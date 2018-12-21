package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Name.classes.FullyQualified;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.CodeCleanerPass;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Name;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Namespace_;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/NamespaceAwarePass.php

*/

public abstract class NamespaceAwarePass extends CodeCleanerPass {

    public Object namespace = null;

    public Object currentScope = null;

    public NamespaceAwarePass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public NamespaceAwarePass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    public Object beforeTraverse(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        this.namespace = ZVal.newArray();
        this.currentScope = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
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
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getFullyQualifiedName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        name, FullyQualified.class, "PhpParser\\Node\\Name\\FullyQualified"))) {
            return ZVal.assign(
                    NamespaceGlobal.implode
                            .env(env)
                            .call("\\", toObjectR(name).accessProp(this, env).name("parts").value())
                            .value());

        } else if (ZVal.isTrue(ZVal.checkInstanceType(name, Name.class, "PhpParser\\Node\\Name"))) {
            name = ZVal.assign(toObjectR(name).accessProp(this, env).name("parts").value());

        } else if (!function_is_array.f.env(env).call(name).getBool()) {
            name = ZVal.newArray(new ZPair(0, name));
        }

        return ZVal.assign(
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                "\\",
                                function_array_merge.f.env(env).call(this.namespace, name).value())
                        .value());
    }

    public static final Object CONST_class = "Psy\\CodeCleaner\\NamespaceAwarePass";

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
                    .setName("Psy\\CodeCleaner\\NamespaceAwarePass")
                    .setLookup(
                            NamespaceAwarePass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("currentScope", "namespace")
                    .setFilename("vendor/psy/psysh/src/CodeCleaner/NamespaceAwarePass.php")
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
