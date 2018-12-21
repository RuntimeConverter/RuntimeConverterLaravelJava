package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Parser.classes.Multiple;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Lexer.classes.Emulative;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Parser.classes.Php5;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Parser.classes.Php7;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/ParserFactory.php

*/

public class ParserFactory extends RuntimeClassBase {

    public ParserFactory(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ParserFactory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "kind", typeHint = "int")
    @ConvertedParameter(
        index = 1,
        name = "lexer",
        typeHint = "PhpParser\\Lexer",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "parserOptions",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object create(RuntimeEnv env, Object... args) {
        Object kind = assignParameter(args, 0, false);
        Object lexer = assignParameter(args, 1, true);
        if (null == lexer) {
            lexer = ZVal.getNull();
        }
        Object parserOptions = assignParameter(args, 2, true);
        if (null == parserOptions) {
            parserOptions = ZVal.newArray();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", lexer)) {
            lexer = new Emulative(env);
        }

        SwitchEnumType45 switchVariable45 =
                ZVal.getEnum(
                        kind,
                        SwitchEnumType45.DEFAULT_CASE,
                        SwitchEnumType45.DYNAMIC_TYPE_132,
                        CONST_PREFER_PHP7,
                        SwitchEnumType45.DYNAMIC_TYPE_133,
                        CONST_PREFER_PHP5,
                        SwitchEnumType45.DYNAMIC_TYPE_134,
                        CONST_ONLY_PHP7,
                        SwitchEnumType45.DYNAMIC_TYPE_135,
                        CONST_ONLY_PHP5);
        switch (switchVariable45) {
            case DYNAMIC_TYPE_132:
                return ZVal.assign(
                        new Multiple(
                                env,
                                ZVal.newArray(
                                        new ZPair(0, new Php7(env, lexer, parserOptions)),
                                        new ZPair(1, new Php5(env, lexer, parserOptions)))));
            case DYNAMIC_TYPE_133:
                return ZVal.assign(
                        new Multiple(
                                env,
                                ZVal.newArray(
                                        new ZPair(0, new Php5(env, lexer, parserOptions)),
                                        new ZPair(1, new Php7(env, lexer, parserOptions)))));
            case DYNAMIC_TYPE_134:
                return ZVal.assign(new Php7(env, lexer, parserOptions));
            case DYNAMIC_TYPE_135:
                return ZVal.assign(new Php5(env, lexer, parserOptions));
            case DEFAULT_CASE:
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                "Kind must be one of ::PREFER_PHP7, ::PREFER_PHP5, ::ONLY_PHP7 or ::ONLY_PHP5"));
        }
        ;
        return null;
    }

    public static final Object CONST_PREFER_PHP7 = 1;

    public static final Object CONST_PREFER_PHP5 = 2;

    public static final Object CONST_ONLY_PHP7 = 3;

    public static final Object CONST_ONLY_PHP5 = 4;

    public static final Object CONST_class = "PhpParser\\ParserFactory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\ParserFactory")
                    .setLookup(
                            ParserFactory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/ParserFactory.php")
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

    private enum SwitchEnumType45 {
        DYNAMIC_TYPE_132,
        DYNAMIC_TYPE_133,
        DYNAMIC_TYPE_134,
        DYNAMIC_TYPE_135,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
