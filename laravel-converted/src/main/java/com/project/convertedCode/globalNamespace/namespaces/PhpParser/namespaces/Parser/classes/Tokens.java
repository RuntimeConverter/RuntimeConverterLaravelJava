package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Parser.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Parser/Tokens.php

*/

public final class Tokens extends RuntimeClassBase {

    public Tokens(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Tokens(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_YYERRTOK = 256;

    public static final Object CONST_T_INCLUDE = 257;

    public static final Object CONST_T_INCLUDE_ONCE = 258;

    public static final Object CONST_T_EVAL = 259;

    public static final Object CONST_T_REQUIRE = 260;

    public static final Object CONST_T_REQUIRE_ONCE = 261;

    public static final Object CONST_T_LOGICAL_OR = 262;

    public static final Object CONST_T_LOGICAL_XOR = 263;

    public static final Object CONST_T_LOGICAL_AND = 264;

    public static final Object CONST_T_PRINT = 265;

    public static final Object CONST_T_YIELD = 266;

    public static final Object CONST_T_DOUBLE_ARROW = 267;

    public static final Object CONST_T_YIELD_FROM = 268;

    public static final Object CONST_T_PLUS_EQUAL = 269;

    public static final Object CONST_T_MINUS_EQUAL = 270;

    public static final Object CONST_T_MUL_EQUAL = 271;

    public static final Object CONST_T_DIV_EQUAL = 272;

    public static final Object CONST_T_CONCAT_EQUAL = 273;

    public static final Object CONST_T_MOD_EQUAL = 274;

    public static final Object CONST_T_AND_EQUAL = 275;

    public static final Object CONST_T_OR_EQUAL = 276;

    public static final Object CONST_T_XOR_EQUAL = 277;

    public static final Object CONST_T_SL_EQUAL = 278;

    public static final Object CONST_T_SR_EQUAL = 279;

    public static final Object CONST_T_POW_EQUAL = 280;

    public static final Object CONST_T_COALESCE = 281;

    public static final Object CONST_T_BOOLEAN_OR = 282;

    public static final Object CONST_T_BOOLEAN_AND = 283;

    public static final Object CONST_T_IS_EQUAL = 284;

    public static final Object CONST_T_IS_NOT_EQUAL = 285;

    public static final Object CONST_T_IS_IDENTICAL = 286;

    public static final Object CONST_T_IS_NOT_IDENTICAL = 287;

    public static final Object CONST_T_SPACESHIP = 288;

    public static final Object CONST_T_IS_SMALLER_OR_EQUAL = 289;

    public static final Object CONST_T_IS_GREATER_OR_EQUAL = 290;

    public static final Object CONST_T_SL = 291;

    public static final Object CONST_T_SR = 292;

    public static final Object CONST_T_INSTANCEOF = 293;

    public static final Object CONST_T_INC = 294;

    public static final Object CONST_T_DEC = 295;

    public static final Object CONST_T_INT_CAST = 296;

    public static final Object CONST_T_DOUBLE_CAST = 297;

    public static final Object CONST_T_STRING_CAST = 298;

    public static final Object CONST_T_ARRAY_CAST = 299;

    public static final Object CONST_T_OBJECT_CAST = 300;

    public static final Object CONST_T_BOOL_CAST = 301;

    public static final Object CONST_T_UNSET_CAST = 302;

    public static final Object CONST_T_POW = 303;

    public static final Object CONST_T_NEW = 304;

    public static final Object CONST_T_CLONE = 305;

    public static final Object CONST_T_EXIT = 306;

    public static final Object CONST_T_IF = 307;

    public static final Object CONST_T_ELSEIF = 308;

    public static final Object CONST_T_ELSE = 309;

    public static final Object CONST_T_ENDIF = 310;

    public static final Object CONST_T_LNUMBER = 311;

    public static final Object CONST_T_DNUMBER = 312;

    public static final Object CONST_T_STRING = 313;

    public static final Object CONST_T_STRING_VARNAME = 314;

    public static final Object CONST_T_VARIABLE = 315;

    public static final Object CONST_T_NUM_STRING = 316;

    public static final Object CONST_T_INLINE_HTML = 317;

    public static final Object CONST_T_CHARACTER = 318;

    public static final Object CONST_T_BAD_CHARACTER = 319;

    public static final Object CONST_T_ENCAPSED_AND_WHITESPACE = 320;

    public static final Object CONST_T_CONSTANT_ENCAPSED_STRING = 321;

    public static final Object CONST_T_ECHO = 322;

    public static final Object CONST_T_DO = 323;

    public static final Object CONST_T_WHILE = 324;

    public static final Object CONST_T_ENDWHILE = 325;

    public static final Object CONST_T_FOR = 326;

    public static final Object CONST_T_ENDFOR = 327;

    public static final Object CONST_T_FOREACH = 328;

    public static final Object CONST_T_ENDFOREACH = 329;

    public static final Object CONST_T_DECLARE = 330;

    public static final Object CONST_T_ENDDECLARE = 331;

    public static final Object CONST_T_AS = 332;

    public static final Object CONST_T_SWITCH = 333;

    public static final Object CONST_T_ENDSWITCH = 334;

    public static final Object CONST_T_CASE = 335;

    public static final Object CONST_T_DEFAULT = 336;

    public static final Object CONST_T_BREAK = 337;

    public static final Object CONST_T_CONTINUE = 338;

    public static final Object CONST_T_GOTO = 339;

    public static final Object CONST_T_FUNCTION = 340;

    public static final Object CONST_T_CONST = 341;

    public static final Object CONST_T_RETURN = 342;

    public static final Object CONST_T_TRY = 343;

    public static final Object CONST_T_CATCH = 344;

    public static final Object CONST_T_FINALLY = 345;

    public static final Object CONST_T_THROW = 346;

    public static final Object CONST_T_USE = 347;

    public static final Object CONST_T_INSTEADOF = 348;

    public static final Object CONST_T_GLOBAL = 349;

    public static final Object CONST_T_STATIC = 350;

    public static final Object CONST_T_ABSTRACT = 351;

    public static final Object CONST_T_FINAL = 352;

    public static final Object CONST_T_PRIVATE = 353;

    public static final Object CONST_T_PROTECTED = 354;

    public static final Object CONST_T_PUBLIC = 355;

    public static final Object CONST_T_VAR = 356;

    public static final Object CONST_T_UNSET = 357;

    public static final Object CONST_T_ISSET = 358;

    public static final Object CONST_T_EMPTY = 359;

    public static final Object CONST_T_HALT_COMPILER = 360;

    public static final Object CONST_T_CLASS = 361;

    public static final Object CONST_T_TRAIT = 362;

    public static final Object CONST_T_INTERFACE = 363;

    public static final Object CONST_T_EXTENDS = 364;

    public static final Object CONST_T_IMPLEMENTS = 365;

    public static final Object CONST_T_OBJECT_OPERATOR = 366;

    public static final Object CONST_T_LIST = 367;

    public static final Object CONST_T_ARRAY = 368;

    public static final Object CONST_T_CALLABLE = 369;

    public static final Object CONST_T_CLASS_C = 370;

    public static final Object CONST_T_TRAIT_C = 371;

    public static final Object CONST_T_METHOD_C = 372;

    public static final Object CONST_T_FUNC_C = 373;

    public static final Object CONST_T_LINE = 374;

    public static final Object CONST_T_FILE = 375;

    public static final Object CONST_T_COMMENT = 376;

    public static final Object CONST_T_DOC_COMMENT = 377;

    public static final Object CONST_T_OPEN_TAG = 378;

    public static final Object CONST_T_OPEN_TAG_WITH_ECHO = 379;

    public static final Object CONST_T_CLOSE_TAG = 380;

    public static final Object CONST_T_WHITESPACE = 381;

    public static final Object CONST_T_START_HEREDOC = 382;

    public static final Object CONST_T_END_HEREDOC = 383;

    public static final Object CONST_T_DOLLAR_OPEN_CURLY_BRACES = 384;

    public static final Object CONST_T_CURLY_OPEN = 385;

    public static final Object CONST_T_PAAMAYIM_NEKUDOTAYIM = 386;

    public static final Object CONST_T_NAMESPACE = 387;

    public static final Object CONST_T_NS_C = 388;

    public static final Object CONST_T_DIR = 389;

    public static final Object CONST_T_NS_SEPARATOR = 390;

    public static final Object CONST_T_ELLIPSIS = 391;

    public static final Object CONST_class = "PhpParser\\Parser\\Tokens";

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
                    .setName("PhpParser\\Parser\\Tokens")
                    .setLookup(
                            Tokens.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Parser/Tokens.php")
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
