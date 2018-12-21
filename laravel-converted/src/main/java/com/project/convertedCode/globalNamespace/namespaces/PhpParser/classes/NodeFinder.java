package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.NodeTraverser;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.NodeVisitor.classes.FirstFindingVisitor;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.NodeVisitor.classes.FindingVisitor;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/NodeFinder.php

*/

public class NodeFinder extends RuntimeClassBase {

    public NodeFinder(RuntimeEnv env, Object... args) {
        super(env);
    }

    public NodeFinder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes")
    @ConvertedParameter(index = 1, name = "filter", typeHint = "callable")
    public Object find(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        Object filter = assignParameter(args, 1, false);
        Object traverser = null;
        Object visitor = null;
        if (!function_is_array.f.env(env).call(nodes).getBool()) {
            nodes = ZVal.newArray(new ZPair(0, nodes));
        }

        visitor = new FindingVisitor(env, filter);
        traverser = new NodeTraverser(env);
        env.callMethod(traverser, "addVisitor", NodeFinder.class, visitor);
        env.callMethod(traverser, "traverse", NodeFinder.class, nodes);
        return ZVal.assign(env.callMethod(visitor, "getFoundNodes", NodeFinder.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes")
    @ConvertedParameter(index = 1, name = "class", typeHint = "string")
    public Object findInstanceOf(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/nikic/php-parser/lib/PhpParser")
                        .setFile("/vendor/nikic/php-parser/lib/PhpParser/NodeFinder.php");
        Object nodes = assignParameter(args, 0, false);
        Object _pClass = assignParameter(args, 1, false);
        return ZVal.assign(
                this.find(
                        env,
                        nodes,
                        new Closure(
                                env, runtimeConverterFunctionClassConstants, "PhpParser", this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "node")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object node = assignParameter(args, 0, false);
                                Object _pClass = null;
                                _pClass = this.contextReferences.getCapturedValue("class");
                                return ZVal.assign(ZVal.checkInstanceTypeMatch(node, _pClass));
                            }
                        }.use("class", _pClass)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes")
    @ConvertedParameter(index = 1, name = "filter", typeHint = "callable")
    public Object findFirst(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        Object filter = assignParameter(args, 1, false);
        Object traverser = null;
        Object visitor = null;
        if (!function_is_array.f.env(env).call(nodes).getBool()) {
            nodes = ZVal.newArray(new ZPair(0, nodes));
        }

        visitor = new FirstFindingVisitor(env, filter);
        traverser = new NodeTraverser(env);
        env.callMethod(traverser, "addVisitor", NodeFinder.class, visitor);
        env.callMethod(traverser, "traverse", NodeFinder.class, nodes);
        return ZVal.assign(env.callMethod(visitor, "getFoundNode", NodeFinder.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes")
    @ConvertedParameter(index = 1, name = "class", typeHint = "string")
    public Object findFirstInstanceOf(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/nikic/php-parser/lib/PhpParser")
                        .setFile("/vendor/nikic/php-parser/lib/PhpParser/NodeFinder.php");
        Object nodes = assignParameter(args, 0, false);
        Object _pClass = assignParameter(args, 1, false);
        return ZVal.assign(
                this.findFirst(
                        env,
                        nodes,
                        new Closure(
                                env, runtimeConverterFunctionClassConstants, "PhpParser", this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "node")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object node = assignParameter(args, 0, false);
                                Object _pClass = null;
                                _pClass = this.contextReferences.getCapturedValue("class");
                                return ZVal.assign(ZVal.checkInstanceTypeMatch(node, _pClass));
                            }
                        }.use("class", _pClass)));
    }

    public static final Object CONST_class = "PhpParser\\NodeFinder";

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
                    .setName("PhpParser\\NodeFinder")
                    .setLookup(
                            NodeFinder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/NodeFinder.php")
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
