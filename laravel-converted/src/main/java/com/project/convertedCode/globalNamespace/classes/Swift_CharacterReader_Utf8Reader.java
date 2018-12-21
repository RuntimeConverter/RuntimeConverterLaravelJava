package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.classes.Swift_CharacterReader;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/CharacterReader/Utf8Reader.php

*/

public class Swift_CharacterReader_Utf8Reader extends RuntimeClassBase
        implements Swift_CharacterReader {

    public Swift_CharacterReader_Utf8Reader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_CharacterReader_Utf8Reader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    @ConvertedParameter(index = 1, name = "startOffset")
    @ConvertedParameter(index = 2, name = "currentMap")
    @ConvertedParameter(index = 3, name = "ignoredChars")
    public Object getCharPositions(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        ReferenceContainer string = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object startOffset = assignParameter(args, 1, false);
        ReferenceContainer currentMap =
                assignParameterRef(runtimePassByReferenceArgs, args, 2, false);
        ReferenceContainer ignoredChars =
                assignParameterRef(runtimePassByReferenceArgs, args, 3, false);
        ReferenceContainer foundChars = new BasicReferenceContainer(null);
        Object strlen = null;
        Object charPos = null;
        Object size = null;
        Object invalid = null;
        Object _pChar = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer j = new BasicReferenceContainer(null);
        if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, currentMap, env, "i"))
                || ZVal.toBool(!arrayActionR(ArrayAction.ISSET, currentMap, env, "p"))) {
            currentMap
                    .arrayAccess(env, "p")
                    .set(currentMap.arrayAccess(env, "i").set(ZVal.newArray()));
        }

        strlen = function_strlen.f.env(env).call(string.getObject()).value();
        charPos = function_count.f.env(env).call(currentMap.arrayGet(env, "p")).value();
        foundChars.setObject(0);
        invalid = false;
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', strlen);
                i.setObject(ZVal.increment(i.getObject()))) {
            _pChar = ZVal.assign(string.arrayGet(env, i.getObject()));
            size =
                    ZVal.assign(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .classes
                                                    .Swift_CharacterReader_Utf8Reader
                                                    .RequestStaticProperties
                                                    .class,
                                            "s_length_map")
                                    .arrayGet(env, _pChar));
            if (ZVal.equalityCheck(0, size)) {
                invalid = true;
                continue;

            } else {
                if (ZVal.strictEqualityCheck(true, "===", invalid)) {
                    currentMap
                            .arrayAccess(env, "p", ZVal.add(charPos, foundChars.getObject()))
                            .set(ZVal.add(startOffset, i.getObject()));
                    currentMap
                            .arrayAccess(env, "i", ZVal.add(charPos, foundChars.getObject()))
                            .set(true);
                    foundChars.setObject(ZVal.increment(foundChars.getObject()));
                    invalid = false;
                }

                if (ZVal.isGreaterThan(ZVal.add(i.getObject(), size), '>', strlen)) {
                    ignoredChars.setObject(
                            function_substr
                                    .f
                                    .env(env)
                                    .call(string.getObject(), i.getObject())
                                    .value());
                    break;
                }

                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (j.setObject(1);
                        ZVal.isLessThan(j.getObject(), '<', size);
                        j.setObject(ZVal.increment(j.getObject()))) {
                    _pChar =
                            ZVal.assign(
                                    string.arrayGet(env, ZVal.add(i.getObject(), j.getObject())));
                    if (ZVal.toBool(ZVal.isGreaterThan(_pChar, '>', ""))
                            && ZVal.toBool(
                                    ZVal.isLessThan(_pChar, '<', ZVal.base64Decode("wA==")))) {

                    } else {
                        invalid = true;
                        runtimeConverterContinueCount = 2;
                        runtimeConverterContinueCount--;
                        continue;
                    }
                }

                currentMap
                        .arrayAccess(env, "p", ZVal.add(charPos, foundChars.getObject()))
                        .set(ZVal.add(ZVal.add(startOffset, i.getObject()), size));
                i.setObject(ZAssignment.add("+=", i.getObject(), ZVal.subtract(j.getObject(), 1)));
                foundChars.setObject(ZVal.increment(foundChars.getObject()));
            }
        }

        return ZVal.assign(foundChars.getObject());
    }

    public Object getCharPositions(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    public Object getMapType(RuntimeEnv env, Object... args) {
        return ZVal.assign(CONST_MAP_TYPE_POSITIONS);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    @ConvertedParameter(index = 1, name = "size")
    public Object validateByteSequence(RuntimeEnv env, Object... args) {
        ReferenceContainer bytes = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object size = assignParameter(args, 1, false);
        Object needed = null;
        if (ZVal.isLessThan(size, '<', 1)) {
            return -1;
        }

        needed =
                ZVal.subtract(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .classes
                                                .Swift_CharacterReader_Utf8Reader
                                                .RequestStaticProperties
                                                .class,
                                        "length_map")
                                .arrayGet(env, bytes.arrayGet(env, 0)),
                        size);
        return ZVal.assign(ZVal.isGreaterThan(needed, '>', -1) ? needed : -1);
    }

    @ConvertedMethod
    public Object getInitialByteSize(RuntimeEnv env, Object... args) {
        return 1;
    }

    public static final Object CONST_class = "Swift_CharacterReader_Utf8Reader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object length_map =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                    1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                    0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3,
                                    3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5,
                                    6, 6, 0, 0);
                        });

        public Object s_length_map =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.newArray(
                                    new ZPair("\u0000", 1),
                                    new ZPair("\u0001", 1),
                                    new ZPair("\u0002", 1),
                                    new ZPair("\u0003", 1),
                                    new ZPair("\u0004", 1),
                                    new ZPair("\u0005", 1),
                                    new ZPair("\u0006", 1),
                                    new ZPair("\u0007", 1),
                                    new ZPair("\b", 1),
                                    new ZPair("\t", 1),
                                    new ZPair("\n", 1),
                                    new ZPair("\u000B", 1),
                                    new ZPair("\f", 1),
                                    new ZPair("\r", 1),
                                    new ZPair("\u000E", 1),
                                    new ZPair("\u000F", 1),
                                    new ZPair("\u0010", 1),
                                    new ZPair("\u0011", 1),
                                    new ZPair("\u0012", 1),
                                    new ZPair("\u0013", 1),
                                    new ZPair("\u0014", 1),
                                    new ZPair("\u0015", 1),
                                    new ZPair("\u0016", 1),
                                    new ZPair("\u0017", 1),
                                    new ZPair("\u0018", 1),
                                    new ZPair("\u0019", 1),
                                    new ZPair("\u001A", 1),
                                    new ZPair("\u001B", 1),
                                    new ZPair("\u001C", 1),
                                    new ZPair("\u001D", 1),
                                    new ZPair("\u001E", 1),
                                    new ZPair("\u001F", 1),
                                    new ZPair(" ", 1),
                                    new ZPair("!", 1),
                                    new ZPair("\"", 1),
                                    new ZPair("#", 1),
                                    new ZPair("$", 1),
                                    new ZPair("%", 1),
                                    new ZPair("&", 1),
                                    new ZPair("'", 1),
                                    new ZPair("(", 1),
                                    new ZPair(")", 1),
                                    new ZPair("*", 1),
                                    new ZPair("+", 1),
                                    new ZPair(",", 1),
                                    new ZPair("-", 1),
                                    new ZPair(".", 1),
                                    new ZPair("/", 1),
                                    new ZPair("0", 1),
                                    new ZPair("1", 1),
                                    new ZPair("2", 1),
                                    new ZPair("3", 1),
                                    new ZPair("4", 1),
                                    new ZPair("5", 1),
                                    new ZPair("6", 1),
                                    new ZPair("7", 1),
                                    new ZPair("8", 1),
                                    new ZPair("9", 1),
                                    new ZPair(":", 1),
                                    new ZPair(";", 1),
                                    new ZPair("<", 1),
                                    new ZPair("=", 1),
                                    new ZPair(">", 1),
                                    new ZPair("?", 1),
                                    new ZPair("@", 1),
                                    new ZPair("A", 1),
                                    new ZPair("B", 1),
                                    new ZPair("C", 1),
                                    new ZPair("D", 1),
                                    new ZPair("E", 1),
                                    new ZPair("F", 1),
                                    new ZPair("G", 1),
                                    new ZPair("H", 1),
                                    new ZPair("I", 1),
                                    new ZPair("J", 1),
                                    new ZPair("K", 1),
                                    new ZPair("L", 1),
                                    new ZPair("M", 1),
                                    new ZPair("N", 1),
                                    new ZPair("O", 1),
                                    new ZPair("P", 1),
                                    new ZPair("Q", 1),
                                    new ZPair("R", 1),
                                    new ZPair("S", 1),
                                    new ZPair("T", 1),
                                    new ZPair("U", 1),
                                    new ZPair("V", 1),
                                    new ZPair("W", 1),
                                    new ZPair("X", 1),
                                    new ZPair("Y", 1),
                                    new ZPair("Z", 1),
                                    new ZPair("[", 1),
                                    new ZPair("\\", 1),
                                    new ZPair("]", 1),
                                    new ZPair("^", 1),
                                    new ZPair("_", 1),
                                    new ZPair("`", 1),
                                    new ZPair("a", 1),
                                    new ZPair("b", 1),
                                    new ZPair("c", 1),
                                    new ZPair("d", 1),
                                    new ZPair("e", 1),
                                    new ZPair("f", 1),
                                    new ZPair("g", 1),
                                    new ZPair("h", 1),
                                    new ZPair("i", 1),
                                    new ZPair("j", 1),
                                    new ZPair("k", 1),
                                    new ZPair("l", 1),
                                    new ZPair("m", 1),
                                    new ZPair("n", 1),
                                    new ZPair("o", 1),
                                    new ZPair("p", 1),
                                    new ZPair("q", 1),
                                    new ZPair("r", 1),
                                    new ZPair("s", 1),
                                    new ZPair("t", 1),
                                    new ZPair("u", 1),
                                    new ZPair("v", 1),
                                    new ZPair("w", 1),
                                    new ZPair("x", 1),
                                    new ZPair("y", 1),
                                    new ZPair("z", 1),
                                    new ZPair("{", 1),
                                    new ZPair("|", 1),
                                    new ZPair("}", 1),
                                    new ZPair("~", 1),
                                    new ZPair("", 1),
                                    new ZPair(ZVal.base64Decode("gA=="), 0),
                                    new ZPair(ZVal.base64Decode("gQ=="), 0),
                                    new ZPair(ZVal.base64Decode("gg=="), 0),
                                    new ZPair(ZVal.base64Decode("gw=="), 0),
                                    new ZPair(ZVal.base64Decode("hA=="), 0),
                                    new ZPair(ZVal.base64Decode("hQ=="), 0),
                                    new ZPair(ZVal.base64Decode("hg=="), 0),
                                    new ZPair(ZVal.base64Decode("hw=="), 0),
                                    new ZPair(ZVal.base64Decode("iA=="), 0),
                                    new ZPair(ZVal.base64Decode("iQ=="), 0),
                                    new ZPair(ZVal.base64Decode("ig=="), 0),
                                    new ZPair(ZVal.base64Decode("iw=="), 0),
                                    new ZPair(ZVal.base64Decode("jA=="), 0),
                                    new ZPair(ZVal.base64Decode("jQ=="), 0),
                                    new ZPair(ZVal.base64Decode("jg=="), 0),
                                    new ZPair(ZVal.base64Decode("jw=="), 0),
                                    new ZPair(ZVal.base64Decode("kA=="), 0),
                                    new ZPair(ZVal.base64Decode("kQ=="), 0),
                                    new ZPair(ZVal.base64Decode("kg=="), 0),
                                    new ZPair(ZVal.base64Decode("kw=="), 0),
                                    new ZPair(ZVal.base64Decode("lA=="), 0),
                                    new ZPair(ZVal.base64Decode("lQ=="), 0),
                                    new ZPair(ZVal.base64Decode("lg=="), 0),
                                    new ZPair(ZVal.base64Decode("lw=="), 0),
                                    new ZPair(ZVal.base64Decode("mA=="), 0),
                                    new ZPair(ZVal.base64Decode("mQ=="), 0),
                                    new ZPair(ZVal.base64Decode("mg=="), 0),
                                    new ZPair(ZVal.base64Decode("mw=="), 0),
                                    new ZPair(ZVal.base64Decode("nA=="), 0),
                                    new ZPair(ZVal.base64Decode("nQ=="), 0),
                                    new ZPair(ZVal.base64Decode("ng=="), 0),
                                    new ZPair(ZVal.base64Decode("nw=="), 0),
                                    new ZPair(ZVal.base64Decode("oA=="), 0),
                                    new ZPair(ZVal.base64Decode("oQ=="), 0),
                                    new ZPair(ZVal.base64Decode("og=="), 0),
                                    new ZPair(ZVal.base64Decode("ow=="), 0),
                                    new ZPair(ZVal.base64Decode("pA=="), 0),
                                    new ZPair(ZVal.base64Decode("pQ=="), 0),
                                    new ZPair(ZVal.base64Decode("pg=="), 0),
                                    new ZPair(ZVal.base64Decode("pw=="), 0),
                                    new ZPair(ZVal.base64Decode("qA=="), 0),
                                    new ZPair(ZVal.base64Decode("qQ=="), 0),
                                    new ZPair(ZVal.base64Decode("qg=="), 0),
                                    new ZPair(ZVal.base64Decode("qw=="), 0),
                                    new ZPair(ZVal.base64Decode("rA=="), 0),
                                    new ZPair(ZVal.base64Decode("rQ=="), 0),
                                    new ZPair(ZVal.base64Decode("rg=="), 0),
                                    new ZPair(ZVal.base64Decode("rw=="), 0),
                                    new ZPair(ZVal.base64Decode("sA=="), 0),
                                    new ZPair(ZVal.base64Decode("sQ=="), 0),
                                    new ZPair(ZVal.base64Decode("sg=="), 0),
                                    new ZPair(ZVal.base64Decode("sw=="), 0),
                                    new ZPair(ZVal.base64Decode("tA=="), 0),
                                    new ZPair(ZVal.base64Decode("tQ=="), 0),
                                    new ZPair(ZVal.base64Decode("tg=="), 0),
                                    new ZPair(ZVal.base64Decode("tw=="), 0),
                                    new ZPair(ZVal.base64Decode("uA=="), 0),
                                    new ZPair(ZVal.base64Decode("uQ=="), 0),
                                    new ZPair(ZVal.base64Decode("ug=="), 0),
                                    new ZPair(ZVal.base64Decode("uw=="), 0),
                                    new ZPair(ZVal.base64Decode("vA=="), 0),
                                    new ZPair(ZVal.base64Decode("vQ=="), 0),
                                    new ZPair(ZVal.base64Decode("vg=="), 0),
                                    new ZPair(ZVal.base64Decode("vw=="), 0),
                                    new ZPair(ZVal.base64Decode("wA=="), 2),
                                    new ZPair(ZVal.base64Decode("wQ=="), 2),
                                    new ZPair(ZVal.base64Decode("wg=="), 2),
                                    new ZPair(ZVal.base64Decode("ww=="), 2),
                                    new ZPair(ZVal.base64Decode("xA=="), 2),
                                    new ZPair(ZVal.base64Decode("xQ=="), 2),
                                    new ZPair(ZVal.base64Decode("xg=="), 2),
                                    new ZPair(ZVal.base64Decode("xw=="), 2),
                                    new ZPair(ZVal.base64Decode("yA=="), 2),
                                    new ZPair(ZVal.base64Decode("yQ=="), 2),
                                    new ZPair(ZVal.base64Decode("yg=="), 2),
                                    new ZPair(ZVal.base64Decode("yw=="), 2),
                                    new ZPair(ZVal.base64Decode("zA=="), 2),
                                    new ZPair(ZVal.base64Decode("zQ=="), 2),
                                    new ZPair(ZVal.base64Decode("zg=="), 2),
                                    new ZPair(ZVal.base64Decode("zw=="), 2),
                                    new ZPair(ZVal.base64Decode("0A=="), 2),
                                    new ZPair(ZVal.base64Decode("0Q=="), 2),
                                    new ZPair(ZVal.base64Decode("0g=="), 2),
                                    new ZPair(ZVal.base64Decode("0w=="), 2),
                                    new ZPair(ZVal.base64Decode("1A=="), 2),
                                    new ZPair(ZVal.base64Decode("1Q=="), 2),
                                    new ZPair(ZVal.base64Decode("1g=="), 2),
                                    new ZPair(ZVal.base64Decode("1w=="), 2),
                                    new ZPair(ZVal.base64Decode("2A=="), 2),
                                    new ZPair(ZVal.base64Decode("2Q=="), 2),
                                    new ZPair(ZVal.base64Decode("2g=="), 2),
                                    new ZPair(ZVal.base64Decode("2w=="), 2),
                                    new ZPair(ZVal.base64Decode("3A=="), 2),
                                    new ZPair(ZVal.base64Decode("3Q=="), 2),
                                    new ZPair(ZVal.base64Decode("3g=="), 2),
                                    new ZPair(ZVal.base64Decode("3w=="), 2),
                                    new ZPair(ZVal.base64Decode("4A=="), 3),
                                    new ZPair(ZVal.base64Decode("4Q=="), 3),
                                    new ZPair(ZVal.base64Decode("4g=="), 3),
                                    new ZPair(ZVal.base64Decode("4w=="), 3),
                                    new ZPair(ZVal.base64Decode("5A=="), 3),
                                    new ZPair(ZVal.base64Decode("5Q=="), 3),
                                    new ZPair(ZVal.base64Decode("5g=="), 3),
                                    new ZPair(ZVal.base64Decode("5w=="), 3),
                                    new ZPair(ZVal.base64Decode("6A=="), 3),
                                    new ZPair(ZVal.base64Decode("6Q=="), 3),
                                    new ZPair(ZVal.base64Decode("6g=="), 3),
                                    new ZPair(ZVal.base64Decode("6w=="), 3),
                                    new ZPair(ZVal.base64Decode("7A=="), 3),
                                    new ZPair(ZVal.base64Decode("7Q=="), 3),
                                    new ZPair(ZVal.base64Decode("7g=="), 3),
                                    new ZPair(ZVal.base64Decode("7w=="), 3),
                                    new ZPair(ZVal.base64Decode("8A=="), 4),
                                    new ZPair(ZVal.base64Decode("8Q=="), 4),
                                    new ZPair(ZVal.base64Decode("8g=="), 4),
                                    new ZPair(ZVal.base64Decode("8w=="), 4),
                                    new ZPair(ZVal.base64Decode("9A=="), 4),
                                    new ZPair(ZVal.base64Decode("9Q=="), 4),
                                    new ZPair(ZVal.base64Decode("9g=="), 4),
                                    new ZPair(ZVal.base64Decode("9w=="), 4),
                                    new ZPair(ZVal.base64Decode("+A=="), 5),
                                    new ZPair(ZVal.base64Decode("+Q=="), 5),
                                    new ZPair(ZVal.base64Decode("+g=="), 5),
                                    new ZPair(ZVal.base64Decode("+w=="), 5),
                                    new ZPair(ZVal.base64Decode("/A=="), 6),
                                    new ZPair(ZVal.base64Decode("/Q=="), 6),
                                    new ZPair(ZVal.base64Decode("/g=="), 0),
                                    new ZPair(ZVal.base64Decode("/w=="), 0));
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_CharacterReader_Utf8Reader")
                    .setLookup(
                            Swift_CharacterReader_Utf8Reader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("length_map", "s_length_map")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/CharacterReader/Utf8Reader.php")
                    .addInterface("Swift_CharacterReader")
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
