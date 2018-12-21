package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.PrettyPrinter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.Identical;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.Spaceship;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.PreDec;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Print_;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Instanceof_;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.Equal;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.PostInc;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.LNumber;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.PreInc;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.NotEqual;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.BooleanOr;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.UnaryMinus;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.Cast.classes.Object_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.Coalesce;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.Cast.classes.Double;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Expr;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.Cast.classes.Unset_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.BitwiseNot;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.Cast.classes.Bool_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Variable;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.PostDec;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.UnaryPlus;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.LogicalXor;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.SmallerOrEqual;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.LogicalOr;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.Cast.classes.Int_;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.LogicalAnd;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.PrettyPrinterAbstract;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.YieldFrom;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Ternary;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Exit_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.BooleanNot;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.NotIdentical;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.GreaterOrEqual;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Include_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.BooleanAnd;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Use_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ErrorSuppress;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Class_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.EncapsedStringPart;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Assign;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.Greater;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.AssignRef;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.Smaller;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/PrettyPrinter/Standard.php

*/

public class Standard extends PrettyPrinterAbstract {

    public Standard(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Standard.class) {
            this.__construct(env, args);
        }
    }

    public Standard(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Param")
    protected Object pParam(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                toObjectR(node).accessProp(this, env).name("type").getBool()
                                        ? toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "p",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("type")
                                                                        .value()),
                                                        env)
                                                + " "
                                        : "",
                                env)
                        + toStringR(
                                toObjectR(node).accessProp(this, env).name("byRef").getBool()
                                        ? "&"
                                        : "",
                                env)
                        + toStringR(
                                toObjectR(node).accessProp(this, env).name("variadic").getBool()
                                        ? "..."
                                        : "",
                                env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("var").value()),
                                env)
                        + toStringR(
                                toObjectR(node).accessProp(this, env).name("default").getBool()
                                        ? " = "
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "p",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("default")
                                                                        .value()),
                                                        env)
                                        : "",
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Arg")
    protected Object pArg(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                toObjectR(node).accessProp(this, env).name("byRef").getBool()
                                        ? "&"
                                        : "",
                                env)
                        + toStringR(
                                toObjectR(node).accessProp(this, env).name("unpack").getBool()
                                        ? "..."
                                        : "",
                                env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("value")
                                                .value()),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Const_")
    protected Object pConst(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(toObjectR(node).accessProp(this, env).name("name").value(), env)
                        + " = "
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("value")
                                                .value()),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\NullableType")
    protected Object pNullableType(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "?"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("type").value()),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Identifier")
    protected Object pIdentifier(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(toObjectR(node).accessProp(this, env).name("name").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\VarLikeIdentifier")
    protected Object pVarLikeIdentifier(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "$" + toStringR(toObjectR(node).accessProp(this, env).name("name").value(), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Name")
    protected Object pName(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.implode
                        .env(env)
                        .call("\\", toObjectR(node).accessProp(this, env).name("parts").value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Name\\FullyQualified"
    )
    protected Object pName_FullyQualified(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "\\"
                        + toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                "\\",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("parts")
                                                        .value())
                                        .value(),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Name\\Relative")
    protected Object pName_Relative(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "namespace\\"
                        + toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                "\\",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("parts")
                                                        .value())
                                        .value(),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Scalar\\MagicConst\\Class_"
    )
    protected Object pScalar_MagicConst_Class(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return "__CLASS__";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Scalar\\MagicConst\\Dir"
    )
    protected Object pScalar_MagicConst_Dir(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return "__DIR__";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Scalar\\MagicConst\\File"
    )
    protected Object pScalar_MagicConst_File(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return "__FILE__";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Scalar\\MagicConst\\Function_"
    )
    protected Object pScalar_MagicConst_Function(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return "__FUNCTION__";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Scalar\\MagicConst\\Line"
    )
    protected Object pScalar_MagicConst_Line(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return "__LINE__";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Scalar\\MagicConst\\Method"
    )
    protected Object pScalar_MagicConst_Method(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return "__METHOD__";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Scalar\\MagicConst\\Namespace_"
    )
    protected Object pScalar_MagicConst_Namespace(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return "__NAMESPACE__";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Scalar\\MagicConst\\Trait_"
    )
    protected Object pScalar_MagicConst_Trait(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return "__TRAIT__";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Scalar\\String_")
    protected Object pScalar_String(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object escaped = null;
        Object kind = null;
        Object label = null;
        kind =
                env.callMethod(
                        node,
                        "getAttribute",
                        Standard.class,
                        "kind",
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Scalar
                                .classes
                                .String_
                                .CONST_KIND_SINGLE_QUOTED);
        SwitchEnumType46 switchVariable46 =
                ZVal.getEnum(
                        kind,
                        SwitchEnumType46.DEFAULT_CASE,
                        SwitchEnumType46.DYNAMIC_TYPE_136,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Scalar
                                .classes
                                .String_
                                .CONST_KIND_NOWDOC,
                        SwitchEnumType46.DYNAMIC_TYPE_137,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Scalar
                                .classes
                                .String_
                                .CONST_KIND_SINGLE_QUOTED,
                        SwitchEnumType46.DYNAMIC_TYPE_138,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Scalar
                                .classes
                                .String_
                                .CONST_KIND_HEREDOC,
                        SwitchEnumType46.DYNAMIC_TYPE_139,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Scalar
                                .classes
                                .String_
                                .CONST_KIND_DOUBLE_QUOTED);
        switch (switchVariable46) {
            case DYNAMIC_TYPE_136:
                label = env.callMethod(node, "getAttribute", Standard.class, "docLabel");
                if (ZVal.toBool(label)
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        this.containsEndLabel(
                                                env,
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("value")
                                                        .value(),
                                                label)))) {
                    if (ZVal.strictEqualityCheck(
                            toObjectR(node).accessProp(this, env).name("value").value(),
                            "===",
                            "")) {
                        return ZVal.assign(
                                toStringR(
                                                "<<<'"
                                                        + toStringR(label, env)
                                                        + "'\n"
                                                        + toStringR(label, env),
                                                env)
                                        + toStringR(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("docStringEndToken")
                                                        .value(),
                                                env));
                    }

                    return ZVal.assign(
                            toStringR(
                                            "<<<'"
                                                    + toStringR(label, env)
                                                    + "'\n"
                                                    + toStringR(
                                                            toObjectR(node)
                                                                    .accessProp(this, env)
                                                                    .name("value")
                                                                    .value(),
                                                            env)
                                                    + "\n"
                                                    + toStringR(label, env),
                                            env)
                                    + toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("docStringEndToken")
                                                    .value(),
                                            env));
                }

            case DYNAMIC_TYPE_137:
                return ZVal.assign(
                        this.pSingleQuotedString(
                                env, toObjectR(node).accessProp(this, env).name("value").value()));
            case DYNAMIC_TYPE_138:
                label = env.callMethod(node, "getAttribute", Standard.class, "docLabel");
                if (ZVal.toBool(label)
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        this.containsEndLabel(
                                                env,
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("value")
                                                        .value(),
                                                label)))) {
                    if (ZVal.strictEqualityCheck(
                            toObjectR(node).accessProp(this, env).name("value").value(),
                            "===",
                            "")) {
                        return ZVal.assign(
                                toStringR(
                                                "<<<"
                                                        + toStringR(label, env)
                                                        + "\n"
                                                        + toStringR(label, env),
                                                env)
                                        + toStringR(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("docStringEndToken")
                                                        .value(),
                                                env));
                    }

                    escaped =
                            this.escapeString(
                                    env,
                                    toObjectR(node).accessProp(this, env).name("value").value(),
                                    ZVal.getNull());
                    return ZVal.assign(
                            toStringR("<<<" + toStringR(label, env) + "\n", env)
                                    + toStringR(escaped, env)
                                    + toStringR("\n" + toStringR(label, env), env)
                                    + toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("docStringEndToken")
                                                    .value(),
                                            env));
                }

            case DYNAMIC_TYPE_139:
                return ZVal.assign(
                        "\""
                                + toStringR(
                                        this.escapeString(
                                                env,
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("value")
                                                        .value(),
                                                "\""),
                                        env)
                                + "\"");
        }
        ;
        throw ZVal.getException(env, new PHPException(env, "Invalid string kind"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Scalar\\Encapsed")
    protected Object pScalar_Encapsed(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object label = null;
        if (ZVal.strictEqualityCheck(
                env.callMethod(node, "getAttribute", Standard.class, "kind"),
                "===",
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .PhpParser
                        .namespaces
                        .Node
                        .namespaces
                        .Scalar
                        .classes
                        .String_
                        .CONST_KIND_HEREDOC)) {
            label = env.callMethod(node, "getAttribute", Standard.class, "docLabel");
            if (ZVal.toBool(label)
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    this.encapsedContainsEndLabel(
                                            env,
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("parts")
                                                    .value(),
                                            label)))) {
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        function_count
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        toObjectR(node)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("parts")
                                                                                .value())
                                                                .value(),
                                                        "===",
                                                        1))
                                        && ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        new ReferenceClassProperty(
                                                                        node, "parts", env)
                                                                .arrayGet(env, 0),
                                                        EncapsedStringPart.class,
                                                        "PhpParser\\Node\\Scalar\\EncapsedStringPart")))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        toObjectR(
                                                        new ReferenceClassProperty(
                                                                        node, "parts", env)
                                                                .arrayGet(env, 0))
                                                .accessProp(this, env)
                                                .name("value")
                                                .value(),
                                        "===",
                                        ""))) {
                    return ZVal.assign(
                            toStringR(
                                            "<<<"
                                                    + toStringR(label, env)
                                                    + "\n"
                                                    + toStringR(label, env),
                                            env)
                                    + toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("docStringEndToken")
                                                    .value(),
                                            env));
                }

                return ZVal.assign(
                        toStringR("<<<" + toStringR(label, env) + "\n", env)
                                + toStringR(
                                        this.pEncapsList(
                                                env,
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("parts")
                                                        .value(),
                                                ZVal.getNull()),
                                        env)
                                + toStringR("\n" + toStringR(label, env), env)
                                + toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("docStringEndToken")
                                                .value(),
                                        env));
            }
        }

        return ZVal.assign(
                "\""
                        + toStringR(
                                this.pEncapsList(
                                        env,
                                        toObjectR(node).accessProp(this, env).name("parts").value(),
                                        "\""),
                                env)
                        + "\"");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Scalar\\LNumber")
    protected Object pScalar_LNumber(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object str = null;
        Object kind = null;
        Object sign = null;
        if (ZVal.strictEqualityCheck(
                toObjectR(node).accessProp(this, env).name("value").value(),
                "===",
                ZVal.subtract(ZVal.minusSign(9223372036854775807L), 1))) {
            return ZVal.assign("(-" + toStringR(9223372036854775807L, env) + "-1)");
        }

        kind = env.callMethod(node, "getAttribute", Standard.class, "kind", LNumber.CONST_KIND_DEC);
        if (ZVal.strictEqualityCheck(LNumber.CONST_KIND_DEC, "===", kind)) {
            return ZVal.assign(
                    toStringR(toObjectR(node).accessProp(this, env).name("value").value(), env));
        }

        sign =
                ZVal.assign(
                        ZVal.isLessThan(
                                        toObjectR(node).accessProp(this, env).name("value").value(),
                                        '<',
                                        0)
                                ? "-"
                                : "");
        str =
                ZVal.assign(
                        toStringR(
                                toObjectR(node).accessProp(this, env).name("value").value(), env));
        SwitchEnumType47 switchVariable47 =
                ZVal.getEnum(
                        kind,
                        SwitchEnumType47.DEFAULT_CASE,
                        SwitchEnumType47.DYNAMIC_TYPE_140,
                        LNumber.CONST_KIND_BIN,
                        SwitchEnumType47.DYNAMIC_TYPE_141,
                        LNumber.CONST_KIND_OCT,
                        SwitchEnumType47.DYNAMIC_TYPE_142,
                        LNumber.CONST_KIND_HEX);
        switch (switchVariable47) {
            case DYNAMIC_TYPE_140:
                return ZVal.assign(
                        toStringR(sign, env)
                                + "0b"
                                + toStringR(
                                        NamespaceGlobal.base_convert
                                                .env(env)
                                                .call(str, 10, 2)
                                                .value(),
                                        env));
            case DYNAMIC_TYPE_141:
                return ZVal.assign(
                        toStringR(sign, env)
                                + "0"
                                + toStringR(
                                        NamespaceGlobal.base_convert
                                                .env(env)
                                                .call(str, 10, 8)
                                                .value(),
                                        env));
            case DYNAMIC_TYPE_142:
                return ZVal.assign(
                        toStringR(sign, env)
                                + "0x"
                                + toStringR(
                                        NamespaceGlobal.base_convert
                                                .env(env)
                                                .call(str, 10, 16)
                                                .value(),
                                        env));
        }
        ;
        throw ZVal.getException(env, new PHPException(env, "Invalid number kind"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Scalar\\DNumber")
    protected Object pScalar_DNumber(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object stringValue = null;
        if (!NamespaceGlobal.is_finite
                .env(env)
                .call(toObjectR(node).accessProp(this, env).name("value").value())
                .getBool()) {
            if (ZVal.strictEqualityCheck(
                    toObjectR(node).accessProp(this, env).name("value").value(),
                    "===",
                    function_constant.get(env, "INF"))) {
                return "\\INF";

            } else if (ZVal.strictEqualityCheck(
                    toObjectR(node).accessProp(this, env).name("value").value(),
                    "===",
                    ZVal.minusSign(function_constant.get(env, "INF")))) {
                return "-\\INF";

            } else {
                return "\\NAN";
            }
        }

        stringValue =
                function_sprintf
                        .f
                        .env(env)
                        .call("%.16G", toObjectR(node).accessProp(this, env).name("value").value())
                        .value();
        if (ZVal.strictNotEqualityCheck(
                toObjectR(node).accessProp(this, env).name("value").value(),
                "!==",
                ZVal.toDouble(stringValue))) {
            stringValue =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%.17G",
                                    toObjectR(node).accessProp(this, env).name("value").value())
                            .value();
        }

        stringValue = function_str_replace.f.env(env).call(",", ".", stringValue).value();
        return ZVal.assign(
                function_preg_match.f.env(env).call("/^-?[0-9]+$/", stringValue).getBool()
                        ? toStringR(stringValue, env) + ".0"
                        : stringValue);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Scalar\\EncapsedStringPart"
    )
    protected Object pScalar_EncapsedStringPart(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        throw ZVal.getException(
                env, new LogicException(env, "Cannot directly print EncapsedStringPart"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Assign")
    protected Object pExpr_Assign(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        Assign.CONST_class,
                        toObjectR(node).accessProp(this, env).name("var").value(),
                        " = ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\AssignRef")
    protected Object pExpr_AssignRef(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        AssignRef.CONST_class,
                        toObjectR(node).accessProp(this, env).name("var").value(),
                        " =& ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\AssignOp\\Plus"
    )
    protected Object pExpr_AssignOp_Plus(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .AssignOp
                                .classes
                                .Plus
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("var").value(),
                        " += ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\AssignOp\\Minus"
    )
    protected Object pExpr_AssignOp_Minus(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .AssignOp
                                .classes
                                .Minus
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("var").value(),
                        " -= ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\AssignOp\\Mul")
    protected Object pExpr_AssignOp_Mul(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .AssignOp
                                .classes
                                .Mul
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("var").value(),
                        " *= ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\AssignOp\\Div")
    protected Object pExpr_AssignOp_Div(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .AssignOp
                                .classes
                                .Div
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("var").value(),
                        " /= ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\AssignOp\\Concat"
    )
    protected Object pExpr_AssignOp_Concat(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .AssignOp
                                .classes
                                .Concat
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("var").value(),
                        " .= ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\AssignOp\\Mod")
    protected Object pExpr_AssignOp_Mod(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .AssignOp
                                .classes
                                .Mod
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("var").value(),
                        " %= ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\AssignOp\\BitwiseAnd"
    )
    protected Object pExpr_AssignOp_BitwiseAnd(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .AssignOp
                                .classes
                                .BitwiseAnd
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("var").value(),
                        " &= ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\AssignOp\\BitwiseOr"
    )
    protected Object pExpr_AssignOp_BitwiseOr(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .AssignOp
                                .classes
                                .BitwiseOr
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("var").value(),
                        " |= ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\AssignOp\\BitwiseXor"
    )
    protected Object pExpr_AssignOp_BitwiseXor(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .AssignOp
                                .classes
                                .BitwiseXor
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("var").value(),
                        " ^= ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\AssignOp\\ShiftLeft"
    )
    protected Object pExpr_AssignOp_ShiftLeft(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .AssignOp
                                .classes
                                .ShiftLeft
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("var").value(),
                        " <<= ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\AssignOp\\ShiftRight"
    )
    protected Object pExpr_AssignOp_ShiftRight(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .AssignOp
                                .classes
                                .ShiftRight
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("var").value(),
                        " >>= ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\AssignOp\\Pow")
    protected Object pExpr_AssignOp_Pow(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .AssignOp
                                .classes
                                .Pow
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("var").value(),
                        " **= ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\Plus"
    )
    protected Object pExpr_BinaryOp_Plus(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .BinaryOp
                                .classes
                                .Plus
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " + ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\Minus"
    )
    protected Object pExpr_BinaryOp_Minus(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .BinaryOp
                                .classes
                                .Minus
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " - ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\Mul")
    protected Object pExpr_BinaryOp_Mul(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .BinaryOp
                                .classes
                                .Mul
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " * ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\Div")
    protected Object pExpr_BinaryOp_Div(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .BinaryOp
                                .classes
                                .Div
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " / ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\Concat"
    )
    protected Object pExpr_BinaryOp_Concat(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .BinaryOp
                                .classes
                                .Concat
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " . ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\Mod")
    protected Object pExpr_BinaryOp_Mod(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .BinaryOp
                                .classes
                                .Mod
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " % ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\BooleanAnd"
    )
    protected Object pExpr_BinaryOp_BooleanAnd(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        BooleanAnd.CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " && ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\BooleanOr"
    )
    protected Object pExpr_BinaryOp_BooleanOr(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        BooleanOr.CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " || ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\BitwiseAnd"
    )
    protected Object pExpr_BinaryOp_BitwiseAnd(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .BinaryOp
                                .classes
                                .BitwiseAnd
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " & ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\BitwiseOr"
    )
    protected Object pExpr_BinaryOp_BitwiseOr(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .BinaryOp
                                .classes
                                .BitwiseOr
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " | ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\BitwiseXor"
    )
    protected Object pExpr_BinaryOp_BitwiseXor(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .BinaryOp
                                .classes
                                .BitwiseXor
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " ^ ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\ShiftLeft"
    )
    protected Object pExpr_BinaryOp_ShiftLeft(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .BinaryOp
                                .classes
                                .ShiftLeft
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " << ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\ShiftRight"
    )
    protected Object pExpr_BinaryOp_ShiftRight(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .BinaryOp
                                .classes
                                .ShiftRight
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " >> ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\Pow")
    protected Object pExpr_BinaryOp_Pow(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .BinaryOp
                                .classes
                                .Pow
                                .CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " ** ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\LogicalAnd"
    )
    protected Object pExpr_BinaryOp_LogicalAnd(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        LogicalAnd.CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " and ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\LogicalOr"
    )
    protected Object pExpr_BinaryOp_LogicalOr(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        LogicalOr.CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " or ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\LogicalXor"
    )
    protected Object pExpr_BinaryOp_LogicalXor(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        LogicalXor.CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " xor ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\Equal"
    )
    protected Object pExpr_BinaryOp_Equal(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        Equal.CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " == ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\NotEqual"
    )
    protected Object pExpr_BinaryOp_NotEqual(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        NotEqual.CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " != ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\Identical"
    )
    protected Object pExpr_BinaryOp_Identical(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        Identical.CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " === ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\NotIdentical"
    )
    protected Object pExpr_BinaryOp_NotIdentical(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        NotIdentical.CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " !== ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\Spaceship"
    )
    protected Object pExpr_BinaryOp_Spaceship(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        Spaceship.CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " <=> ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\Greater"
    )
    protected Object pExpr_BinaryOp_Greater(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        Greater.CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " > ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\GreaterOrEqual"
    )
    protected Object pExpr_BinaryOp_GreaterOrEqual(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        GreaterOrEqual.CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " >= ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\Smaller"
    )
    protected Object pExpr_BinaryOp_Smaller(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        Smaller.CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " < ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\SmallerOrEqual"
    )
    protected Object pExpr_BinaryOp_SmallerOrEqual(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        SmallerOrEqual.CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " <= ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\BinaryOp\\Coalesce"
    )
    protected Object pExpr_BinaryOp_Coalesce(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        Coalesce.CONST_class,
                        toObjectR(node).accessProp(this, env).name("left").value(),
                        " ?? ",
                        toObjectR(node).accessProp(this, env).name("right").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Instanceof_")
    protected Object pExpr_Instanceof(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        Instanceof_.CONST_class,
                        toObjectR(node).accessProp(this, env).name("expr").value(),
                        " instanceof ",
                        toObjectR(node).accessProp(this, env).name("class").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\BooleanNot")
    protected Object pExpr_BooleanNot(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pPrefixOp",
                        Standard.class,
                        BooleanNot.CONST_class,
                        "!",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\BitwiseNot")
    protected Object pExpr_BitwiseNot(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pPrefixOp",
                        Standard.class,
                        BitwiseNot.CONST_class,
                        "~",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\UnaryMinus")
    protected Object pExpr_UnaryMinus(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                toObjectR(node).accessProp(this, env).name("expr").value(),
                                UnaryMinus.class,
                                "PhpParser\\Node\\Expr\\UnaryMinus"))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                toObjectR(node).accessProp(this, env).name("expr").value(),
                                PreDec.class,
                                "PhpParser\\Node\\Expr\\PreDec"))) {
            return ZVal.assign(
                    "-("
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "p",
                                            Standard.class,
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("expr")
                                                    .value()),
                                    env)
                            + ")");
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "pPrefixOp",
                        Standard.class,
                        UnaryMinus.CONST_class,
                        "-",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\UnaryPlus")
    protected Object pExpr_UnaryPlus(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                toObjectR(node).accessProp(this, env).name("expr").value(),
                                UnaryPlus.class,
                                "PhpParser\\Node\\Expr\\UnaryPlus"))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                toObjectR(node).accessProp(this, env).name("expr").value(),
                                PreInc.class,
                                "PhpParser\\Node\\Expr\\PreInc"))) {
            return ZVal.assign(
                    "+("
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "p",
                                            Standard.class,
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("expr")
                                                    .value()),
                                    env)
                            + ")");
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "pPrefixOp",
                        Standard.class,
                        UnaryPlus.CONST_class,
                        "+",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\PreInc")
    protected Object pExpr_PreInc(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pPrefixOp",
                        Standard.class,
                        PreInc.CONST_class,
                        "++",
                        toObjectR(node).accessProp(this, env).name("var").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\PreDec")
    protected Object pExpr_PreDec(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pPrefixOp",
                        Standard.class,
                        PreDec.CONST_class,
                        "--",
                        toObjectR(node).accessProp(this, env).name("var").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\PostInc")
    protected Object pExpr_PostInc(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pPostfixOp",
                        Standard.class,
                        PostInc.CONST_class,
                        toObjectR(node).accessProp(this, env).name("var").value(),
                        "++"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\PostDec")
    protected Object pExpr_PostDec(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pPostfixOp",
                        Standard.class,
                        PostDec.CONST_class,
                        toObjectR(node).accessProp(this, env).name("var").value(),
                        "--"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\ErrorSuppress")
    protected Object pExpr_ErrorSuppress(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pPrefixOp",
                        Standard.class,
                        ErrorSuppress.CONST_class,
                        "@",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\YieldFrom")
    protected Object pExpr_YieldFrom(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pPrefixOp",
                        Standard.class,
                        YieldFrom.CONST_class,
                        "yield from ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Print_")
    protected Object pExpr_Print(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pPrefixOp",
                        Standard.class,
                        Print_.CONST_class,
                        "print ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Cast\\Int_")
    protected Object pExpr_Cast_Int(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pPrefixOp",
                        Standard.class,
                        Int_.CONST_class,
                        "(int) ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Cast\\Double")
    protected Object pExpr_Cast_Double(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pPrefixOp",
                        Standard.class,
                        Double.CONST_class,
                        "(double) ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Cast\\String_")
    protected Object pExpr_Cast_String(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pPrefixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .Cast
                                .classes
                                .String_
                                .CONST_class,
                        "(string) ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Cast\\Array_")
    protected Object pExpr_Cast_Array(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pPrefixOp",
                        Standard.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Expr
                                .namespaces
                                .Cast
                                .classes
                                .Array_
                                .CONST_class,
                        "(array) ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Cast\\Object_")
    protected Object pExpr_Cast_Object(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pPrefixOp",
                        Standard.class,
                        Object_.CONST_class,
                        "(object) ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Cast\\Bool_")
    protected Object pExpr_Cast_Bool(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pPrefixOp",
                        Standard.class,
                        Bool_.CONST_class,
                        "(bool) ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Cast\\Unset_")
    protected Object pExpr_Cast_Unset(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pPrefixOp",
                        Standard.class,
                        Unset_.CONST_class,
                        "(unset) ",
                        toObjectR(node).accessProp(this, env).name("expr").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\FuncCall")
    protected Object pExpr_FuncCall(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                this.pCallLhs(
                                        env,
                                        toObjectR(node).accessProp(this, env).name("name").value()),
                                env)
                        + "("
                        + toStringR(
                                this.pMaybeMultiline(
                                        env,
                                        toObjectR(node).accessProp(this, env).name("args").value()),
                                env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\MethodCall")
    protected Object pExpr_MethodCall(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                this.pDereferenceLhs(
                                        env,
                                        toObjectR(node).accessProp(this, env).name("var").value()),
                                env)
                        + "->"
                        + toStringR(
                                this.pObjectProperty(
                                        env,
                                        toObjectR(node).accessProp(this, env).name("name").value()),
                                env)
                        + "("
                        + toStringR(
                                this.pMaybeMultiline(
                                        env,
                                        toObjectR(node).accessProp(this, env).name("args").value()),
                                env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\StaticCall")
    protected Object pExpr_StaticCall(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                this.pDereferenceLhs(
                                        env,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("class")
                                                .value()),
                                env)
                        + "::"
                        + toStringR(
                                ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        toObjectR(node)
                                                                .accessProp(this, env)
                                                                .name("name")
                                                                .value(),
                                                        Expr.class,
                                                        "PhpParser\\Node\\Expr"))
                                        ? ZVal.isTrue(
                                                        ZVal.checkInstanceType(
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("name")
                                                                        .value(),
                                                                Variable.class,
                                                                "PhpParser\\Node\\Expr\\Variable"))
                                                ? env.callMethod(
                                                        this,
                                                        "p",
                                                        Standard.class,
                                                        toObjectR(node)
                                                                .accessProp(this, env)
                                                                .name("name")
                                                                .value())
                                                : "{"
                                                        + toStringR(
                                                                env.callMethod(
                                                                        this,
                                                                        "p",
                                                                        Standard.class,
                                                                        toObjectR(node)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("name")
                                                                                .value()),
                                                                env)
                                                        + "}"
                                        : toObjectR(node)
                                                .accessProp(this, env)
                                                .name("name")
                                                .value(),
                                env)
                        + "("
                        + toStringR(
                                this.pMaybeMultiline(
                                        env,
                                        toObjectR(node).accessProp(this, env).name("args").value()),
                                env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Empty_")
    protected Object pExpr_Empty(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "empty("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("expr").value()),
                                env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Isset_")
    protected Object pExpr_Isset(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "isset("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("vars").value()),
                                env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Eval_")
    protected Object pExpr_Eval(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "eval("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("expr").value()),
                                env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Include_")
    protected Object pExpr_Include(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        ReferenceContainer map = new BasicReferenceContainer(null);
        map =
                env.getInlineStatic(
                        17,
                        ZVal.newArray(
                                new ZPair(Include_.CONST_TYPE_INCLUDE, "include"),
                                new ZPair(Include_.CONST_TYPE_INCLUDE_ONCE, "include_once"),
                                new ZPair(Include_.CONST_TYPE_REQUIRE, "require"),
                                new ZPair(Include_.CONST_TYPE_REQUIRE_ONCE, "require_once")));
        return ZVal.assign(
                toStringR(
                                map.arrayGet(
                                        env,
                                        toObjectR(node).accessProp(this, env).name("type").value()),
                                env)
                        + " "
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("expr").value()),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\List_")
    protected Object pExpr_List(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "list("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("items")
                                                .value()),
                                env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Error")
    protected Object pExpr_Error(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        throw ZVal.getException(
                env, new LogicException(env, "Cannot pretty-print AST with Error nodes"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Variable")
    protected Object pExpr_Variable(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        toObjectR(node).accessProp(this, env).name("name").value(),
                        Expr.class,
                        "PhpParser\\Node\\Expr"))) {
            return ZVal.assign(
                    "${"
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "p",
                                            Standard.class,
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value()),
                                    env)
                            + "}");

        } else {
            return ZVal.assign(
                    "$"
                            + toStringR(
                                    toObjectR(node).accessProp(this, env).name("name").value(),
                                    env));
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Array_")
    protected Object pExpr_Array(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object syntax = null;
        syntax =
                env.callMethod(
                        node,
                        "getAttribute",
                        Standard.class,
                        "kind",
                        ZVal.isTrue(
                                        new ReferenceClassProperty(this, "options", env)
                                                .arrayGet(env, "shortArraySyntax"))
                                ? com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PhpParser
                                        .namespaces
                                        .Node
                                        .namespaces
                                        .Expr
                                        .classes
                                        .Array_
                                        .CONST_KIND_SHORT
                                : com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PhpParser
                                        .namespaces
                                        .Node
                                        .namespaces
                                        .Expr
                                        .classes
                                        .Array_
                                        .CONST_KIND_LONG);
        if (ZVal.strictEqualityCheck(
                syntax,
                "===",
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .PhpParser
                        .namespaces
                        .Node
                        .namespaces
                        .Expr
                        .classes
                        .Array_
                        .CONST_KIND_SHORT)) {
            return ZVal.assign(
                    "["
                            + toStringR(
                                    this.pMaybeMultiline(
                                            env,
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("items")
                                                    .value(),
                                            true),
                                    env)
                            + "]");

        } else {
            return ZVal.assign(
                    "array("
                            + toStringR(
                                    this.pMaybeMultiline(
                                            env,
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("items")
                                                    .value(),
                                            true),
                                    env)
                            + ")");
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\ArrayItem")
    protected Object pExpr_ArrayItem(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("key")
                                                        .value())
                                        ? toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "p",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("key")
                                                                        .value()),
                                                        env)
                                                + " => "
                                        : "",
                                env)
                        + toStringR(
                                toObjectR(node).accessProp(this, env).name("byRef").getBool()
                                        ? "&"
                                        : "",
                                env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("value")
                                                .value()),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\ArrayDimFetch")
    protected Object pExpr_ArrayDimFetch(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                this.pDereferenceLhs(
                                        env,
                                        toObjectR(node).accessProp(this, env).name("var").value()),
                                env)
                        + "["
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("dim")
                                                        .value())
                                        ? env.callMethod(
                                                this,
                                                "p",
                                                Standard.class,
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("dim")
                                                        .value())
                                        : "",
                                env)
                        + "]");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\ConstFetch")
    protected Object pExpr_ConstFetch(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "p",
                        Standard.class,
                        toObjectR(node).accessProp(this, env).name("name").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\ClassConstFetch"
    )
    protected Object pExpr_ClassConstFetch(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("class")
                                                .value()),
                                env)
                        + "::"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("name").value()),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\PropertyFetch")
    protected Object pExpr_PropertyFetch(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                this.pDereferenceLhs(
                                        env,
                                        toObjectR(node).accessProp(this, env).name("var").value()),
                                env)
                        + "->"
                        + toStringR(
                                this.pObjectProperty(
                                        env,
                                        toObjectR(node).accessProp(this, env).name("name").value()),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Expr\\StaticPropertyFetch"
    )
    protected Object pExpr_StaticPropertyFetch(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                this.pDereferenceLhs(
                                        env,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("class")
                                                .value()),
                                env)
                        + "::$"
                        + toStringR(
                                this.pObjectProperty(
                                        env,
                                        toObjectR(node).accessProp(this, env).name("name").value()),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\ShellExec")
    protected Object pExpr_ShellExec(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "`"
                        + toStringR(
                                this.pEncapsList(
                                        env,
                                        toObjectR(node).accessProp(this, env).name("parts").value(),
                                        "`"),
                                env)
                        + "`");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Closure")
    protected Object pExpr_Closure(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                toObjectR(node).accessProp(this, env).name("static").getBool()
                                        ? "static "
                                        : "",
                                env)
                        + "function "
                        + toStringR(
                                toObjectR(node).accessProp(this, env).name("byRef").getBool()
                                        ? "&"
                                        : "",
                                env)
                        + "("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("params")
                                                .value()),
                                env)
                        + ")"
                        + toStringR(
                                !ZVal.isEmpty(
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("uses")
                                                        .value())
                                        ? " use("
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "pCommaSeparated",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("uses")
                                                                        .value()),
                                                        env)
                                                + ")"
                                        : "",
                                env)
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("returnType")
                                                        .value())
                                        ? " : "
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "p",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("returnType")
                                                                        .value()),
                                                        env)
                                        : "",
                                env)
                        + " {"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pStmts",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("stmts")
                                                .value()),
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "}");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\ClosureUse")
    protected Object pExpr_ClosureUse(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                toObjectR(node).accessProp(this, env).name("byRef").getBool()
                                        ? "&"
                                        : "",
                                env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("var").value()),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\New_")
    protected Object pExpr_New(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object ___args = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        toObjectR(node).accessProp(this, env).name("class").value(),
                        Class_.class,
                        "PhpParser\\Node\\Stmt\\Class_"))) {
            ___args =
                    ZVal.assign(
                            toObjectR(node).accessProp(this, env).name("args").getBool()
                                    ? "("
                                            + toStringR(
                                                    this.pMaybeMultiline(
                                                            env,
                                                            toObjectR(node)
                                                                    .accessProp(this, env)
                                                                    .name("args")
                                                                    .value()),
                                                    env)
                                            + ")"
                                    : "");
            return ZVal.assign(
                    "new "
                            + toStringR(
                                    this.pClassCommon(
                                            env,
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("class")
                                                    .value(),
                                            ___args),
                                    env));
        }

        return ZVal.assign(
                "new "
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("class")
                                                .value()),
                                env)
                        + "("
                        + toStringR(
                                this.pMaybeMultiline(
                                        env,
                                        toObjectR(node).accessProp(this, env).name("args").value()),
                                env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Clone_")
    protected Object pExpr_Clone(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "clone "
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("expr").value()),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Ternary")
    protected Object pExpr_Ternary(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "pInfixOp",
                        Standard.class,
                        Ternary.CONST_class,
                        toObjectR(node).accessProp(this, env).name("cond").value(),
                        " ?"
                                + toStringR(
                                        ZVal.strictNotEqualityCheck(
                                                        ZVal.getNull(),
                                                        "!==",
                                                        toObjectR(node)
                                                                .accessProp(this, env)
                                                                .name("if")
                                                                .value())
                                                ? " "
                                                        + toStringR(
                                                                env.callMethod(
                                                                        this,
                                                                        "p",
                                                                        Standard.class,
                                                                        toObjectR(node)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("if")
                                                                                .value()),
                                                                env)
                                                        + " "
                                                : "",
                                        env)
                                + ": ",
                        toObjectR(node).accessProp(this, env).name("else").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Exit_")
    protected Object pExpr_Exit(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object kind = null;
        kind = env.callMethod(node, "getAttribute", Standard.class, "kind", Exit_.CONST_KIND_DIE);
        return ZVal.assign(
                toStringR(
                                ZVal.strictEqualityCheck(kind, "===", Exit_.CONST_KIND_EXIT)
                                        ? "exit"
                                        : "die",
                                env)
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("expr")
                                                        .value())
                                        ? "("
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "p",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("expr")
                                                                        .value()),
                                                        env)
                                                + ")"
                                        : "",
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr\\Yield_")
    protected Object pExpr_Yield(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(
                toObjectR(node).accessProp(this, env).name("value").value(),
                "===",
                ZVal.getNull())) {
            return "yield";

        } else {
            return ZVal.assign(
                    "(yield "
                            + toStringR(
                                    ZVal.strictNotEqualityCheck(
                                                    toObjectR(node)
                                                            .accessProp(this, env)
                                                            .name("key")
                                                            .value(),
                                                    "!==",
                                                    ZVal.getNull())
                                            ? toStringR(
                                                            env.callMethod(
                                                                    this,
                                                                    "p",
                                                                    Standard.class,
                                                                    toObjectR(node)
                                                                            .accessProp(this, env)
                                                                            .name("key")
                                                                            .value()),
                                                            env)
                                                    + " => "
                                            : "",
                                    env)
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "p",
                                            Standard.class,
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("value")
                                                    .value()),
                                    env)
                            + ")");
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Namespace_")
    protected Object pStmt_Namespace(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (toObjectR(this).accessProp(this, env).name("canUseSemicolonNamespaces").getBool()) {
            return ZVal.assign(
                    "namespace "
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "p",
                                            Standard.class,
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value()),
                                    env)
                            + ";"
                            + toStringR(
                                    toObjectR(this).accessProp(this, env).name("nl").value(), env)
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "pStmts",
                                            Standard.class,
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("stmts")
                                                    .value(),
                                            false),
                                    env));

        } else {
            return ZVal.assign(
                    "namespace"
                            + toStringR(
                                    ZVal.strictNotEqualityCheck(
                                                    ZVal.getNull(),
                                                    "!==",
                                                    toObjectR(node)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value())
                                            ? " "
                                                    + toStringR(
                                                            env.callMethod(
                                                                    this,
                                                                    "p",
                                                                    Standard.class,
                                                                    toObjectR(node)
                                                                            .accessProp(this, env)
                                                                            .name("name")
                                                                            .value()),
                                                            env)
                                            : "",
                                    env)
                            + " {"
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "pStmts",
                                            Standard.class,
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("stmts")
                                                    .value()),
                                    env)
                            + toStringR(
                                    toObjectR(this).accessProp(this, env).name("nl").value(), env)
                            + "}");
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Use_")
    protected Object pStmt_Use(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "use "
                        + toStringR(
                                this.pUseType(
                                        env,
                                        toObjectR(node).accessProp(this, env).name("type").value()),
                                env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("uses").value()),
                                env)
                        + ";");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\GroupUse")
    protected Object pStmt_GroupUse(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "use "
                        + toStringR(
                                this.pUseType(
                                        env,
                                        toObjectR(node).accessProp(this, env).name("type").value()),
                                env)
                        + toStringR(
                                this.pName(
                                        env,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("prefix")
                                                .value()),
                                env)
                        + "\\{"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("uses").value()),
                                env)
                        + "};");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\UseUse")
    protected Object pStmt_UseUse(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                this.pUseType(
                                        env,
                                        toObjectR(node).accessProp(this, env).name("type").value()),
                                env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("name").value()),
                                env)
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("alias")
                                                        .value())
                                        ? " as "
                                                + toStringR(
                                                        toObjectR(node)
                                                                .accessProp(this, env)
                                                                .name("alias")
                                                                .value(),
                                                        env)
                                        : "",
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    protected Object pUseType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictEqualityCheck(type, "===", Use_.CONST_TYPE_FUNCTION)
                        ? "function "
                        : ZVal.strictEqualityCheck(type, "===", Use_.CONST_TYPE_CONSTANT)
                                ? "const "
                                : "");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Interface_")
    protected Object pStmt_Interface(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "interface "
                        + toStringR(toObjectR(node).accessProp(this, env).name("name").value(), env)
                        + toStringR(
                                !ZVal.isEmpty(
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("extends")
                                                        .value())
                                        ? " extends "
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "pCommaSeparated",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("extends")
                                                                        .value()),
                                                        env)
                                        : "",
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "{"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pStmts",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("stmts")
                                                .value()),
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "}");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Class_")
    protected Object pStmt_Class(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                this.pClassCommon(
                        env,
                        node,
                        " "
                                + toStringR(
                                        toObjectR(node).accessProp(this, env).name("name").value(),
                                        env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Trait_")
    protected Object pStmt_Trait(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "trait "
                        + toStringR(toObjectR(node).accessProp(this, env).name("name").value(), env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "{"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pStmts",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("stmts")
                                                .value()),
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "}");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\TraitUse")
    protected Object pStmt_TraitUse(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "use "
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("traits")
                                                .value()),
                                env)
                        + toStringR(
                                ZVal.isEmpty(
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("adaptations")
                                                        .value())
                                        ? ";"
                                        : " {"
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "pStmts",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("adaptations")
                                                                        .value()),
                                                        env)
                                                + toStringR(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("nl")
                                                                .value(),
                                                        env)
                                                + "}",
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Stmt\\TraitUseAdaptation\\Precedence"
    )
    protected Object pStmt_TraitUseAdaptation_Precedence(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("trait")
                                                .value()),
                                env)
                        + "::"
                        + toStringR(
                                toObjectR(node).accessProp(this, env).name("method").value(), env)
                        + " insteadof "
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("insteadof")
                                                .value()),
                                env)
                        + ";");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Stmt\\TraitUseAdaptation\\Alias"
    )
    protected Object pStmt_TraitUseAdaptation_Alias(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("trait")
                                                        .value())
                                        ? toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "p",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("trait")
                                                                        .value()),
                                                        env)
                                                + "::"
                                        : "",
                                env)
                        + toStringR(
                                toObjectR(node).accessProp(this, env).name("method").value(), env)
                        + " as"
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("newModifier")
                                                        .value())
                                        ? " "
                                                + toStringR(
                                                        function_rtrim
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        env.callMethod(
                                                                                this,
                                                                                "pModifiers",
                                                                                Standard.class,
                                                                                toObjectR(node)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "newModifier")
                                                                                        .value()),
                                                                        " ")
                                                                .value(),
                                                        env)
                                        : "",
                                env)
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("newName")
                                                        .value())
                                        ? " "
                                                + toStringR(
                                                        toObjectR(node)
                                                                .accessProp(this, env)
                                                                .name("newName")
                                                                .value(),
                                                        env)
                                        : "",
                                env)
                        + ";");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Property")
    protected Object pStmt_Property(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                ZVal.strictEqualityCheck(
                                                0,
                                                "===",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("flags")
                                                        .value())
                                        ? "var "
                                        : env.callMethod(
                                                this,
                                                "pModifiers",
                                                Standard.class,
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("flags")
                                                        .value()),
                                env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("props")
                                                .value()),
                                env)
                        + ";");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Stmt\\PropertyProperty"
    )
    protected Object pStmt_PropertyProperty(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "$"
                        + toStringR(toObjectR(node).accessProp(this, env).name("name").value(), env)
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("default")
                                                        .value())
                                        ? " = "
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "p",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("default")
                                                                        .value()),
                                                        env)
                                        : "",
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\ClassMethod")
    protected Object pStmt_ClassMethod(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                env.callMethod(
                                        this,
                                        "pModifiers",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("flags")
                                                .value()),
                                env)
                        + "function "
                        + toStringR(
                                toObjectR(node).accessProp(this, env).name("byRef").getBool()
                                        ? "&"
                                        : "",
                                env)
                        + toStringR(toObjectR(node).accessProp(this, env).name("name").value(), env)
                        + "("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("params")
                                                .value()),
                                env)
                        + ")"
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("returnType")
                                                        .value())
                                        ? " : "
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "p",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("returnType")
                                                                        .value()),
                                                        env)
                                        : "",
                                env)
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("stmts")
                                                        .value())
                                        ? toStringR(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("nl")
                                                                .value(),
                                                        env)
                                                + "{"
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "pStmts",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("stmts")
                                                                        .value()),
                                                        env)
                                                + toStringR(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("nl")
                                                                .value(),
                                                        env)
                                                + "}"
                                        : ";",
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\ClassConst")
    protected Object pStmt_ClassConst(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                env.callMethod(
                                        this,
                                        "pModifiers",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("flags")
                                                .value()),
                                env)
                        + "const "
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("consts")
                                                .value()),
                                env)
                        + ";");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Function_")
    protected Object pStmt_Function(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "function "
                        + toStringR(
                                toObjectR(node).accessProp(this, env).name("byRef").getBool()
                                        ? "&"
                                        : "",
                                env)
                        + toStringR(toObjectR(node).accessProp(this, env).name("name").value(), env)
                        + "("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("params")
                                                .value()),
                                env)
                        + ")"
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("returnType")
                                                        .value())
                                        ? " : "
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "p",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("returnType")
                                                                        .value()),
                                                        env)
                                        : "",
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "{"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pStmts",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("stmts")
                                                .value()),
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "}");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Const_")
    protected Object pStmt_Const(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "const "
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("consts")
                                                .value()),
                                env)
                        + ";");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Declare_")
    protected Object pStmt_Declare(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "declare ("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("declares")
                                                .value()),
                                env)
                        + ")"
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("stmts")
                                                        .value())
                                        ? " {"
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "pStmts",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("stmts")
                                                                        .value()),
                                                        env)
                                                + toStringR(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("nl")
                                                                .value(),
                                                        env)
                                                + "}"
                                        : ";",
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "PhpParser\\Node\\Stmt\\DeclareDeclare"
    )
    protected Object pStmt_DeclareDeclare(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(toObjectR(node).accessProp(this, env).name("key").value(), env)
                        + "="
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("value")
                                                .value()),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\If_")
    protected Object pStmt_If(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "if ("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("cond").value()),
                                env)
                        + ") {"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pStmts",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("stmts")
                                                .value()),
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "}"
                        + toStringR(
                                toObjectR(node).accessProp(this, env).name("elseifs").getBool()
                                        ? " "
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "pImplode",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("elseifs")
                                                                        .value(),
                                                                " "),
                                                        env)
                                        : "",
                                env)
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("else")
                                                        .value())
                                        ? " "
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "p",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("else")
                                                                        .value()),
                                                        env)
                                        : "",
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\ElseIf_")
    protected Object pStmt_ElseIf(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "elseif ("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("cond").value()),
                                env)
                        + ") {"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pStmts",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("stmts")
                                                .value()),
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "}");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Else_")
    protected Object pStmt_Else(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "else {"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pStmts",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("stmts")
                                                .value()),
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "}");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\For_")
    protected Object pStmt_For(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "for ("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("init").value()),
                                env)
                        + ";"
                        + toStringR(
                                !ZVal.isEmpty(
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("cond")
                                                        .value())
                                        ? " "
                                        : "",
                                env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("cond").value()),
                                env)
                        + ";"
                        + toStringR(
                                !ZVal.isEmpty(
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("loop")
                                                        .value())
                                        ? " "
                                        : "",
                                env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("loop").value()),
                                env)
                        + ") {"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pStmts",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("stmts")
                                                .value()),
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "}");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Foreach_")
    protected Object pStmt_Foreach(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "foreach ("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("expr").value()),
                                env)
                        + " as "
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("keyVar")
                                                        .value())
                                        ? toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "p",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("keyVar")
                                                                        .value()),
                                                        env)
                                                + " => "
                                        : "",
                                env)
                        + toStringR(
                                toObjectR(node).accessProp(this, env).name("byRef").getBool()
                                        ? "&"
                                        : "",
                                env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("valueVar")
                                                .value()),
                                env)
                        + ") {"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pStmts",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("stmts")
                                                .value()),
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "}");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\While_")
    protected Object pStmt_While(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "while ("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("cond").value()),
                                env)
                        + ") {"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pStmts",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("stmts")
                                                .value()),
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "}");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Do_")
    protected Object pStmt_Do(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "do {"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pStmts",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("stmts")
                                                .value()),
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "} while ("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("cond").value()),
                                env)
                        + ");");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Switch_")
    protected Object pStmt_Switch(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "switch ("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("cond").value()),
                                env)
                        + ") {"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pStmts",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("cases")
                                                .value()),
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "}");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Case_")
    protected Object pStmt_Case(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("cond")
                                                        .value())
                                        ? "case "
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "p",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("cond")
                                                                        .value()),
                                                        env)
                                        : "default",
                                env)
                        + ":"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pStmts",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("stmts")
                                                .value()),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\TryCatch")
    protected Object pStmt_TryCatch(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "try {"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pStmts",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("stmts")
                                                .value()),
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "}"
                        + toStringR(
                                toObjectR(node).accessProp(this, env).name("catches").getBool()
                                        ? " "
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "pImplode",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("catches")
                                                                        .value(),
                                                                " "),
                                                        env)
                                        : "",
                                env)
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("finally")
                                                        .value(),
                                                "!==",
                                                ZVal.getNull())
                                        ? " "
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "p",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("finally")
                                                                        .value()),
                                                        env)
                                        : "",
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Catch_")
    protected Object pStmt_Catch(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "catch ("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pImplode",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("types").value(),
                                        "|"),
                                env)
                        + " "
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("var").value()),
                                env)
                        + ") {"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pStmts",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("stmts")
                                                .value()),
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "}");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Finally_")
    protected Object pStmt_Finally(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "finally {"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pStmts",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("stmts")
                                                .value()),
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "}");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Break_")
    protected Object pStmt_Break(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "break"
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("num")
                                                        .value(),
                                                "!==",
                                                ZVal.getNull())
                                        ? " "
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "p",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("num")
                                                                        .value()),
                                                        env)
                                        : "",
                                env)
                        + ";");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Continue_")
    protected Object pStmt_Continue(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "continue"
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("num")
                                                        .value(),
                                                "!==",
                                                ZVal.getNull())
                                        ? " "
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "p",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("num")
                                                                        .value()),
                                                        env)
                                        : "",
                                env)
                        + ";");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Return_")
    protected Object pStmt_Return(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "return"
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("expr")
                                                        .value())
                                        ? " "
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "p",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("expr")
                                                                        .value()),
                                                        env)
                                        : "",
                                env)
                        + ";");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Throw_")
    protected Object pStmt_Throw(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "throw "
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("expr").value()),
                                env)
                        + ";");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Label")
    protected Object pStmt_Label(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(toObjectR(node).accessProp(this, env).name("name").value(), env) + ":");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Goto_")
    protected Object pStmt_Goto(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "goto "
                        + toStringR(toObjectR(node).accessProp(this, env).name("name").value(), env)
                        + ";");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Expression")
    protected Object pStmt_Expression(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("expr").value()),
                                env)
                        + ";");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Echo_")
    protected Object pStmt_Echo(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "echo "
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("exprs")
                                                .value()),
                                env)
                        + ";");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Static_")
    protected Object pStmt_Static(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "static "
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("vars").value()),
                                env)
                        + ";");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Global_")
    protected Object pStmt_Global(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "global "
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("vars").value()),
                                env)
                        + ";");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\StaticVar")
    protected Object pStmt_StaticVar(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                env.callMethod(
                                        this,
                                        "p",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("var").value()),
                                env)
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("default")
                                                        .value())
                                        ? " = "
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "p",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("default")
                                                                        .value()),
                                                        env)
                                        : "",
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Unset_")
    protected Object pStmt_Unset(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "unset("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pCommaSeparated",
                                        Standard.class,
                                        toObjectR(node).accessProp(this, env).name("vars").value()),
                                env)
                        + ");");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\InlineHTML")
    protected Object pStmt_InlineHTML(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object newline = null;
        newline =
                ZVal.assign(
                        ZVal.isTrue(
                                        env.callMethod(
                                                node,
                                                "getAttribute",
                                                Standard.class,
                                                "hasLeadingNewline",
                                                true))
                                ? "\n"
                                : "");
        return ZVal.assign(
                "?>"
                        + toStringR(newline, env)
                        + toStringR(
                                toObjectR(node).accessProp(this, env).name("value").value(), env)
                        + "<?php ");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\HaltCompiler")
    protected Object pStmt_HaltCompiler(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                "__halt_compiler();"
                        + toStringR(
                                toObjectR(node).accessProp(this, env).name("remaining").value(),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Nop")
    protected Object pStmt_Nop(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return "";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Class_")
    @ConvertedParameter(index = 1, name = "afterClassToken")
    protected Object pClassCommon(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object afterClassToken = assignParameter(args, 1, false);
        return ZVal.assign(
                toStringR(
                                env.callMethod(
                                        this,
                                        "pModifiers",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("flags")
                                                .value()),
                                env)
                        + "class"
                        + toStringR(afterClassToken, env)
                        + toStringR(
                                ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("extends")
                                                        .value())
                                        ? " extends "
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "p",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("extends")
                                                                        .value()),
                                                        env)
                                        : "",
                                env)
                        + toStringR(
                                !ZVal.isEmpty(
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("implements")
                                                        .value())
                                        ? " implements "
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "pCommaSeparated",
                                                                Standard.class,
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("implements")
                                                                        .value()),
                                                        env)
                                        : "",
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "{"
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "pStmts",
                                        Standard.class,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("stmts")
                                                .value()),
                                env)
                        + toStringR(toObjectR(this).accessProp(this, env).name("nl").value(), env)
                        + "}");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node")
    protected Object pObjectProperty(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (ZVal.isTrue(ZVal.checkInstanceType(node, Expr.class, "PhpParser\\Node\\Expr"))) {
            return ZVal.assign(
                    "{" + toStringR(env.callMethod(this, "p", Standard.class, node), env) + "}");

        } else {
            return ZVal.assign(node);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "encapsList", typeHint = "array")
    @ConvertedParameter(index = 1, name = "quote")
    protected Object pEncapsList(RuntimeEnv env, Object... args) {
        Object encapsList = assignParameter(args, 0, false);
        Object quote = assignParameter(args, 1, false);
        Object _pReturn = null;
        Object element = null;
        _pReturn = "";
        for (ZPair zpairResult893 : ZVal.getIterable(encapsList, env, true)) {
            element = ZVal.assign(zpairResult893.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            element,
                            EncapsedStringPart.class,
                            "PhpParser\\Node\\Scalar\\EncapsedStringPart"))) {
                _pReturn =
                        toStringR(_pReturn, env)
                                + toStringR(
                                        this.escapeString(
                                                env,
                                                toObjectR(element)
                                                        .accessProp(this, env)
                                                        .name("value")
                                                        .value(),
                                                quote),
                                        env);

            } else {
                _pReturn =
                        toStringR(_pReturn, env)
                                + "{"
                                + toStringR(env.callMethod(this, "p", Standard.class, element), env)
                                + "}";
            }
        }

        return ZVal.assign(_pReturn);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string", typeHint = "string")
    protected Object pSingleQuotedString(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        return ZVal.assign(
                "'"
                        + toStringR(
                                NamespaceGlobal.addcslashes.env(env).call(string, "'\\").value(),
                                env)
                        + "'");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    @ConvertedParameter(index = 1, name = "quote")
    protected Object escapeString(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/nikic/php-parser/lib/PhpParser/PrettyPrinter")
                        .setFile(
                                "/vendor/nikic/php-parser/lib/PhpParser/PrettyPrinter/Standard.php");
        Object string = assignParameter(args, 0, false);
        Object quote = assignParameter(args, 1, false);
        Object escaped = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", quote)) {
            escaped = NamespaceGlobal.addcslashes.env(env).call(string, "\t\f\u000B$\\").value();

        } else {
            escaped =
                    NamespaceGlobal.addcslashes
                            .env(env)
                            .call(string, "\n\r\t\f\u000B$" + toStringR(quote, env) + "\\")
                            .value();
        }

        return ZVal.assign(
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(
                                "/([\\0-\\10\\16-\\37])(?=([0-7]?))/",
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "PhpParser\\PrettyPrinter",
                                        this) {
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
                                        Object oct = null;
                                        oct =
                                                NamespaceGlobal.decoct
                                                        .env(env)
                                                        .call(
                                                                NamespaceGlobal.ord
                                                                        .env(env)
                                                                        .call(
                                                                                matches.arrayGet(
                                                                                        env, 1))
                                                                        .value())
                                                        .value();
                                        if (ZVal.strictNotEqualityCheck(
                                                matches.arrayGet(env, 2), "!==", "")) {
                                            return ZVal.assign(
                                                    "\\"
                                                            + toStringR(
                                                                    NamespaceGlobal.str_pad
                                                                            .env(env)
                                                                            .call(oct, 3, "0", 0)
                                                                            .value(),
                                                                    env));
                                        }

                                        return ZVal.assign("\\" + toStringR(oct, env));
                                    }
                                },
                                escaped)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    @ConvertedParameter(index = 1, name = "label")
    @ConvertedParameter(
        index = 2,
        name = "atStart",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "atEnd",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object containsEndLabel(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object label = assignParameter(args, 1, false);
        Object atStart = assignParameter(args, 2, true);
        if (null == atStart) {
            atStart = true;
        }
        Object atEnd = assignParameter(args, 3, true);
        if (null == atEnd) {
            atEnd = true;
        }
        Object start = null;
        Object end = null;
        start = ZVal.assign(ZVal.isTrue(atStart) ? "(?:^|[\\r\\n])" : "[\\r\\n]");
        end = ZVal.assign(ZVal.isTrue(atEnd) ? "(?:$|[;\\r\\n])" : "[;\\r\\n]");
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        false,
                                        "!==",
                                        function_strpos.f.env(env).call(string, label).value()))
                        && ZVal.toBool(
                                function_preg_match
                                        .f
                                        .env(env)
                                        .call(
                                                "/"
                                                        + toStringR(start, env)
                                                        + toStringR(label, env)
                                                        + toStringR(end, env)
                                                        + "/",
                                                string)
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parts", typeHint = "array")
    @ConvertedParameter(index = 1, name = "label")
    protected Object encapsedContainsEndLabel(RuntimeEnv env, Object... args) {
        Object parts = assignParameter(args, 0, false);
        Object label = assignParameter(args, 1, false);
        Object atEnd = null;
        Object part = null;
        Object atStart = null;
        Object i = null;
        for (ZPair zpairResult894 : ZVal.getIterable(parts, env, false)) {
            i = ZVal.assign(zpairResult894.getKey());
            part = ZVal.assign(zpairResult894.getValue());
            atStart = ZVal.strictEqualityCheck(i, "===", 0);
            atEnd =
                    ZVal.strictEqualityCheck(
                            i,
                            "===",
                            ZVal.subtract(function_count.f.env(env).call(parts).value(), 1));
            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    part,
                                    EncapsedStringPart.class,
                                    "PhpParser\\Node\\Scalar\\EncapsedStringPart"))
                    && ZVal.toBool(
                            this.containsEndLabel(
                                    env,
                                    toObjectR(part).accessProp(this, env).name("value").value(),
                                    label,
                                    atStart,
                                    atEnd))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    protected Object pDereferenceLhs(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                env.callMethod(this, "dereferenceLhsRequiresParens", Standard.class, node))) {
            return ZVal.assign(env.callMethod(this, "p", Standard.class, node));

        } else {
            return ZVal.assign(
                    "(" + toStringR(env.callMethod(this, "p", Standard.class, node), env) + ")");
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    protected Object pCallLhs(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (!ZVal.isTrue(env.callMethod(this, "callLhsRequiresParens", Standard.class, node))) {
            return ZVal.assign(env.callMethod(this, "p", Standard.class, node));

        } else {
            return ZVal.assign(
                    "(" + toStringR(env.callMethod(this, "p", Standard.class, node), env) + ")");
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    private Object hasNodeWithComments(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        Object node = null;
        for (ZPair zpairResult895 : ZVal.getIterable(nodes, env, true)) {
            node = ZVal.assign(zpairResult895.getValue());
            if (ZVal.toBool(node)
                    && ZVal.toBool(env.callMethod(node, "getComments", Standard.class))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "trailingComma",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    private Object pMaybeMultiline(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        Object trailingComma = assignParameter(args, 1, true);
        if (null == trailingComma) {
            trailingComma = false;
        }
        if (!ZVal.isTrue(this.hasNodeWithComments(env, nodes))) {
            return ZVal.assign(env.callMethod(this, "pCommaSeparated", Standard.class, nodes));

        } else {
            return ZVal.assign(
                    toStringR(
                                    env.callMethod(
                                            this,
                                            "pCommaSeparatedMultiline",
                                            Standard.class,
                                            nodes,
                                            trailingComma),
                                    env)
                            + toStringR(
                                    toObjectR(this).accessProp(this, env).name("nl").value(), env));
        }
    }

    public static final Object CONST_class = "PhpParser\\PrettyPrinter\\Standard";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends PrettyPrinterAbstract.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\PrettyPrinter\\Standard")
                    .setLookup(
                            Standard.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "canUseSemicolonNamespaces",
                            "docStringEndToken",
                            "fixupMap",
                            "indentLevel",
                            "insertionMap",
                            "labelCharMap",
                            "listInsertionMap",
                            "modifierChangeMap",
                            "nl",
                            "nodeListDiffer",
                            "options",
                            "origTokens",
                            "precedenceMap",
                            "removalMap")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/PrettyPrinter/Standard.php")
                    .addExtendsClass("PhpParser\\PrettyPrinterAbstract")
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

    private enum SwitchEnumType46 {
        DYNAMIC_TYPE_136,
        DYNAMIC_TYPE_137,
        DYNAMIC_TYPE_138,
        DYNAMIC_TYPE_139,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType47 {
        DYNAMIC_TYPE_140,
        DYNAMIC_TYPE_141,
        DYNAMIC_TYPE_142,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
