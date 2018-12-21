package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.assertArgs;
import com.project.convertedCode.globalNamespace.functions.magicSplit;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/grammar/rebuildParsers.php

*/

public class resolveMacros extends FunctionBaseRegular {

    public static resolveMacros f = new resolveMacros();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    public Object call(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/nikic/php-parser/grammar")
                        .setFile("/vendor/nikic/php-parser/grammar/rebuildParsers.php");
        Object code = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(
                                "~\\b(?<!::|->)(?!array\\()(?<name>[a-z][A-Za-z]++)"
                                        + toStringR(function_constant.get(env, "ARGS"), env)
                                        + "~",
                                new Closure(env, runtimeConverterFunctionClassConstants, "", this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "matches")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer matches =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        ReferenceContainer ___args =
                                                new BasicReferenceContainer(null);
                                        Object name = null;
                                        matches.arrayAccess(env, "args")
                                                .set(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .functions
                                                                .resolveMacros
                                                                .f
                                                                .env(env)
                                                                .call(matches.arrayGet(env, "args"))
                                                                .value());
                                        name = ZVal.assign(matches.arrayGet(env, "name"));
                                        ___args.setObject(
                                                magicSplit
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "(?:"
                                                                        + toStringR(
                                                                                function_constant
                                                                                        .get(
                                                                                                env,
                                                                                                "PARAMS"),
                                                                                env)
                                                                        + "|"
                                                                        + toStringR(
                                                                                function_constant
                                                                                        .get(
                                                                                                env,
                                                                                                "ARGS"),
                                                                                env)
                                                                        + ")(*SKIP)(*FAIL)|,",
                                                                matches.arrayGet(env, "args"))
                                                        .value());
                                        if (ZVal.equalityCheck("attributes", name)) {
                                            assertArgs
                                                    .f
                                                    .env(env)
                                                    .call(0, ___args.getObject(), name);
                                            return "$this->startAttributeStack[#1] + $this->endAttributes";
                                        }

                                        if (ZVal.equalityCheck("stackAttributes", name)) {
                                            assertArgs
                                                    .f
                                                    .env(env)
                                                    .call(1, ___args.getObject(), name);
                                            return ZVal.assign(
                                                    "$this->startAttributeStack["
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + "]"
                                                            + " + $this->endAttributeStack["
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + "]");
                                        }

                                        if (ZVal.equalityCheck("init", name)) {
                                            return ZVal.assign(
                                                    "$$ = array("
                                                            + toStringR(
                                                                    NamespaceGlobal.implode
                                                                            .env(env)
                                                                            .call(
                                                                                    ", ",
                                                                                    ___args
                                                                                            .getObject())
                                                                            .value(),
                                                                    env)
                                                            + ")");
                                        }

                                        if (ZVal.equalityCheck("push", name)) {
                                            assertArgs
                                                    .f
                                                    .env(env)
                                                    .call(2, ___args.getObject(), name);
                                            return ZVal.assign(
                                                    toStringR(___args.arrayGet(env, 0), env)
                                                            + "[] = "
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 1), env)
                                                            + "; $$ = "
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env));
                                        }

                                        if (ZVal.equalityCheck("pushNormalizing", name)) {
                                            assertArgs
                                                    .f
                                                    .env(env)
                                                    .call(2, ___args.getObject(), name);
                                            return ZVal.assign(
                                                    "if (is_array("
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 1), env)
                                                            + ")) { $$ = array_merge("
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + ", "
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 1), env)
                                                            + "); }"
                                                            + " else { "
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + "[] = "
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 1), env)
                                                            + "; $$ = "
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + "; }");
                                        }

                                        if (ZVal.equalityCheck("toArray", name)) {
                                            assertArgs
                                                    .f
                                                    .env(env)
                                                    .call(1, ___args.getObject(), name);
                                            return ZVal.assign(
                                                    "is_array("
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + ") ? "
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + " : array("
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + ")");
                                        }

                                        if (ZVal.equalityCheck("parseVar", name)) {
                                            assertArgs
                                                    .f
                                                    .env(env)
                                                    .call(1, ___args.getObject(), name);
                                            return ZVal.assign(
                                                    "substr("
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + ", 1)");
                                        }

                                        if (ZVal.equalityCheck("parseEncapsed", name)) {
                                            assertArgs
                                                    .f
                                                    .env(env)
                                                    .call(3, ___args.getObject(), name);
                                            return ZVal.assign(
                                                    "foreach ("
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + " as $s) { if ($s instanceof Node\\Scalar\\EncapsedStringPart) {"
                                                            + " $s->value = Node\\Scalar\\String_::parseEscapeSequences($s->value, "
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 1), env)
                                                            + ", "
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 2), env)
                                                            + "); } }");
                                        }

                                        if (ZVal.equalityCheck("parseEncapsedDoc", name)) {
                                            assertArgs
                                                    .f
                                                    .env(env)
                                                    .call(2, ___args.getObject(), name);
                                            return ZVal.assign(
                                                    "foreach ("
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + " as $s) { if ($s instanceof Node\\Scalar\\EncapsedStringPart) {"
                                                            + " $s->value = Node\\Scalar\\String_::parseEscapeSequences($s->value, null, "
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 1), env)
                                                            + "); } }"
                                                            + " $s->value = preg_replace('~(\\r\\n|\\n|\\r)\\z~', '', $s->value);"
                                                            + " if ('' === $s->value) array_pop("
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + ");");
                                        }

                                        if (ZVal.equalityCheck("makeNop", name)) {
                                            assertArgs
                                                    .f
                                                    .env(env)
                                                    .call(3, ___args.getObject(), name);
                                            return ZVal.assign(
                                                    "$startAttributes = "
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 1), env)
                                                            + ";"
                                                            + " if (isset($startAttributes['comments']))"
                                                            + " { "
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + " = new Stmt\\Nop($startAttributes + "
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 2), env)
                                                            + "); }"
                                                            + " else { "
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + " = null; }");
                                        }

                                        if (ZVal.equalityCheck("strKind", name)) {
                                            assertArgs
                                                    .f
                                                    .env(env)
                                                    .call(1, ___args.getObject(), name);
                                            return ZVal.assign(
                                                    "("
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + "[0] === \"'\" || ("
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + "[1] === \"'\" && "
                                                            + "("
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + "[0] === 'b' || "
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + "[0] === 'B')) "
                                                            + "? Scalar\\String_::KIND_SINGLE_QUOTED : Scalar\\String_::KIND_DOUBLE_QUOTED)");
                                        }

                                        if (ZVal.equalityCheck("setDocStringAttrs", name)) {
                                            assertArgs
                                                    .f
                                                    .env(env)
                                                    .call(2, ___args.getObject(), name);
                                            return ZVal.assign(
                                                    toStringR(___args.arrayGet(env, 0), env)
                                                            + "['kind'] = strpos("
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 1), env)
                                                            + ", \"'\") === false "
                                                            + "? Scalar\\String_::KIND_HEREDOC : Scalar\\String_::KIND_NOWDOC; "
                                                            + "preg_match('/\\A[bB]?<<<[ \\t]*[\\'\"]?([a-zA-Z_\\x7f-\\xff][a-zA-Z0-9_\\x7f-\\xff]*)[\\'\"]?(?:\\r\\n|\\n|\\r)\\z/', "
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 1), env)
                                                            + ", $matches); "
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + "['docLabel'] = $matches[1];");
                                        }

                                        if (ZVal.equalityCheck("prependLeadingComments", name)) {
                                            assertArgs
                                                    .f
                                                    .env(env)
                                                    .call(1, ___args.getObject(), name);
                                            return ZVal.assign(
                                                    "$attrs = $this->startAttributeStack[#1]; $stmts = "
                                                            + toStringR(
                                                                    ___args.arrayGet(env, 0), env)
                                                            + "; "
                                                            + "if (!empty($attrs['comments'])) {"
                                                            + "$stmts[0]->setAttribute('comments', "
                                                            + "array_merge($attrs['comments'], $stmts[0]->getAttribute('comments', []))); }");
                                        }

                                        return ZVal.assign(matches.arrayGet(env, 0));
                                    }
                                },
                                code)
                        .value());
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/nikic/php-parser/grammar")
                .setFile("/vendor/nikic/php-parser/grammar/rebuildParsers.php");
    }
}
