package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Empty_;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Variable;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.ParseErrorException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.CodeCleanerPass;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/LegacyEmptyPass.php

*/

public class LegacyEmptyPass extends CodeCleanerPass {

    public Object atLeastPhp55 = null;

    public LegacyEmptyPass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LegacyEmptyPass.class) {
            this.__construct(env, args);
        }
    }

    public LegacyEmptyPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.atLeastPhp55 =
                NamespaceGlobal.version_compare.env(env).call("7.2.11-dev", "5.5", ">=").value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object msg = null;
        if (ZVal.isTrue(this.atLeastPhp55)) {
            return null;
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(node, Empty_.class, "PhpParser\\Node\\Expr\\Empty_"))) {
            return null;
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        toObjectR(node).accessProp(this, env).name("expr").value(),
                        Variable.class,
                        "PhpParser\\Node\\Expr\\Variable"))) {
            msg =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "syntax error, unexpected %s",
                                    this.getUnexpectedThing(
                                            env,
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("expr")
                                                    .value()))
                            .value();
            throw ZVal.getException(
                    env,
                    new ParseErrorException(
                            env,
                            msg,
                            env.callMethod(
                                    toObjectR(node).accessProp(this, env).name("expr").value(),
                                    "getLine",
                                    LegacyEmptyPass.class)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    private Object getUnexpectedThing(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        SwitchEnumType70 switchVariable70 =
                ZVal.getEnum(
                        env.callMethod(node, "getType", LegacyEmptyPass.class),
                        SwitchEnumType70.DEFAULT_CASE,
                        SwitchEnumType70.STRING_Scalar_String,
                        "Scalar_String",
                        SwitchEnumType70.STRING_Scalar_LNumber,
                        "Scalar_LNumber",
                        SwitchEnumType70.STRING_Scalar_DNumber,
                        "Scalar_DNumber",
                        SwitchEnumType70.STRING_Expr_ConstFetch,
                        "Expr_ConstFetch");
        switch (switchVariable70) {
            case STRING_Scalar_String:
            case STRING_Scalar_LNumber:
            case STRING_Scalar_DNumber:
                return ZVal.assign(
                        NamespaceGlobal.json_encode
                                .env(env)
                                .call(toObjectR(node).accessProp(this, env).name("value").value())
                                .value());
            case STRING_Expr_ConstFetch:
                return ZVal.assign(
                        toStringR(toObjectR(node).accessProp(this, env).name("name").value(), env));
            case DEFAULT_CASE:
                return ZVal.assign(env.callMethod(node, "getType", LegacyEmptyPass.class));
        }
        ;
        return null;
    }

    public static final Object CONST_class = "Psy\\CodeCleaner\\LegacyEmptyPass";

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
                    .setName("Psy\\CodeCleaner\\LegacyEmptyPass")
                    .setLookup(
                            LegacyEmptyPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("atLeastPhp55")
                    .setFilename("vendor/psy/psysh/src/CodeCleaner/LegacyEmptyPass.php")
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

    private enum SwitchEnumType70 {
        STRING_Scalar_String,
        STRING_Scalar_LNumber,
        STRING_Scalar_DNumber,
        STRING_Expr_ConstFetch,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
