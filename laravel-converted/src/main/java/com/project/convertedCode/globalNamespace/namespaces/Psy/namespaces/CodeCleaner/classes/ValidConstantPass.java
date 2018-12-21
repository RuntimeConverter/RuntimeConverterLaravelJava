package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.NamespaceAwarePass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.FatalErrorException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Identifier;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ClassConstFetch;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Expr;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ConstFetch;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/ValidConstantPass.php

*/

public class ValidConstantPass extends NamespaceAwarePass {

    public ValidConstantPass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ValidConstantPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object leaveNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object msg = null;
        Object name = null;
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                node, ConstFetch.class, "PhpParser\\Node\\Expr\\ConstFetch"))
                && ZVal.toBool(
                        ZVal.isGreaterThan(
                                function_count
                                        .f
                                        .env(env)
                                        .call(
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("name")
                                                        .getObject()
                                                        .accessProp(this, env)
                                                        .name("parts")
                                                        .value())
                                        .value(),
                                '>',
                                1))) {
            name =
                    env.callMethod(
                            this,
                            "getFullyQualifiedName",
                            ValidConstantPass.class,
                            toObjectR(node).accessProp(this, env).name("name").value());
            if (!function_defined.f.env(env).call(name).getBool()) {
                msg = function_sprintf.f.env(env).call("Undefined constant %s", name).value();
                throw ZVal.getException(
                        env,
                        new FatalErrorException(
                                env,
                                msg,
                                0,
                                1,
                                ZVal.getNull(),
                                env.callMethod(node, "getLine", ValidConstantPass.class)));
            }

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, ClassConstFetch.class, "PhpParser\\Node\\Expr\\ClassConstFetch"))) {
            this.validateClassConstFetchExpression(env, node);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "stmt",
        typeHint = "PhpParser\\Node\\Expr\\ClassConstFetch"
    )
    protected Object validateClassConstFetchExpression(RuntimeEnv env, Object... args) {
        Object stmt = assignParameter(args, 0, false);
        Object msg = null;
        Object constType = null;
        Object constName = null;
        Object className = null;
        Object refl = null;
        constName =
                ZVal.assign(
                        ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                toObjectR(stmt)
                                                        .accessProp(this, env)
                                                        .name("name")
                                                        .value(),
                                                Identifier.class,
                                                "PhpParser\\Node\\Identifier"))
                                ? env.callMethod(
                                        toObjectR(stmt).accessProp(this, env).name("name").value(),
                                        "toString",
                                        ValidConstantPass.class)
                                : toObjectR(stmt).accessProp(this, env).name("name").value());
        if (ZVal.strictEqualityCheck(constName, "===", "class")) {
            return null;
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        toObjectR(stmt).accessProp(this, env).name("class").value(),
                        Expr.class,
                        "PhpParser\\Node\\Expr"))) {
            className =
                    env.callMethod(
                            this,
                            "getFullyQualifiedName",
                            ValidConstantPass.class,
                            toObjectR(stmt).accessProp(this, env).name("class").value());
            if (ZVal.toBool(function_class_exists.f.env(env).call(className).value())
                    || ZVal.toBool(
                            NamespaceGlobal.interface_exists.env(env).call(className).value())) {
                refl = new ReflectionClass(env, className);
                if (!ZVal.isTrue(
                        env.callMethod(refl, "hasConstant", ValidConstantPass.class, constName))) {
                    constType =
                            ZVal.assign(
                                    function_class_exists.f.env(env).call(className).getBool()
                                            ? "Class"
                                            : "Interface");
                    msg =
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "%s constant '%s::%s' not found",
                                            constType, className, constName)
                                    .value();
                    throw ZVal.getException(
                            env,
                            new FatalErrorException(
                                    env,
                                    msg,
                                    0,
                                    1,
                                    ZVal.getNull(),
                                    env.callMethod(stmt, "getLine", ValidConstantPass.class)));
                }
            }
        }

        return null;
    }

    public static final Object CONST_class = "Psy\\CodeCleaner\\ValidConstantPass";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends NamespaceAwarePass.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\CodeCleaner\\ValidConstantPass")
                    .setLookup(
                            ValidConstantPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("currentScope", "namespace")
                    .setFilename("vendor/psy/psysh/src/CodeCleaner/ValidConstantPass.php")
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
