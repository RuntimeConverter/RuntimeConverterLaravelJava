package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.FatalErrorException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.CodeCleanerPass;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Class_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Identifier;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.ClassMethod;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Namespace_;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/ValidConstructorPass.php

*/

public class ValidConstructorPass extends CodeCleanerPass {

    public Object namespace = null;

    public ValidConstructorPass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ValidConstructorPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    public Object beforeTraverse(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        this.namespace = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object constructor = null;
        Object stmt = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, Namespace_.class, "PhpParser\\Node\\Stmt\\Namespace_"))) {
            this.namespace =
                    ZVal.isset(toObjectR(node).accessProp(this, env).name("name").value())
                            ? toObjectR(node)
                                    .accessProp(this, env)
                                    .name("name")
                                    .getObject()
                                    .accessProp(this, env)
                                    .name("parts")
                                    .value()
                            : ZVal.newArray();

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(node, Class_.class, "PhpParser\\Node\\Stmt\\Class_"))) {
            constructor = ZVal.getNull();
            for (ZPair zpairResult1353 :
                    ZVal.getIterable(
                            toObjectR(node).accessProp(this, env).name("stmts").value(),
                            env,
                            true)) {
                stmt = ZVal.assign(zpairResult1353.getValue());
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                stmt, ClassMethod.class, "PhpParser\\Node\\Stmt\\ClassMethod"))) {
                    if (ZVal.strictEqualityCheck(
                            "__construct",
                            "===",
                            NamespaceGlobal.strtolower
                                    .env(env)
                                    .call(
                                            toObjectR(stmt)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value())
                                    .value())) {
                        this.validateConstructor(env, stmt, node);
                        return null;
                    }

                    if (ZVal.toBool(ZVal.isEmpty(this.namespace))
                            && ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            NamespaceGlobal.strtolower
                                                    .env(env)
                                                    .call(
                                                            toObjectR(node)
                                                                    .accessProp(this, env)
                                                                    .name("name")
                                                                    .value())
                                                    .value(),
                                            "===",
                                            NamespaceGlobal.strtolower
                                                    .env(env)
                                                    .call(
                                                            toObjectR(stmt)
                                                                    .accessProp(this, env)
                                                                    .name("name")
                                                                    .value())
                                                    .value()))) {
                        constructor = ZVal.assign(stmt);
                    }
                }
            }

            if (ZVal.isTrue(constructor)) {
                this.validateConstructor(env, constructor, node);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "constructor", typeHint = "PhpParser\\Node")
    @ConvertedParameter(index = 1, name = "classNode", typeHint = "PhpParser\\Node")
    private Object validateConstructor(RuntimeEnv env, Object... args) {
        Object constructor = assignParameter(args, 0, false);
        Object classNode = assignParameter(args, 1, false);
        Object msg = null;
        Object className = null;
        if (ZVal.isTrue(env.callMethod(constructor, "isStatic", ValidConstructorPass.class))) {
            className =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    toObjectR(classNode)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value(),
                                                    Identifier.class,
                                                    "PhpParser\\Node\\Identifier"))
                                    ? env.callMethod(
                                            toObjectR(classNode)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            "toString",
                                            ValidConstructorPass.class)
                                    : toObjectR(classNode)
                                            .accessProp(this, env)
                                            .name("name")
                                            .value());
            msg =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Constructor %s::%s() cannot be static",
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(
                                                    "\\",
                                                    function_array_merge
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    this.namespace,
                                                                    rToArrayCast(className))
                                                            .value())
                                            .value(),
                                    toObjectR(constructor)
                                            .accessProp(this, env)
                                            .name("name")
                                            .value())
                            .value();
            throw ZVal.getException(
                    env,
                    new FatalErrorException(
                            env,
                            msg,
                            0,
                            1,
                            ZVal.getNull(),
                            env.callMethod(classNode, "getLine", ValidConstructorPass.class)));
        }

        if (ZVal.toBool(
                        function_method_exists
                                .f
                                .env(env)
                                .call(constructor, "getReturnType")
                                .value())
                && ZVal.toBool(
                        env.callMethod(constructor, "getReturnType", ValidConstructorPass.class))) {
            className =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    toObjectR(classNode)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value(),
                                                    Identifier.class,
                                                    "PhpParser\\Node\\Identifier"))
                                    ? env.callMethod(
                                            toObjectR(classNode)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            "toString",
                                            ValidConstructorPass.class)
                                    : toObjectR(classNode)
                                            .accessProp(this, env)
                                            .name("name")
                                            .value());
            msg =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Constructor %s::%s() cannot declare a return type",
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(
                                                    "\\",
                                                    function_array_merge
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    this.namespace,
                                                                    rToArrayCast(className))
                                                            .value())
                                            .value(),
                                    toObjectR(constructor)
                                            .accessProp(this, env)
                                            .name("name")
                                            .value())
                            .value();
            throw ZVal.getException(
                    env,
                    new FatalErrorException(
                            env,
                            msg,
                            0,
                            1,
                            ZVal.getNull(),
                            env.callMethod(classNode, "getLine", ValidConstructorPass.class)));
        }

        return null;
    }

    public static final Object CONST_class = "Psy\\CodeCleaner\\ValidConstructorPass";

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
                    .setName("Psy\\CodeCleaner\\ValidConstructorPass")
                    .setLookup(
                            ValidConstructorPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("namespace")
                    .setFilename("vendor/psy/psysh/src/CodeCleaner/ValidConstructorPass.php")
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
}
