package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.CodeCleanerPass;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Namespace_;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/NamespacePass.php

*/

public class NamespacePass extends CodeCleanerPass {

    public Object namespace = ZVal.getNull();

    public Object cleaner = null;

    public NamespacePass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NamespacePass.class) {
            this.__construct(env, args);
        }
    }

    public NamespacePass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cleaner", typeHint = "Psy\\CodeCleaner")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object cleaner = assignParameter(args, 0, false);
        this.cleaner = cleaner;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    public Object beforeTraverse(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        Object last = null;
        Object kind = null;
        if (ZVal.isEmpty(nodes)) {
            return ZVal.assign(nodes);
        }

        last = function_end.f.env(env).call(nodes).value();
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        last, Namespace_.class, "PhpParser\\Node\\Stmt\\Namespace_"))) {
            kind = env.callMethod(last, "getAttribute", NamespacePass.class, "kind");
            if (ZVal.toBool(ZVal.strictEqualityCheck(kind, "===", ZVal.getNull()))
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    kind, "===", Namespace_.CONST_KIND_SEMICOLON))) {
                this.setNamespace(env, toObjectR(last).accessProp(this, env).name("name").value());

            } else {
                this.setNamespace(env, ZVal.getNull());
            }

            return ZVal.assign(nodes);
        }

        return ZVal.assign(
                ZVal.isTrue(this.namespace)
                        ? ZVal.newArray(new ZPair(0, new Namespace_(env, this.namespace, nodes)))
                        : nodes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    private Object setNamespace(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, false);
        this.namespace = namespace;
        env.callMethod(
                this.cleaner,
                "setNamespace",
                NamespacePass.class,
                ZVal.strictEqualityCheck(namespace, "===", ZVal.getNull())
                        ? ZVal.getNull()
                        : toObjectR(namespace).accessProp(this, env).name("parts").value());
        return null;
    }

    public static final Object CONST_class = "Psy\\CodeCleaner\\NamespacePass";

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
                    .setName("Psy\\CodeCleaner\\NamespacePass")
                    .setLookup(
                            NamespacePass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cleaner", "namespace")
                    .setFilename("vendor/psy/psysh/src/CodeCleaner/NamespacePass.php")
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
