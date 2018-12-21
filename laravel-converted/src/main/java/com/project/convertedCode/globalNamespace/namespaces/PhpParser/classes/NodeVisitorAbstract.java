package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.NodeVisitor;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/NodeVisitorAbstract.php

*/

public class NodeVisitorAbstract extends RuntimeClassBase implements NodeVisitor {

    public NodeVisitorAbstract(RuntimeEnv env, Object... args) {
        super(env);
    }

    public NodeVisitorAbstract(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    public Object beforeTraverse(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        return ZVal.assign(ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object leaveNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    public Object afterTraverse(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        return ZVal.assign(ZVal.getNull());
    }

    public static final Object CONST_class = "PhpParser\\NodeVisitorAbstract";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\NodeVisitorAbstract")
                    .setLookup(
                            NodeVisitorAbstract.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/NodeVisitorAbstract.php")
                    .addInterface("PhpParser\\NodeVisitor")
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
