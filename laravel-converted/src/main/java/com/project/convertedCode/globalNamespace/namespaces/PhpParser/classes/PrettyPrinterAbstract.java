package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.Identical;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Node;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.Equal;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.PostInc;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Namespace_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.NotEqual;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.BooleanOr;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.UnaryMinus;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Expr;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.Cast.classes.Unset_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ConstFetch;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.StaticCall;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.Cast.classes.Bool_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.UnaryPlus;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.LogicalXor;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.MethodCall;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.Encapsed;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.Cast.classes.Int_;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.YieldFrom;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Internal.classes.DiffElem;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.GreaterOrEqual;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.NotIdentical;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.FuncCall;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Class_;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Assign;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.PreDec;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.Spaceship;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Print_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Instanceof_;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Name;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Internal.classes.Differ;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.PreInc;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.Cast.classes.Object_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.Cast.classes.Double;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.Coalesce;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Nop;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.PropertyFetch;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ClassConstFetch;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.BitwiseNot;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Internal.classes.PrintableNewAnonClassNode;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Internal.classes.TokenStream;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Variable;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.PostDec;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ArrayDimFetch;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.InlineHTML;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.SmallerOrEqual;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.LogicalOr;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.LogicalAnd;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Ternary;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.BooleanNot;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Include_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.BooleanAnd;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.StaticPropertyFetch;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ErrorSuppress;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.EncapsedStringPart;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.Greater;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.Smaller;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.AssignRef;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.New_;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/PrettyPrinterAbstract.php

*/

public abstract class PrettyPrinterAbstract extends RuntimeClassBase {

    public Object precedenceMap =
            ZVal.newArray(
                    new ZPair(
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
                            ZVal.arrayFromList(0, 1)),
                    new ZPair(BitwiseNot.CONST_class, ZVal.arrayFromList(10, 1)),
                    new ZPair(PreInc.CONST_class, ZVal.arrayFromList(10, 1)),
                    new ZPair(PreDec.CONST_class, ZVal.arrayFromList(10, 1)),
                    new ZPair(PostInc.CONST_class, ZVal.arrayFromList(10, -1)),
                    new ZPair(PostDec.CONST_class, ZVal.arrayFromList(10, -1)),
                    new ZPair(UnaryPlus.CONST_class, ZVal.arrayFromList(10, 1)),
                    new ZPair(UnaryMinus.CONST_class, ZVal.arrayFromList(10, 1)),
                    new ZPair(Int_.CONST_class, ZVal.arrayFromList(10, 1)),
                    new ZPair(Double.CONST_class, ZVal.arrayFromList(10, 1)),
                    new ZPair(
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
                            ZVal.arrayFromList(10, 1)),
                    new ZPair(
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
                            ZVal.arrayFromList(10, 1)),
                    new ZPair(Object_.CONST_class, ZVal.arrayFromList(10, 1)),
                    new ZPair(Bool_.CONST_class, ZVal.arrayFromList(10, 1)),
                    new ZPair(Unset_.CONST_class, ZVal.arrayFromList(10, 1)),
                    new ZPair(ErrorSuppress.CONST_class, ZVal.arrayFromList(10, 1)),
                    new ZPair(Instanceof_.CONST_class, ZVal.arrayFromList(20, 0)),
                    new ZPair(BooleanNot.CONST_class, ZVal.arrayFromList(30, 1)),
                    new ZPair(
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
                            ZVal.arrayFromList(40, -1)),
                    new ZPair(
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
                            ZVal.arrayFromList(40, -1)),
                    new ZPair(
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
                            ZVal.arrayFromList(40, -1)),
                    new ZPair(
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
                            ZVal.arrayFromList(50, -1)),
                    new ZPair(
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
                            ZVal.arrayFromList(50, -1)),
                    new ZPair(
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
                            ZVal.arrayFromList(50, -1)),
                    new ZPair(
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
                            ZVal.arrayFromList(60, -1)),
                    new ZPair(
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
                            ZVal.arrayFromList(60, -1)),
                    new ZPair(Smaller.CONST_class, ZVal.arrayFromList(70, 0)),
                    new ZPair(SmallerOrEqual.CONST_class, ZVal.arrayFromList(70, 0)),
                    new ZPair(Greater.CONST_class, ZVal.arrayFromList(70, 0)),
                    new ZPair(GreaterOrEqual.CONST_class, ZVal.arrayFromList(70, 0)),
                    new ZPair(Equal.CONST_class, ZVal.arrayFromList(80, 0)),
                    new ZPair(NotEqual.CONST_class, ZVal.arrayFromList(80, 0)),
                    new ZPair(Identical.CONST_class, ZVal.arrayFromList(80, 0)),
                    new ZPair(NotIdentical.CONST_class, ZVal.arrayFromList(80, 0)),
                    new ZPair(Spaceship.CONST_class, ZVal.arrayFromList(80, 0)),
                    new ZPair(
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
                            ZVal.arrayFromList(90, -1)),
                    new ZPair(
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
                            ZVal.arrayFromList(100, -1)),
                    new ZPair(
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
                            ZVal.arrayFromList(110, -1)),
                    new ZPair(BooleanAnd.CONST_class, ZVal.arrayFromList(120, -1)),
                    new ZPair(BooleanOr.CONST_class, ZVal.arrayFromList(130, -1)),
                    new ZPair(Coalesce.CONST_class, ZVal.arrayFromList(140, 1)),
                    new ZPair(Ternary.CONST_class, ZVal.arrayFromList(150, -1)),
                    new ZPair(Assign.CONST_class, ZVal.arrayFromList(160, 1)),
                    new ZPair(AssignRef.CONST_class, ZVal.arrayFromList(160, 1)),
                    new ZPair(
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
                            ZVal.arrayFromList(160, 1)),
                    new ZPair(
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
                            ZVal.arrayFromList(160, 1)),
                    new ZPair(
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
                            ZVal.arrayFromList(160, 1)),
                    new ZPair(
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
                            ZVal.arrayFromList(160, 1)),
                    new ZPair(
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
                            ZVal.arrayFromList(160, 1)),
                    new ZPair(
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
                            ZVal.arrayFromList(160, 1)),
                    new ZPair(
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
                            ZVal.arrayFromList(160, 1)),
                    new ZPair(
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
                            ZVal.arrayFromList(160, 1)),
                    new ZPair(
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
                            ZVal.arrayFromList(160, 1)),
                    new ZPair(
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
                            ZVal.arrayFromList(160, 1)),
                    new ZPair(
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
                            ZVal.arrayFromList(160, 1)),
                    new ZPair(
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
                            ZVal.arrayFromList(160, 1)),
                    new ZPair(YieldFrom.CONST_class, ZVal.arrayFromList(165, 1)),
                    new ZPair(Print_.CONST_class, ZVal.arrayFromList(168, 1)),
                    new ZPair(LogicalAnd.CONST_class, ZVal.arrayFromList(170, -1)),
                    new ZPair(LogicalXor.CONST_class, ZVal.arrayFromList(180, -1)),
                    new ZPair(LogicalOr.CONST_class, ZVal.arrayFromList(190, -1)),
                    new ZPair(Include_.CONST_class, ZVal.arrayFromList(200, -1)));

    public Object indentLevel = null;

    public Object nl = null;

    public Object docStringEndToken = null;

    public Object canUseSemicolonNamespaces = null;

    public Object options = null;

    public Object origTokens = null;

    public Object nodeListDiffer = null;

    public Object labelCharMap = null;

    public Object fixupMap = null;

    public Object removalMap = null;

    public Object insertionMap = null;

    public Object listInsertionMap = null;

    public Object modifierChangeMap = null;

