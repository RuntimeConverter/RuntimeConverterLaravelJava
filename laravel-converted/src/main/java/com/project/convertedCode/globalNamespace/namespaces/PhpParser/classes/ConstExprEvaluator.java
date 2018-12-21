package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.String_;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.UnaryPlus;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ArrayDimFetch;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.DNumber;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import java.lang.Math;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.BinaryOp;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Array_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.LNumber;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Ternary;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.BooleanNot;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.UnaryMinus;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.Coalesce;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ConstFetch;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.ConstExprEvaluationException;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.BitwiseNot;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/ConstExprEvaluator.php

*/

public class ConstExprEvaluator extends RuntimeClassBase {

    public Object fallbackEvaluator = null;

    public ConstExprEvaluator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConstExprEvaluator.class) {
            this.__construct(env, args);
        }
    }

    public ConstExprEvaluator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "fallbackEvaluator",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/nikic/php-parser/lib/PhpParser")
                        .setFile("/vendor/nikic/php-parser/lib/PhpParser/ConstExprEvaluator.php");
        Object fallbackEvaluator = assignParameter(args, 0, true);
        if (null == fallbackEvaluator) {
            fallbackEvaluator = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.fallbackEvaluator =
                ZVal.isDefined(ternaryExpressionTemp = fallbackEvaluator)
                        ? ternaryExpressionTemp
                        : new Closure(
                                env, runtimeConverterFunctionClassConstants, "PhpParser", this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(
                                index = 0,
                                name = "expr",
                                typeHint = "PhpParser\\Node\\Expr"
                            )
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object expr = assignParameter(args, 0, false);
                                throw ZVal.getException(
                                        env,
                                        new ConstExprEvaluationException(
                                                env,
                                                "Expression of type "
                                                        + toStringR(
                                                                env.callMethod(
                                                                        expr,
                                                                        "getType",
                                                                        ConstExprEvaluator.class),
                                                                env)
                                                        + " cannot be evaluated"));
                            }
                        };
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expr", typeHint = "PhpParser\\Node\\Expr")
    public Object evaluateSilently(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/nikic/php-parser/lib/PhpParser")
                        .setFile("/vendor/nikic/php-parser/lib/PhpParser/ConstExprEvaluator.php");
        Object expr = assignParameter(args, 0, false);
        Object e = null;
        function_set_error_handler
                .f
                .env(env)
                .call(
                        new Closure(
                                env, runtimeConverterFunctionClassConstants, "PhpParser", this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "num")
                            @ConvertedParameter(index = 1, name = "str")
                            @ConvertedParameter(index = 2, name = "file")
                            @ConvertedParameter(index = 3, name = "line")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object num = assignParameter(args, 0, false);
                                Object str = assignParameter(args, 1, false);
                                Object file = assignParameter(args, 2, false);
                                Object line = assignParameter(args, 3, false);
                                throw ZVal.getException(
                                        env, new ErrorException(env, str, 0, num, file, line));
                            }
                        });
        try {
            return ZVal.assign(this.evaluate(env, expr));
        } catch (ConvertedException convertedException96) {
            if (convertedException96.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException96.getObject();
                if (!ZVal.isTrue(
                        ZVal.checkInstanceType(
                                e,
                                ConstExprEvaluationException.class,
                                "PhpParser\\ConstExprEvaluationException"))) {
                    e =
                            new ConstExprEvaluationException(
                                    env,
                                    "An error occurred during constant expression evaluation",
                                    0,
                                    e);
                }

                throw ZVal.getException(env, e);
            } else {
                throw convertedException96;
            }
        } finally {
            function_restore_error_handler.f.env(env).call();
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expr", typeHint = "PhpParser\\Node\\Expr")
    public Object evaluateDirectly(RuntimeEnv env, Object... args) {
        Object expr = assignParameter(args, 0, false);
        return ZVal.assign(this.evaluate(env, expr));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expr", typeHint = "PhpParser\\Node\\Expr")
    private Object evaluate(RuntimeEnv env, Object... args) {
        ReferenceContainer expr = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                expr.getObject(),
                                                LNumber.class,
                                                "PhpParser\\Node\\Scalar\\LNumber"))
                                || ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                expr.getObject(),
                                                DNumber.class,
                                                "PhpParser\\Node\\Scalar\\DNumber")))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                expr.getObject(),
                                String_.class,
                                "PhpParser\\Node\\Scalar\\String_"))) {
            return ZVal.assign(
                    toObjectR(expr.getObject()).accessProp(this, env).name("value").value());
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        expr.getObject(), Array_.class, "PhpParser\\Node\\Expr\\Array_"))) {
            return ZVal.assign(this.evaluateArray(env, expr.getObject()));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        expr.getObject(), UnaryPlus.class, "PhpParser\\Node\\Expr\\UnaryPlus"))) {
            return ZVal.assign(
                    ZVal.minusSign(
                            this.evaluate(
                                    env,
                                    toObjectR(expr.getObject())
                                            .accessProp(this, env)
                                            .name("expr")
                                            .value())));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        expr.getObject(), UnaryMinus.class, "PhpParser\\Node\\Expr\\UnaryMinus"))) {
            return ZVal.assign(
                    ZVal.minusSign(
                            this.evaluate(
                                    env,
                                    toObjectR(expr.getObject())
                                            .accessProp(this, env)
                                            .name("expr")
                                            .value())));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        expr.getObject(), BooleanNot.class, "PhpParser\\Node\\Expr\\BooleanNot"))) {
            return ZVal.assign(
                    !ZVal.isTrue(
                            this.evaluate(
                                    env,
                                    toObjectR(expr.getObject())
                                            .accessProp(this, env)
                                            .name("expr")
                                            .value())));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        expr.getObject(), BitwiseNot.class, "PhpParser\\Node\\Expr\\BitwiseNot"))) {
            return ZVal.assign(
                    ~ZVal.toLong(
                            this.evaluate(
                                    env,
                                    toObjectR(expr.getObject())
                                            .accessProp(this, env)
                                            .name("expr")
                                            .value())));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        expr.getObject(), BinaryOp.class, "PhpParser\\Node\\Expr\\BinaryOp"))) {
            return ZVal.assign(this.evaluateBinaryOp(env, expr.getObject()));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        expr.getObject(), Ternary.class, "PhpParser\\Node\\Expr\\Ternary"))) {
            return ZVal.assign(this.evaluateTernary(env, expr.getObject()));
        }

        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                expr.getObject(),
                                ArrayDimFetch.class,
                                "PhpParser\\Node\\Expr\\ArrayDimFetch"))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                ZVal.getNull(),
                                "!==",
                                toObjectR(expr.getObject())
                                        .accessProp(this, env)
                                        .name("dim")
                                        .value()))) {
            return ZVal.assign(
                    handleReturnReference(
                                    this.evaluate(
                                            env,
                                            toObjectR(expr.getObject())
                                                    .accessProp(this, env)
                                                    .name("var")
                                                    .value()))
                            .arrayGet(
                                    env,
                                    this.evaluate(
                                            env,
                                            toObjectR(expr.getObject())
                                                    .accessProp(this, env)
                                                    .name("dim")
                                                    .value())));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        expr.getObject(), ConstFetch.class, "PhpParser\\Node\\Expr\\ConstFetch"))) {
            return ZVal.assign(this.evaluateConstFetch(env, expr.getObject()));
        }

        return ZVal.assign(
                env.callFunctionDynamic(
                                this.fallbackEvaluator,
                                new RuntimeArgsWithReferences().add(0, expr),
                                expr.getObject())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expr", typeHint = "PhpParser\\Node\\Expr\\Array_")
    private Object evaluateArray(RuntimeEnv env, Object... args) {
        Object expr = assignParameter(args, 0, false);
        Object item = null;
        ReferenceContainer array = new BasicReferenceContainer(null);
        array.setObject(ZVal.newArray());
        for (ZPair zpairResult847 :
                ZVal.getIterable(
                        toObjectR(expr).accessProp(this, env).name("items").value(), env, true)) {
            item = ZVal.assign(zpairResult847.getValue());
            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    toObjectR(item).accessProp(this, env).name("key").value())) {
                array.arrayAccess(
                                env,
                                this.evaluate(
                                        env,
                                        toObjectR(item).accessProp(this, env).name("key").value()))
                        .set(
                                this.evaluate(
                                        env,
                                        toObjectR(item)
                                                .accessProp(this, env)
                                                .name("value")
                                                .value()));

            } else {
                array.arrayAppend(env)
                        .set(
                                this.evaluate(
                                        env,
                                        toObjectR(item)
                                                .accessProp(this, env)
                                                .name("value")
                                                .value()));
            }
        }

        return ZVal.assign(array.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expr", typeHint = "PhpParser\\Node\\Expr\\Ternary")
    private Object evaluateTernary(RuntimeEnv env, Object... args) {
        Object expr = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(), "===", toObjectR(expr).accessProp(this, env).name("if").value())) {
            return ZVal.assign(
                    ZVal.isTrue(
                                    ternaryExpressionTemp =
                                            this.evaluate(
                                                    env,
                                                    toObjectR(expr)
                                                            .accessProp(this, env)
                                                            .name("cond")
                                                            .value()))
                            ? ternaryExpressionTemp
                            : this.evaluate(
                                    env,
                                    toObjectR(expr).accessProp(this, env).name("else").value()));
        }

        return ZVal.assign(
                ZVal.isTrue(
                                this.evaluate(
                                        env,
                                        toObjectR(expr).accessProp(this, env).name("cond").value()))
                        ? this.evaluate(
                                env, toObjectR(expr).accessProp(this, env).name("if").value())
                        : this.evaluate(
                                env, toObjectR(expr).accessProp(this, env).name("else").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expr", typeHint = "PhpParser\\Node\\Expr\\BinaryOp")
    private Object evaluateBinaryOp(RuntimeEnv env, Object... args) {
        Object expr = assignParameter(args, 0, false);
        Object r = null;
        Object ternaryExpressionTemp = null;
        Object l = null;
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                expr, Coalesce.class, "PhpParser\\Node\\Expr\\BinaryOp\\Coalesce"))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                toObjectR(expr).accessProp(this, env).name("left").value(),
                                ArrayDimFetch.class,
                                "PhpParser\\Node\\Expr\\ArrayDimFetch"))) {
            return ZVal.assign(
                    ZVal.isDefined(
                                    ternaryExpressionTemp =
                                            handleReturnReference(
                                                            this.evaluate(
                                                                    env,
                                                                    toObjectR(expr)
                                                                            .accessProp(this, env)
                                                                            .name("left")
                                                                            .getObject()
                                                                            .accessProp(this, env)
                                                                            .name("var")
                                                                            .value()))
                                                    .arrayGet(
                                                            env,
                                                            this.evaluate(
                                                                    env,
                                                                    toObjectR(expr)
                                                                            .accessProp(this, env)
                                                                            .name("left")
                                                                            .getObject()
                                                                            .accessProp(this, env)
                                                                            .name("dim")
                                                                            .value())))
                            ? ternaryExpressionTemp
                            : this.evaluate(
                                    env,
                                    toObjectR(expr).accessProp(this, env).name("right").value()));
        }

        l = ZVal.assign(toObjectR(expr).accessProp(this, env).name("left").value());
        r = ZVal.assign(toObjectR(expr).accessProp(this, env).name("right").value());
        switch (toStringR(env.callMethod(expr, "getOperatorSigil", ConstExprEvaluator.class))) {
            case "&":
                return ZVal.assign(
                        ZVal.toLong(this.evaluate(env, l)) & ZVal.toLong(this.evaluate(env, r)));
            case "|":
                return ZVal.assign(
                        ZVal.toLong(this.evaluate(env, l)) | ZVal.toLong(this.evaluate(env, r)));
            case "^":
                return ZVal.assign(
                        ZVal.toLong(this.evaluate(env, l)) ^ ZVal.toLong(this.evaluate(env, r)));
            case "&&":
                return ZVal.assign(
                        ZVal.toBool(this.evaluate(env, l)) && ZVal.toBool(this.evaluate(env, r)));
            case "||":
                return ZVal.assign(
                        ZVal.toBool(this.evaluate(env, l)) || ZVal.toBool(this.evaluate(env, r)));
            case "??":
                return ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = this.evaluate(env, l))
                                ? ternaryExpressionTemp
                                : this.evaluate(env, r));
            case ".":
                return ZVal.assign(
                        toStringR(this.evaluate(env, l), env)
                                + toStringR(this.evaluate(env, r), env));
            case "/":
                return ZVal.assign(ZVal.divide(this.evaluate(env, l), this.evaluate(env, r)));
            case "==":
                return ZVal.assign(
                        ZVal.equalityCheck(this.evaluate(env, l), this.evaluate(env, r)));
            case ">":
                return ZVal.assign(
                        ZVal.isGreaterThan(this.evaluate(env, l), '>', this.evaluate(env, r)));
            case ">=":
                return ZVal.assign(
                        ZVal.isGreaterThanOrEqualTo(
                                this.evaluate(env, l), ">=", this.evaluate(env, r)));
            case "===":
                return ZVal.assign(
                        ZVal.strictEqualityCheck(
                                this.evaluate(env, l), "===", this.evaluate(env, r)));
            case "and":
                return ZVal.assign(
                        ZVal.toBool(this.evaluate(env, l)) && ZVal.toBool(this.evaluate(env, r)));
            case "or":
                return ZVal.assign(
                        ZVal.toBool(this.evaluate(env, l)) || ZVal.toBool(this.evaluate(env, r)));
            case "xor":
                return ZVal.assign(
                        ZVal.toBool(this.evaluate(env, l)) ^ ZVal.toBool(this.evaluate(env, r)));
            case "-":
                return ZVal.assign(ZVal.subtract(this.evaluate(env, l), this.evaluate(env, r)));
            case "%":
                return ZVal.assign(ZVal.modulus(this.evaluate(env, l), this.evaluate(env, r)));
            case "*":
                return ZVal.assign(ZVal.multiply(this.evaluate(env, l), this.evaluate(env, r)));
            case "!=":
                return ZVal.assign(
                        ZVal.notEqualityCheck(this.evaluate(env, l), this.evaluate(env, r)));
            case "!==":
                return ZVal.assign(
                        ZVal.strictNotEqualityCheck(
                                this.evaluate(env, l), "!==", this.evaluate(env, r)));
            case "+":
                return ZVal.assign(ZVal.add(this.evaluate(env, l), this.evaluate(env, r)));
            case "**":
                return ZVal.assign(
                        Math.pow(
                                ZVal.toDouble(this.evaluate(env, l)),
                                ZVal.toDouble(this.evaluate(env, r))));
            case "<<":
                return ZVal.assign(
                        ZVal.toLong(this.evaluate(env, l)) << ZVal.toLong(this.evaluate(env, r)));
            case ">>":
                return ZVal.assign(
                        ZVal.toLong(this.evaluate(env, l)) >> ZVal.toLong(this.evaluate(env, r)));
            case "<":
                return ZVal.assign(
                        ZVal.isLessThan(this.evaluate(env, l), '<', this.evaluate(env, r)));
            case "<=":
                return ZVal.assign(
                        ZVal.isLessThanOrEqualTo(
                                this.evaluate(env, l), "<=", this.evaluate(env, r)));
            case "<=>":
                return ZVal.assign(
                        ZVal.spaceshipComparison(this.evaluate(env, l), this.evaluate(env, r)));
        }
        ;
        throw ZVal.getException(env, new PHPException(env, "Should not happen"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expr", typeHint = "PhpParser\\Node\\Expr\\ConstFetch")
    private Object evaluateConstFetch(RuntimeEnv env, Object... args) {
        ReferenceContainer expr = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object name = null;
        name =
                env.callMethod(
                        toObjectR(expr.getObject()).accessProp(this, env).name("name").value(),
                        "toLowerString",
                        ConstExprEvaluator.class);
        switch (toStringR(name)) {
            case "null":
                return ZVal.assign(ZVal.getNull());
            case "false":
                return ZVal.assign(false);
            case "true":
                return ZVal.assign(true);
        }
        ;
        return ZVal.assign(
                env.callFunctionDynamic(
                                this.fallbackEvaluator,
                                new RuntimeArgsWithReferences().add(0, expr),
                                expr.getObject())
                        .value());
    }

    public static final Object CONST_class = "PhpParser\\ConstExprEvaluator";

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
                    .setName("PhpParser\\ConstExprEvaluator")
                    .setLookup(
                            ConstExprEvaluator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("fallbackEvaluator")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/ConstExprEvaluator.php")
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
