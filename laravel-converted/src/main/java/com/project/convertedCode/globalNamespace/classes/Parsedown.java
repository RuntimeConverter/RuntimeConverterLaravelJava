package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.project.convertedCode.globalNamespace.functions.mb_strlen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/erusev/parsedown/Parsedown.php

*/

public class Parsedown extends RuntimeClassBase {

    public Object breaksEnabled = null;

    public Object markupEscaped = null;

    public Object urlsLinked = true;

    public Object safeMode = null;

    public Object safeLinksWhitelist =
            ZVal.arrayFromList(
                    "http://",
                    "https://",
                    "ftp://",
                    "ftps://",
                    "mailto:",
                    "data:image/png;base64,",
                    "data:image/gif;base64,",
                    "data:image/jpeg;base64,",
                    "irc:",
                    "ircs:",
                    "git:",
                    "ssh:",
                    "news:",
                    "steam:");

    public Object BlockTypes =
            ZVal.newArray(
                    new ZPair("#", ZVal.arrayFromList("Header")),
                    new ZPair("*", ZVal.arrayFromList("Rule", "List")),
                    new ZPair("+", ZVal.arrayFromList("List")),
                    new ZPair("-", ZVal.arrayFromList("SetextHeader", "Table", "Rule", "List")),
                    new ZPair("0", ZVal.arrayFromList("List")),
                    new ZPair("1", ZVal.arrayFromList("List")),
                    new ZPair("2", ZVal.arrayFromList("List")),
                    new ZPair("3", ZVal.arrayFromList("List")),
                    new ZPair("4", ZVal.arrayFromList("List")),
                    new ZPair("5", ZVal.arrayFromList("List")),
                    new ZPair("6", ZVal.arrayFromList("List")),
                    new ZPair("7", ZVal.arrayFromList("List")),
                    new ZPair("8", ZVal.arrayFromList("List")),
                    new ZPair("9", ZVal.arrayFromList("List")),
                    new ZPair(":", ZVal.arrayFromList("Table")),
                    new ZPair("<", ZVal.arrayFromList("Comment", "Markup")),
                    new ZPair("=", ZVal.arrayFromList("SetextHeader")),
                    new ZPair(">", ZVal.arrayFromList("Quote")),
                    new ZPair("[", ZVal.arrayFromList("Reference")),
                    new ZPair("_", ZVal.arrayFromList("Rule")),
                    new ZPair("`", ZVal.arrayFromList("FencedCode")),
                    new ZPair("|", ZVal.arrayFromList("Table")),
                    new ZPair("~", ZVal.arrayFromList("FencedCode")));

    public Object unmarkedBlockTypes = ZVal.arrayFromList("Code");

    public Object InlineTypes =
            ZVal.newArray(
                    new ZPair("\"", ZVal.arrayFromList("SpecialCharacter")),
                    new ZPair("!", ZVal.arrayFromList("Image")),
                    new ZPair("&", ZVal.arrayFromList("SpecialCharacter")),
                    new ZPair("*", ZVal.arrayFromList("Emphasis")),
                    new ZPair(":", ZVal.arrayFromList("Url")),
                    new ZPair(
                            "<",
                            ZVal.arrayFromList("UrlTag", "EmailTag", "Markup", "SpecialCharacter")),
                    new ZPair(">", ZVal.arrayFromList("SpecialCharacter")),
                    new ZPair("[", ZVal.arrayFromList("Link")),
                    new ZPair("_", ZVal.arrayFromList("Emphasis")),
                    new ZPair("`", ZVal.arrayFromList("Code")),
                    new ZPair("~", ZVal.arrayFromList("Strikethrough")),
                    new ZPair("\\", ZVal.arrayFromList("EscapeSequence")));

    public Object inlineMarkerList = "!\"*_&[:<>`~\\";

    public Object DefinitionData = null;

    public Object specialCharacters =
            ZVal.arrayFromList(
                    "\\", "`", "*", "_", "{", "}", "[", "]", "(", ")", ">", "#", "+", "-", ".", "!",
                    "|");

    public Object StrongRegex =
            ZVal.newArray(
                    new ZPair("*", "/^[*]{2}((?:\\\\\\*|[^*]|[*][^*]*[*])+?)[*]{2}(?![*])/s"),
                    new ZPair("_", "/^__((?:\\\\_|[^_]|_[^_]*_)+?)__(?!_)/us"));

    public Object EmRegex =
            ZVal.newArray(
                    new ZPair("*", "/^[*]((?:\\\\\\*|[^*]|[*][*][^*]+?[*][*])+?)[*](?![*])/s"),
                    new ZPair("_", "/^_((?:\\\\_|[^_]|__[^_]*__)+?)_(?!_)\\b/us"));

    public Object regexHtmlAttribute =
            "[a-zA-Z_:][\\w:.-]*(?:\\s*=\\s*(?:[^\"'=<>`\\s]+|\"[^\"]*\"|'[^']*'))?";

    public Object voidElements =
            ZVal.arrayFromList(
                    "area", "base", "br", "col", "command", "embed", "hr", "img", "input", "link",
                    "meta", "param", "source");

    public Object textLevelElements =
            ZVal.arrayFromLambdaExpression(
                    /* Lambda can be removed if method size limit (64kb) is not an issue. */
                    () -> {
                        return ZVal.arrayFromList(
                                "a",
                                "br",
                                "bdo",
                                "abbr",
                                "blink",
                                "nextid",
                                "acronym",
                                "basefont",
                                "b",
                                "em",
                                "big",
                                "cite",
                                "small",
                                "spacer",
                                "listing",
                                "i",
                                "rp",
                                "del",
                                "code",
                                "strike",
                                "marquee",
                                "q",
                                "rt",
                                "ins",
                                "font",
                                "strong",
                                "s",
                                "tt",
                                "kbd",
                                "mark",
                                "u",
                                "xm",
                                "sub",
                                "nobr",
                                "sup",
                                "ruby",
                                "var",
                                "span",
                                "wbr",
                                "time");
                    });