    public PrettyPrinterAbstract(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PrettyPrinterAbstract.class) {
            this.__construct(env, args);
        }
    }

    public PrettyPrinterAbstract(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object defaultOptions = null;
        this.docStringEndToken =
                "_DOC_STRING_END_"
                        + toStringR(NamespaceGlobal.mt_rand.env(env).call().value(), env);
        defaultOptions = ZVal.newArray(new ZPair("shortArraySyntax", false));
        this.options = ZVal.add(options, defaultOptions);
        return null;
    }

    @ConvertedMethod
    protected Object resetState(RuntimeEnv env, Object... args) {
        this.indentLevel = 0;
        this.nl = "\n";
        this.origTokens = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level", typeHint = "int")
    protected Object setIndentLevel(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        this.indentLevel = level;
        this.nl = "\n" + toStringR(function_str_repeat.f.env(env).call(" ", level).value(), env);
        return null;
    }

    @ConvertedMethod
    protected Object indent(RuntimeEnv env, Object... args) {
        this.indentLevel = ZAssignment.add("+=", this.indentLevel, 4);
        this.nl = toStringR(this.nl, env) + "    ";
        return null;
    }

    @ConvertedMethod
    protected Object outdent(RuntimeEnv env, Object... args) {
        com.runtimeconverter.runtime.ZVal.functionNotFound("_pAssert")
                .env(env)
                .call(ZVal.isGreaterThanOrEqualTo(this.indentLevel, ">=", 4));
        this.indentLevel = ZAssignment.subtract("-=", this.indentLevel, 4);
        this.nl =
                "\n"
                        + toStringR(
                                function_str_repeat.f.env(env).call(" ", this.indentLevel).value(),
                                env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stmts", typeHint = "array")
    public Object prettyPrint(RuntimeEnv env, Object... args) {
        Object stmts = assignParameter(args, 0, false);
        this.resetState(env);
        this.preprocessNodes(env, stmts);
        return ZVal.assign(
                function_ltrim
                        .f
                        .env(env)
                        .call(this.handleMagicTokens(env, this.pStmts(env, stmts, false)))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Expr")
    public Object prettyPrintExpr(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        this.resetState(env);
        return ZVal.assign(this.handleMagicTokens(env, this.p(env, node)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stmts", typeHint = "array")
    public Object prettyPrintFile(RuntimeEnv env, Object... args) {
        ReferenceContainer stmts = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object p = null;
        if (!ZVal.isTrue(stmts.getObject())) {
            return "<?php\n\n";
        }

        p = "<?php\n\n" + toStringR(this.prettyPrint(env, stmts.getObject()), env);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        stmts.arrayGet(env, 0),
                        InlineHTML.class,
                        "PhpParser\\Node\\Stmt\\InlineHTML"))) {
            p = function_preg_replace.f.env(env).call("/^<\\?php\\s+\\?>\\n?/", "", p).value();
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        stmts.arrayGet(
                                env,
                                ZVal.subtract(
                                        function_count.f.env(env).call(stmts.getObject()).value(),
                                        1)),
                        InlineHTML.class,
                        "PhpParser\\Node\\Stmt\\InlineHTML"))) {
            p =
                    function_preg_replace
                            .f
                            .env(env)
                            .call("/<\\?php$/", "", function_rtrim.f.env(env).call(p).value())
                            .value();
        }

        return ZVal.assign(p);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    protected Object preprocessNodes(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object nodes = assignParameter(args, 0, false);
        Object node = null;
        this.canUseSemicolonNamespaces = true;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult896 : ZVal.getIterable(nodes, env, true)) {
            node = ZVal.assign(zpairResult896.getValue());
            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    node, Namespace_.class, "PhpParser\\Node\\Stmt\\Namespace_"))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    ZVal.getNull(),
                                    "===",
                                    toObjectR(node).accessProp(this, env).name("name").value()))) {
                this.canUseSemicolonNamespaces = false;
                break;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "str", typeHint = "string")
    protected Object handleMagicTokens(RuntimeEnv env, Object... args) {
        Object str = assignParameter(args, 0, false);
        str =
                function_str_replace
                        .f
                        .env(env)
                        .call(toStringR(this.docStringEndToken, env) + ";\n", ";\n", str)
                        .value();
        str = function_str_replace.f.env(env).call(this.docStringEndToken, "\n", str).value();
        return ZVal.assign(str);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "indent",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object pStmts(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object nodes = assignParameter(args, 0, false);
        Object indent = assignParameter(args, 1, true);
        if (null == indent) {
            indent = true;
        }
        Object result = null;
        Object node = null;
        Object comments = null;
        if (ZVal.isTrue(indent)) {
            this.indent(env);
        }

        result = "";
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult897 : ZVal.getIterable(nodes, env, true)) {
            node = ZVal.assign(zpairResult897.getValue());
            comments = env.callMethod(node, "getComments", PrettyPrinterAbstract.class);
            if (ZVal.isTrue(comments)) {
                result =
                        toStringR(result, env)
                                + toStringR(this.nl, env)
                                + toStringR(this.pComments(env, comments), env);
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(node, Nop.class, "PhpParser\\Node\\Stmt\\Nop"))) {
                    continue;
                }
            }

            result =
                    toStringR(result, env)
                            + toStringR(this.nl, env)
                            + toStringR(this.p(env, node), env);
        }

        if (ZVal.isTrue(indent)) {
            this.outdent(env);
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class", typeHint = "string")
    @ConvertedParameter(index = 1, name = "leftNode", typeHint = "PhpParser\\Node")
    @ConvertedParameter(index = 2, name = "operatorString", typeHint = "string")
    @ConvertedParameter(index = 3, name = "rightNode", typeHint = "PhpParser\\Node")
    protected Object pInfixOp(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object leftNode = assignParameter(args, 1, false);
        Object operatorString = assignParameter(args, 2, false);
        Object rightNode = assignParameter(args, 3, false);
        Object runtimeTempArrayResult124 = null;
        Object associativity = null;
        Object precedence = null;
        ZVal.list(
                runtimeTempArrayResult124 =
                        new ReferenceClassProperty(this, "precedenceMap", env)
                                .arrayGet(env, _pClass),
                (precedence = listGet(runtimeTempArrayResult124, 0, env)),
                (associativity = listGet(runtimeTempArrayResult124, 1, env)));
        return ZVal.assign(
                toStringR(this.pPrec(env, leftNode, precedence, associativity, -1), env)
                        + toStringR(operatorString, env)
                        + toStringR(this.pPrec(env, rightNode, precedence, associativity, 1), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class", typeHint = "string")
    @ConvertedParameter(index = 1, name = "operatorString", typeHint = "string")
    @ConvertedParameter(index = 2, name = "node", typeHint = "PhpParser\\Node")
    protected Object pPrefixOp(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object operatorString = assignParameter(args, 1, false);
        Object node = assignParameter(args, 2, false);
        Object runtimeTempArrayResult125 = null;
        Object associativity = null;
        Object precedence = null;
        ZVal.list(
                runtimeTempArrayResult125 =
                        new ReferenceClassProperty(this, "precedenceMap", env)
                                .arrayGet(env, _pClass),
                (precedence = listGet(runtimeTempArrayResult125, 0, env)),
                (associativity = listGet(runtimeTempArrayResult125, 1, env)));
        return ZVal.assign(
                toStringR(operatorString, env)
                        + toStringR(this.pPrec(env, node, precedence, associativity, 1), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class", typeHint = "string")
    @ConvertedParameter(index = 1, name = "node", typeHint = "PhpParser\\Node")
    @ConvertedParameter(index = 2, name = "operatorString", typeHint = "string")
    protected Object pPostfixOp(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object node = assignParameter(args, 1, false);
        Object operatorString = assignParameter(args, 2, false);
        Object runtimeTempArrayResult126 = null;
        Object associativity = null;
        Object precedence = null;
        ZVal.list(
                runtimeTempArrayResult126 =
                        new ReferenceClassProperty(this, "precedenceMap", env)
                                .arrayGet(env, _pClass),
                (precedence = listGet(runtimeTempArrayResult126, 0, env)),
                (associativity = listGet(runtimeTempArrayResult126, 1, env)));
        return ZVal.assign(
                toStringR(this.pPrec(env, node, precedence, associativity, -1), env)
                        + toStringR(operatorString, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    @ConvertedParameter(index = 1, name = "parentPrecedence", typeHint = "int")
    @ConvertedParameter(index = 2, name = "parentAssociativity", typeHint = "int")
    @ConvertedParameter(index = 3, name = "childPosition", typeHint = "int")
    protected Object pPrec(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object parentPrecedence = assignParameter(args, 1, false);
        Object parentAssociativity = assignParameter(args, 2, false);
        Object childPosition = assignParameter(args, 3, false);
        Object childPrecedence = null;
        Object _pClass = null;
        _pClass = function_get_class.f.env(env).call(node).value();
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "precedenceMap", env),
                env,
                _pClass)) {
            childPrecedence =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "precedenceMap", env)
                                    .arrayGet(env, _pClass, 0));
            if (ZVal.toBool(ZVal.isGreaterThan(childPrecedence, '>', parentPrecedence))
                    || ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    parentPrecedence, "===", childPrecedence))
                                    && ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(
                                                    parentAssociativity, "!==", childPosition)))) {
                return ZVal.assign("(" + toStringR(this.p(env, node), env) + ")");
            }
        }

        return ZVal.assign(this.p(env, node));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    @ConvertedParameter(index = 1, name = "glue", typeHint = "string")
    protected Object pImplode(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        Object glue = assignParameter(args, 1, true);
        if (null == glue) {
            glue = "";
        }
        Object node = null;
        ReferenceContainer pNodes = new BasicReferenceContainer(null);
        pNodes.setObject(ZVal.newArray());
        for (ZPair zpairResult898 : ZVal.getIterable(nodes, env, true)) {
            node = ZVal.assign(zpairResult898.getValue());
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", node)) {
                pNodes.arrayAppend(env).set("");

            } else {
                pNodes.arrayAppend(env).set(this.p(env, node));
            }
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call(glue, pNodes.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    protected Object pCommaSeparated(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        return ZVal.assign(this.pImplode(env, nodes, ", "));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    @ConvertedParameter(index = 1, name = "trailingComma", typeHint = "bool")
    protected Object pCommaSeparatedMultiline(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        Object trailingComma = assignParameter(args, 1, false);
        Object result = null;
        Object node = null;
        Object comments = null;
        Object lastIdx = null;
        Object idx = null;
        this.indent(env);
        result = "";
        lastIdx = ZVal.subtract(function_count.f.env(env).call(nodes).value(), 1);
        for (ZPair zpairResult899 : ZVal.getIterable(nodes, env, false)) {
            idx = ZVal.assign(zpairResult899.getKey());
            node = ZVal.assign(zpairResult899.getValue());
            if (ZVal.strictNotEqualityCheck(node, "!==", ZVal.getNull())) {
                comments = env.callMethod(node, "getComments", PrettyPrinterAbstract.class);
                if (ZVal.isTrue(comments)) {
                    result =
                            toStringR(result, env)
                                    + toStringR(this.nl, env)
                                    + toStringR(this.pComments(env, comments), env);
                }

                result =
                        toStringR(result, env)
                                + toStringR(this.nl, env)
                                + toStringR(this.p(env, node), env);

            } else {
                result = toStringR(result, env) + toStringR(this.nl, env);
            }

            if (ZVal.toBool(trailingComma)
                    || ZVal.toBool(ZVal.strictNotEqualityCheck(idx, "!==", lastIdx))) {
                result = toStringR(result, env) + ",";
            }
        }

        this.outdent(env);
        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "comments", typeHint = "array")
    protected Object pComments(RuntimeEnv env, Object... args) {
        Object comments = assignParameter(args, 0, false);
        Object comment = null;
        ReferenceContainer formattedComments = new BasicReferenceContainer(null);
        formattedComments.setObject(ZVal.newArray());
        for (ZPair zpairResult900 : ZVal.getIterable(comments, env, true)) {
            comment = ZVal.assign(zpairResult900.getValue());
            formattedComments
                    .arrayAppend(env)
                    .set(
                            function_str_replace
                                    .f
                                    .env(env)
                                    .call(
                                            "\n",
                                            this.nl,
                                            env.callMethod(
                                                    comment,
                                                    "getReformattedText",
                                                    PrettyPrinterAbstract.class))
                                    .value());
        }

        return ZVal.assign(
                NamespaceGlobal.implode
                        .env(env)
                        .call(this.nl, formattedComments.getObject())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stmts", typeHint = "array")
    @ConvertedParameter(index = 1, name = "origStmts", typeHint = "array")
    @ConvertedParameter(index = 2, name = "origTokens", typeHint = "array")
    public Object printFormatPreserving(RuntimeEnv env, Object... args) {
        Object stmts = assignParameter(args, 0, false);
        Object origStmts = assignParameter(args, 1, false);
        Object origTokens = assignParameter(args, 2, false);
        Object result = null;
        ReferenceContainer pos = new BasicReferenceContainer(null);
        this.initializeNodeListDiffer(env);
        this.initializeLabelCharMap(env);
        this.initializeFixupMap(env);
        this.initializeRemovalMap(env);
        this.initializeInsertionMap(env);
        this.initializeListInsertionMap(env);
        this.initializeModifierChangeMap(env);
        this.resetState(env);
        this.origTokens = new TokenStream(env, origTokens);
        this.preprocessNodes(env, stmts);
        pos.setObject(0);
        result =
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(2, pos),
                        "pArray",
                        PrettyPrinterAbstract.class,
                        stmts,
                        origStmts,
                        pos.getObject(),
                        0,
                        "stmts",
                        ZVal.getNull(),
                        "\n");
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", result)) {
            result =
                    toStringR(result, env)
                            + toStringR(
                                    env.callMethod(
                                            this.origTokens,
                                            "getTokenCode",
                                            PrettyPrinterAbstract.class,
                                            pos.getObject(),
                                            function_count.f.env(env).call(origTokens).value(),
                                            0),
                                    env);

        } else {
            result = "<?php\n" + toStringR(this.pStmts(env, stmts, false), env);
        }

        return ZVal.assign(
                function_ltrim.f.env(env).call(this.handleMagicTokens(env, result)).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    protected Object pFallback(RuntimeEnv env, Object... args) {
        ReferenceContainer node = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, node),
                        "p"
                                + toStringR(
                                        env.callMethod(
                                                node.getObject(),
                                                "getType",
                                                PrettyPrinterAbstract.class),
                                        env),
                        PrettyPrinterAbstract.class,
                        node.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    @ConvertedParameter(
        index = 1,
        name = "parentFormatPreserved",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object p(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer node = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parentFormatPreserved = assignParameter(args, 1, true);
        if (null == parentFormatPreserved) {
            parentFormatPreserved = false;
        }
        ReferenceContainer fixupInfo = new BasicReferenceContainer(null);
        Object origIndentLevel = null;
        Object origNode = null;
        Object findToken = null;
        Object subNodeName = null;
        Object type = null;
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object extraLeft = null;
        ReferenceContainer pos = new BasicReferenceContainer(null);
        Object runtimeTempArrayResult127 = null;
        Object subEndPos = null;
        Object _pClass = null;
        Object key = null;
        Object res = null;
        Object listResult = null;
        Object subStartPos = null;
        Object ternaryExpressionTemp = null;
        ReferenceContainer removalInfo = new BasicReferenceContainer(null);
        Object startPos = null;
        Object endPos = null;
        Object fallbackNode = null;
        Object indentAdjustment = null;
        Object extraRight = null;
        Object fixup = null;
        Object subNode = null;
        Object origSubNode = null;
        if (!ZVal.isTrue(this.origTokens)) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(0, node),
                            "p"
                                    + toStringR(
                                            env.callMethod(
                                                    node.getObject(),
                                                    "getType",
                                                    PrettyPrinterAbstract.class),
                                            env),
                            PrettyPrinterAbstract.class,
                            node.getObject()));
        }

        origNode =
                env.callMethod(
                        node.getObject(), "getAttribute", PrettyPrinterAbstract.class, "origNode");
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", origNode)) {
            return ZVal.assign(this.pFallback(env, node.getObject()));
        }

        _pClass = function_get_class.f.env(env).call(node.getObject()).value();
        com.runtimeconverter.runtime.ZVal.functionNotFound(
                        "___error23423346_namespace_function_not_found__(identifier:_pAssert)_(namespace:\\)(source:_pAssert)______")
                .env(env)
                .call(
                        ZVal.strictEqualityCheck(
                                _pClass,
                                "===",
                                function_get_class.f.env(env).call(origNode).value()));
        startPos = env.callMethod(origNode, "getStartTokenPos", PrettyPrinterAbstract.class);
        endPos = env.callMethod(origNode, "getEndTokenPos", PrettyPrinterAbstract.class);
        com.runtimeconverter.runtime.ZVal.functionNotFound(
                        "___error23423346_namespace_function_not_found__(identifier:_pAssert)_(namespace:\\)(source:_pAssert)______")
                .env(env)
                .call(
                        ZVal.toBool(ZVal.isGreaterThanOrEqualTo(startPos, ">=", 0))
                                && ZVal.toBool(ZVal.isGreaterThanOrEqualTo(endPos, ">=", 0)));
        fallbackNode = ZVal.assign(node.getObject());
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                node.getObject(), New_.class, "PhpParser\\Node\\Expr\\New_"))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                toObjectR(node.getObject())
                                        .accessProp(this, env)
                                        .name("class")
                                        .value(),
                                Class_.class,
                                "PhpParser\\Node\\Stmt\\Class_"))) {
            node.setObject(
                    PrintableNewAnonClassNode.runtimeStaticObject.fromNewNode(
                            env, node.getObject()));
            origNode = PrintableNewAnonClassNode.runtimeStaticObject.fromNewNode(env, origNode);
        }

        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                node.getObject(),
                                InlineHTML.class,
                                "PhpParser\\Node\\Stmt\\InlineHTML"))
                && ZVal.toBool(!ZVal.isTrue(parentFormatPreserved))) {
            return ZVal.assign(this.pFallback(env, fallbackNode));
        }

        indentAdjustment =
                ZVal.subtract(
                        this.indentLevel,
                        env.callMethod(
                                this.origTokens,
                                "getIndentationBefore",
                                PrettyPrinterAbstract.class,
                                startPos));
        type = env.callMethod(node.getObject(), "getType", PrettyPrinterAbstract.class);
        fixupInfo.setObject(
                ZVal.assign(
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                new ReferenceClassProperty(this, "fixupMap", env)
                                                        .arrayGet(env, _pClass))
                                ? ternaryExpressionTemp
                                : ZVal.getNull()));
        result.setObject("");
        pos.setObject(ZVal.assign(startPos));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult901 :
                ZVal.getIterable(
                        env.callMethod(
                                node.getObject(), "getSubNodeNames", PrettyPrinterAbstract.class),
                        env,
                        true)) {
            subNodeName = ZVal.assign(zpairResult901.getValue());
            subNode =
                    ZVal.assign(
                            toObjectR(node.getObject())
                                    .accessProp(this, env)
                                    .name(subNodeName)
                                    .value());
            origSubNode =
                    ZVal.assign(
                            toObjectR(origNode).accessProp(this, env).name(subNodeName).value());
            if (ZVal.toBool(
                            ZVal.toBool(
                                            !ZVal.isTrue(
                                                    ZVal.checkInstanceType(
                                                            subNode,
                                                            Node.class,
                                                            "PhpParser\\Node")))
                                    && ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(
                                                    subNode, "!==", ZVal.getNull())))
                    || ZVal.toBool(
                            ZVal.toBool(
                                            !ZVal.isTrue(
                                                    ZVal.checkInstanceType(
                                                            origSubNode,
                                                            Node.class,
                                                            "PhpParser\\Node")))
                                    && ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(
                                                    origSubNode, "!==", ZVal.getNull())))) {
                if (ZVal.strictEqualityCheck(subNode, "===", origSubNode)) {
                    continue;
                }

                if (ZVal.toBool(function_is_array.f.env(env).call(subNode).value())
                        && ZVal.toBool(function_is_array.f.env(env).call(origSubNode).value())) {
                    listResult =
                            env.callMethod(
                                    this,
                                    new RuntimeArgsWithReferences().add(2, pos),
                                    "pArray",
                                    PrettyPrinterAbstract.class,
                                    subNode,
                                    origSubNode,
                                    pos.getObject(),
                                    indentAdjustment,
                                    subNodeName,
                                    ZVal.isDefined(
                                                    ternaryExpressionTemp =
                                                            fixupInfo.arrayGet(env, subNodeName))
                                            ? ternaryExpressionTemp
                                            : ZVal.getNull(),
                                    ZVal.isDefined(
                                                    ternaryExpressionTemp =
                                                            new ReferenceClassProperty(
                                                                            this,
                                                                            "listInsertionMap",
                                                                            env)
                                                                    .arrayGet(
                                                                            env,
                                                                            toStringR(type, env)
                                                                                    + "->"
                                                                                    + toStringR(
                                                                                            subNodeName,
                                                                                            env)))
                                            ? ternaryExpressionTemp
                                            : ZVal.getNull());
                    if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", listResult)) {
                        return ZVal.assign(this.pFallback(env, fallbackNode));
                    }

                    result.setObject(
                            toStringR(result.getObject(), env) + toStringR(listResult, env));
                    continue;
                }

                if (ZVal.toBool(function_is_int.f.env(env).call(subNode).value())
                        && ZVal.toBool(function_is_int.f.env(env).call(origSubNode).value())) {
                    key = toStringR(type, env) + "->" + toStringR(subNodeName, env);
                    if (!arrayActionR(
                            ArrayAction.ISSET,
                            new ReferenceClassProperty(this, "modifierChangeMap", env),
                            env,
                            key)) {
                        return ZVal.assign(this.pFallback(env, fallbackNode));
                    }

                    findToken =
                            ZVal.assign(
                                    new ReferenceClassProperty(this, "modifierChangeMap", env)
                                            .arrayGet(env, key));
                    result.setObject(
                            toStringR(result.getObject(), env)
                                    + toStringR(this.pModifiers(env, subNode), env));
                    pos.setObject(
                            env.callMethod(
                                    this.origTokens,
                                    "findRight",
                                    PrettyPrinterAbstract.class,
                                    pos.getObject(),
                                    findToken));
                    continue;
                }

                return ZVal.assign(this.pFallback(env, fallbackNode));
            }

            extraLeft = "";
            extraRight = "";
            if (ZVal.strictNotEqualityCheck(origSubNode, "!==", ZVal.getNull())) {
                subStartPos =
                        env.callMethod(
                                origSubNode, "getStartTokenPos", PrettyPrinterAbstract.class);
                subEndPos =
                        env.callMethod(origSubNode, "getEndTokenPos", PrettyPrinterAbstract.class);
                com.runtimeconverter.runtime.ZVal.functionNotFound(
                                "___error23423346_namespace_function_not_found__(identifier:_pAssert)_(namespace:\\)(source:_pAssert)______")
                        .env(env)
                        .call(
                                ZVal.toBool(ZVal.isGreaterThanOrEqualTo(subStartPos, ">=", 0))
                                        && ZVal.toBool(
                                                ZVal.isGreaterThanOrEqualTo(subEndPos, ">=", 0)));

            } else {
                if (ZVal.strictEqualityCheck(subNode, "===", ZVal.getNull())) {
                    continue;
                }

                key = toStringR(type, env) + "->" + toStringR(subNodeName, env);
                if (!arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "insertionMap", env),
                        env,
                        key)) {
                    return ZVal.assign(this.pFallback(env, fallbackNode));
                }

                ZVal.list(
                        runtimeTempArrayResult127 =
                                new ReferenceClassProperty(this, "insertionMap", env)
                                        .arrayGet(env, key),
                        (findToken = listGet(runtimeTempArrayResult127, 0, env)),
                        (extraLeft = listGet(runtimeTempArrayResult127, 1, env)),
                        (extraRight = listGet(runtimeTempArrayResult127, 2, env)));
                if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", findToken)) {
                    subStartPos =
                            ZVal.add(
                                    env.callMethod(
                                            this.origTokens,
                                            "findRight",
                                            PrettyPrinterAbstract.class,
                                            pos.getObject(),
                                            findToken),
                                    1);

                } else {
                    subStartPos = ZVal.assign(pos.getObject());
                }

                if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", extraLeft))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", extraRight))) {
                    subStartPos =
                            env.callMethod(
                                    this.origTokens,
                                    "skipRightWhitespace",
                                    PrettyPrinterAbstract.class,
                                    subStartPos);
                }

                subEndPos = ZVal.subtract(subStartPos, 1);
            }

            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", subNode)) {
                key = toStringR(type, env) + "->" + toStringR(subNodeName, env);
                if (!arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "removalMap", env),
                        env,
                        key)) {
                    return ZVal.assign(this.pFallback(env, fallbackNode));
                }

                removalInfo.setObject(
                        ZVal.assign(
                                new ReferenceClassProperty(this, "removalMap", env)
                                        .arrayGet(env, key)));
                if (arrayActionR(ArrayAction.ISSET, removalInfo, env, "left")) {
                    subStartPos =
                            ZVal.add(
                                    env.callMethod(
                                            this.origTokens,
                                            "skipLeft",
                                            PrettyPrinterAbstract.class,
                                            ZVal.subtract(subStartPos, 1),
                                            removalInfo.arrayGet(env, "left")),
                                    1);
                }

                if (arrayActionR(ArrayAction.ISSET, removalInfo, env, "right")) {
                    subEndPos =
                            ZVal.subtract(
                                    env.callMethod(
                                            this.origTokens,
                                            "skipRight",
                                            PrettyPrinterAbstract.class,
                                            ZVal.add(subEndPos, 1),
                                            removalInfo.arrayGet(env, "right")),
                                    1);
                }
            }

            result.setObject(
                    toStringR(result.getObject(), env)
                            + toStringR(
                                    env.callMethod(
                                            this.origTokens,
                                            "getTokenCode",
                                            PrettyPrinterAbstract.class,
                                            pos.getObject(),
                                            subStartPos,
                                            indentAdjustment),
                                    env));
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", subNode)) {
                result.setObject(toStringR(result.getObject(), env) + toStringR(extraLeft, env));
                origIndentLevel = ZVal.assign(this.indentLevel);
                this.setIndentLevel(
                        env,
                        ZVal.add(
                                env.callMethod(
                                        this.origTokens,
                                        "getIndentationBefore",
                                        PrettyPrinterAbstract.class,
                                        subStartPos),
                                indentAdjustment));
                if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, fixupInfo, env, subNodeName))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        env.callMethod(
                                                subNode,
                                                "getAttribute",
                                                PrettyPrinterAbstract.class,
                                                "origNode"),
                                        "!==",
                                        origSubNode))) {
                    fixup = ZVal.assign(fixupInfo.arrayGet(env, subNodeName));
                    res = this.pFixup(env, fixup, subNode, _pClass, subStartPos, subEndPos);

                } else {
                    res = this.p(env, subNode, true);
                }

                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, result),
                        "safeAppend",
                        PrettyPrinterAbstract.class,
                        result.getObject(),
                        res);
                this.setIndentLevel(env, origIndentLevel);
                result.setObject(toStringR(result.getObject(), env) + toStringR(extraRight, env));
            }

            pos.setObject(ZVal.add(subEndPos, 1));
        }

        result.setObject(
                toStringR(result.getObject(), env)
                        + toStringR(
                                env.callMethod(
                                        this.origTokens,
                                        "getTokenCode",
                                        PrettyPrinterAbstract.class,
                                        pos.getObject(),
                                        ZVal.add(endPos, 1),
                                        indentAdjustment),
                                env));
        return ZVal.assign(result.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    @ConvertedParameter(index = 1, name = "origNodes", typeHint = "array")
    @ConvertedParameter(index = 2, name = "pos", typeHint = "int")
    @ConvertedParameter(index = 3, name = "indentAdjustment", typeHint = "int")
    @ConvertedParameter(index = 4, name = "subNodeName", typeHint = "string")
    @ConvertedParameter(index = 5, name = "fixup")
    @ConvertedParameter(index = 6, name = "insertStr")
    protected Object pArray(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        int runtimeConverterContinueCount;
        Object nodes = assignParameter(args, 0, false);
        ReferenceContainer origNodes = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer pos = assignParameterRef(runtimePassByReferenceArgs, args, 2, false);
        Object indentAdjustment = assignParameter(args, 3, false);
        Object subNodeName = assignParameter(args, 4, false);
        Object fixup = assignParameter(args, 5, false);
        Object insertStr = assignParameter(args, 6, false);
        Object diffElem = null;
        Object origIndentLevel = null;
        Object commentStartPos = null;
        Object commentsChanged = null;
        Object beforeFirstKeepOrReplace = null;
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object insertNewline = null;
        Object itemEndPos = null;
        Object delayedAddNode = null;
        Object lastElemIndentLevel = null;
        Object res = null;
        Object comments = null;
        Object diffType = null;
        Object i = null;
        Object diff = null;
        ReferenceContainer origComments = new BasicReferenceContainer(null);
        Object startPos = null;
        Object endPos = null;
        Object itemStartPos = null;
        Object delayedAddComments = null;
        Object arrItem = null;
        ReferenceContainer delayedAdd = new BasicReferenceContainer(null);
        Object origArrItem = null;
        diff =
                env.callMethod(
                        this.nodeListDiffer,
                        "diffWithReplacements",
                        PrettyPrinterAbstract.class,
                        origNodes.getObject(),
                        nodes);
        beforeFirstKeepOrReplace = true;
        delayedAdd.setObject(ZVal.newArray());
        lastElemIndentLevel = ZVal.assign(this.indentLevel);
        insertNewline = false;
        if (ZVal.strictEqualityCheck(insertStr, "===", "\n")) {
            insertStr = "";
            insertNewline = true;
        }

        if (ZVal.toBool(
                        ZVal.toBool(ZVal.strictEqualityCheck(subNodeName, "===", "stmts"))
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(origNodes.getObject())
                                                        .value(),
                                                "===",
                                                1)))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                function_count.f.env(env).call(nodes).value(), "!==", 1))) {
            startPos =
                    env.callMethod(
                            origNodes.arrayGet(env, 0),
                            "getStartTokenPos",
                            PrettyPrinterAbstract.class);
            endPos =
                    env.callMethod(
                            origNodes.arrayGet(env, 0),
                            "getEndTokenPos",
                            PrettyPrinterAbstract.class);
            com.runtimeconverter.runtime.ZVal.functionNotFound(
                            "___error23423346_namespace_function_not_found__(identifier:_pAssert)_(namespace:\\)(source:_pAssert)______")
                    .env(env)
                    .call(
                            ZVal.toBool(ZVal.isGreaterThanOrEqualTo(startPos, ">=", 0))
                                    && ZVal.toBool(ZVal.isGreaterThanOrEqualTo(endPos, ">=", 0)));
            if (!ZVal.isTrue(
                    env.callMethod(
                            this.origTokens,
                            "haveBraces",
                            PrettyPrinterAbstract.class,
                            startPos,
                            endPos))) {
                return ZVal.assign(ZVal.getNull());
            }
        }

        result.setObject("");
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult902 : ZVal.getIterable(diff, env, false)) {
            i = ZVal.assign(zpairResult902.getKey());
            diffElem = ZVal.assign(zpairResult902.getValue());
            diffType = ZVal.assign(toObjectR(diffElem).accessProp(this, env).name("type").value());
            arrItem = ZVal.assign(toObjectR(diffElem).accessProp(this, env).name("new").value());
            origArrItem =
                    ZVal.assign(toObjectR(diffElem).accessProp(this, env).name("old").value());
            if (ZVal.toBool(ZVal.strictEqualityCheck(diffType, "===", DiffElem.CONST_TYPE_KEEP))
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    diffType, "===", DiffElem.CONST_TYPE_REPLACE))) {
                beforeFirstKeepOrReplace = false;
                if (ZVal.toBool(ZVal.strictEqualityCheck(origArrItem, "===", ZVal.getNull()))
                        || ZVal.toBool(ZVal.strictEqualityCheck(arrItem, "===", ZVal.getNull()))) {
                    if (ZVal.strictEqualityCheck(origArrItem, "===", arrItem)) {
                        continue;
                    }

                    return ZVal.assign(ZVal.getNull());
                }

                if (ZVal.toBool(
                                !ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                arrItem, Node.class, "PhpParser\\Node")))
                        || ZVal.toBool(
                                !ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                origArrItem, Node.class, "PhpParser\\Node")))) {
                    return ZVal.assign(ZVal.getNull());
                }

                itemStartPos =
                        env.callMethod(
                                origArrItem, "getStartTokenPos", PrettyPrinterAbstract.class);
                itemEndPos =
                        env.callMethod(origArrItem, "getEndTokenPos", PrettyPrinterAbstract.class);
                com.runtimeconverter.runtime.ZVal.functionNotFound(
                                "___error23423346_namespace_function_not_found__(identifier:_pAssert)_(namespace:\\)(source:_pAssert)______")
                        .env(env)
                        .call(
                                ZVal.toBool(ZVal.isGreaterThanOrEqualTo(itemStartPos, ">=", 0))
                                        && ZVal.toBool(
                                                ZVal.isGreaterThanOrEqualTo(itemEndPos, ">=", 0)));
                if (ZVal.isLessThan(itemEndPos, '<', itemStartPos)) {
                    com.runtimeconverter.runtime.ZVal.functionNotFound("_pAssert")
                            .env(env)
                            .call(
                                    ZVal.checkInstanceType(
                                            origArrItem, Nop.class, "PhpParser\\Node\\Stmt\\Nop"));
                    continue;
                }

                origIndentLevel = ZVal.assign(this.indentLevel);
                lastElemIndentLevel =
                        ZVal.add(
                                env.callMethod(
                                        this.origTokens,
                                        "getIndentationBefore",
                                        PrettyPrinterAbstract.class,
                                        itemStartPos),
                                indentAdjustment);
                this.setIndentLevel(env, lastElemIndentLevel);
                comments = env.callMethod(arrItem, "getComments", PrettyPrinterAbstract.class);
                origComments.setObject(
                        env.callMethod(origArrItem, "getComments", PrettyPrinterAbstract.class));
                commentStartPos =
                        ZVal.assign(
                                ZVal.isTrue(origComments.getObject())
                                        ? env.callMethod(
                                                origComments.arrayGet(env, 0),
                                                "getTokenPos",
                                                PrettyPrinterAbstract.class)
                                        : itemStartPos);
                com.runtimeconverter.runtime.ZVal.functionNotFound(
                                "___error23423346_namespace_function_not_found__(identifier:_pAssert)_(namespace:\\)(source:_pAssert)______")
                        .env(env)
                        .call(ZVal.isGreaterThanOrEqualTo(commentStartPos, ">=", 0));
                commentsChanged =
                        ZVal.strictNotEqualityCheck(comments, "!==", origComments.getObject());
                if (ZVal.isTrue(commentsChanged)) {
                    itemStartPos = ZVal.assign(commentStartPos);
                }

                if (!ZVal.isEmpty(delayedAdd.getObject())) {
                    result.setObject(
                            toStringR(result.getObject(), env)
                                    + toStringR(
                                            env.callMethod(
                                                    this.origTokens,
                                                    "getTokenCode",
                                                    PrettyPrinterAbstract.class,
                                                    pos.getObject(),
                                                    commentStartPos,
                                                    indentAdjustment),
                                            env));
                    runtimeConverterContinueCount = 0;
                    for (ZPair zpairResult903 :
                            ZVal.getIterable(delayedAdd.getObject(), env, true)) {
                        delayedAddNode = ZVal.assign(zpairResult903.getValue());
                        if (ZVal.isTrue(insertNewline)) {
                            delayedAddComments =
                                    env.callMethod(
                                            delayedAddNode,
                                            "getComments",
                                            PrettyPrinterAbstract.class);
                            if (ZVal.isTrue(delayedAddComments)) {
                                result.setObject(
                                        toStringR(result.getObject(), env)
                                                + toStringR(
                                                        this.pComments(env, delayedAddComments),
                                                        env)
                                                + toStringR(this.nl, env));
                            }
                        }

                        env.callMethod(
                                this,
                                new RuntimeArgsWithReferences().add(0, result),
                                "safeAppend",
                                PrettyPrinterAbstract.class,
                                result.getObject(),
                                this.p(env, delayedAddNode, true));
                        if (ZVal.isTrue(insertNewline)) {
                            result.setObject(
                                    toStringR(result.getObject(), env)
                                            + toStringR(insertStr, env)
                                            + toStringR(this.nl, env));

                        } else {
                            result.setObject(
                                    toStringR(result.getObject(), env) + toStringR(insertStr, env));
                        }
                    }

                    result.setObject(
                            toStringR(result.getObject(), env)
                                    + toStringR(
                                            env.callMethod(
                                                    this.origTokens,
                                                    "getTokenCode",
                                                    PrettyPrinterAbstract.class,
                                                    commentStartPos,
                                                    itemStartPos,
                                                    indentAdjustment),
                                            env));
                    delayedAdd.setObject(ZVal.newArray());

                } else {
                    result.setObject(
                            toStringR(result.getObject(), env)
                                    + toStringR(
                                            env.callMethod(
                                                    this.origTokens,
                                                    "getTokenCode",
                                                    PrettyPrinterAbstract.class,
                                                    pos.getObject(),
                                                    itemStartPos,
                                                    indentAdjustment),
                                            env));
                }

                if (ZVal.toBool(commentsChanged) && ZVal.toBool(comments)) {
                    result.setObject(
                            toStringR(result.getObject(), env)
                                    + toStringR(this.pComments(env, comments), env)
                                    + toStringR(this.nl, env));
                }

            } else if (ZVal.strictEqualityCheck(diffType, "===", DiffElem.CONST_TYPE_ADD)) {
                if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", insertStr)) {
                    return ZVal.assign(ZVal.getNull());
                }

                if (ZVal.toBool(ZVal.strictEqualityCheck(insertStr, "===", ", "))
                        && ZVal.toBool(this.isMultiline(env, origNodes.getObject()))) {
                    insertStr = ",";
                    insertNewline = true;
                }

                if (ZVal.isTrue(beforeFirstKeepOrReplace)) {
                    delayedAdd.arrayAppend(env).set(arrItem);
                    continue;
                }

                itemStartPos = ZVal.assign(pos.getObject());
                itemEndPos = ZVal.subtract(pos.getObject(), 1);
                origIndentLevel = ZVal.assign(this.indentLevel);
                this.setIndentLevel(env, lastElemIndentLevel);
                if (ZVal.isTrue(insertNewline)) {
                    comments = env.callMethod(arrItem, "getComments", PrettyPrinterAbstract.class);
                    if (ZVal.isTrue(comments)) {
                        result.setObject(
                                toStringR(result.getObject(), env)
                                        + toStringR(this.nl, env)
                                        + toStringR(this.pComments(env, comments), env));
                    }

                    result.setObject(
                            toStringR(result.getObject(), env)
                                    + toStringR(insertStr, env)
                                    + toStringR(this.nl, env));

                } else {
                    result.setObject(
                            toStringR(result.getObject(), env) + toStringR(insertStr, env));
                }

            } else if (ZVal.strictEqualityCheck(diffType, "===", DiffElem.CONST_TYPE_REMOVE)) {
                if (ZVal.strictEqualityCheck(i, "===", 0)) {
                    return ZVal.assign(ZVal.getNull());
                }

                if (!ZVal.isTrue(
                        ZVal.checkInstanceType(origArrItem, Node.class, "PhpParser\\Node"))) {
                    return ZVal.assign(ZVal.getNull());
                }

                itemEndPos =
                        env.callMethod(origArrItem, "getEndTokenPos", PrettyPrinterAbstract.class);
                com.runtimeconverter.runtime.ZVal.functionNotFound(
                                "___error23423346_namespace_function_not_found__(identifier:_pAssert)_(namespace:\\)(source:_pAssert)______")
                        .env(env)
                        .call(ZVal.isGreaterThanOrEqualTo(itemEndPos, ">=", 0));
                pos.setObject(ZVal.add(itemEndPos, 1));
                continue;

            } else {
                throw ZVal.getException(env, new PHPException(env, "Shouldn't happen"));
            }

            if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", fixup))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    env.callMethod(
                                            arrItem,
                                            "getAttribute",
                                            PrettyPrinterAbstract.class,
                                            "origNode"),
                                    "!==",
                                    origArrItem))) {
                res = this.pFixup(env, fixup, arrItem, ZVal.getNull(), itemStartPos, itemEndPos);

            } else {
                res = this.p(env, arrItem, true);
            }

            env.callMethod(
                    this,
                    new RuntimeArgsWithReferences().add(0, result),
                    "safeAppend",
                    PrettyPrinterAbstract.class,
                    result.getObject(),
                    res);
            this.setIndentLevel(env, origIndentLevel);
            pos.setObject(ZVal.add(itemEndPos, 1));
        }

        if (!ZVal.isEmpty(delayedAdd.getObject())) {
            return ZVal.assign(ZVal.getNull());
        }

        return ZVal.assign(result.getObject());
    }

    public Object pArray(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fixup", typeHint = "int")
    @ConvertedParameter(index = 1, name = "subNode", typeHint = "PhpParser\\Node")
    @ConvertedParameter(index = 2, name = "parentClass")
    @ConvertedParameter(index = 3, name = "subStartPos", typeHint = "int")
    @ConvertedParameter(index = 4, name = "subEndPos", typeHint = "int")
    protected Object pFixup(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object fixup = assignParameter(args, 0, false);
        Object subNode = assignParameter(args, 1, false);
        Object parentClass = assignParameter(args, 2, false);
        Object subStartPos = assignParameter(args, 3, false);
        Object subEndPos = assignParameter(args, 4, false);
        Object runtimeTempArrayResult128 = null;
        Object associativity = null;
        Object precedence = null;
        SwitchEnumType48 switchVariable48 =
                ZVal.getEnum(
                        fixup,
                        SwitchEnumType48.DEFAULT_CASE,
                        SwitchEnumType48.DYNAMIC_TYPE_143,
                        CONST_FIXUP_PREC_LEFT,
                        SwitchEnumType48.DYNAMIC_TYPE_144,
                        CONST_FIXUP_PREC_RIGHT,
                        SwitchEnumType48.DYNAMIC_TYPE_145,
                        CONST_FIXUP_CALL_LHS,
                        SwitchEnumType48.DYNAMIC_TYPE_146,
                        CONST_FIXUP_DEREF_LHS,
                        SwitchEnumType48.DYNAMIC_TYPE_147,
                        CONST_FIXUP_BRACED_NAME,
                        SwitchEnumType48.DYNAMIC_TYPE_148,
                        CONST_FIXUP_VAR_BRACED_NAME,
                        SwitchEnumType48.DYNAMIC_TYPE_149,
                        CONST_FIXUP_ENCAPSED);
        switch (switchVariable48) {
            case DYNAMIC_TYPE_143:
            case DYNAMIC_TYPE_144:
                if (!ZVal.isTrue(
                        env.callMethod(
                                this.origTokens,
                                "haveParens",
                                PrettyPrinterAbstract.class,
                                subStartPos,
                                subEndPos))) {
                    ZVal.list(
                            runtimeTempArrayResult128 =
                                    new ReferenceClassProperty(this, "precedenceMap", env)
                                            .arrayGet(env, parentClass),
                            (precedence = listGet(runtimeTempArrayResult128, 0, env)),
                            (associativity = listGet(runtimeTempArrayResult128, 1, env)));
                    return ZVal.assign(
                            this.pPrec(
                                    env,
                                    subNode,
                                    precedence,
                                    associativity,
                                    ZVal.strictEqualityCheck(fixup, "===", CONST_FIXUP_PREC_LEFT)
                                            ? -1
                                            : 1));
                }

                break;
            case DYNAMIC_TYPE_145:
                if (ZVal.toBool(this.callLhsRequiresParens(env, subNode))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                this.origTokens,
                                                "haveParens",
                                                PrettyPrinterAbstract.class,
                                                subStartPos,
                                                subEndPos)))) {
                    return ZVal.assign("(" + toStringR(this.p(env, subNode), env) + ")");
                }

                break;
            case DYNAMIC_TYPE_146:
                if (ZVal.toBool(this.dereferenceLhsRequiresParens(env, subNode))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                this.origTokens,
                                                "haveParens",
                                                PrettyPrinterAbstract.class,
                                                subStartPos,
                                                subEndPos)))) {
                    return ZVal.assign("(" + toStringR(this.p(env, subNode), env) + ")");
                }

                break;
            case DYNAMIC_TYPE_147:
            case DYNAMIC_TYPE_148:
                if (ZVal.toBool(
                                ZVal.checkInstanceType(
                                        subNode, Expr.class, "PhpParser\\Node\\Expr"))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                this.origTokens,
                                                "haveBraces",
                                                PrettyPrinterAbstract.class,
                                                subStartPos,
                                                subEndPos)))) {
                    return ZVal.assign(
                            toStringR(
                                            ZVal.strictEqualityCheck(
                                                            fixup,
                                                            "===",
                                                            CONST_FIXUP_VAR_BRACED_NAME)
                                                    ? "$"
                                                    : "",
                                            env)
                                    + "{"
                                    + toStringR(this.p(env, subNode), env)
                                    + "}");
                }

                break;
            case DYNAMIC_TYPE_149:
                if (ZVal.toBool(
                                !ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                subNode,
                                                EncapsedStringPart.class,
                                                "PhpParser\\Node\\Scalar\\EncapsedStringPart")))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                this.origTokens,
                                                "haveBraces",
                                                PrettyPrinterAbstract.class,
                                                subStartPos,
                                                subEndPos)))) {
                    return ZVal.assign("{" + toStringR(this.p(env, subNode), env) + "}");
                }

                break;
            case DEFAULT_CASE:
                throw ZVal.getException(env, new PHPException(env, "Cannot happen"));
        }
        ;
        return ZVal.assign(this.p(env, subNode));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "str", typeHint = "string")
    @ConvertedParameter(index = 1, name = "append", typeHint = "string")
    protected Object safeAppend(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer str = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        ReferenceContainer append = new BasicReferenceContainer(assignParameter(args, 1, false));
        if (ZVal.strictEqualityCheck(str.getObject(), "===", "")) {
            str.setObject(ZVal.assign(append.getObject()));
            return null;
        }

        if (ZVal.toBool(
                        !ZVal.isTrue(
                                new ReferenceClassProperty(this, "labelCharMap", env)
                                        .arrayGet(env, append.arrayGet(env, 0))))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                new ReferenceClassProperty(this, "labelCharMap", env)
                                        .arrayGet(
                                                env,
                                                str.arrayGet(
                                                        env,
                                                        ZVal.subtract(
                                                                function_strlen
                                                                        .f
                                                                        .env(env)
                                                                        .call(str.getObject())
                                                                        .value(),
                                                                1)))))) {
            str.setObject(toStringR(str.getObject(), env) + toStringR(append.getObject(), env));

        } else {
            str.setObject(
                    toStringR(str.getObject(), env) + " " + toStringR(append.getObject(), env));
        }

        return null;
    }

    public Object safeAppend(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    protected Object callLhsRequiresParens(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                !ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.toBool(
                                                                                ZVal.toBool(
                                                                                                ZVal
                                                                                                                .toBool(
                                                                                                                        ZVal
                                                                                                                                .checkInstanceType(
                                                                                                                                        node,
                                                                                                                                        Name
                                                                                                                                                .class,
                                                                                                                                        "PhpParser\\Node\\Name"))
                                                                                                        || ZVal
                                                                                                                .toBool(
                                                                                                                        ZVal
                                                                                                                                .checkInstanceType(
                                                                                                                                        node,
                                                                                                                                        Variable
                                                                                                                                                .class,
                                                                                                                                        "PhpParser\\Node\\Expr\\Variable")))
                                                                                        || ZVal
                                                                                                .toBool(
                                                                                                        ZVal
                                                                                                                .checkInstanceType(
                                                                                                                        node,
                                                                                                                        ArrayDimFetch
                                                                                                                                .class,
                                                                                                                        "PhpParser\\Node\\Expr\\ArrayDimFetch")))
                                                                        || ZVal.toBool(
                                                                                ZVal
                                                                                        .checkInstanceType(
                                                                                                node,
                                                                                                FuncCall
                                                                                                        .class,
                                                                                                "PhpParser\\Node\\Expr\\FuncCall")))
                                                        || ZVal.toBool(
                                                                ZVal.checkInstanceType(
                                                                        node,
                                                                        MethodCall.class,
                                                                        "PhpParser\\Node\\Expr\\MethodCall")))
                                        || ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        node,
                                                        StaticCall.class,
                                                        "PhpParser\\Node\\Expr\\StaticCall")))
                        || ZVal.toBool(
                                ZVal.checkInstanceType(
                                        node,
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
                                                .class,
                                        "PhpParser\\Node\\Expr\\Array_")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    protected Object dereferenceLhsRequiresParens(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                !ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.toBool(
                                                                                ZVal.toBool(
                                                                                                ZVal
                                                                                                                .toBool(
                                                                                                                        ZVal
                                                                                                                                        .toBool(
                                                                                                                                                ZVal
                                                                                                                                                                .toBool(
                                                                                                                                                                        ZVal
                                                                                                                                                                                        .toBool(
                                                                                                                                                                                                ZVal
                                                                                                                                                                                                                .toBool(
                                                                                                                                                                                                                        ZVal
                                                                                                                                                                                                                                        .toBool(
                                                                                                                                                                                                                                                ZVal
                                                                                                                                                                                                                                                        .checkInstanceType(
                                                                                                                                                                                                                                                                node,
                                                                                                                                                                                                                                                                Variable
                                                                                                                                                                                                                                                                        .class,
                                                                                                                                                                                                                                                                "PhpParser\\Node\\Expr\\Variable"))
                                                                                                                                                                                                                                || ZVal
                                                                                                                                                                                                                                        .toBool(
                                                                                                                                                                                                                                                ZVal
                                                                                                                                                                                                                                                        .checkInstanceType(
                                                                                                                                                                                                                                                                node,
                                                                                                                                                                                                                                                                Name
                                                                                                                                                                                                                                                                        .class,
                                                                                                                                                                                                                                                                "PhpParser\\Node\\Name")))
                                                                                                                                                                                                        || ZVal
                                                                                                                                                                                                                .toBool(
                                                                                                                                                                                                                        ZVal
                                                                                                                                                                                                                                .checkInstanceType(
                                                                                                                                                                                                                                        node,
                                                                                                                                                                                                                                        ArrayDimFetch
                                                                                                                                                                                                                                                .class,
                                                                                                                                                                                                                                        "PhpParser\\Node\\Expr\\ArrayDimFetch")))
                                                                                                                                                                                || ZVal
                                                                                                                                                                                        .toBool(
                                                                                                                                                                                                ZVal
                                                                                                                                                                                                        .checkInstanceType(
                                                                                                                                                                                                                node,
                                                                                                                                                                                                                PropertyFetch
                                                                                                                                                                                                                        .class,
                                                                                                                                                                                                                "PhpParser\\Node\\Expr\\PropertyFetch")))
                                                                                                                                                        || ZVal
                                                                                                                                                                .toBool(
                                                                                                                                                                        ZVal
                                                                                                                                                                                .checkInstanceType(
                                                                                                                                                                                        node,
                                                                                                                                                                                        StaticPropertyFetch
                                                                                                                                                                                                .class,
                                                                                                                                                                                        "PhpParser\\Node\\Expr\\StaticPropertyFetch")))
                                                                                                                                || ZVal
                                                                                                                                        .toBool(
                                                                                                                                                ZVal
                                                                                                                                                        .checkInstanceType(
                                                                                                                                                                node,
                                                                                                                                                                FuncCall
                                                                                                                                                                        .class,
                                                                                                                                                                "PhpParser\\Node\\Expr\\FuncCall")))
                                                                                                        || ZVal
                                                                                                                .toBool(
                                                                                                                        ZVal
                                                                                                                                .checkInstanceType(
                                                                                                                                        node,
                                                                                                                                        MethodCall
                                                                                                                                                .class,
                                                                                                                                        "PhpParser\\Node\\Expr\\MethodCall")))
                                                                                        || ZVal
                                                                                                .toBool(
                                                                                                        ZVal
                                                                                                                .checkInstanceType(
                                                                                                                        node,
                                                                                                                        StaticCall
                                                                                                                                .class,
                                                                                                                        "PhpParser\\Node\\Expr\\StaticCall")))
                                                                        || ZVal.toBool(
                                                                                ZVal
                                                                                        .checkInstanceType(
                                                                                                node,
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
                                                                                                        .class,
                                                                                                "PhpParser\\Node\\Expr\\Array_")))
                                                        || ZVal.toBool(
                                                                ZVal.checkInstanceType(
                                                                        node,
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
                                                                                .class,
                                                                        "PhpParser\\Node\\Scalar\\String_")))
                                        || ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        node,
                                                        ConstFetch.class,
                                                        "PhpParser\\Node\\Expr\\ConstFetch")))
                        || ZVal.toBool(
                                ZVal.checkInstanceType(
                                        node,
                                        ClassConstFetch.class,
                                        "PhpParser\\Node\\Expr\\ClassConstFetch")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "modifiers", typeHint = "int")
    protected Object pModifiers(RuntimeEnv env, Object... args) {
        Object modifiers = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                ZVal.isTrue(
                                                ZVal.toLong(modifiers)
                                                        & ZVal.toLong(Class_.CONST_MODIFIER_PUBLIC))
                                        ? "public "
                                        : "",
                                env)
                        + toStringR(
                                ZVal.isTrue(
                                                ZVal.toLong(modifiers)
                                                        & ZVal.toLong(
                                                                Class_.CONST_MODIFIER_PROTECTED))
                                        ? "protected "
                                        : "",
                                env)
                        + toStringR(
                                ZVal.isTrue(
                                                ZVal.toLong(modifiers)
                                                        & ZVal.toLong(
                                                                Class_.CONST_MODIFIER_PRIVATE))
                                        ? "private "
                                        : "",
                                env)
                        + toStringR(
                                ZVal.isTrue(
                                                ZVal.toLong(modifiers)
                                                        & ZVal.toLong(Class_.CONST_MODIFIER_STATIC))
                                        ? "static "
                                        : "",
                                env)
                        + toStringR(
                                ZVal.isTrue(
                                                ZVal.toLong(modifiers)
                                                        & ZVal.toLong(
                                                                Class_.CONST_MODIFIER_ABSTRACT))
                                        ? "abstract "
                                        : "",
                                env)
                        + toStringR(
                                ZVal.isTrue(
                                                ZVal.toLong(modifiers)
                                                        & ZVal.toLong(Class_.CONST_MODIFIER_FINAL))
                                        ? "final "
                                        : "",
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    protected Object isMultiline(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object nodes = assignParameter(args, 0, false);
        Object node = null;
        Object pos = null;
        Object text = null;
        Object endPos = null;
        if (ZVal.isLessThan(function_count.f.env(env).call(nodes).value(), '<', 2)) {
            return ZVal.assign(false);
        }

        pos = -1;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult904 : ZVal.getIterable(nodes, env, true)) {
            node = ZVal.assign(zpairResult904.getValue());
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", node)) {
                continue;
            }

            endPos =
                    ZVal.add(
                            env.callMethod(node, "getEndTokenPos", PrettyPrinterAbstract.class), 1);
            if (ZVal.isGreaterThanOrEqualTo(pos, ">=", 0)) {
                text =
                        env.callMethod(
                                this.origTokens,
                                "getTokenCode",
                                PrettyPrinterAbstract.class,
                                pos,
                                endPos,
                                0);
                if (ZVal.strictEqualityCheck(
                        false, "===", function_strpos.f.env(env).call(text, "\n").value())) {
                    return ZVal.assign(false);
                }
            }

            pos = ZVal.assign(endPos);
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    protected Object initializeLabelCharMap(RuntimeEnv env, Object... args) {
        ReferenceContainer i = new BasicReferenceContainer(null);
        if (ZVal.isTrue(this.labelCharMap)) {
            return null;
        }

        this.labelCharMap = ZVal.newArray();
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', 256);
                i.setObject(ZVal.increment(i.getObject()))) {
            new ReferenceClassProperty(this, "labelCharMap", env)
                    .arrayAccess(env, NamespaceGlobal.chr.env(env).call(i.getObject()).value())
                    .set(
                            ZVal.toBool(ZVal.isGreaterThanOrEqualTo(i.getObject(), ">=", 127))
                                    || ZVal.toBool(
                                            NamespaceGlobal.ctype_alnum
                                                    .env(env)
                                                    .call(i.getObject())
                                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    protected Object initializeNodeListDiffer(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/nikic/php-parser/lib/PhpParser")
                        .setFile(
                                "/vendor/nikic/php-parser/lib/PhpParser/PrettyPrinterAbstract.php");
        if (ZVal.isTrue(this.nodeListDiffer)) {
            return null;
        }

        this.nodeListDiffer =
                new Differ(
                        env,
                        new Closure(
                                env, runtimeConverterFunctionClassConstants, "PhpParser", this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "a")
                            @ConvertedParameter(index = 1, name = "b")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object a = assignParameter(args, 0, false);
                                Object b = assignParameter(args, 1, false);
                                if (ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        a, Node.class, "PhpParser\\Node"))
                                        && ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        b, Node.class, "PhpParser\\Node"))) {
                                    return ZVal.assign(
                                            ZVal.strictEqualityCheck(
                                                    a,
                                                    "===",
                                                    env.callMethod(
                                                            b,
                                                            "getAttribute",
                                                            PrettyPrinterAbstract.class,
                                                            "origNode")));
                                }

                                return ZVal.assign(
                                        ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                a, "===", ZVal.getNull()))
                                                && ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                b, "===", ZVal.getNull())));
                            }
                        });
        return null;
    }

    @ConvertedMethod
    protected Object initializeFixupMap(RuntimeEnv env, Object... args) {
        Object binaryOps = null;
        Object binaryOp = null;
        Object prefixOp = null;
        Object assignOp = null;
        Object prefixOps = null;
        Object assignOps = null;
        if (ZVal.isTrue(this.fixupMap)) {
            return null;
        }

        this.fixupMap =
                ZVal.newArray(
                        new ZPair(
                                PreInc.CONST_class,
                                ZVal.newArray(new ZPair("var", CONST_FIXUP_PREC_RIGHT))),
                        new ZPair(
                                PreDec.CONST_class,
                                ZVal.newArray(new ZPair("var", CONST_FIXUP_PREC_RIGHT))),
                        new ZPair(
                                PostInc.CONST_class,
                                ZVal.newArray(new ZPair("var", CONST_FIXUP_PREC_LEFT))),
                        new ZPair(
                                PostDec.CONST_class,
                                ZVal.newArray(new ZPair("var", CONST_FIXUP_PREC_LEFT))),
                        new ZPair(
                                Instanceof_.CONST_class,
                                ZVal.newArray(
                                        new ZPair("expr", CONST_FIXUP_PREC_LEFT),
                                        new ZPair("class", CONST_FIXUP_PREC_RIGHT))),
                        new ZPair(
                                Ternary.CONST_class,
                                ZVal.newArray(
                                        new ZPair("cond", CONST_FIXUP_PREC_LEFT),
                                        new ZPair("else", CONST_FIXUP_PREC_RIGHT))),
                        new ZPair(
                                FuncCall.CONST_class,
                                ZVal.newArray(new ZPair("name", CONST_FIXUP_CALL_LHS))),
                        new ZPair(
                                StaticCall.CONST_class,
                                ZVal.newArray(new ZPair("class", CONST_FIXUP_DEREF_LHS))),
                        new ZPair(
                                ArrayDimFetch.CONST_class,
                                ZVal.newArray(new ZPair("var", CONST_FIXUP_DEREF_LHS))),
                        new ZPair(
                                MethodCall.CONST_class,
                                ZVal.newArray(
                                        new ZPair("var", CONST_FIXUP_DEREF_LHS),
                                        new ZPair("name", CONST_FIXUP_BRACED_NAME))),
                        new ZPair(
                                StaticPropertyFetch.CONST_class,
                                ZVal.newArray(
                                        new ZPair("class", CONST_FIXUP_DEREF_LHS),
                                        new ZPair("name", CONST_FIXUP_VAR_BRACED_NAME))),
                        new ZPair(
                                PropertyFetch.CONST_class,
                                ZVal.newArray(
                                        new ZPair("var", CONST_FIXUP_DEREF_LHS),
                                        new ZPair("name", CONST_FIXUP_BRACED_NAME))),
                        new ZPair(
                                Encapsed.CONST_class,
                                ZVal.newArray(new ZPair("parts", CONST_FIXUP_ENCAPSED))));
        binaryOps =
                ZVal.newArray(
                        new ZPair(
                                0,
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
                                        .CONST_class),
                        new ZPair(
                                1,
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
                                        .CONST_class),
                        new ZPair(
                                2,
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
                                        .CONST_class),
                        new ZPair(
                                3,
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
                                        .CONST_class),
                        new ZPair(
                                4,
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
                                        .CONST_class),
                        new ZPair(
                                5,
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
                                        .CONST_class),
                        new ZPair(
                                6,
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
                                        .CONST_class),
                        new ZPair(
                                7,
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
                                        .CONST_class),
                        new ZPair(
                                8,
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
                                        .CONST_class),
                        new ZPair(9, Smaller.CONST_class),
                        new ZPair(10, SmallerOrEqual.CONST_class),
                        new ZPair(11, Greater.CONST_class),
                        new ZPair(12, GreaterOrEqual.CONST_class),
                        new ZPair(13, Equal.CONST_class),
                        new ZPair(14, NotEqual.CONST_class),
                        new ZPair(15, Identical.CONST_class),
                        new ZPair(16, NotIdentical.CONST_class),
                        new ZPair(17, Spaceship.CONST_class),
                        new ZPair(
                                18,
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
                                        .CONST_class),
                        new ZPair(
                                19,
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
                                        .CONST_class),
                        new ZPair(
                                20,
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
                                        .CONST_class),
                        new ZPair(21, BooleanAnd.CONST_class),
                        new ZPair(22, BooleanOr.CONST_class),
                        new ZPair(23, Coalesce.CONST_class),
                        new ZPair(24, LogicalAnd.CONST_class),
                        new ZPair(25, LogicalXor.CONST_class),
                        new ZPair(26, LogicalOr.CONST_class));
        for (ZPair zpairResult905 : ZVal.getIterable(binaryOps, env, true)) {
            binaryOp = ZVal.assign(zpairResult905.getValue());
            new ReferenceClassProperty(this, "fixupMap", env)
                    .arrayAccess(env, binaryOp)
                    .set(
                            ZVal.newArray(
                                    new ZPair("left", CONST_FIXUP_PREC_LEFT),
                                    new ZPair("right", CONST_FIXUP_PREC_RIGHT)));
        }

        assignOps =
                ZVal.newArray(
                        new ZPair(0, Assign.CONST_class),
                        new ZPair(1, AssignRef.CONST_class),
                        new ZPair(
                                2,
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
                                        .CONST_class),
                        new ZPair(
                                3,
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
                                        .CONST_class),
                        new ZPair(
                                4,
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
                                        .CONST_class),
                        new ZPair(
                                5,
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
                                        .CONST_class),
                        new ZPair(
                                6,
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
                                        .CONST_class),
                        new ZPair(
                                7,
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
                                        .CONST_class),
                        new ZPair(
                                8,
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
                                        .CONST_class),
                        new ZPair(
                                9,
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
                                        .CONST_class),
                        new ZPair(
                                10,
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
                                        .CONST_class),
                        new ZPair(
                                11,
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
                                        .CONST_class),
                        new ZPair(
                                12,
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
                                        .CONST_class),
                        new ZPair(
                                13,
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
                                        .CONST_class));
        for (ZPair zpairResult906 : ZVal.getIterable(assignOps, env, true)) {
            assignOp = ZVal.assign(zpairResult906.getValue());
            new ReferenceClassProperty(this, "fixupMap", env)
                    .arrayAccess(env, assignOp)
                    .set(
                            ZVal.newArray(
                                    new ZPair("var", CONST_FIXUP_PREC_LEFT),
                                    new ZPair("expr", CONST_FIXUP_PREC_RIGHT)));
        }

        prefixOps =
                ZVal.newArray(
                        new ZPair(0, BitwiseNot.CONST_class),
                        new ZPair(1, BooleanNot.CONST_class),
                        new ZPair(2, UnaryPlus.CONST_class),
                        new ZPair(3, UnaryMinus.CONST_class),
                        new ZPair(4, Int_.CONST_class),
                        new ZPair(5, Double.CONST_class),
                        new ZPair(
                                6,
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
                                        .CONST_class),
                        new ZPair(
                                7,
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
                                        .CONST_class),
                        new ZPair(8, Object_.CONST_class),
                        new ZPair(9, Bool_.CONST_class),
                        new ZPair(10, Unset_.CONST_class),
                        new ZPair(11, ErrorSuppress.CONST_class),
                        new ZPair(12, YieldFrom.CONST_class),
                        new ZPair(13, Print_.CONST_class),
                        new ZPair(14, Include_.CONST_class));
        for (ZPair zpairResult907 : ZVal.getIterable(prefixOps, env, true)) {
            prefixOp = ZVal.assign(zpairResult907.getValue());
            new ReferenceClassProperty(this, "fixupMap", env)
                    .arrayAccess(env, prefixOp)
                    .set(ZVal.newArray(new ZPair("expr", CONST_FIXUP_PREC_RIGHT)));
        }

        return null;
    }

    @ConvertedMethod
    protected Object initializeRemovalMap(RuntimeEnv env, Object... args) {
        Object stripColon = null;
        Object stripDoubleArrow = null;
        Object stripRight = null;
        Object stripLeft = null;
        Object stripEquals = null;
        Object stripBoth = null;
        if (ZVal.isTrue(this.removalMap)) {
            return null;
        }

        stripBoth = ZVal.newArray(new ZPair("left", 382), new ZPair("right", 382));
        stripLeft = ZVal.newArray(new ZPair("left", 382));
        stripRight = ZVal.newArray(new ZPair("right", 382));
        stripDoubleArrow = ZVal.newArray(new ZPair("right", 268));
        stripColon = ZVal.newArray(new ZPair("left", ":"));
        stripEquals = ZVal.newArray(new ZPair("left", "="));
        this.removalMap =
                ZVal.newArray(
                        new ZPair("Expr_ArrayDimFetch->dim", stripBoth),
                        new ZPair("Expr_ArrayItem->key", stripDoubleArrow),
                        new ZPair("Expr_Closure->returnType", stripColon),
                        new ZPair("Expr_Exit->expr", stripBoth),
                        new ZPair("Expr_Ternary->if", stripBoth),
                        new ZPair("Expr_Yield->key", stripDoubleArrow),
                        new ZPair("Expr_Yield->value", stripBoth),
                        new ZPair("Param->type", stripRight),
                        new ZPair("Param->default", stripEquals),
                        new ZPair("Stmt_Break->num", stripBoth),
                        new ZPair("Stmt_ClassMethod->returnType", stripColon),
                        new ZPair("Stmt_Class->extends", ZVal.newArray(new ZPair("left", 364))),
                        new ZPair(
                                "Expr_PrintableNewAnonClass->extends",
                                ZVal.newArray(new ZPair("left", 364))),
                        new ZPair("Stmt_Continue->num", stripBoth),
                        new ZPair("Stmt_Foreach->keyVar", stripDoubleArrow),
                        new ZPair("Stmt_Function->returnType", stripColon),
                        new ZPair("Stmt_If->else", stripLeft),
                        new ZPair("Stmt_Namespace->name", stripLeft),
                        new ZPair("Stmt_PropertyProperty->default", stripEquals),
                        new ZPair("Stmt_Return->expr", stripBoth),
                        new ZPair("Stmt_StaticVar->default", stripEquals),
                        new ZPair("Stmt_TraitUseAdaptation_Alias->newName", stripLeft),
                        new ZPair("Stmt_TryCatch->finally", stripLeft));
        return null;
    }

    @ConvertedMethod
    protected Object initializeInsertionMap(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.insertionMap)) {
            return null;
        }

        this.insertionMap =
                ZVal.newArray(
                        new ZPair(
                                "Expr_ArrayDimFetch->dim",
                                ZVal.newArray(
                                        new ZPair(0, "["),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, ZVal.getNull()))),
                        new ZPair(
                                "Expr_ArrayItem->key",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.getNull()),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, " => "))),
                        new ZPair(
                                "Expr_Closure->returnType",
                                ZVal.newArray(
                                        new ZPair(0, ")"),
                                        new ZPair(1, " : "),
                                        new ZPair(2, ZVal.getNull()))),
                        new ZPair("Expr_Ternary->if", ZVal.arrayFromList("?", " ", " ")),
                        new ZPair(
                                "Expr_Yield->key",
                                ZVal.newArray(
                                        new ZPair(0, 267),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, " => "))),
                        new ZPair(
                                "Expr_Yield->value",
                                ZVal.newArray(
                                        new ZPair(0, 267),
                                        new ZPair(1, " "),
                                        new ZPair(2, ZVal.getNull()))),
                        new ZPair(
                                "Param->type",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.getNull()),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, " "))),
                        new ZPair(
                                "Param->default",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.getNull()),
                                        new ZPair(1, " = "),
                                        new ZPair(2, ZVal.getNull()))),
                        new ZPair(
                                "Stmt_Break->num",
                                ZVal.newArray(
                                        new ZPair(0, 343),
                                        new ZPair(1, " "),
                                        new ZPair(2, ZVal.getNull()))),
                        new ZPair(
                                "Stmt_ClassMethod->returnType",
                                ZVal.newArray(
                                        new ZPair(0, ")"),
                                        new ZPair(1, " : "),
                                        new ZPair(2, ZVal.getNull()))),
                        new ZPair(
                                "Stmt_Class->extends",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.getNull()),
                                        new ZPair(1, " extends "),
                                        new ZPair(2, ZVal.getNull()))),
                        new ZPair(
                                "Expr_PrintableNewAnonClass->extends",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.getNull()),
                                        new ZPair(1, " extends "),
                                        new ZPair(2, ZVal.getNull()))),
                        new ZPair(
                                "Stmt_Continue->num",
                                ZVal.newArray(
                                        new ZPair(0, 344),
                                        new ZPair(1, " "),
                                        new ZPair(2, ZVal.getNull()))),
                        new ZPair(
                                "Stmt_Foreach->keyVar",
                                ZVal.newArray(
                                        new ZPair(0, 338),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, " => "))),
                        new ZPair(
                                "Stmt_Function->returnType",
                                ZVal.newArray(
                                        new ZPair(0, ")"),
                                        new ZPair(1, " : "),
                                        new ZPair(2, ZVal.getNull()))),
                        new ZPair(
                                "Stmt_If->else",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.getNull()),
                                        new ZPair(1, " "),
                                        new ZPair(2, ZVal.getNull()))),
                        new ZPair(
                                "Stmt_Namespace->name",
                                ZVal.newArray(
                                        new ZPair(0, 388),
                                        new ZPair(1, " "),
                                        new ZPair(2, ZVal.getNull()))),
                        new ZPair(
                                "Stmt_PropertyProperty->default",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.getNull()),
                                        new ZPair(1, " = "),
                                        new ZPair(2, ZVal.getNull()))),
                        new ZPair(
                                "Stmt_Return->expr",
                                ZVal.newArray(
                                        new ZPair(0, 348),
                                        new ZPair(1, " "),
                                        new ZPair(2, ZVal.getNull()))),
                        new ZPair(
                                "Stmt_StaticVar->default",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.getNull()),
                                        new ZPair(1, " = "),
                                        new ZPair(2, ZVal.getNull()))),
                        new ZPair(
                                "Stmt_TryCatch->finally",
                                ZVal.newArray(
                                        new ZPair(0, ZVal.getNull()),
                                        new ZPair(1, " "),
                                        new ZPair(2, ZVal.getNull()))));
        return null;
    }

    @ConvertedMethod
    protected Object initializeListInsertionMap(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.listInsertionMap)) {
            return null;
        }

        this.listInsertionMap =
                ZVal.newArray(
                        new ZPair("Stmt_Catch->types", "|"),
                        new ZPair("Stmt_If->elseifs", " "),
                        new ZPair("Stmt_TryCatch->catches", " "),
                        new ZPair("Expr_Array->items", ", "),
                        new ZPair("Expr_Closure->params", ", "),
                        new ZPair("Expr_Closure->uses", ", "),
                        new ZPair("Expr_FuncCall->args", ", "),
                        new ZPair("Expr_Isset->vars", ", "),
                        new ZPair("Expr_List->items", ", "),
                        new ZPair("Expr_MethodCall->args", ", "),
                        new ZPair("Expr_New->args", ", "),
                        new ZPair("Expr_PrintableNewAnonClass->args", ", "),
                        new ZPair("Expr_StaticCall->args", ", "),
                        new ZPair("Stmt_ClassConst->consts", ", "),
                        new ZPair("Stmt_ClassMethod->params", ", "),
                        new ZPair("Stmt_Class->implements", ", "),
                        new ZPair("Expr_PrintableNewAnonClass->implements", ", "),
                        new ZPair("Stmt_Const->consts", ", "),
                        new ZPair("Stmt_Declare->declares", ", "),
                        new ZPair("Stmt_Echo->exprs", ", "),
                        new ZPair("Stmt_For->init", ", "),
                        new ZPair("Stmt_For->cond", ", "),
                        new ZPair("Stmt_For->loop", ", "),
                        new ZPair("Stmt_Function->params", ", "),
                        new ZPair("Stmt_Global->vars", ", "),
                        new ZPair("Stmt_GroupUse->uses", ", "),
                        new ZPair("Stmt_Interface->extends", ", "),
                        new ZPair("Stmt_Property->props", ", "),
                        new ZPair("Stmt_StaticVar->vars", ", "),
                        new ZPair("Stmt_TraitUse->traits", ", "),
                        new ZPair("Stmt_TraitUseAdaptation_Precedence->insteadof", ", "),
                        new ZPair("Stmt_Unset->vars", ", "),
                        new ZPair("Stmt_Use->uses", ", "),
                        new ZPair("Expr_Closure->stmts", "\n"),
                        new ZPair("Stmt_Case->stmts", "\n"),
                        new ZPair("Stmt_Catch->stmts", "\n"),
                        new ZPair("Stmt_Class->stmts", "\n"),
                        new ZPair("Expr_PrintableNewAnonClass->stmts", "\n"),
                        new ZPair("Stmt_Interface->stmts", "\n"),
                        new ZPair("Stmt_Trait->stmts", "\n"),
                        new ZPair("Stmt_ClassMethod->stmts", "\n"),
                        new ZPair("Stmt_Declare->stmts", "\n"),
                        new ZPair("Stmt_Do->stmts", "\n"),
                        new ZPair("Stmt_ElseIf->stmts", "\n"),
                        new ZPair("Stmt_Else->stmts", "\n"),
                        new ZPair("Stmt_Finally->stmts", "\n"),
                        new ZPair("Stmt_Foreach->stmts", "\n"),
                        new ZPair("Stmt_For->stmts", "\n"),
                        new ZPair("Stmt_Function->stmts", "\n"),
                        new ZPair("Stmt_If->stmts", "\n"),
                        new ZPair("Stmt_Namespace->stmts", "\n"),
                        new ZPair("Stmt_Switch->cases", "\n"),
                        new ZPair("Stmt_TraitUse->adaptations", "\n"),
                        new ZPair("Stmt_TryCatch->stmts", "\n"),
                        new ZPair("Stmt_While->stmts", "\n"));
        return null;
    }

    @ConvertedMethod
    protected Object initializeModifierChangeMap(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.modifierChangeMap)) {
            return null;
        }

        this.modifierChangeMap =
                ZVal.newArray(
                        new ZPair("Stmt_ClassConst->flags", 347),
                        new ZPair("Stmt_ClassMethod->flags", 346),
                        new ZPair("Stmt_Class->flags", 361),
                        new ZPair("Stmt_Property->flags", 320));
        return null;
    }

    public static final Object CONST_FIXUP_PREC_LEFT = 0;

    public static final Object CONST_FIXUP_PREC_RIGHT = 1;

    public static final Object CONST_FIXUP_CALL_LHS = 2;

    public static final Object CONST_FIXUP_DEREF_LHS = 3;

    public static final Object CONST_FIXUP_BRACED_NAME = 4;

    public static final Object CONST_FIXUP_VAR_BRACED_NAME = 5;

    public static final Object CONST_FIXUP_ENCAPSED = 6;

    public static final Object CONST_class = "PhpParser\\PrettyPrinterAbstract";

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
                    .setName("PhpParser\\PrettyPrinterAbstract")
                    .setLookup(
                            PrettyPrinterAbstract.class,
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
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/PrettyPrinterAbstract.php")
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

    private enum SwitchEnumType48 {
        DYNAMIC_TYPE_143,
        DYNAMIC_TYPE_144,
        DYNAMIC_TYPE_145,
        DYNAMIC_TYPE_146,
        DYNAMIC_TYPE_147,
        DYNAMIC_TYPE_148,
        DYNAMIC_TYPE_149,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
