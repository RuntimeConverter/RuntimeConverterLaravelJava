package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.NodeVisitor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.NodeVisitorAbstract;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.NodeTraverser;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/NodeVisitor/FirstFindingVisitor.php

*/

public class FirstFindingVisitor extends NodeVisitorAbstract {

    public Object filterCallback = null;

    public Object foundNode = null;

    public FirstFindingVisitor(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FirstFindingVisitor.class) {
            this.__construct(env, args);
        }
    }

    public FirstFindingVisitor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filterCallback", typeHint = "callable")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object filterCallback = assignParameter(args, 0, false);
        this.filterCallback = filterCallback;
        return null;
    }

    @ConvertedMethod
    public Object getFoundNode(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.foundNode);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    public Object beforeTraverse(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        this.foundNode = ZVal.getNull();
        return ZVal.assign(ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        ReferenceContainer node = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object filterCallback = null;
        filterCallback = ZVal.assign(this.filterCallback);
        if (env.callFunctionDynamic(
                        filterCallback,
                        new RuntimeArgsWithReferences().add(0, node),
                        node.getObject())
                .getBool()) {
            this.foundNode = node.getObject();
            return ZVal.assign(NodeTraverser.CONST_STOP_TRAVERSAL);
        }

        return ZVal.assign(ZVal.getNull());
    }

    public static final Object CONST_class = "PhpParser\\NodeVisitor\\FirstFindingVisitor";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends NodeVisitorAbstract.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\NodeVisitor\\FirstFindingVisitor")
                    .setLookup(
                            FirstFindingVisitor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filterCallback", "foundNode")
                    .setFilename(
                            "vendor/nikic/php-parser/lib/PhpParser/NodeVisitor/FirstFindingVisitor.php")
                    .addInterface("PhpParser\\NodeVisitor")
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
