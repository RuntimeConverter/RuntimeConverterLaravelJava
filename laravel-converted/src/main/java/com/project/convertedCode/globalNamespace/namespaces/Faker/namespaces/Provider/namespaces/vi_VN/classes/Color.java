package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.vi_VN.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/vi_VN/Color.php

*/

public class Color
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Color {

    public Color(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Color.class) {
            this.__construct(env, args);
        }
    }

    public Color(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\vi_VN\\Color";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Faker
                    .namespaces
                    .Provider
                    .classes
                    .Color
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object safeColorNames =
                ZVal.arrayFromList(
                        "\u0111en",
                        "xanh",
                        "\u00F4 liu",
                        "t\u00EDm ",
                        "v\u00F4i",
                        "xanh",
                        "b\u1EA1c",
                        "x\u00E1m",
                        "v\u00E0ng",
                        "tr\u1EAFng");

        public Object allColorNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "H\u1ED5 ph\u00E1ch",
                                    "Ametit",
                                    "Xanh berin",
                                    "Xanh da tr\u1EDDi",
                                    "Be",
                                    "N\u00E2u s\u1EABm",
                                    "\u0110en",
                                    "Xanh lam",
                                    "N\u00E2u",
                                    "Da b\u00F2",
                                    "Cam ch\u00E1y",
                                    "H\u1ED3ng y",
                                    "\u0110\u1ECF y\u00EAn chi",
                                    "Men ng\u1ECDc",
                                    "Anh \u0111\u00E0o",
                                    "Xanh ho\u00E0ng h\u00F4n",
                                    "Xanh n\u00F5n chu\u1ED1i",
                                    "Xanh c\u00F4 ban",
                                    "\u0110\u1ED3ng",
                                    "San h\u00F4",
                                    "Kem",
                                    "\u0110\u1ECF th\u1EAFm",
                                    "Xanh l\u01A1",
                                    "L\u1EE5c b\u1EA3o",
                                    "V\u00E0ng kim lo\u1EA1i",
                                    "X\u00E1m",
                                    "Xanh l\u00E1 c\u00E2y",
                                    "V\u00F2i voi",
                                    "Ch\u00E0m",
                                    "Ng\u1ECDc th\u1EA1ch",
                                    "Kaki",
                                    "O\u1EA3i h\u01B0\u01A1ng",
                                    "V\u00E0ng chanh",
                                    "H\u1ED3ng s\u1EABm",
                                    "H\u1EA1t d\u1EBB",
                                    "C\u1EA9m qu\u1EF3",
                                    "Hoa c\u00E0",
                                    "Lam s\u1EABm",
                                    "Ochre",
                                    "\u00D4 liu",
                                    "Da cam",
                                    "Lan t\u00EDm",
                                    "L\u00F2ng \u0111\u00E0o",
                                    "D\u1EEBa c\u1EA1n",
                                    "H\u1ED3ng",
                                    "M\u1EADn",
                                    "Xanh th\u1EE7y tinh",
                                    "H\u1ED3ng \u0111\u1EA5t",
                                    "T\u00EDa",
                                    "\u0110\u1ECF",
                                    "C\u00E1 h\u1ED3i",
                                    "\u0110\u1ECF t\u01B0\u01A1i",
                                    "N\u00E2u \u0111en",
                                    "B\u1EA1c",
                                    "N\u00E2u tanin",
                                    "M\u00F2ng k\u00E9t",
                                    "Xanh Th\u1ED5",
                                    "\u0110\u1ECF son",
                                    "T\u00EDm",
                                    "Xanh cr\u00F4m",
                                    "Tr\u1EAFng",
                                    "V\u00E0ng");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\vi_VN\\Color")
                    .setLookup(
                            Color.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("allColorNames", "safeColorNames")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/vi_VN/Color.php")
                    .addExtendsClass("Faker\\Provider\\Color")
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
