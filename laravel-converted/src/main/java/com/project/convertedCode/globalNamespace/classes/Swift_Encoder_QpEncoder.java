package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Swift_Encoder;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Encoder/QpEncoder.php

*/

public class Swift_Encoder_QpEncoder extends RuntimeClassBase implements Swift_Encoder {

    public Object charStream = null;

    public Object filter = null;

    public Object safeMap = ZVal.newArray();

    public Swift_Encoder_QpEncoder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Encoder_QpEncoder.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Encoder_QpEncoder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charStream", typeHint = "Swift_CharacterStream")
    @ConvertedParameter(
        index = 1,
        name = "filter",
        typeHint = "Swift_StreamFilter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object charStream = assignParameter(args, 0, false);
        Object filter = assignParameter(args, 1, true);
        if (null == filter) {
            filter = ZVal.getNull();
        }
        this.charStream = charStream;
        if (!arrayActionR(
                ArrayAction.ISSET,
                env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .classes
                                .Swift_Encoder_QpEncoder
                                .RequestStaticProperties
                                .class,
                        "safeMapShare"),
                env,
                this.getSafeMapShareId(env))) {
            this.initSafeMap(env);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .classes
                                    .Swift_Encoder_QpEncoder
                                    .RequestStaticProperties
                                    .class,
                            "safeMapShare")
                    .arrayAccess(env, this.getSafeMapShareId(env))
                    .set(this.safeMap);

        } else {
            this.safeMap =
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .classes
                                            .Swift_Encoder_QpEncoder
                                            .RequestStaticProperties
                                            .class,
                                    "safeMapShare")
                            .arrayGet(env, this.getSafeMapShareId(env));
        }

        this.filter = filter;
        return null;
    }

    @ConvertedMethod
    public Object __sleep(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("charStream", "filter"));
    }

    @ConvertedMethod
    public Object __wakeup(RuntimeEnv env, Object... args) {
        if (!arrayActionR(
                ArrayAction.ISSET,
                env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .classes
                                .Swift_Encoder_QpEncoder
                                .RequestStaticProperties
                                .class,
                        "safeMapShare"),
                env,
                this.getSafeMapShareId(env))) {
            this.initSafeMap(env);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .classes
                                    .Swift_Encoder_QpEncoder
                                    .RequestStaticProperties
                                    .class,
                            "safeMapShare")
                    .arrayAccess(env, this.getSafeMapShareId(env))
                    .set(this.safeMap);

        } else {
            this.safeMap =
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .classes
                                            .Swift_Encoder_QpEncoder
                                            .RequestStaticProperties
                                            .class,
                                    "safeMapShare")
                            .arrayGet(env, this.getSafeMapShareId(env));
        }

        return null;
    }

    @ConvertedMethod
    protected Object getSafeMapShareId(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_get_class.f.env(env).call(this).value());
    }

    @ConvertedMethod
    protected Object initSafeMap(RuntimeEnv env, Object... args) {
        Object _pByte = null;
        for (ZPair zpairResult1503 :
                ZVal.getIterable(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        ZVal.arrayFromList(9, 32),
                                        function_range.f.env(env).call(33, 60).value(),
                                        function_range.f.env(env).call(62, 126).value())
                                .value(),
                        env,
                        true)) {
            _pByte = ZVal.assign(zpairResult1503.getValue());
            new ReferenceClassProperty(this, "safeMap", env)
                    .arrayAccess(env, _pByte)
                    .set(NamespaceGlobal.chr.env(env).call(_pByte).value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    @ConvertedParameter(
        index = 1,
        name = "firstLineOffset",
        defaultValue = "0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "maxLineLength",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object encodeString(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object string = assignParameter(args, 0, false);
        Object firstLineOffset = assignParameter(args, 1, true);
        if (null == firstLineOffset) {
            firstLineOffset = 0;
        }
        Object maxLineLength = assignParameter(args, 2, true);
        if (null == maxLineLength) {
            maxLineLength = 0;
        }
        Object newLineLength = null;
        Object b = null;
        Object thisLineLength = null;
        Object i = null;
        Object lineLen = null;
        ReferenceContainer lNo = new BasicReferenceContainer(null);
        ReferenceContainer size = new BasicReferenceContainer(null);
        Object moreBytes = null;
        ReferenceContainer bytes = new BasicReferenceContainer(null);
        Object enc = null;
        ReferenceContainer lines = new BasicReferenceContainer(null);
        ReferenceContainer currentLine = new BasicReferenceContainer(null);
        if (ZVal.toBool(ZVal.isGreaterThan(maxLineLength, '>', 76))
                || ZVal.toBool(ZVal.isLessThanOrEqualTo(maxLineLength, "<=", 0))) {
            maxLineLength = 76;
        }

        thisLineLength = ZVal.subtract(maxLineLength, firstLineOffset);
        lines.setObject(ZVal.newArray());
        lNo.setObject(0);
        lines.arrayAccess(env, lNo.getObject()).set("");
        currentLine = new ArrayDimensionReference(lines.getObject(), ZVal.postIncrement(lNo));
        size.setObject(ZVal.assign(lineLen = 0));
        env.callMethod(this.charStream, "flushContents", Swift_Encoder_QpEncoder.class);
        env.callMethod(this.charStream, "importString", Swift_Encoder_QpEncoder.class, string);
        runtimeConverterBreakCount = 0;
        while (ZVal.strictNotEqualityCheck(false, "!==", bytes.setObject(this.nextSequence(env)))) {
            if (ZVal.isset(this.filter)) {
                runtimeConverterBreakCount = 0;
                while (ZVal.isTrue(
                        env.callMethod(
                                this.filter,
                                "shouldBuffer",
                                Swift_Encoder_QpEncoder.class,
                                bytes.getObject()))) {
                    if (ZVal.strictEqualityCheck(
                            false, "===", moreBytes = this.nextSequence(env, 1))) {
                        break;
                    }

                    runtimeConverterBreakCount = 0;
                    for (ZPair zpairResult1504 : ZVal.getIterable(moreBytes, env, true)) {
                        b = ZVal.assign(zpairResult1504.getValue());
                        bytes.arrayAppend(env).set(b);
                    }
                }

                bytes.setObject(
                        env.callMethod(
                                this.filter,
                                "filter",
                                Swift_Encoder_QpEncoder.class,
                                bytes.getObject()));
            }

            enc =
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(1, size),
                            "encodeByteSequence",
                            Swift_Encoder_QpEncoder.class,
                            bytes.getObject(),
                            size.getObject());
            i = function_strpos.f.env(env).call(enc, "=0D=0A").value();
            newLineLength =
                    ZVal.add(
                            lineLen,
                            ZVal.strictEqualityCheck(false, "===", i) ? size.getObject() : i);
            if (ZVal.toBool(currentLine.getObject())
                    && ZVal.toBool(
                            ZVal.isGreaterThanOrEqualTo(newLineLength, ">=", thisLineLength))) {
                lines.arrayAccess(env, lNo.getObject()).set("");
                currentLine =
                        new ArrayDimensionReference(lines.getObject(), ZVal.postIncrement(lNo));
                thisLineLength = ZVal.assign(maxLineLength);
                lineLen = 0;
            }

            currentLine.setObject(toStringR(currentLine.getObject(), env) + toStringR(enc, env));
            if (ZVal.strictEqualityCheck(false, "===", i)) {
                lineLen = ZAssignment.add("+=", lineLen, size.getObject());

            } else {
                lineLen =
                        ZVal.subtract(
                                ZVal.subtract(
                                        size.getObject(),
                                        NamespaceGlobal.strrpos
                                                .env(env)
                                                .call(enc, "=0D=0A")
                                                .value()),
                                6);
            }
        }

        return ZVal.assign(
                this.standardize(
                        env,
                        NamespaceGlobal.implode.env(env).call("=\r\n", lines.getObject()).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object charsetChanged(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        env.callMethod(this.charStream, "setCharacterSet", Swift_Encoder_QpEncoder.class, charset);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes", typeHint = "array")
    @ConvertedParameter(index = 1, name = "size")
    protected Object encodeByteSequence(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object bytes = assignParameter(args, 0, false);
        ReferenceContainer size = assignParameterRef(runtimePassByReferenceArgs, args, 1, false);
        Object ret = null;
        Object b = null;
        ret = "";
        size.setObject(0);
        for (ZPair zpairResult1505 : ZVal.getIterable(bytes, env, true)) {
            b = ZVal.assign(zpairResult1505.getValue());
            if (arrayActionR(
                    ArrayAction.ISSET, new ReferenceClassProperty(this, "safeMap", env), env, b)) {
                ret =
                        toStringR(ret, env)
                                + toStringR(
                                        new ReferenceClassProperty(this, "safeMap", env)
                                                .arrayGet(env, b),
                                        env);
                size.setObject(ZVal.increment(size.getObject()));

            } else {
                ret =
                        toStringR(ret, env)
                                + toStringR(
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .classes
                                                                .Swift_Encoder_QpEncoder
                                                                .RequestStaticProperties
                                                                .class,
                                                        "qpMap")
                                                .arrayGet(env, b),
                                        env);
                size.setObject(ZAssignment.add("+=", size.getObject(), 3));
            }
        }

        return ZVal.assign(ret);
    }

    public Object encodeByteSequence(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "size", defaultValue = "4", defaultValueType = "number")
    protected Object nextSequence(RuntimeEnv env, Object... args) {
        Object size = assignParameter(args, 0, true);
        if (null == size) {
            size = 4;
        }
        return ZVal.assign(
                env.callMethod(this.charStream, "readBytes", Swift_Encoder_QpEncoder.class, size));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    protected Object standardize(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object end = null;
        string =
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList("\t=0D=0A", " =0D=0A", "=0D=0A"),
                                ZVal.arrayFromList("=09\r\n", "=20\r\n", "\r\n"),
                                string)
                        .value();
        switch (ZVal.toInt(
                end =
                        NamespaceGlobal.ord
                                .env(env)
                                .call(function_substr.f.env(env).call(string, -1).value())
                                .value())) {
            case 9:
            case 32:
                string =
                        NamespaceGlobal.substr_replace
                                .env(env)
                                .call(
                                        string,
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .classes
                                                                .Swift_Encoder_QpEncoder
                                                                .RequestStaticProperties
                                                                .class,
                                                        "qpMap")
                                                .arrayGet(env, end),
                                        -1)
                                .value();
        }
        ;
        return ZVal.assign(string);
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        this.charStream = ((RuntimeClassInterface) this.charStream).phpClone(env);
        return null;
    }

    public static final Object CONST_class = "Swift_Encoder_QpEncoder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object qpMap =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.newArray(
                                    new ZPair(0, "=00"),
                                    new ZPair(1, "=01"),
                                    new ZPair(2, "=02"),
                                    new ZPair(3, "=03"),
                                    new ZPair(4, "=04"),
                                    new ZPair(5, "=05"),
                                    new ZPair(6, "=06"),
                                    new ZPair(7, "=07"),
                                    new ZPair(8, "=08"),
                                    new ZPair(9, "=09"),
                                    new ZPair(10, "=0A"),
                                    new ZPair(11, "=0B"),
                                    new ZPair(12, "=0C"),
                                    new ZPair(13, "=0D"),
                                    new ZPair(14, "=0E"),
                                    new ZPair(15, "=0F"),
                                    new ZPair(16, "=10"),
                                    new ZPair(17, "=11"),
                                    new ZPair(18, "=12"),
                                    new ZPair(19, "=13"),
                                    new ZPair(20, "=14"),
                                    new ZPair(21, "=15"),
                                    new ZPair(22, "=16"),
                                    new ZPair(23, "=17"),
                                    new ZPair(24, "=18"),
                                    new ZPair(25, "=19"),
                                    new ZPair(26, "=1A"),
                                    new ZPair(27, "=1B"),
                                    new ZPair(28, "=1C"),
                                    new ZPair(29, "=1D"),
                                    new ZPair(30, "=1E"),
                                    new ZPair(31, "=1F"),
                                    new ZPair(32, "=20"),
                                    new ZPair(33, "=21"),
                                    new ZPair(34, "=22"),
                                    new ZPair(35, "=23"),
                                    new ZPair(36, "=24"),
                                    new ZPair(37, "=25"),
                                    new ZPair(38, "=26"),
                                    new ZPair(39, "=27"),
                                    new ZPair(40, "=28"),
                                    new ZPair(41, "=29"),
                                    new ZPair(42, "=2A"),
                                    new ZPair(43, "=2B"),
                                    new ZPair(44, "=2C"),
                                    new ZPair(45, "=2D"),
                                    new ZPair(46, "=2E"),
                                    new ZPair(47, "=2F"),
                                    new ZPair(48, "=30"),
                                    new ZPair(49, "=31"),
                                    new ZPair(50, "=32"),
                                    new ZPair(51, "=33"),
                                    new ZPair(52, "=34"),
                                    new ZPair(53, "=35"),
                                    new ZPair(54, "=36"),
                                    new ZPair(55, "=37"),
                                    new ZPair(56, "=38"),
                                    new ZPair(57, "=39"),
                                    new ZPair(58, "=3A"),
                                    new ZPair(59, "=3B"),
                                    new ZPair(60, "=3C"),
                                    new ZPair(61, "=3D"),
                                    new ZPair(62, "=3E"),
                                    new ZPair(63, "=3F"),
                                    new ZPair(64, "=40"),
                                    new ZPair(65, "=41"),
                                    new ZPair(66, "=42"),
                                    new ZPair(67, "=43"),
                                    new ZPair(68, "=44"),
                                    new ZPair(69, "=45"),
                                    new ZPair(70, "=46"),
                                    new ZPair(71, "=47"),
                                    new ZPair(72, "=48"),
                                    new ZPair(73, "=49"),
                                    new ZPair(74, "=4A"),
                                    new ZPair(75, "=4B"),
                                    new ZPair(76, "=4C"),
                                    new ZPair(77, "=4D"),
                                    new ZPair(78, "=4E"),
                                    new ZPair(79, "=4F"),
                                    new ZPair(80, "=50"),
                                    new ZPair(81, "=51"),
                                    new ZPair(82, "=52"),
                                    new ZPair(83, "=53"),
                                    new ZPair(84, "=54"),
                                    new ZPair(85, "=55"),
                                    new ZPair(86, "=56"),
                                    new ZPair(87, "=57"),
                                    new ZPair(88, "=58"),
                                    new ZPair(89, "=59"),
                                    new ZPair(90, "=5A"),
                                    new ZPair(91, "=5B"),
                                    new ZPair(92, "=5C"),
                                    new ZPair(93, "=5D"),
                                    new ZPair(94, "=5E"),
                                    new ZPair(95, "=5F"),
                                    new ZPair(96, "=60"),
                                    new ZPair(97, "=61"),
                                    new ZPair(98, "=62"),
                                    new ZPair(99, "=63"),
                                    new ZPair(100, "=64"),
                                    new ZPair(101, "=65"),
                                    new ZPair(102, "=66"),
                                    new ZPair(103, "=67"),
                                    new ZPair(104, "=68"),
                                    new ZPair(105, "=69"),
                                    new ZPair(106, "=6A"),
                                    new ZPair(107, "=6B"),
                                    new ZPair(108, "=6C"),
                                    new ZPair(109, "=6D"),
                                    new ZPair(110, "=6E"),
                                    new ZPair(111, "=6F"),
                                    new ZPair(112, "=70"),
                                    new ZPair(113, "=71"),
                                    new ZPair(114, "=72"),
                                    new ZPair(115, "=73"),
                                    new ZPair(116, "=74"),
                                    new ZPair(117, "=75"),
                                    new ZPair(118, "=76"),
                                    new ZPair(119, "=77"),
                                    new ZPair(120, "=78"),
                                    new ZPair(121, "=79"),
                                    new ZPair(122, "=7A"),
                                    new ZPair(123, "=7B"),
                                    new ZPair(124, "=7C"),
                                    new ZPair(125, "=7D"),
                                    new ZPair(126, "=7E"),
                                    new ZPair(127, "=7F"),
                                    new ZPair(128, "=80"),
                                    new ZPair(129, "=81"),
                                    new ZPair(130, "=82"),
                                    new ZPair(131, "=83"),
                                    new ZPair(132, "=84"),
                                    new ZPair(133, "=85"),
                                    new ZPair(134, "=86"),
                                    new ZPair(135, "=87"),
                                    new ZPair(136, "=88"),
                                    new ZPair(137, "=89"),
                                    new ZPair(138, "=8A"),
                                    new ZPair(139, "=8B"),
                                    new ZPair(140, "=8C"),
                                    new ZPair(141, "=8D"),
                                    new ZPair(142, "=8E"),
                                    new ZPair(143, "=8F"),
                                    new ZPair(144, "=90"),
                                    new ZPair(145, "=91"),
                                    new ZPair(146, "=92"),
                                    new ZPair(147, "=93"),
                                    new ZPair(148, "=94"),
                                    new ZPair(149, "=95"),
                                    new ZPair(150, "=96"),
                                    new ZPair(151, "=97"),
                                    new ZPair(152, "=98"),
                                    new ZPair(153, "=99"),
                                    new ZPair(154, "=9A"),
                                    new ZPair(155, "=9B"),
                                    new ZPair(156, "=9C"),
                                    new ZPair(157, "=9D"),
                                    new ZPair(158, "=9E"),
                                    new ZPair(159, "=9F"),
                                    new ZPair(160, "=A0"),
                                    new ZPair(161, "=A1"),
                                    new ZPair(162, "=A2"),
                                    new ZPair(163, "=A3"),
                                    new ZPair(164, "=A4"),
                                    new ZPair(165, "=A5"),
                                    new ZPair(166, "=A6"),
                                    new ZPair(167, "=A7"),
                                    new ZPair(168, "=A8"),
                                    new ZPair(169, "=A9"),
                                    new ZPair(170, "=AA"),
                                    new ZPair(171, "=AB"),
                                    new ZPair(172, "=AC"),
                                    new ZPair(173, "=AD"),
                                    new ZPair(174, "=AE"),
                                    new ZPair(175, "=AF"),
                                    new ZPair(176, "=B0"),
                                    new ZPair(177, "=B1"),
                                    new ZPair(178, "=B2"),
                                    new ZPair(179, "=B3"),
                                    new ZPair(180, "=B4"),
                                    new ZPair(181, "=B5"),
                                    new ZPair(182, "=B6"),
                                    new ZPair(183, "=B7"),
                                    new ZPair(184, "=B8"),
                                    new ZPair(185, "=B9"),
                                    new ZPair(186, "=BA"),
                                    new ZPair(187, "=BB"),
                                    new ZPair(188, "=BC"),
                                    new ZPair(189, "=BD"),
                                    new ZPair(190, "=BE"),
                                    new ZPair(191, "=BF"),
                                    new ZPair(192, "=C0"),
                                    new ZPair(193, "=C1"),
                                    new ZPair(194, "=C2"),
                                    new ZPair(195, "=C3"),
                                    new ZPair(196, "=C4"),
                                    new ZPair(197, "=C5"),
                                    new ZPair(198, "=C6"),
                                    new ZPair(199, "=C7"),
                                    new ZPair(200, "=C8"),
                                    new ZPair(201, "=C9"),
                                    new ZPair(202, "=CA"),
                                    new ZPair(203, "=CB"),
                                    new ZPair(204, "=CC"),
                                    new ZPair(205, "=CD"),
                                    new ZPair(206, "=CE"),
                                    new ZPair(207, "=CF"),
                                    new ZPair(208, "=D0"),
                                    new ZPair(209, "=D1"),
                                    new ZPair(210, "=D2"),
                                    new ZPair(211, "=D3"),
                                    new ZPair(212, "=D4"),
                                    new ZPair(213, "=D5"),
                                    new ZPair(214, "=D6"),
                                    new ZPair(215, "=D7"),
                                    new ZPair(216, "=D8"),
                                    new ZPair(217, "=D9"),
                                    new ZPair(218, "=DA"),
                                    new ZPair(219, "=DB"),
                                    new ZPair(220, "=DC"),
                                    new ZPair(221, "=DD"),
                                    new ZPair(222, "=DE"),
                                    new ZPair(223, "=DF"),
                                    new ZPair(224, "=E0"),
                                    new ZPair(225, "=E1"),
                                    new ZPair(226, "=E2"),
                                    new ZPair(227, "=E3"),
                                    new ZPair(228, "=E4"),
                                    new ZPair(229, "=E5"),
                                    new ZPair(230, "=E6"),
                                    new ZPair(231, "=E7"),
                                    new ZPair(232, "=E8"),
                                    new ZPair(233, "=E9"),
                                    new ZPair(234, "=EA"),
                                    new ZPair(235, "=EB"),
                                    new ZPair(236, "=EC"),
                                    new ZPair(237, "=ED"),
                                    new ZPair(238, "=EE"),
                                    new ZPair(239, "=EF"),
                                    new ZPair(240, "=F0"),
                                    new ZPair(241, "=F1"),
                                    new ZPair(242, "=F2"),
                                    new ZPair(243, "=F3"),
                                    new ZPair(244, "=F4"),
                                    new ZPair(245, "=F5"),
                                    new ZPair(246, "=F6"),
                                    new ZPair(247, "=F7"),
                                    new ZPair(248, "=F8"),
                                    new ZPair(249, "=F9"),
                                    new ZPair(250, "=FA"),
                                    new ZPair(251, "=FB"),
                                    new ZPair(252, "=FC"),
                                    new ZPair(253, "=FD"),
                                    new ZPair(254, "=FE"),
                                    new ZPair(255, "=FF"));
                        });

        public Object safeMapShare = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Encoder_QpEncoder")
                    .setLookup(
                            Swift_Encoder_QpEncoder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("charStream", "filter", "safeMap")
                    .setStaticPropertyNames("qpMap", "safeMapShare")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Encoder/QpEncoder.php")
                    .addInterface("Swift_Encoder")
                    .addInterface("Swift_Mime_CharsetObserver")
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
