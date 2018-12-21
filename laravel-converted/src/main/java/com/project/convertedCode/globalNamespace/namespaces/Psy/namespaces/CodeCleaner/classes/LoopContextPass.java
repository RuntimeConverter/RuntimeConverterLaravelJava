package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.LNumber;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.DNumber;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.FatalErrorException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.CodeCleanerPass;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.While_;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Do_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Break_;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.For_;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Switch_;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Foreach_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Continue_;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/LoopContextPass.php

*/

public class LoopContextPass extends CodeCleanerPass {

    public Object loopDepth = null;

    public LoopContextPass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public LoopContextPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    public Object beforeTraverse(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        this.loopDepth = 0;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object node = assignParameter(args, 0, false);
        Object msg = null;
        Object num = null;
        Object operator = null;
        SwitchEnumType71 switchVariable71 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType71.DEFAULT_CASE,
                        SwitchEnumType71.DYNAMIC_TYPE_250,
                        ZVal.checkInstanceType(node, Do_.class, "PhpParser\\Node\\Stmt\\Do_"),
                        SwitchEnumType71.DYNAMIC_TYPE_251,
                        ZVal.checkInstanceType(node, For_.class, "PhpParser\\Node\\Stmt\\For_"),
                        SwitchEnumType71.DYNAMIC_TYPE_252,
                        ZVal.checkInstanceType(
                                node, Foreach_.class, "PhpParser\\Node\\Stmt\\Foreach_"),
                        SwitchEnumType71.DYNAMIC_TYPE_253,
                        ZVal.checkInstanceType(
                                node, Switch_.class, "PhpParser\\Node\\Stmt\\Switch_"),
                        SwitchEnumType71.DYNAMIC_TYPE_254,
                        ZVal.checkInstanceType(node, While_.class, "PhpParser\\Node\\Stmt\\While_"),
                        SwitchEnumType71.DYNAMIC_TYPE_255,
                        ZVal.checkInstanceType(node, Break_.class, "PhpParser\\Node\\Stmt\\Break_"),
                        SwitchEnumType71.DYNAMIC_TYPE_256,
                        ZVal.checkInstanceType(
                                node, Continue_.class, "PhpParser\\Node\\Stmt\\Continue_"));
        switch (switchVariable71) {
            case DYNAMIC_TYPE_250:
            case DYNAMIC_TYPE_251:
            case DYNAMIC_TYPE_252:
            case DYNAMIC_TYPE_253:
            case DYNAMIC_TYPE_254:
                this.loopDepth = ZVal.increment(this.loopDepth);
                break;
            case DYNAMIC_TYPE_255:
            case DYNAMIC_TYPE_256:
                operator =
                        ZVal.assign(
                                ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        node,
                                                        Break_.class,
                                                        "PhpParser\\Node\\Stmt\\Break_"))
                                        ? "break"
                                        : "continue");
                if (ZVal.strictEqualityCheck(this.loopDepth, "===", 0)) {
                    msg =
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("'%s' not in the 'loop' or 'switch' context", operator)
                                    .value();
                    throw ZVal.getException(
                            env,
                            new FatalErrorException(
                                    env,
                                    msg,
                                    0,
                                    1,
                                    ZVal.getNull(),
                                    env.callMethod(node, "getLine", LoopContextPass.class)));
                }

                if (ZVal.toBool(
                                ZVal.checkInstanceType(
                                        toObjectR(node).accessProp(this, env).name("num").value(),
                                        LNumber.class,
                                        "PhpParser\\Node\\Scalar\\LNumber"))
                        || ZVal.toBool(
                                ZVal.checkInstanceType(
                                        toObjectR(node).accessProp(this, env).name("num").value(),
                                        DNumber.class,
                                        "PhpParser\\Node\\Scalar\\DNumber"))) {
                    num =
                            ZVal.assign(
                                    toObjectR(node)
                                            .accessProp(this, env)
                                            .name("num")
                                            .getObject()
                                            .accessProp(this, env)
                                            .name("value")
                                            .value());
                    if (ZVal.toBool(
                                    ZVal.checkInstanceType(
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("num")
                                                    .value(),
                                            DNumber.class,
                                            "PhpParser\\Node\\Scalar\\DNumber"))
                            || ZVal.toBool(ZVal.isLessThan(num, '<', 1))) {
                        msg =
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "'%s' operator accepts only positive numbers",
                                                operator)
                                        .value();
                        throw ZVal.getException(
                                env,
                                new FatalErrorException(
                                        env,
                                        msg,
                                        0,
                                        1,
                                        ZVal.getNull(),
                                        env.callMethod(node, "getLine", LoopContextPass.class)));
                    }

                    if (ZVal.isGreaterThan(num, '>', this.loopDepth)) {
                        msg =
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Cannot '%s' %d levels", operator, num)
                                        .value();
                        throw ZVal.getException(
                                env,
                                new FatalErrorException(
                                        env,
                                        msg,
                                        0,
                                        1,
                                        ZVal.getNull(),
                                        env.callMethod(node, "getLine", LoopContextPass.class)));
                    }

                } else if (toObjectR(node).accessProp(this, env).name("num").getBool()) {
                    msg =
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "'%s' operator with non-constant operand is no longer supported",
                                            operator)
                                    .value();
                    throw ZVal.getException(
                            env,
                            new FatalErrorException(
                                    env,
                                    msg,
                                    0,
                                    1,
                                    ZVal.getNull(),
                                    env.callMethod(node, "getLine", LoopContextPass.class)));
                }

                break;
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object leaveNode(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object node = assignParameter(args, 0, false);
        SwitchEnumType72 switchVariable72 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType72.DEFAULT_CASE,
                        SwitchEnumType72.DYNAMIC_TYPE_257,
                        ZVal.checkInstanceType(node, Do_.class, "PhpParser\\Node\\Stmt\\Do_"),
                        SwitchEnumType72.DYNAMIC_TYPE_258,
                        ZVal.checkInstanceType(node, For_.class, "PhpParser\\Node\\Stmt\\For_"),
                        SwitchEnumType72.DYNAMIC_TYPE_259,
                        ZVal.checkInstanceType(
                                node, Foreach_.class, "PhpParser\\Node\\Stmt\\Foreach_"),
                        SwitchEnumType72.DYNAMIC_TYPE_260,
                        ZVal.checkInstanceType(
                                node, Switch_.class, "PhpParser\\Node\\Stmt\\Switch_"),
                        SwitchEnumType72.DYNAMIC_TYPE_261,
                        ZVal.checkInstanceType(
                                node, While_.class, "PhpParser\\Node\\Stmt\\While_"));
        switch (switchVariable72) {
            case DYNAMIC_TYPE_257:
            case DYNAMIC_TYPE_258:
            case DYNAMIC_TYPE_259:
            case DYNAMIC_TYPE_260:
            case DYNAMIC_TYPE_261:
                this.loopDepth = ZVal.decrement(this.loopDepth);
                break;
        }
        ;
        return null;
    }

    public static final Object CONST_class = "Psy\\CodeCleaner\\LoopContextPass";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends CodeCleanerPass.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\CodeCleaner\\LoopContextPass")
                    .setLookup(
                            LoopContextPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("loopDepth")
                    .setFilename("vendor/psy/psysh/src/CodeCleaner/LoopContextPass.php")
                    .addInterface("PhpParser\\NodeVisitor")
                    .addExtendsClass("Psy\\CodeCleaner\\CodeCleanerPass")
                    .addExtendsClass("PhpParser\\NodeVisitorAbstract")
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

    private enum SwitchEnumType71 {
        DYNAMIC_TYPE_250,
        DYNAMIC_TYPE_251,
        DYNAMIC_TYPE_252,
        DYNAMIC_TYPE_253,
        DYNAMIC_TYPE_254,
        DYNAMIC_TYPE_255,
        DYNAMIC_TYPE_256,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType72 {
        DYNAMIC_TYPE_257,
        DYNAMIC_TYPE_258,
        DYNAMIC_TYPE_259,
        DYNAMIC_TYPE_260,
        DYNAMIC_TYPE_261,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
