package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.FatalErrorException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.CodeCleanerPass;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Class_;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.ClassMethod;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/AbstractClassPass.php

*/

public class AbstractClassPass extends CodeCleanerPass {

    public Object _pClass = null;

    public Object abstractMethods = null;

    public AbstractClassPass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public AbstractClassPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object msg = null;
        Object name = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(node, Class_.class, "PhpParser\\Node\\Stmt\\Class_"))) {
            this._pClass = node;
            this.abstractMethods = ZVal.newArray();

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, ClassMethod.class, "PhpParser\\Node\\Stmt\\ClassMethod"))) {
            if (ZVal.isTrue(env.callMethod(node, "isAbstract", AbstractClassPass.class))) {
                name =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%s::%s",
                                        toObjectR(this._pClass)
                                                .accessProp(this, env)
                                                .name("name")
                                                .value(),
                                        toObjectR(node).accessProp(this, env).name("name").value())
                                .value();
                new ReferenceClassProperty(this, "abstractMethods", env).arrayAppend(env).set(name);
                if (ZVal.strictNotEqualityCheck(
                        toObjectR(node).accessProp(this, env).name("stmts").value(),
                        "!==",
                        ZVal.getNull())) {
                    msg =
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Abstract function %s cannot contain body", name)
                                    .value();
                    throw ZVal.getException(
                            env,
                            new FatalErrorException(
                                    env,
                                    msg,
                                    0,
                                    1,
                                    ZVal.getNull(),
                                    env.callMethod(node, "getLine", AbstractClassPass.class)));
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object leaveNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object msg = null;
        Object count = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(node, Class_.class, "PhpParser\\Node\\Stmt\\Class_"))) {
            count = function_count.f.env(env).call(this.abstractMethods).value();
            if (ZVal.toBool(ZVal.isGreaterThan(count, '>', 0))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(node, "isAbstract", AbstractClassPass.class)))) {
                msg =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Class %s contains %d abstract method%s must therefore be declared abstract or implement the remaining methods (%s)",
                                        toObjectR(node).accessProp(this, env).name("name").value(),
                                        count,
                                        ZVal.strictEqualityCheck(count, "===", 1) ? "" : "s",
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call(", ", this.abstractMethods)
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
                                env.callMethod(node, "getLine", AbstractClassPass.class)));
            }
        }

        return null;
    }

    public static final Object CONST_class = "Psy\\CodeCleaner\\AbstractClassPass";

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
                    .setName("Psy\\CodeCleaner\\AbstractClassPass")
                    .setLookup(
                            AbstractClassPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("abstractMethods", "class")
                    .setFilename("vendor/psy/psysh/src/CodeCleaner/AbstractClassPass.php")
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