    public Parsedown(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Parsedown(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text")
    public Object text(RuntimeEnv env, Object... args) {
        Object text = assignParameter(args, 0, false);
        Object markup = null;
        Object lines = null;
        this.DefinitionData = ZVal.newArray();
        text =
                function_str_replace
                        .f
                        .env(env)
                        .call(ZVal.arrayFromList("\r\n", "\r"), "\n", text)
                        .value();
        text = function_trim.f.env(env).call(text, "\n").value();
        lines = function_explode.f.env(env).call("\n", text).value();
        markup = this.lines(env, lines);
        markup = function_trim.f.env(env).call(markup, "\n").value();
        return ZVal.assign(markup);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "breaksEnabled")
    public Object setBreaksEnabled(RuntimeEnv env, Object... args) {
        Object breaksEnabled = assignParameter(args, 0, false);
        this.breaksEnabled = breaksEnabled;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "markupEscaped")
    public Object setMarkupEscaped(RuntimeEnv env, Object... args) {
        Object markupEscaped = assignParameter(args, 0, false);
        this.markupEscaped = markupEscaped;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "urlsLinked")
    public Object setUrlsLinked(RuntimeEnv env, Object... args) {
        Object urlsLinked = assignParameter(args, 0, false);
        this.urlsLinked = urlsLinked;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "safeMode")
    public Object setSafeMode(RuntimeEnv env, Object... args) {
        Object safeMode = assignParameter(args, 0, false);
        this.safeMode = ZVal.toBool(safeMode);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lines", typeHint = "array")
    protected Object lines(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object lines = assignParameter(args, 0, false);
        ReferenceContainer Blocks = new BasicReferenceContainer(null);
        Object markup = null;
        ReferenceContainer indent = new BasicReferenceContainer(null);
        ReferenceContainer line = new BasicReferenceContainer(null);
        Object part = null;
        Object blockType = null;
        ReferenceContainer CurrentBlock = new BasicReferenceContainer(null);
        ReferenceContainer Line = new BasicReferenceContainer(null);
        Object shortage = null;
        Object marker = null;
        ReferenceContainer parts = new BasicReferenceContainer(null);
        ReferenceContainer Block = new BasicReferenceContainer(null);
        ReferenceContainer blockTypes = new BasicReferenceContainer(null);
        ReferenceContainer text = new BasicReferenceContainer(null);
        CurrentBlock.setObject(ZVal.getNull());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult26 : ZVal.getIterable(lines, env, true)) {
            line.setObject(ZVal.assign(zpairResult26.getValue()));
            if (ZVal.strictEqualityCheck(
                    NamespaceGlobal.chop.env(env).call(line.getObject()).value(), "===", "")) {
                if (ZVal.isset(CurrentBlock.getObject())) {
                    CurrentBlock.arrayAccess(env, "interrupted").set(true);
                }

                continue;
            }

            if (ZVal.strictNotEqualityCheck(
                    function_strpos.f.env(env).call(line.getObject(), "\t").value(),
                    "!==",
                    false)) {
                parts.setObject(function_explode.f.env(env).call("\t", line.getObject()).value());
                line.setObject(ZVal.assign(parts.arrayGet(env, 0)));
                arrayActionR(ArrayAction.UNSET, parts, env, 0);
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult27 : ZVal.getIterable(parts.getObject(), env, true)) {
                    part = ZVal.assign(zpairResult27.getValue());
                    shortage =
                            ZVal.subtract(
                                    4,
                                    ZVal.modulus(
                                            mb_strlen
                                                    .f
                                                    .env(env)
                                                    .call(line.getObject(), "utf-8")
                                                    .value(),
                                            4));
                    line.setObject(
                            toStringR(line.getObject(), env)
                                    + toStringR(
                                            function_str_repeat
                                                    .f
                                                    .env(env)
                                                    .call(" ", shortage)
                                                    .value(),
                                            env));
                    line.setObject(toStringR(line.getObject(), env) + toStringR(part, env));
                }
            }

            indent.setObject(0);
            runtimeConverterContinueCount = 0;
            while (ZVal.toBool(arrayActionR(ArrayAction.ISSET, line, env, indent.getObject()))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    line.arrayGet(env, indent.getObject()), "===", " "))) {
                indent.setObject(ZVal.increment(indent.getObject()));
            }

            text.setObject(
                    ZVal.assign(
                            ZVal.isGreaterThan(indent.getObject(), '>', 0)
                                    ? function_substr
                                            .f
                                            .env(env)
                                            .call(line.getObject(), indent.getObject())
                                            .value()
                                    : line.getObject()));
            Line.setObject(
                    ZVal.newArray(
                            new ZPair("body", line.getObject()),
                            new ZPair("indent", indent.getObject()),
                            new ZPair("text", text.getObject())));
            if (arrayActionR(ArrayAction.ISSET, CurrentBlock, env, "continuable")) {
                Block.setObject(
                        env.callMethod(
                                this,
                                new RuntimeArgsWithReferences().add(0, Line).add(1, CurrentBlock),
                                "block"
                                        + toStringR(CurrentBlock.arrayGet(env, "type"), env)
                                        + "Continue",
                                Parsedown.class,
                                Line.getObject(),
                                CurrentBlock.getObject()));
                if (ZVal.isset(Block.getObject())) {
                    CurrentBlock.setObject(ZVal.assign(Block.getObject()));
                    continue;

                } else {
                    if (ZVal.isTrue(
                            this.isBlockCompletable(env, CurrentBlock.arrayGet(env, "type")))) {
                        CurrentBlock.setObject(
                                env.callMethod(
                                        this,
                                        new RuntimeArgsWithReferences().add(0, CurrentBlock),
                                        "block"
                                                + toStringR(CurrentBlock.arrayGet(env, "type"), env)
                                                + "Complete",
                                        Parsedown.class,
                                        CurrentBlock.getObject()));
                    }
                }
            }

            marker = ZVal.assign(text.arrayGet(env, 0));
            blockTypes.setObject(ZVal.assign(this.unmarkedBlockTypes));
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "BlockTypes", env),
                    env,
                    marker)) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult28 :
                        ZVal.getIterable(
                                new ReferenceClassProperty(this, "BlockTypes", env)
                                        .arrayGet(env, marker),
                                env,
                                true)) {
                    blockType = ZVal.assign(zpairResult28.getValue());
                    blockTypes.arrayAppend(env).set(blockType);
                }
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult29 : ZVal.getIterable(blockTypes.getObject(), env, true)) {
                blockType = ZVal.assign(zpairResult29.getValue());
                Block.setObject(
                        env.callMethod(
                                this,
                                new RuntimeArgsWithReferences().add(0, Line).add(1, CurrentBlock),
                                "block" + toStringR(blockType, env),
                                Parsedown.class,
                                Line.getObject(),
                                CurrentBlock.getObject()));
                if (ZVal.isset(Block.getObject())) {
                    Block.arrayAccess(env, "type").set(blockType);
                    if (!arrayActionR(ArrayAction.ISSET, Block, env, "identified")) {
                        Blocks.arrayAppend(env).set(CurrentBlock.getObject());
                        Block.arrayAccess(env, "identified").set(true);
                    }

                    if (ZVal.isTrue(this.isBlockContinuable(env, blockType))) {
                        Block.arrayAccess(env, "continuable").set(true);
                    }

                    CurrentBlock.setObject(ZVal.assign(Block.getObject()));
                    runtimeConverterContinueCount = 2;
                    runtimeConverterContinueCount--;
                    continue;
                }
            }

            if (ZVal.toBool(
                            ZVal.toBool(ZVal.isset(CurrentBlock.getObject()))
                                    && ZVal.toBool(
                                            !arrayActionR(
                                                    ArrayAction.ISSET, CurrentBlock, env, "type")))
                    && ZVal.toBool(
                            !arrayActionR(ArrayAction.ISSET, CurrentBlock, env, "interrupted"))) {
                CurrentBlock.arrayAccess(env, "element", "text")
                        .set(
                                toStringR(CurrentBlock.arrayGet(env, "element", "text"), env)
                                        + "\n"
                                        + toStringR(text.getObject(), env));

            } else {
                Blocks.arrayAppend(env).set(CurrentBlock.getObject());
                CurrentBlock.setObject(this.paragraph(env, Line.getObject()));
                CurrentBlock.arrayAccess(env, "identified").set(true);
            }
        }

        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, CurrentBlock, env, "continuable"))
                && ZVal.toBool(this.isBlockCompletable(env, CurrentBlock.arrayGet(env, "type")))) {
            CurrentBlock.setObject(
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(0, CurrentBlock),
                            "block"
                                    + toStringR(CurrentBlock.arrayGet(env, "type"), env)
                                    + "Complete",
                            Parsedown.class,
                            CurrentBlock.getObject()));
        }

        Blocks.arrayAppend(env).set(CurrentBlock.getObject());
        arrayActionR(ArrayAction.UNSET, Blocks, env, 0);
        markup = "";
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult30 : ZVal.getIterable(Blocks.getObject(), env, true)) {
            Block.setObject(ZVal.assign(zpairResult30.getValue()));
            if (arrayActionR(ArrayAction.ISSET, Block, env, "hidden")) {
                continue;
            }

            markup = toStringR(markup, env) + "\n";
            markup =
                    toStringR(markup, env)
                            + toStringR(
                                    arrayActionR(ArrayAction.ISSET, Block, env, "markup")
                                            ? Block.arrayGet(env, "markup")
                                            : this.element(env, Block.arrayGet(env, "element")),
                                    env);
        }

        markup = toStringR(markup, env) + "\n";
        return ZVal.assign(markup);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Type")
    protected Object isBlockContinuable(RuntimeEnv env, Object... args) {
        Object Type = assignParameter(args, 0, false);
        return ZVal.assign(
                function_method_exists
                        .f
                        .env(env)
                        .call(this, "block" + toStringR(Type, env) + "Continue")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Type")
    protected Object isBlockCompletable(RuntimeEnv env, Object... args) {
        Object Type = assignParameter(args, 0, false);
        return ZVal.assign(
                function_method_exists
                        .f
                        .env(env)
                        .call(this, "block" + toStringR(Type, env) + "Complete")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    @ConvertedParameter(
        index = 1,
        name = "Block",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object blockCode(RuntimeEnv env, Object... args) {
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer Block = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == Block.getObject()) {
            Block.setObject(ZVal.getNull());
        }
        Object text = null;
        if (ZVal.toBool(
                        ZVal.toBool(ZVal.isset(Block.getObject()))
                                && ZVal.toBool(
                                        !arrayActionR(ArrayAction.ISSET, Block, env, "type")))
                && ZVal.toBool(!arrayActionR(ArrayAction.ISSET, Block, env, "interrupted"))) {
            return null;
        }

        if (ZVal.isGreaterThanOrEqualTo(Line.arrayGet(env, "indent"), ">=", 4)) {
            text = function_substr.f.env(env).call(Line.arrayGet(env, "body"), 4).value();
            Block.setObject(
                    ZVal.newArray(
                            new ZPair(
                                    "element",
                                    ZVal.newArray(
                                            new ZPair("name", "pre"),
                                            new ZPair("handler", "element"),
                                            new ZPair(
                                                    "text",
                                                    ZVal.newArray(
                                                            new ZPair("name", "code"),
                                                            new ZPair("text", text)))))));
            return ZVal.assign(Block.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    @ConvertedParameter(index = 1, name = "Block")
    protected Object blockCodeContinue(RuntimeEnv env, Object... args) {
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer Block = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object text = null;
        if (ZVal.isGreaterThanOrEqualTo(Line.arrayGet(env, "indent"), ">=", 4)) {
            if (arrayActionR(ArrayAction.ISSET, Block, env, "interrupted")) {
                Block.arrayAccess(env, "element", "text", "text")
                        .set(toStringR(Block.arrayGet(env, "element", "text", "text"), env) + "\n");
                arrayActionR(ArrayAction.UNSET, Block, env, "interrupted");
            }

            Block.arrayAccess(env, "element", "text", "text")
                    .set(toStringR(Block.arrayGet(env, "element", "text", "text"), env) + "\n");
            text = function_substr.f.env(env).call(Line.arrayGet(env, "body"), 4).value();
            Block.arrayAccess(env, "element", "text", "text")
                    .set(
                            toStringR(Block.arrayGet(env, "element", "text", "text"), env)
                                    + toStringR(text, env));
            return ZVal.assign(Block.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Block")
    protected Object blockCodeComplete(RuntimeEnv env, Object... args) {
        ReferenceContainer Block = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object text = null;
        text = ZVal.assign(Block.arrayGet(env, "element", "text", "text"));
        Block.arrayAccess(env, "element", "text", "text").set(text);
        return ZVal.assign(Block.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    protected Object blockComment(RuntimeEnv env, Object... args) {
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer Block = new BasicReferenceContainer(null);
        if (ZVal.toBool(this.markupEscaped) || ZVal.toBool(this.safeMode)) {
            return null;
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        arrayActionR(
                                                                ArrayAction.ISSET,
                                                                Line,
                                                                env,
                                                                "text",
                                                                3))
                                                && ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                Line.arrayGet(env, "text", 3),
                                                                "===",
                                                                "-")))
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                Line.arrayGet(env, "text", 2), "===", "-")))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(Line.arrayGet(env, "text", 1), "===", "!"))) {
            Block.setObject(ZVal.newArray(new ZPair("markup", Line.arrayGet(env, "body"))));
            if (function_preg_match
                    .f
                    .env(env)
                    .call("/-->$/", Line.arrayGet(env, "text"))
                    .getBool()) {
                Block.arrayAccess(env, "closed").set(true);
            }

            return ZVal.assign(Block.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    @ConvertedParameter(index = 1, name = "Block", typeHint = "array")
    protected Object blockCommentContinue(RuntimeEnv env, Object... args) {
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer Block = new BasicReferenceContainer(assignParameter(args, 1, false));
        if (arrayActionR(ArrayAction.ISSET, Block, env, "closed")) {
            return null;
        }

        Block.arrayAccess(env, "markup")
                .set(
                        toStringR(Block.arrayGet(env, "markup"), env)
                                + "\n"
                                + toStringR(Line.arrayGet(env, "body"), env));
        if (function_preg_match.f.env(env).call("/-->$/", Line.arrayGet(env, "text")).getBool()) {
            Block.arrayAccess(env, "closed").set(true);
        }

        return ZVal.assign(Block.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    protected Object blockFencedCode(RuntimeEnv env, Object... args) {
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer Element = new BasicReferenceContainer(null);
        Object Block = null;
        Object _pClass = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "/^["
                                + toStringR(Line.arrayGet(env, "text", 0), env)
                                + "]{3,}[ ]*([^`]+)?[ ]*$/",
                        Line.arrayGet(env, "text"),
                        matches.getObject())
                .getBool()) {
            Element.setObject(ZVal.newArray(new ZPair("name", "code"), new ZPair("text", "")));
            if (arrayActionR(ArrayAction.ISSET, matches, env, 1)) {
                _pClass = "language-" + toStringR(matches.arrayGet(env, 1), env);
                Element.arrayAccess(env, "attributes")
                        .set(ZVal.newArray(new ZPair("class", _pClass)));
            }

            Block =
                    ZVal.newArray(
                            new ZPair("char", Line.arrayGet(env, "text", 0)),
                            new ZPair(
                                    "element",
                                    ZVal.newArray(
                                            new ZPair("name", "pre"),
                                            new ZPair("handler", "element"),
                                            new ZPair("text", Element.getObject()))));
            return ZVal.assign(Block);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    @ConvertedParameter(index = 1, name = "Block")
    protected Object blockFencedCodeContinue(RuntimeEnv env, Object... args) {
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer Block = new BasicReferenceContainer(assignParameter(args, 1, false));
        if (arrayActionR(ArrayAction.ISSET, Block, env, "complete")) {
            return null;
        }

        if (arrayActionR(ArrayAction.ISSET, Block, env, "interrupted")) {
            Block.arrayAccess(env, "element", "text", "text")
                    .set(toStringR(Block.arrayGet(env, "element", "text", "text"), env) + "\n");
            arrayActionR(ArrayAction.UNSET, Block, env, "interrupted");
        }

        if (function_preg_match
                .f
                .env(env)
                .call(
                        "/^" + toStringR(Block.arrayGet(env, "char"), env) + "{3,}[ ]*$/",
                        Line.arrayGet(env, "text"))
                .getBool()) {
            Block.arrayAccess(env, "element", "text", "text")
                    .set(
                            function_substr
                                    .f
                                    .env(env)
                                    .call(Block.arrayGet(env, "element", "text", "text"), 1)
                                    .value());
            Block.arrayAccess(env, "complete").set(true);
            return ZVal.assign(Block.getObject());
        }

        Block.arrayAccess(env, "element", "text", "text")
                .set(
                        toStringR(Block.arrayGet(env, "element", "text", "text"), env)
                                + "\n"
                                + toStringR(Line.arrayGet(env, "body"), env));
        return ZVal.assign(Block.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Block")
    protected Object blockFencedCodeComplete(RuntimeEnv env, Object... args) {
        ReferenceContainer Block = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object text = null;
        text = ZVal.assign(Block.arrayGet(env, "element", "text", "text"));
        Block.arrayAccess(env, "element", "text", "text").set(text);
        return ZVal.assign(Block.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    protected Object blockHeader(RuntimeEnv env, Object... args) {
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer level = new BasicReferenceContainer(null);
        Object Block = null;
        Object text = null;
        if (arrayActionR(ArrayAction.ISSET, Line, env, "text", 1)) {
            level.setObject(1);
            while (ZVal.toBool(
                            arrayActionR(ArrayAction.ISSET, Line, env, "text", level.getObject()))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    Line.arrayGet(env, "text", level.getObject()), "===", "#"))) {
                level.setObject(ZVal.increment(level.getObject()));
            }

            if (ZVal.isGreaterThan(level.getObject(), '>', 6)) {
                return null;
            }

            text = function_trim.f.env(env).call(Line.arrayGet(env, "text"), "# ").value();
            Block =
                    ZVal.newArray(
                            new ZPair(
                                    "element",
                                    ZVal.newArray(
                                            new ZPair(
                                                    "name",
                                                    "h"
                                                            + toStringR(
                                                                    NamespaceGlobal.min
                                                                            .env(env)
                                                                            .call(
                                                                                    6,
                                                                                    level
                                                                                            .getObject())
                                                                            .value(),
                                                                    env)),
                                            new ZPair("text", text),
                                            new ZPair("handler", "line"))));
            return ZVal.assign(Block);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    protected Object blockList(RuntimeEnv env, Object... args) {
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object listStart = null;
        Object runtimeTempArrayResult4 = null;
        Object name = null;
        Object pattern = null;
        ReferenceContainer Block = new BasicReferenceContainer(null);
        ReferenceContainer matches = new BasicReferenceContainer(null);
        ZVal.list(
                runtimeTempArrayResult4 =
                        ZVal.isLessThanOrEqualTo(Line.arrayGet(env, "text", 0), "<=", "-")
                                ? ZVal.arrayFromList("ul", "[*+-]")
                                : ZVal.arrayFromList("ol", "[0-9]+[.]"),
                (name = listGet(runtimeTempArrayResult4, 0, env)),
                (pattern = listGet(runtimeTempArrayResult4, 1, env)));
        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "/^(" + toStringR(pattern, env) + "[ ]+)(.*)/",
                        Line.arrayGet(env, "text"),
                        matches.getObject())
                .getBool()) {
            Block.setObject(
                    ZVal.newArray(
                            new ZPair("indent", Line.arrayGet(env, "indent")),
                            new ZPair("pattern", pattern),
                            new ZPair(
                                    "element",
                                    ZVal.newArray(
                                            new ZPair("name", name),
                                            new ZPair("handler", "elements")))));
            if (ZVal.strictEqualityCheck(name, "===", "ol")) {
                listStart =
                        NamespaceGlobal.stristr
                                .env(env)
                                .call(matches.arrayGet(env, 0), ".", true)
                                .value();
                if (ZVal.strictNotEqualityCheck(listStart, "!==", "1")) {
                    Block.arrayAccess(env, "element", "attributes")
                            .set(ZVal.newArray(new ZPair("start", listStart)));
                }
            }

            Block.arrayAccess(env, "li")
                    .set(
                            ZVal.newArray(
                                    new ZPair("name", "li"),
                                    new ZPair("handler", "li"),
                                    new ZPair(
                                            "text",
                                            ZVal.newArray(
                                                    new ZPair(0, matches.arrayGet(env, 2))))));
            Block.arrayAppend(env, "element", "text").set(Block.arrayGet(env, "li"));
            return ZVal.assign(Block.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    @ConvertedParameter(index = 1, name = "Block", typeHint = "array")
    protected Object blockListContinue(RuntimeEnv env, Object... args) {
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer Block = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object text = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                Block.arrayGet(env, "indent"), "===", Line.arrayGet(env, "indent")))
                && ZVal.toBool(
                        function_preg_match
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(
                                        "/^"
                                                + toStringR(Block.arrayGet(env, "pattern"), env)
                                                + "(?:[ ]+(.*)|$)/",
                                        Line.arrayGet(env, "text"),
                                        matches.getObject())
                                .value())) {
            if (arrayActionR(ArrayAction.ISSET, Block, env, "interrupted")) {
                Block.arrayAppend(env, "li", "text").set("");
                Block.arrayAccess(env, "loose").set(true);
                arrayActionR(ArrayAction.UNSET, Block, env, "interrupted");
            }

            arrayActionR(ArrayAction.UNSET, Block, env, "li");
            text =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, matches, env, 1)
                                    ? matches.arrayGet(env, 1)
                                    : "");
            Block.arrayAccess(env, "li")
                    .set(
                            ZVal.newArray(
                                    new ZPair("name", "li"),
                                    new ZPair("handler", "li"),
                                    new ZPair("text", ZVal.newArray(new ZPair(0, text)))));
            Block.arrayAppend(env, "element", "text").set(Block.arrayGet(env, "li"));
            return ZVal.assign(Block.getObject());
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(Line.arrayGet(env, "text", 0), "===", "["))
                && ZVal.toBool(this.blockReference(env, Line.getObject()))) {
            return ZVal.assign(Block.getObject());
        }

        if (!arrayActionR(ArrayAction.ISSET, Block, env, "interrupted")) {
            text =
                    function_preg_replace
                            .f
                            .env(env)
                            .call("/^[ ]{0,4}/", "", Line.arrayGet(env, "body"))
                            .value();
            Block.arrayAppend(env, "li", "text").set(text);
            return ZVal.assign(Block.getObject());
        }

        if (ZVal.isGreaterThan(Line.arrayGet(env, "indent"), '>', 0)) {
            Block.arrayAppend(env, "li", "text").set("");
            text =
                    function_preg_replace
                            .f
                            .env(env)
                            .call("/^[ ]{0,4}/", "", Line.arrayGet(env, "body"))
                            .value();
            Block.arrayAppend(env, "li", "text").set(text);
            arrayActionR(ArrayAction.UNSET, Block, env, "interrupted");
            return ZVal.assign(Block.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Block", typeHint = "array")
    protected Object blockListComplete(RuntimeEnv env, Object... args) {
        ReferenceContainer Block = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer li = new BasicReferenceContainer(null);
        if (arrayActionR(ArrayAction.ISSET, Block, env, "loose")) {
            for (ZPair zpairResult31 :
                    ZVal.getIterable(Block.arrayGet(env, "element", "text"), env, true)) {
                li = zpairResult31;
                if (ZVal.strictNotEqualityCheck(
                        function_end.f.env(env).call(li.arrayGet(env, "text")).value(),
                        "!==",
                        "")) {
                    li.arrayAppend(env, "text").set("");
                }
            }
        }

        return ZVal.assign(Block.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    protected Object blockQuote(RuntimeEnv env, Object... args) {
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object Block = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call("/^>[ ]?(.*)/", Line.arrayGet(env, "text"), matches.getObject())
                .getBool()) {
            Block =
                    ZVal.newArray(
                            new ZPair(
                                    "element",
                                    ZVal.newArray(
                                            new ZPair("name", "blockquote"),
                                            new ZPair("handler", "lines"),
                                            new ZPair(
                                                    "text",
                                                    rToArrayCast(matches.arrayGet(env, 1))))));
            return ZVal.assign(Block);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    @ConvertedParameter(index = 1, name = "Block", typeHint = "array")
    protected Object blockQuoteContinue(RuntimeEnv env, Object... args) {
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer Block = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (ZVal.toBool(ZVal.strictEqualityCheck(Line.arrayGet(env, "text", 0), "===", ">"))
                && ZVal.toBool(
                        function_preg_match
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(
                                        "/^>[ ]?(.*)/",
                                        Line.arrayGet(env, "text"),
                                        matches.getObject())
                                .value())) {
            if (arrayActionR(ArrayAction.ISSET, Block, env, "interrupted")) {
                Block.arrayAppend(env, "element", "text").set("");
                arrayActionR(ArrayAction.UNSET, Block, env, "interrupted");
            }

            Block.arrayAppend(env, "element", "text").set(matches.arrayGet(env, 1));
            return ZVal.assign(Block.getObject());
        }

        if (!arrayActionR(ArrayAction.ISSET, Block, env, "interrupted")) {
            Block.arrayAppend(env, "element", "text").set(Line.arrayGet(env, "text"));
            return ZVal.assign(Block.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    protected Object blockRule(RuntimeEnv env, Object... args) {
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object Block = null;
        if (function_preg_match
                .f
                .env(env)
                .call(
                        "/^(["
                                + toStringR(Line.arrayGet(env, "text", 0), env)
                                + "])([ ]*\\1){2,}[ ]*$/",
                        Line.arrayGet(env, "text"))
                .getBool()) {
            Block = ZVal.newArray(new ZPair("element", ZVal.newArray(new ZPair("name", "hr"))));
            return ZVal.assign(Block);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    @ConvertedParameter(
        index = 1,
        name = "Block",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object blockSetextHeader(RuntimeEnv env, Object... args) {
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer Block = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == Block.getObject()) {
            Block.setObject(ZVal.getNull());
        }
        if (ZVal.toBool(
                        ZVal.toBool(!ZVal.isset(Block.getObject()))
                                || ZVal.toBool(arrayActionR(ArrayAction.ISSET, Block, env, "type")))
                || ZVal.toBool(arrayActionR(ArrayAction.ISSET, Block, env, "interrupted"))) {
            return null;
        }

        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.chop
                        .env(env)
                        .call(Line.arrayGet(env, "text"), Line.arrayGet(env, "text", 0))
                        .value(),
                "===",
                "")) {
            Block.arrayAccess(env, "element", "name")
                    .set(
                            ZVal.strictEqualityCheck(Line.arrayGet(env, "text", 0), "===", "=")
                                    ? "h1"
                                    : "h2");
            return ZVal.assign(Block.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    protected Object blockMarkup(RuntimeEnv env, Object... args) {
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object length = null;
        ReferenceContainer Block = new BasicReferenceContainer(null);
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object remainder = null;
        Object element = null;
        if (ZVal.toBool(this.markupEscaped) || ZVal.toBool(this.safeMode)) {
            return null;
        }

        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "/^<(\\w[\\w-]*)(?:[ ]*"
                                + toStringR(this.regexHtmlAttribute, env)
                                + ")*[ ]*(\\/)?>/",
                        Line.arrayGet(env, "text"),
                        matches.getObject())
                .getBool()) {
            element = NamespaceGlobal.strtolower.env(env).call(matches.arrayGet(env, 1)).value();
            if (function_in_array.f.env(env).call(element, this.textLevelElements).getBool()) {
                return null;
            }

            Block.setObject(
                    ZVal.newArray(
                            new ZPair("name", matches.arrayGet(env, 1)),
                            new ZPair("depth", 0),
                            new ZPair("markup", Line.arrayGet(env, "text"))));
            length = function_strlen.f.env(env).call(matches.arrayGet(env, 0)).value();
            remainder = function_substr.f.env(env).call(Line.arrayGet(env, "text"), length).value();
            if (ZVal.strictEqualityCheck(
                    function_trim.f.env(env).call(remainder).value(), "===", "")) {
                if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, matches, env, 2))
                        || ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(matches.arrayGet(env, 1), this.voidElements)
                                        .value())) {
                    Block.arrayAccess(env, "closed").set(true);
                    Block.arrayAccess(env, "void").set(true);
                }

            } else {
                if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, matches, env, 2))
                        || ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(matches.arrayGet(env, 1), this.voidElements)
                                        .value())) {
                    return null;
                }

                if (function_preg_match
                        .f
                        .env(env)
                        .call(
                                "/<\\/" + toStringR(matches.arrayGet(env, 1), env) + ">[ ]*$/i",
                                remainder)
                        .getBool()) {
                    Block.arrayAccess(env, "closed").set(true);
                }
            }

            return ZVal.assign(Block.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    @ConvertedParameter(index = 1, name = "Block", typeHint = "array")
    protected Object blockMarkupContinue(RuntimeEnv env, Object... args) {
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer Block = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (arrayActionR(ArrayAction.ISSET, Block, env, "closed")) {
            return null;
        }

        if (function_preg_match
                .f
                .env(env)
                .call(
                        "/^<"
                                + toStringR(Block.arrayGet(env, "name"), env)
                                + "(?:[ ]*"
                                + toStringR(this.regexHtmlAttribute, env)
                                + ")*[ ]*>/i",
                        Line.arrayGet(env, "text"))
                .getBool()) {
            Block.arrayAccess(env, "depth").set(ZVal.increment(Block.arrayGet(env, "depth")));
        }

        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "/(.*?)<\\/" + toStringR(Block.arrayGet(env, "name"), env) + ">[ ]*$/i",
                        Line.arrayGet(env, "text"),
                        matches.getObject())
                .getBool()) {
            if (ZVal.isGreaterThan(Block.arrayGet(env, "depth"), '>', 0)) {
                Block.arrayAccess(env, "depth").set(ZVal.decrement(Block.arrayGet(env, "depth")));

            } else {
                Block.arrayAccess(env, "closed").set(true);
            }
        }

        if (arrayActionR(ArrayAction.ISSET, Block, env, "interrupted")) {
            Block.arrayAccess(env, "markup")
                    .set(toStringR(Block.arrayGet(env, "markup"), env) + "\n");
            arrayActionR(ArrayAction.UNSET, Block, env, "interrupted");
        }

        Block.arrayAccess(env, "markup")
                .set(
                        toStringR(Block.arrayGet(env, "markup"), env)
                                + "\n"
                                + toStringR(Line.arrayGet(env, "body"), env));
        return ZVal.assign(Block.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    protected Object blockReference(RuntimeEnv env, Object... args) {
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object Block = null;
        ReferenceContainer Data = new BasicReferenceContainer(null);
        Object id = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "/^\\[(.+?)\\]:[ ]*<?(\\S+?)>?(?:[ ]+[\"'(](.+)[\"')])?[ ]*$/",
                        Line.arrayGet(env, "text"),
                        matches.getObject())
                .getBool()) {
            id = NamespaceGlobal.strtolower.env(env).call(matches.arrayGet(env, 1)).value();
            Data.setObject(
                    ZVal.newArray(
                            new ZPair("url", matches.arrayGet(env, 2)),
                            new ZPair("title", ZVal.getNull())));
            if (arrayActionR(ArrayAction.ISSET, matches, env, 3)) {
                Data.arrayAccess(env, "title").set(matches.arrayGet(env, 3));
            }

            new ReferenceClassProperty(this, "DefinitionData", env)
                    .arrayAccess(env, "Reference", id)
                    .set(Data.getObject());
            Block = ZVal.newArray(new ZPair("hidden", true));
            return ZVal.assign(Block);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    @ConvertedParameter(
        index = 1,
        name = "Block",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object blockTable(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer Block = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == Block.getObject()) {
            Block.setObject(ZVal.getNull());
        }
        ReferenceContainer HeaderElements = new BasicReferenceContainer(null);
        ReferenceContainer alignments = new BasicReferenceContainer(null);
        ReferenceContainer HeaderElement = new BasicReferenceContainer(null);
        Object headerCells = null;
        Object dividerCells = null;
        Object index = null;
        ReferenceContainer dividerCell = new BasicReferenceContainer(null);
        Object divider = null;
        Object header = null;
        Object headerCell = null;
        Object alignment = null;
        if (ZVal.toBool(
                        ZVal.toBool(!ZVal.isset(Block.getObject()))
                                || ZVal.toBool(arrayActionR(ArrayAction.ISSET, Block, env, "type")))
                || ZVal.toBool(arrayActionR(ArrayAction.ISSET, Block, env, "interrupted"))) {
            return null;
        }

        if (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                function_strpos
                                        .f
                                        .env(env)
                                        .call(Block.arrayGet(env, "element", "text"), "|")
                                        .value(),
                                "!==",
                                false))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                NamespaceGlobal.chop
                                        .env(env)
                                        .call(Line.arrayGet(env, "text"), " -:|")
                                        .value(),
                                "===",
                                ""))) {
            alignments.setObject(ZVal.newArray());
            divider = ZVal.assign(Line.arrayGet(env, "text"));
            divider = function_trim.f.env(env).call(divider).value();
            divider = function_trim.f.env(env).call(divider, "|").value();
            dividerCells = function_explode.f.env(env).call("|", divider).value();
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult32 : ZVal.getIterable(dividerCells, env, true)) {
                dividerCell.setObject(ZVal.assign(zpairResult32.getValue()));
                dividerCell.setObject(
                        function_trim.f.env(env).call(dividerCell.getObject()).value());
                if (ZVal.strictEqualityCheck(dividerCell.getObject(), "===", "")) {
                    continue;
                }

                alignment = ZVal.getNull();
                if (ZVal.strictEqualityCheck(dividerCell.arrayGet(env, 0), "===", ":")) {
                    alignment = "left";
                }

                if (ZVal.strictEqualityCheck(
                        function_substr.f.env(env).call(dividerCell.getObject(), -1).value(),
                        "===",
                        ":")) {
                    alignment =
                            ZVal.assign(
                                    ZVal.strictEqualityCheck(alignment, "===", "left")
                                            ? "center"
                                            : "right");
                }

                alignments.arrayAppend(env).set(alignment);
            }

            HeaderElements.setObject(ZVal.newArray());
            header = ZVal.assign(Block.arrayGet(env, "element", "text"));
            header = function_trim.f.env(env).call(header).value();
            header = function_trim.f.env(env).call(header, "|").value();
            headerCells = function_explode.f.env(env).call("|", header).value();
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult33 : ZVal.getIterable(headerCells, env, false)) {
                index = ZVal.assign(zpairResult33.getKey());
                headerCell = ZVal.assign(zpairResult33.getValue());
                headerCell = function_trim.f.env(env).call(headerCell).value();
                HeaderElement.setObject(
                        ZVal.newArray(
                                new ZPair("name", "th"),
                                new ZPair("text", headerCell),
                                new ZPair("handler", "line")));
                if (arrayActionR(ArrayAction.ISSET, alignments, env, index)) {
                    alignment = ZVal.assign(alignments.arrayGet(env, index));
                    HeaderElement.arrayAccess(env, "attributes")
                            .set(
                                    ZVal.newArray(
                                            new ZPair(
                                                    "style",
                                                    "text-align: "
                                                            + toStringR(alignment, env)
                                                            + ";")));
                }

                HeaderElements.arrayAppend(env).set(HeaderElement.getObject());
            }

            Block.setObject(
                    ZVal.newArray(
                            new ZPair("alignments", alignments.getObject()),
                            new ZPair("identified", true),
                            new ZPair(
                                    "element",
                                    ZVal.newArray(
                                            new ZPair("name", "table"),
                                            new ZPair("handler", "elements")))));
            Block.arrayAppend(env, "element", "text")
                    .set(
                            ZVal.newArray(
                                    new ZPair("name", "thead"), new ZPair("handler", "elements")));
            Block.arrayAppend(env, "element", "text")
                    .set(
                            ZVal.newArray(
                                    new ZPair("name", "tbody"),
                                    new ZPair("handler", "elements"),
                                    new ZPair("text", ZVal.newArray())));
            Block.arrayAppend(env, "element", "text", 0, "text")
                    .set(
                            ZVal.newArray(
                                    new ZPair("name", "tr"),
                                    new ZPair("handler", "elements"),
                                    new ZPair("text", HeaderElements.getObject())));
            return ZVal.assign(Block.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    @ConvertedParameter(index = 1, name = "Block", typeHint = "array")
    protected Object blockTableContinue(RuntimeEnv env, Object... args) {
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer Block = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer Element = new BasicReferenceContainer(null);
        Object index = null;
        Object row = null;
        ReferenceContainer Elements = new BasicReferenceContainer(null);
        Object cell = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (arrayActionR(ArrayAction.ISSET, Block, env, "interrupted")) {
            return null;
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(Line.arrayGet(env, "text", 0), "===", "|"))
                || ZVal.toBool(
                        function_strpos.f.env(env).call(Line.arrayGet(env, "text"), "|").value())) {
            Elements.setObject(ZVal.newArray());
            row = ZVal.assign(Line.arrayGet(env, "text"));
            row = function_trim.f.env(env).call(row).value();
            row = function_trim.f.env(env).call(row, "|").value();
            function_preg_match_all
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/(?:(\\\\[|])|[^|`]|`[^`]+`|`)+/", row, matches.getObject());
            for (ZPair zpairResult34 : ZVal.getIterable(matches.arrayGet(env, 0), env, false)) {
                index = ZVal.assign(zpairResult34.getKey());
                cell = ZVal.assign(zpairResult34.getValue());
                cell = function_trim.f.env(env).call(cell).value();
                Element.setObject(
                        ZVal.newArray(
                                new ZPair("name", "td"),
                                new ZPair("handler", "line"),
                                new ZPair("text", cell)));
                if (arrayActionR(ArrayAction.ISSET, Block, env, "alignments", index)) {
                    Element.arrayAccess(env, "attributes")
                            .set(
                                    ZVal.newArray(
                                            new ZPair(
                                                    "style",
                                                    "text-align: "
                                                            + toStringR(
                                                                    Block.arrayGet(
                                                                            env,
                                                                            "alignments",
                                                                            index),
                                                                    env)
                                                            + ";")));
                }

                Elements.arrayAppend(env).set(Element.getObject());
            }

            Element.setObject(
                    ZVal.newArray(
                            new ZPair("name", "tr"),
                            new ZPair("handler", "elements"),
                            new ZPair("text", Elements.getObject())));
            Block.arrayAppend(env, "element", "text", 1, "text").set(Element.getObject());
            return ZVal.assign(Block.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Line")
    protected Object paragraph(RuntimeEnv env, Object... args) {
        ReferenceContainer Line = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object Block = null;
        Block =
                ZVal.newArray(
                        new ZPair(
                                "element",
                                ZVal.newArray(
                                        new ZPair("name", "p"),
                                        new ZPair("text", Line.arrayGet(env, "text")),
                                        new ZPair("handler", "line"))));
        return ZVal.assign(Block);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text")
    @ConvertedParameter(
        index = 1,
        name = "nonNestables",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object line(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object text = assignParameter(args, 0, false);
        Object nonNestables = assignParameter(args, 1, true);
        if (null == nonNestables) {
            nonNestables = ZVal.newArray();
        }
        Object non_nestable = null;
        Object inlineType = null;
        Object markup = null;
        Object markerPosition = null;
        Object marker = null;
        ReferenceContainer Excerpt = new BasicReferenceContainer(null);
        Object unmarkedText = null;
        ReferenceContainer Inline = new BasicReferenceContainer(null);
        ReferenceContainer excerpt = new BasicReferenceContainer(null);
        markup = "";
        runtimeConverterContinueCount = 0;
        while (ZVal.isTrue(
                excerpt.setObject(
                        NamespaceGlobal.strpbrk
                                .env(env)
                                .call(text, this.inlineMarkerList)
                                .value()))) {
            marker = ZVal.assign(excerpt.arrayGet(env, 0));
            markerPosition = function_strpos.f.env(env).call(text, marker).value();
            Excerpt.setObject(
                    ZVal.newArray(
                            new ZPair("text", excerpt.getObject()), new ZPair("context", text)));
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult35 :
                    ZVal.getIterable(
                            new ReferenceClassProperty(this, "InlineTypes", env)
                                    .arrayGet(env, marker),
                            env,
                            true)) {
                inlineType = ZVal.assign(zpairResult35.getValue());
                if (ZVal.toBool(!ZVal.isEmpty(nonNestables))
                        && ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(inlineType, nonNestables)
                                        .value())) {
                    continue;
                }

                Inline.setObject(
                        env.callMethod(
                                this,
                                new RuntimeArgsWithReferences().add(0, Excerpt),
                                "inline" + toStringR(inlineType, env),
                                Parsedown.class,
                                Excerpt.getObject()));
                if (!ZVal.isset(Inline.getObject())) {
                    continue;
                }

                if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, Inline, env, "position"))
                        && ZVal.toBool(
                                ZVal.isGreaterThan(
                                        Inline.arrayGet(env, "position"), '>', markerPosition))) {
                    continue;
                }

                if (!arrayActionR(ArrayAction.ISSET, Inline, env, "position")) {
                    Inline.arrayAccess(env, "position").set(markerPosition);
                }

                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult36 : ZVal.getIterable(nonNestables, env, true)) {
                    non_nestable = ZVal.assign(zpairResult36.getValue());
                    Inline.arrayAppend(env, "element", "nonNestables").set(non_nestable);
                }

                unmarkedText =
                        function_substr
                                .f
                                .env(env)
                                .call(text, 0, Inline.arrayGet(env, "position"))
                                .value();
                markup =
                        toStringR(markup, env)
                                + toStringR(this.unmarkedText(env, unmarkedText), env);
                markup =
                        toStringR(markup, env)
                                + toStringR(
                                        arrayActionR(ArrayAction.ISSET, Inline, env, "markup")
                                                ? Inline.arrayGet(env, "markup")
                                                : this.element(
                                                        env, Inline.arrayGet(env, "element")),
                                        env);
                text =
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        text,
                                        ZVal.add(
                                                Inline.arrayGet(env, "position"),
                                                Inline.arrayGet(env, "extent")))
                                .value();
                runtimeConverterContinueCount = 2;
                runtimeConverterContinueCount--;
                continue;
            }

            unmarkedText =
                    function_substr.f.env(env).call(text, 0, ZVal.add(markerPosition, 1)).value();
            markup = toStringR(markup, env) + toStringR(this.unmarkedText(env, unmarkedText), env);
            text = function_substr.f.env(env).call(text, ZVal.add(markerPosition, 1)).value();
        }

        markup = toStringR(markup, env) + toStringR(this.unmarkedText(env, text), env);
        return ZVal.assign(markup);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Excerpt")
    protected Object inlineCode(RuntimeEnv env, Object... args) {
        ReferenceContainer Excerpt = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object marker = null;
        Object text = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        marker = ZVal.assign(Excerpt.arrayGet(env, "text", 0));
        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "/^("
                                + toStringR(marker, env)
                                + "+)[ ]*(.+?)[ ]*(?<!"
                                + toStringR(marker, env)
                                + ")\\1(?!"
                                + toStringR(marker, env)
                                + ")/s",
                        Excerpt.arrayGet(env, "text"),
                        matches.getObject())
                .getBool()) {
            text = ZVal.assign(matches.arrayGet(env, 2));
            text = function_preg_replace.f.env(env).call("/[ ]*\n/", " ", text).value();
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "extent",
                                    function_strlen
                                            .f
                                            .env(env)
                                            .call(matches.arrayGet(env, 0))
                                            .value()),
                            new ZPair(
                                    "element",
                                    ZVal.newArray(
                                            new ZPair("name", "code"), new ZPair("text", text)))));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Excerpt")
    protected Object inlineEmailTag(RuntimeEnv env, Object... args) {
        ReferenceContainer Excerpt = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object url = null;
        if (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                function_strpos
                                        .f
                                        .env(env)
                                        .call(Excerpt.arrayGet(env, "text"), ">")
                                        .value(),
                                "!==",
                                false))
                && ZVal.toBool(
                        function_preg_match
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(
                                        "/^<((mailto:)?\\S+?@\\S+?)>/i",
                                        Excerpt.arrayGet(env, "text"),
                                        matches.getObject())
                                .value())) {
            url = ZVal.assign(matches.arrayGet(env, 1));
            if (!arrayActionR(ArrayAction.ISSET, matches, env, 2)) {
                url = "mailto:" + toStringR(url, env);
            }

            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "extent",
                                    function_strlen
                                            .f
                                            .env(env)
                                            .call(matches.arrayGet(env, 0))
                                            .value()),
                            new ZPair(
                                    "element",
                                    ZVal.newArray(
                                            new ZPair("name", "a"),
                                            new ZPair("text", matches.arrayGet(env, 1)),
                                            new ZPair(
                                                    "attributes",
                                                    ZVal.newArray(new ZPair("href", url)))))));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Excerpt")
    protected Object inlineEmphasis(RuntimeEnv env, Object... args) {
        ReferenceContainer Excerpt = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object marker = null;
        Object emphasis = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (!arrayActionR(ArrayAction.ISSET, Excerpt, env, "text", 1)) {
            return null;
        }

        marker = ZVal.assign(Excerpt.arrayGet(env, "text", 0));
        if (ZVal.toBool(ZVal.strictEqualityCheck(Excerpt.arrayGet(env, "text", 1), "===", marker))
                && ZVal.toBool(
                        function_preg_match
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(
                                        new ReferenceClassProperty(this, "StrongRegex", env)
                                                .arrayGet(env, marker),
                                        Excerpt.arrayGet(env, "text"),
                                        matches.getObject())
                                .value())) {
            emphasis = "strong";

        } else if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        new ReferenceClassProperty(this, "EmRegex", env).arrayGet(env, marker),
                        Excerpt.arrayGet(env, "text"),
                        matches.getObject())
                .getBool()) {
            emphasis = "em";

        } else {
            return null;
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "extent",
                                function_strlen.f.env(env).call(matches.arrayGet(env, 0)).value()),
                        new ZPair(
                                "element",
                                ZVal.newArray(
                                        new ZPair("name", emphasis),
                                        new ZPair("handler", "line"),
                                        new ZPair("text", matches.arrayGet(env, 1))))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Excerpt")
    protected Object inlineEscapeSequence(RuntimeEnv env, Object... args) {
        ReferenceContainer Excerpt = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, Excerpt, env, "text", 1))
                && ZVal.toBool(
                        function_in_array
                                .f
                                .env(env)
                                .call(Excerpt.arrayGet(env, "text", 1), this.specialCharacters)
                                .value())) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair("markup", Excerpt.arrayGet(env, "text", 1)),
                            new ZPair("extent", 2)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Excerpt")
    protected Object inlineImage(RuntimeEnv env, Object... args) {
        ReferenceContainer Excerpt = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer Inline = new BasicReferenceContainer(null);
        ReferenceContainer Link = new BasicReferenceContainer(null);
        if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, Excerpt, env, "text", 1))
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                Excerpt.arrayGet(env, "text", 1), "!==", "["))) {
            return null;
        }

        Excerpt.arrayAccess(env, "text")
                .set(function_substr.f.env(env).call(Excerpt.arrayGet(env, "text"), 1).value());
        Link.setObject(this.inlineLink(env, Excerpt.getObject()));
        if (ZVal.strictEqualityCheck(Link.getObject(), "===", ZVal.getNull())) {
            return null;
        }

        Inline.setObject(
                ZVal.newArray(
                        new ZPair("extent", ZVal.add(Link.arrayGet(env, "extent"), 1)),
                        new ZPair(
                                "element",
                                ZVal.newArray(
                                        new ZPair("name", "img"),
                                        new ZPair(
                                                "attributes",
                                                ZVal.newArray(
                                                        new ZPair(
                                                                "src",
                                                                Link.arrayGet(
                                                                        env,
                                                                        "element",
                                                                        "attributes",
                                                                        "href")),
                                                        new ZPair(
                                                                "alt",
                                                                Link.arrayGet(
                                                                        env, "element",
                                                                        "text"))))))));
        Inline.arrayAccess(env, "element", "attributes")
                .set(
                        ZAssignment.add(
                                "+=",
                                Inline.arrayGet(env, "element", "attributes"),
                                Link.arrayGet(env, "element", "attributes")));
        arrayActionR(ArrayAction.UNSET, Inline, env, "element", "attributes", "href");
        return ZVal.assign(Inline.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Excerpt")
    protected Object inlineLink(RuntimeEnv env, Object... args) {
        ReferenceContainer Excerpt = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object extent = null;
        ReferenceContainer Element = new BasicReferenceContainer(null);
        ReferenceContainer Definition = new BasicReferenceContainer(null);
        Object definition = null;
        Object remainder = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Element.setObject(
                ZVal.newArray(
                        new ZPair("name", "a"),
                        new ZPair("handler", "line"),
                        new ZPair("nonNestables", ZVal.arrayFromList("Url", "Link")),
                        new ZPair("text", ZVal.getNull()),
                        new ZPair(
                                "attributes",
                                ZVal.newArray(
                                        new ZPair("href", ZVal.getNull()),
                                        new ZPair("title", ZVal.getNull())))));
        extent = 0;
        remainder = ZVal.assign(Excerpt.arrayGet(env, "text"));
        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call("/\\[((?:[^][]++|(?R))*+)\\]/", remainder, matches.getObject())
                .getBool()) {
            Element.arrayAccess(env, "text").set(matches.arrayGet(env, 1));
            extent =
                    ZAssignment.add(
                            "+=",
                            extent,
                            function_strlen.f.env(env).call(matches.arrayGet(env, 0)).value());
            remainder = function_substr.f.env(env).call(remainder, extent).value();

        } else {
            return null;
        }

        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "/^[(]\\s*+((?:[^ ()]++|[(][^ )]+[)])++)(?:[ ]+(\"[^\"]*\"|'[^']*'))?\\s*[)]/",
                        remainder,
                        matches.getObject())
                .getBool()) {
            Element.arrayAccess(env, "attributes", "href").set(matches.arrayGet(env, 1));
            if (arrayActionR(ArrayAction.ISSET, matches, env, 2)) {
                Element.arrayAccess(env, "attributes", "title")
                        .set(
                                function_substr
                                        .f
                                        .env(env)
                                        .call(matches.arrayGet(env, 2), 1, -1)
                                        .value());
            }

            extent =
                    ZAssignment.add(
                            "+=",
                            extent,
                            function_strlen.f.env(env).call(matches.arrayGet(env, 0)).value());

        } else {
            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/^\\s*\\[(.*?)\\]/", remainder, matches.getObject())
                    .getBool()) {
                definition =
                        ZVal.assign(
                                function_strlen.f.env(env).call(matches.arrayGet(env, 1)).getBool()
                                        ? matches.arrayGet(env, 1)
                                        : Element.arrayGet(env, "text"));
                definition = NamespaceGlobal.strtolower.env(env).call(definition).value();
                extent =
                        ZAssignment.add(
                                "+=",
                                extent,
                                function_strlen.f.env(env).call(matches.arrayGet(env, 0)).value());

            } else {
                definition =
                        NamespaceGlobal.strtolower
                                .env(env)
                                .call(Element.arrayGet(env, "text"))
                                .value();
            }

            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "DefinitionData", env),
                    env,
                    "Reference",
                    definition)) {
                return null;
            }

            Definition.setObject(
                    ZVal.assign(
                            new ReferenceClassProperty(this, "DefinitionData", env)
                                    .arrayGet(env, "Reference", definition)));
            Element.arrayAccess(env, "attributes", "href").set(Definition.arrayGet(env, "url"));
            Element.arrayAccess(env, "attributes", "title").set(Definition.arrayGet(env, "title"));
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("extent", extent), new ZPair("element", Element.getObject())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Excerpt")
    protected Object inlineMarkup(RuntimeEnv env, Object... args) {
        ReferenceContainer Excerpt = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (ZVal.toBool(ZVal.toBool(this.markupEscaped) || ZVal.toBool(this.safeMode))
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                function_strpos
                                        .f
                                        .env(env)
                                        .call(Excerpt.arrayGet(env, "text"), ">")
                                        .value(),
                                "===",
                                false))) {
            return null;
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(Excerpt.arrayGet(env, "text", 1), "===", "/"))
                && ZVal.toBool(
                        function_preg_match
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(
                                        "/^<\\/\\w[\\w-]*[ ]*>/s",
                                        Excerpt.arrayGet(env, "text"),
                                        matches.getObject())
                                .value())) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair("markup", matches.arrayGet(env, 0)),
                            new ZPair(
                                    "extent",
                                    function_strlen
                                            .f
                                            .env(env)
                                            .call(matches.arrayGet(env, 0))
                                            .value())));
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(Excerpt.arrayGet(env, "text", 1), "===", "!"))
                && ZVal.toBool(
                        function_preg_match
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(
                                        "/^<!---?[^>-](?:-?[^-])*-->/s",
                                        Excerpt.arrayGet(env, "text"),
                                        matches.getObject())
                                .value())) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair("markup", matches.arrayGet(env, 0)),
                            new ZPair(
                                    "extent",
                                    function_strlen
                                            .f
                                            .env(env)
                                            .call(matches.arrayGet(env, 0))
                                            .value())));
        }

        if (ZVal.toBool(ZVal.strictNotEqualityCheck(Excerpt.arrayGet(env, "text", 1), "!==", " "))
                && ZVal.toBool(
                        function_preg_match
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(
                                        "/^<\\w[\\w-]*(?:[ ]*"
                                                + toStringR(this.regexHtmlAttribute, env)
                                                + ")*[ ]*\\/?>/s",
                                        Excerpt.arrayGet(env, "text"),
                                        matches.getObject())
                                .value())) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair("markup", matches.arrayGet(env, 0)),
                            new ZPair(
                                    "extent",
                                    function_strlen
                                            .f
                                            .env(env)
                                            .call(matches.arrayGet(env, 0))
                                            .value())));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Excerpt")
    protected Object inlineSpecialCharacter(RuntimeEnv env, Object... args) {
        ReferenceContainer Excerpt = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer SpecialCharacter = new BasicReferenceContainer(null);
        if (ZVal.toBool(ZVal.strictEqualityCheck(Excerpt.arrayGet(env, "text", 0), "===", "&"))
                && ZVal.toBool(
                        !function_preg_match
                                .f
                                .env(env)
                                .call("/^&#?\\w+;/", Excerpt.arrayGet(env, "text"))
                                .getBool())) {
            return ZVal.assign(ZVal.newArray(new ZPair("markup", "&amp;"), new ZPair("extent", 1)));
        }

        SpecialCharacter.setObject(
                ZVal.newArray(new ZPair(">", "gt"), new ZPair("<", "lt"), new ZPair("\"", "quot")));
        if (arrayActionR(
                ArrayAction.ISSET, SpecialCharacter, env, Excerpt.arrayGet(env, "text", 0))) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "markup",
                                    "&"
                                            + toStringR(
                                                    SpecialCharacter.arrayGet(
                                                            env, Excerpt.arrayGet(env, "text", 0)),
                                                    env)
                                            + ";"),
                            new ZPair("extent", 1)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Excerpt")
    protected Object inlineStrikethrough(RuntimeEnv env, Object... args) {
        ReferenceContainer Excerpt = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (!arrayActionR(ArrayAction.ISSET, Excerpt, env, "text", 1)) {
            return null;
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(Excerpt.arrayGet(env, "text", 1), "===", "~"))
                && ZVal.toBool(
                        function_preg_match
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(
                                        "/^~~(?=\\S)(.+?)(?<=\\S)~~/",
                                        Excerpt.arrayGet(env, "text"),
                                        matches.getObject())
                                .value())) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "extent",
                                    function_strlen
                                            .f
                                            .env(env)
                                            .call(matches.arrayGet(env, 0))
                                            .value()),
                            new ZPair(
                                    "element",
                                    ZVal.newArray(
                                            new ZPair("name", "del"),
                                            new ZPair("text", matches.arrayGet(env, 1)),
                                            new ZPair("handler", "line")))));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Excerpt")
    protected Object inlineUrl(RuntimeEnv env, Object... args) {
        ReferenceContainer Excerpt = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object Inline = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object url = null;
        if (ZVal.toBool(
                        ZVal.toBool(ZVal.strictNotEqualityCheck(this.urlsLinked, "!==", true))
                                || ZVal.toBool(
                                        !arrayActionR(ArrayAction.ISSET, Excerpt, env, "text", 2)))
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                Excerpt.arrayGet(env, "text", 2), "!==", "/"))) {
            return null;
        }

        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "/\\bhttps?:[\\/]{2}[^\\s<]+\\b\\/*/ui",
                        Excerpt.arrayGet(env, "context"), matches.getObject(), 256)
                .getBool()) {
            url = ZVal.assign(matches.arrayGet(env, 0, 0));
            Inline =
                    ZVal.newArray(
                            new ZPair(
                                    "extent",
                                    function_strlen
                                            .f
                                            .env(env)
                                            .call(matches.arrayGet(env, 0, 0))
                                            .value()),
                            new ZPair("position", matches.arrayGet(env, 0, 1)),
                            new ZPair(
                                    "element",
                                    ZVal.newArray(
                                            new ZPair("name", "a"),
                                            new ZPair("text", url),
                                            new ZPair(
                                                    "attributes",
                                                    ZVal.newArray(new ZPair("href", url))))));
            return ZVal.assign(Inline);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Excerpt")
    protected Object inlineUrlTag(RuntimeEnv env, Object... args) {
        ReferenceContainer Excerpt = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object url = null;
        if (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                function_strpos
                                        .f
                                        .env(env)
                                        .call(Excerpt.arrayGet(env, "text"), ">")
                                        .value(),
                                "!==",
                                false))
                && ZVal.toBool(
                        function_preg_match
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(
                                        "/^<(\\w+:\\/{2}[^ >]+)>/i",
                                        Excerpt.arrayGet(env, "text"), matches.getObject())
                                .value())) {
            url = ZVal.assign(matches.arrayGet(env, 1));
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "extent",
                                    function_strlen
                                            .f
                                            .env(env)
                                            .call(matches.arrayGet(env, 0))
                                            .value()),
                            new ZPair(
                                    "element",
                                    ZVal.newArray(
                                            new ZPair("name", "a"),
                                            new ZPair("text", url),
                                            new ZPair(
                                                    "attributes",
                                                    ZVal.newArray(new ZPair("href", url)))))));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text")
    protected Object unmarkedText(RuntimeEnv env, Object... args) {
        Object text = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.breaksEnabled)) {
            text = function_preg_replace.f.env(env).call("/[ ]*\\n/", "<br />\n", text).value();

        } else {
            text =
                    function_preg_replace
                            .f
                            .env(env)
                            .call("/(?:[ ][ ]+|[ ]*\\\\)\\n/", "<br />\n", text)
                            .value();
            text = function_str_replace.f.env(env).call(" \n", "\n", text).value();
        }

        return ZVal.assign(text);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Element", typeHint = "array")
    protected Object element(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer Element = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object markup = null;
        Object name = null;
        Object value = null;
        if (ZVal.isTrue(this.safeMode)) {
            Element.setObject(this.sanitiseElement(env, Element.getObject()));
        }

        markup = "<" + toStringR(Element.arrayGet(env, "name"), env);
        if (arrayActionR(ArrayAction.ISSET, Element, env, "attributes")) {
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult37 :
                    ZVal.getIterable(Element.arrayGet(env, "attributes"), env, false)) {
                name = ZVal.assign(zpairResult37.getKey());
                value = ZVal.assign(zpairResult37.getValue());
                if (ZVal.strictEqualityCheck(value, "===", ZVal.getNull())) {
                    continue;
                }

                markup =
                        toStringR(markup, env)
                                + " "
                                + toStringR(name, env)
                                + "=\""
                                + toStringR(runtimeStaticObject.escape(env, value), env)
                                + "\"";
            }
        }

        if (arrayActionR(ArrayAction.ISSET, Element, env, "text")) {
            markup = toStringR(markup, env) + ">";
            if (!arrayActionR(ArrayAction.ISSET, Element, env, "nonNestables")) {
                Element.arrayAccess(env, "nonNestables").set(ZVal.newArray());
            }

            if (arrayActionR(ArrayAction.ISSET, Element, env, "handler")) {
                markup =
                        toStringR(markup, env)
                                + toStringR(
                                        env.callMethod(
                                                this,
                                                new RuntimeArgsWithReferences()
                                                        .add(
                                                                0,
                                                                new ArrayDimensionReference(
                                                                        Element.getObject(),
                                                                        "text"))
                                                        .add(
                                                                1,
                                                                new ArrayDimensionReference(
                                                                        Element.getObject(),
                                                                        "nonNestables")),
                                                toStringR(Element.arrayGet(env, "handler"), env),
                                                Parsedown.class,
                                                Element.arrayGet(env, "text"),
                                                Element.arrayGet(env, "nonNestables")),
                                        env);

            } else {
                markup =
                        toStringR(markup, env)
                                + toStringR(
                                        runtimeStaticObject.escape(
                                                env, Element.arrayGet(env, "text"), true),
                                        env);
            }

            markup =
                    toStringR(markup, env)
                            + "</"
                            + toStringR(Element.arrayGet(env, "name"), env)
                            + ">";

        } else {
            markup = toStringR(markup, env) + " />";
        }

        return ZVal.assign(markup);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Elements", typeHint = "array")
    protected Object elements(RuntimeEnv env, Object... args) {
        Object Elements = assignParameter(args, 0, false);
        Object markup = null;
        Object Element = null;
        markup = "";
        for (ZPair zpairResult38 : ZVal.getIterable(Elements, env, true)) {
            Element = ZVal.assign(zpairResult38.getValue());
            markup = toStringR(markup, env) + "\n" + toStringR(this.element(env, Element), env);
        }

        markup = toStringR(markup, env) + "\n";
        return ZVal.assign(markup);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lines")
    protected Object li(RuntimeEnv env, Object... args) {
        Object lines = assignParameter(args, 0, false);
        Object markup = null;
        Object trimmedMarkup = null;
        Object position = null;
        markup = this.lines(env, lines);
        trimmedMarkup = function_trim.f.env(env).call(markup).value();
        if (ZVal.toBool(!function_in_array.f.env(env).call("", lines).getBool())
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                function_substr.f.env(env).call(trimmedMarkup, 0, 3).value(),
                                "===",
                                "<p>"))) {
            markup = ZVal.assign(trimmedMarkup);
            markup = function_substr.f.env(env).call(markup, 3).value();
            position = function_strpos.f.env(env).call(markup, "</p>").value();
            markup = NamespaceGlobal.substr_replace.env(env).call(markup, "", position, 4).value();
        }

        return ZVal.assign(markup);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text")
    public Object parse(RuntimeEnv env, Object... args) {
        Object text = assignParameter(args, 0, false);
        Object markup = null;
        markup = this.text(env, text);
        return ZVal.assign(markup);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Element", typeHint = "array")
    protected Object sanitiseElement(RuntimeEnv env, Object... args) {
        ReferenceContainer Element = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object att = null;
        Object val = null;
        ReferenceContainer safeUrlNameToAtt = new BasicReferenceContainer(null);
        ReferenceContainer goodAttribute = new BasicReferenceContainer(null);
        goodAttribute = env.getInlineStatic(2, "/^[a-zA-Z0-9][a-zA-Z0-9-_]*+$/");
        safeUrlNameToAtt =
                env.getInlineStatic(
                        3, ZVal.newArray(new ZPair("a", "href"), new ZPair("img", "src")));
        if (arrayActionR(ArrayAction.ISSET, safeUrlNameToAtt, env, Element.arrayGet(env, "name"))) {
            Element.setObject(
                    this.filterUnsafeUrlInAttribute(
                            env,
                            Element.getObject(),
                            safeUrlNameToAtt.arrayGet(env, Element.arrayGet(env, "name"))));
        }

        if (!arrayActionR(ArrayAction.EMPTY, Element, env, "attributes")) {
            for (ZPair zpairResult39 :
                    ZVal.getIterable(Element.arrayGet(env, "attributes"), env, false)) {
                att = ZVal.assign(zpairResult39.getKey());
                val = ZVal.assign(zpairResult39.getValue());
                if (!function_preg_match
                        .f
                        .env(env)
                        .call(goodAttribute.getObject(), att)
                        .getBool()) {
                    arrayActionR(ArrayAction.UNSET, Element, env, "attributes", att);

                } else if (ZVal.isTrue(runtimeStaticObject.striAtStart(env, att, "on"))) {
                    arrayActionR(ArrayAction.UNSET, Element, env, "attributes", att);
                }
            }
        }

        return ZVal.assign(Element.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "Element", typeHint = "array")
    @ConvertedParameter(index = 1, name = "attribute")
    protected Object filterUnsafeUrlInAttribute(RuntimeEnv env, Object... args) {
        ReferenceContainer Element = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object attribute = assignParameter(args, 1, false);
        Object scheme = null;
        for (ZPair zpairResult40 : ZVal.getIterable(this.safeLinksWhitelist, env, true)) {
            scheme = ZVal.assign(zpairResult40.getValue());
            if (ZVal.isTrue(
                    runtimeStaticObject.striAtStart(
                            env, Element.arrayGet(env, "attributes", attribute), scheme))) {
                return ZVal.assign(Element.getObject());
            }
        }

        Element.arrayAccess(env, "attributes", attribute)
                .set(
                        function_str_replace
                                .f
                                .env(env)
                                .call(":", "%3A", Element.arrayGet(env, "attributes", attribute))
                                .value());
        return ZVal.assign(Element.getObject());
    }

    public static final Object CONST_version = "1.7.1";

    public static final Object CONST_class = "Parsedown";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        @ConvertedParameter(
            index = 1,
            name = "allowQuotes",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        protected Object escape(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            Object allowQuotes = assignParameter(args, 1, true);
            if (null == allowQuotes) {
                allowQuotes = false;
            }
            return ZVal.assign(
                    NamespaceGlobal.htmlspecialchars
                            .env(env)
                            .call(text, ZVal.isTrue(allowQuotes) ? 0 : 3, "UTF-8")
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        @ConvertedParameter(index = 1, name = "needle")
        protected Object striAtStart(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, false);
            Object needle = assignParameter(args, 1, false);
            Object len = null;
            len = function_strlen.f.env(env).call(needle).value();
            if (ZVal.isGreaterThan(len, '>', function_strlen.f.env(env).call(string).value())) {
                return ZVal.assign(false);

            } else {
                return ZVal.assign(
                        ZVal.strictEqualityCheck(
                                NamespaceGlobal.strtolower
                                        .env(env)
                                        .call(
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(string, 0, len)
                                                        .value())
                                        .value(),
                                "===",
                                NamespaceGlobal.strtolower.env(env).call(needle).value()));
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object instance(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, true);
            if (null == name) {
                name = "default";
            }
            Object instance = null;
            if (arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .classes
                                    .Parsedown
                                    .RequestStaticProperties
                                    .class,
                            "instances"),
                    env,
                    name)) {
                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .classes
                                                .Parsedown
                                                .RequestStaticProperties
                                                .class,
                                        "instances")
                                .arrayGet(env, name));
            }

            instance = env.createNewWithLateStaticBindings(this);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .classes
                                    .Parsedown
                                    .RequestStaticProperties
                                    .class,
                            "instances")
                    .arrayAccess(env, name)
                    .set(instance);
            return ZVal.assign(instance);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object instances = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Parsedown")
                    .setLookup(
                            Parsedown.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "BlockTypes",
                            "DefinitionData",
                            "EmRegex",
                            "InlineTypes",
                            "StrongRegex",
                            "breaksEnabled",
                            "inlineMarkerList",
                            "markupEscaped",
                            "regexHtmlAttribute",
                            "safeLinksWhitelist",
                            "safeMode",
                            "specialCharacters",
                            "textLevelElements",
                            "unmarkedBlockTypes",
                            "urlsLinked",
                            "voidElements")
                    .setStaticPropertyNames("instances")
                    .setFilename("vendor/erusev/parsedown/Parsedown.php")
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
