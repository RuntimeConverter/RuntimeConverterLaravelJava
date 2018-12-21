package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.String_;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.MethodCall;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.namespaces.BinaryOp.classes.Concat;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.BuilderHelpers;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes.Namespace_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes.Property;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes.Method;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes.Interface_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.FuncCall;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes.Class_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ClassConstFetch;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Expr;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes.Function_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Arg;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes.Param;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ConstFetch;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes.Trait_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.StaticCall;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.New_;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/BuilderFactory.php

*/

public class BuilderFactory extends RuntimeClassBase {

    public BuilderFactory(RuntimeEnv env, Object... args) {
        super(env);
    }

    public BuilderFactory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object namespace(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(new Namespace_(env, name));
    }

    @ConvertedMethod(name = "class")
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object _pClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(new Class_(env, name));
    }

    @ConvertedMethod(name = "interface")
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object _pInterface(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(new Interface_(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object trait(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(new Trait_(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object method(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(new Method(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object param(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(new Param(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object property(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(new Property(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object function(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(new Function_(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object use(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .PhpParser
                        .namespaces
                        .Builder
                        .classes
                        .Use_(
                        env,
                        name,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Stmt
                                .classes
                                .Use_
                                .CONST_TYPE_NORMAL));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object val(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(BuilderHelpers.runtimeStaticObject.normalizeValue(env, value));
    }

    @ConvertedMethod(name = "args")
    @ConvertedParameter(index = 0, name = "args", typeHint = "array")
    public Object ___args(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, false);
        Object arg = null;
        ReferenceContainer normalizedArgs = new BasicReferenceContainer(null);
        normalizedArgs.setObject(ZVal.newArray());
        for (ZPair zpairResult844 : ZVal.getIterable(___args, env, true)) {
            arg = ZVal.assign(zpairResult844.getValue());
            if (ZVal.isTrue(ZVal.checkInstanceType(arg, Arg.class, "PhpParser\\Node\\Arg"))) {
                normalizedArgs.arrayAppend(env).set(arg);

            } else {
                normalizedArgs
                        .arrayAppend(env)
                        .set(
                                new Arg(
                                        env,
                                        BuilderHelpers.runtimeStaticObject.normalizeValue(
                                                env, arg)));
            }
        }

        return ZVal.assign(normalizedArgs.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "args",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object funcCall(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, true);
        if (null == ___args) {
            ___args = ZVal.newArray();
        }
        return ZVal.assign(
                new FuncCall(
                        env,
                        BuilderHelpers.runtimeStaticObject.normalizeNameOrExpr(env, name),
                        this.___args(env, ___args)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "var", typeHint = "PhpParser\\Node\\Expr")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(
        index = 2,
        name = "args",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object methodCall(RuntimeEnv env, Object... args) {
        Object var = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object ___args = assignParameter(args, 2, true);
        if (null == ___args) {
            ___args = ZVal.newArray();
        }
        return ZVal.assign(
                new MethodCall(
                        env,
                        var,
                        BuilderHelpers.runtimeStaticObject.normalizeIdentifierOrExpr(env, name),
                        this.___args(env, ___args)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(
        index = 2,
        name = "args",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object staticCall(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object ___args = assignParameter(args, 2, true);
        if (null == ___args) {
            ___args = ZVal.newArray();
        }
        return ZVal.assign(
                new StaticCall(
                        env,
                        BuilderHelpers.runtimeStaticObject.normalizeNameOrExpr(env, _pClass),
                        BuilderHelpers.runtimeStaticObject.normalizeIdentifierOrExpr(env, name),
                        this.___args(env, ___args)));
    }

    @ConvertedMethod(name = "new")
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(
        index = 1,
        name = "args",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object _pNew(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, true);
        if (null == ___args) {
            ___args = ZVal.newArray();
        }
        return ZVal.assign(
                new New_(
                        env,
                        BuilderHelpers.runtimeStaticObject.normalizeNameOrExpr(env, _pClass),
                        this.___args(env, ___args)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object constFetch(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                new ConstFetch(env, BuilderHelpers.runtimeStaticObject.normalizeName(env, name)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "name")
    public Object classConstFetch(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        return ZVal.assign(
                new ClassConstFetch(
                        env,
                        BuilderHelpers.runtimeStaticObject.normalizeNameOrExpr(env, _pClass),
                        BuilderHelpers.runtimeStaticObject.normalizeIdentifier(env, name)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exprs")
    public Object concat(RuntimeEnv env, Object... args) {
        ReferenceContainer exprs = new BasicReferenceContainer(assignParameterVarArgs(args, 0));
        Object lastConcat = null;
        Object numExprs = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        numExprs = function_count.f.env(env).call(exprs.getObject()).value();
        if (ZVal.isLessThan(numExprs, '<', 2)) {
            throw ZVal.getException(
                    env, new LogicException(env, "Expected at least two expressions"));
        }

        lastConcat = this.normalizeStringExpr(env, exprs.arrayGet(env, 0));
        for (i.setObject(1);
                ZVal.isLessThan(i.getObject(), '<', numExprs);
                i.setObject(ZVal.increment(i.getObject()))) {
            lastConcat =
                    new Concat(
                            env,
                            lastConcat,
                            this.normalizeStringExpr(env, exprs.arrayGet(env, i.getObject())));
        }

        return ZVal.assign(lastConcat);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expr")
    private Object normalizeStringExpr(RuntimeEnv env, Object... args) {
        Object expr = assignParameter(args, 0, false);
        if (ZVal.isTrue(ZVal.checkInstanceType(expr, Expr.class, "PhpParser\\Node\\Expr"))) {
            return ZVal.assign(expr);
        }

        if (function_is_string.f.env(env).call(expr).getBool()) {
            return ZVal.assign(new String_(env, expr));
        }

        throw ZVal.getException(env, new LogicException(env, "Expected string or Expr"));
    }

    public static final Object CONST_class = "PhpParser\\BuilderFactory";

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
                    .setName("PhpParser\\BuilderFactory")
                    .setLookup(
                            BuilderFactory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/BuilderFactory.php")
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
