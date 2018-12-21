package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Variable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.FatalErrorException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.CodeCleanerPass;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Assign;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/AssignThisVariablePass.php

*/

public class AssignThisVariablePass extends CodeCleanerPass {

    public AssignThisVariablePass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public AssignThisVariablePass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                node,
                                                Assign.class,
                                                "PhpParser\\Node\\Expr\\Assign"))
                                && ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("var")
                                                        .value(),
                                                Variable.class,
                                                "PhpParser\\Node\\Expr\\Variable")))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                toObjectR(node)
                                        .accessProp(this, env)
                                        .name("var")
                                        .getObject()
                                        .accessProp(this, env)
                                        .name("name")
                                        .value(),
                                "===",
                                "this"))) {
            throw ZVal.getException(
                    env,
                    new FatalErrorException(
                            env,
                            "Cannot re-assign $this",
                            0,
                            1,
                            ZVal.getNull(),
                            env.callMethod(node, "getLine", AssignThisVariablePass.class)));
        }

        return null;
    }

    public static final Object CONST_class = "Psy\\CodeCleaner\\AssignThisVariablePass";

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
                    .setName("Psy\\CodeCleaner\\AssignThisVariablePass")
                    .setLookup(
                            AssignThisVariablePass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/CodeCleaner/AssignThisVariablePass.php")
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
