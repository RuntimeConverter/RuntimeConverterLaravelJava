package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/Color.php

*/

public class Color extends Base {

    public Color(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Color.class) {
            this.__construct(env, args);
        }
    }

    public Color(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\Color";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Base.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object hexColor(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    "#"
                            + toStringR(
                                    NamespaceGlobal.str_pad
                                            .env(env)
                                            .call(
                                                    NamespaceGlobal.dechex
                                                            .env(env)
                                                            .call(
                                                                    NamespaceGlobal.mt_rand
                                                                            .env(env)
                                                                            .call(1, 16777215)
                                                                            .value())
                                                            .value(),
                                                    6,
                                                    "0",
                                                    0)
                                            .value(),
                                    env));
        }

        @ConvertedMethod
        public Object safeHexColor(RuntimeEnv env, Object... args) {
            ReferenceContainer color = new BasicReferenceContainer(null);
            color.setObject(
                    NamespaceGlobal.str_pad
                            .env(env)
                            .call(
                                    NamespaceGlobal.dechex
                                            .env(env)
                                            .call(
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(0, 255)
                                                            .value())
                                            .value(),
                                    3,
                                    "0",
                                    0)
                            .value());
            return ZVal.assign(
                    "#"
                            + toStringR(color.arrayGet(env, 0), env)
                            + toStringR(color.arrayGet(env, 0), env)
                            + toStringR(color.arrayGet(env, 1), env)
                            + toStringR(color.arrayGet(env, 1), env)
                            + toStringR(color.arrayGet(env, 2), env)
                            + toStringR(color.arrayGet(env, 2), env));
        }

        @ConvertedMethod
        public Object rgbColorAsArray(RuntimeEnv env, Object... args) {
            Object color = null;
            color =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Color.class)
                            .method("hexColor")
                            .call()
                            .value();
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    NamespaceGlobal.hexdec
                                            .env(env)
                                            .call(
                                                    function_substr
                                                            .f
                                                            .env(env)
                                                            .call(color, 1, 2)
                                                            .value())
                                            .value()),
                            new ZPair(
                                    1,
                                    NamespaceGlobal.hexdec
                                            .env(env)
                                            .call(
                                                    function_substr
                                                            .f
                                                            .env(env)
                                                            .call(color, 3, 2)
                                                            .value())
                                            .value()),
                            new ZPair(
                                    2,
                                    NamespaceGlobal.hexdec
                                            .env(env)
                                            .call(
                                                    function_substr
                                                            .f
                                                            .env(env)
                                                            .call(color, 5, 2)
                                                            .value())
                                            .value())));
        }

        @ConvertedMethod
        public Object rgbColor(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    NamespaceGlobal.implode
                            .env(env)
                            .call(
                                    ",",
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Color.class)
                                            .method("rgbColorAsArray")
                                            .call()
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object rgbCssColor(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    "rgb("
                            + toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Color.class)
                                            .method("rgbColor")
                                            .call()
                                            .value(),
                                    env)
                            + ")");
        }

        @ConvertedMethod
        public Object rgbaCssColor(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    "rgba("
                            + toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Color.class)
                                            .method("rgbColor")
                                            .call()
                                            .value(),
                                    env)
                            + ","
                            + toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Color.class)
                                            .method("randomFloat")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(1, 0, 1)
                                            .value(),
                                    env)
                            + ")");
        }

        @ConvertedMethod
        public Object safeColorName(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Color.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .classes
                                                            .Color
                                                            .RequestStaticProperties
                                                            .class)
                                            .safeColorNames)
                            .value());
        }

        @ConvertedMethod
        public Object colorName(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Color.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .classes
                                                            .Color
                                                            .RequestStaticProperties
                                                            .class)
                                            .allColorNames)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object safeColorNames =
                ZVal.arrayFromList(
                        "black", "maroon", "green", "navy", "olive", "purple", "teal", "lime",
                        "blue", "silver", "gray", "yellow", "fuchsia", "aqua", "white");

        public Object allColorNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "AliceBlue",
                                    "AntiqueWhite",
                                    "Aqua",
                                    "Aquamarine",
                                    "Azure",
                                    "Beige",
                                    "Bisque",
                                    "Black",
                                    "BlanchedAlmond",
                                    "Blue",
                                    "BlueViolet",
                                    "Brown",
                                    "BurlyWood",
                                    "CadetBlue",
                                    "Chartreuse",
                                    "Chocolate",
                                    "Coral",
                                    "CornflowerBlue",
                                    "Cornsilk",
                                    "Crimson",
                                    "Cyan",
                                    "DarkBlue",
                                    "DarkCyan",
                                    "DarkGoldenRod",
                                    "DarkGray",
                                    "DarkGreen",
                                    "DarkKhaki",
                                    "DarkMagenta",
                                    "DarkOliveGreen",
                                    "Darkorange",
                                    "DarkOrchid",
                                    "DarkRed",
                                    "DarkSalmon",
                                    "DarkSeaGreen",
                                    "DarkSlateBlue",
                                    "DarkSlateGray",
                                    "DarkTurquoise",
                                    "DarkViolet",
                                    "DeepPink",
                                    "DeepSkyBlue",
                                    "DimGray",
                                    "DimGrey",
                                    "DodgerBlue",
                                    "FireBrick",
                                    "FloralWhite",
                                    "ForestGreen",
                                    "Fuchsia",
                                    "Gainsboro",
                                    "GhostWhite",
                                    "Gold",
                                    "GoldenRod",
                                    "Gray",
                                    "Green",
                                    "GreenYellow",
                                    "HoneyDew",
                                    "HotPink",
                                    "IndianRed",
                                    "Indigo",
                                    "Ivory",
                                    "Khaki",
                                    "Lavender",
                                    "LavenderBlush",
                                    "LawnGreen",
                                    "LemonChiffon",
                                    "LightBlue",
                                    "LightCoral",
                                    "LightCyan",
                                    "LightGoldenRodYellow",
                                    "LightGray",
                                    "LightGreen",
                                    "LightPink",
                                    "LightSalmon",
                                    "LightSeaGreen",
                                    "LightSkyBlue",
                                    "LightSlateGray",
                                    "LightSteelBlue",
                                    "LightYellow",
                                    "Lime",
                                    "LimeGreen",
                                    "Linen",
                                    "Magenta",
                                    "Maroon",
                                    "MediumAquaMarine",
                                    "MediumBlue",
                                    "MediumOrchid",
                                    "MediumPurple",
                                    "MediumSeaGreen",
                                    "MediumSlateBlue",
                                    "MediumSpringGreen",
                                    "MediumTurquoise",
                                    "MediumVioletRed",
                                    "MidnightBlue",
                                    "MintCream",
                                    "MistyRose",
                                    "Moccasin",
                                    "NavajoWhite",
                                    "Navy",
                                    "OldLace",
                                    "Olive",
                                    "OliveDrab",
                                    "Orange",
                                    "OrangeRed",
                                    "Orchid",
                                    "PaleGoldenRod",
                                    "PaleGreen",
                                    "PaleTurquoise",
                                    "PaleVioletRed",
                                    "PapayaWhip",
                                    "PeachPuff",
                                    "Peru",
                                    "Pink",
                                    "Plum",
                                    "PowderBlue",
                                    "Purple",
                                    "Red",
                                    "RosyBrown",
                                    "RoyalBlue",
                                    "SaddleBrown",
                                    "Salmon",
                                    "SandyBrown",
                                    "SeaGreen",
                                    "SeaShell",
                                    "Sienna",
                                    "Silver",
                                    "SkyBlue",
                                    "SlateBlue",
                                    "SlateGray",
                                    "Snow",
                                    "SpringGreen",
                                    "SteelBlue",
                                    "Tan",
                                    "Teal",
                                    "Thistle",
                                    "Tomato",
                                    "Turquoise",
                                    "Violet",
                                    "Wheat",
                                    "White",
                                    "WhiteSmoke",
                                    "Yellow",
                                    "YellowGreen");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\Color")
                    .setLookup(
                            Color.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("allColorNames", "safeColorNames")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/Color.php")
                    .addExtendsClass("Faker\\Provider\\Base")
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
