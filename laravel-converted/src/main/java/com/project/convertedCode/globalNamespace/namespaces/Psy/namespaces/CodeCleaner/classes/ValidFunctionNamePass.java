package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Variable;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.If_;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.While_;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Do_;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.NamespaceAwarePass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.FatalErrorException;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.FuncCall;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Expr;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Function_;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Switch_;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/ValidFunctionNamePass.php

*/

public class ValidFunctionNamePass extends NamespaceAwarePass {

    public Object conditionalScopes = 0;

    public ValidFunctionNamePass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ValidFunctionNamePass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object msg = null;
        Object name = null;
        super.enterNode(env, node);
        if (ZVal.isTrue(runtimeStaticObject.isConditional(env, node))) {
            this.conditionalScopes = ZVal.increment(this.conditionalScopes);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, Function_.class, "PhpParser\\Node\\Stmt\\Function_"))) {
            name =
                    env.callMethod(
                            this,
                            "getFullyQualifiedName",
                            ValidFunctionNamePass.class,
                            toObjectR(node).accessProp(this, env).name("name").value());
            if (ZVal.strictEqualityCheck(this.conditionalScopes, "===", 0)) {
                if (ZVal.toBool(function_function_exists.f.env(env).call(name).value())
                        || ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "currentScope", env),
                                        env,
                                        NamespaceGlobal.strtolower.env(env).call(name).value()))) {
                    msg = function_sprintf.f.env(env).call("Cannot redeclare %s()", name).value();
                    throw ZVal.getException(
                            env,
                            new FatalErrorException(
                                    env,
                                    msg,
                                    0,
                                    1,
                                    ZVal.getNull(),
                                    env.callMethod(node, "getLine", ValidFunctionNamePass.class)));
                }
            }

            new ReferenceClassProperty(this, "currentScope", env)
                    .arrayAccess(env, NamespaceGlobal.strtolower.env(env).call(name).value())
                    .set(true);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object leaveNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object name = null;
        Object fullName = null;
        Object shortName = null;
        Object inScope = null;
        Object message = null;
        if (ZVal.isTrue(runtimeStaticObject.isConditional(env, node))) {
            this.conditionalScopes = ZVal.decrement(this.conditionalScopes);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(node, FuncCall.class, "PhpParser\\Node\\Expr\\FuncCall"))) {
            name = ZVal.assign(toObjectR(node).accessProp(this, env).name("name").value());
            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            name, Expr.class, "PhpParser\\Node\\Expr")))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            name,
                                            Variable.class,
                                            "PhpParser\\Node\\Expr\\Variable")))) {
                shortName =
                        NamespaceGlobal.implode
                                .env(env)
                                .call(
                                        "\\",
                                        toObjectR(name).accessProp(this, env).name("parts").value())
                                .value();
                fullName =
                        env.callMethod(
                                this, "getFullyQualifiedName", ValidFunctionNamePass.class, name);
                inScope =
                        ZVal.assign(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "currentScope", env),
                                        env,
                                        NamespaceGlobal.strtolower
                                                .env(env)
                                                .call(fullName)
                                                .value()));
                if (ZVal.toBool(
                                ZVal.toBool(!ZVal.isTrue(inScope))
                                        && ZVal.toBool(
                                                !function_function_exists
                                                        .f
                                                        .env(env)
                                                        .call(shortName)
                                                        .getBool()))
                        && ZVal.toBool(
                                !function_function_exists.f.env(env).call(fullName).getBool())) {
                    message =
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Call to undefined function %s()", name)
                                    .value();
                    throw ZVal.getException(
                            env,
                            new FatalErrorException(
                                    env,
                                    message,
                                    0,
                                    1,
                                    ZVal.getNull(),
                                    env.callMethod(node, "getLine", ValidFunctionNamePass.class)));
                }
            }
        }

        return null;
    }

    public static final Object CONST_class = "Psy\\CodeCleaner\\ValidFunctionNamePass";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends NamespaceAwarePass.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
        private Object isConditional(RuntimeEnv env, Object... args) {
            Object node = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.toBool(
                                                                    ZVal.checkInstanceType(
                                                                            node,
                                                                            If_.class,
                                                                            "PhpParser\\Node\\Stmt\\If_"))
                                                            || ZVal.toBool(
                                                                    ZVal.checkInstanceType(
                                                                            node,
                                                                            While_.class,
                                                                            "PhpParser\\Node\\Stmt\\While_")))
                                            || ZVal.toBool(
                                                    ZVal.checkInstanceType(
                                                            node,
                                                            Do_.class,
                                                            "PhpParser\\Node\\Stmt\\Do_")))
                            || ZVal.toBool(
                                    ZVal.checkInstanceType(
                                            node,
                                            Switch_.class,
                                            "PhpParser\\Node\\Stmt\\Switch_")));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\CodeCleaner\\ValidFunctionNamePass")
                    .setLookup(
                            ValidFunctionNamePass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("conditionalScopes", "currentScope", "namespace")
                    .setFilename("vendor/psy/psysh/src/CodeCleaner/ValidFunctionNamePass.php")
                    .addInterface("PhpParser\\NodeVisitor")
                    .addExtendsClass("Psy\\CodeCleaner\\NamespaceAwarePass")
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
}
