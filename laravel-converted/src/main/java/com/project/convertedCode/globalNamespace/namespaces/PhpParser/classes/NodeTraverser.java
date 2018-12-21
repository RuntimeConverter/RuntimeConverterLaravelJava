package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Node;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_splice;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Stmt;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.NodeTraverserInterface;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Expr;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/NodeTraverser.php

*/

public class NodeTraverser extends RuntimeClassBase implements NodeTraverserInterface {

    public Object visitors = null;

    public Object stopTraversal = null;

    public NodeTraverser(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NodeTraverser.class) {
            this.__construct(env, args);
        }
    }

    public NodeTraverser(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.visitors = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "visitor", typeHint = "PhpParser\\NodeVisitor")
    public Object addVisitor(RuntimeEnv env, Object... args) {
        Object visitor = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "visitors", env).arrayAppend(env).set(visitor);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "visitor", typeHint = "PhpParser\\NodeVisitor")
    public Object removeVisitor(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object visitor = assignParameter(args, 0, false);
        Object storedVisitor = null;
        Object index = null;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult859 : ZVal.getIterable(this.visitors, env, false)) {
            index = ZVal.assign(zpairResult859.getKey());
            storedVisitor = ZVal.assign(zpairResult859.getValue());
            if (ZVal.strictEqualityCheck(storedVisitor, "===", visitor)) {
                arrayActionR(
                        ArrayAction.UNSET,
                        new ReferenceClassProperty(this, "visitors", env),
                        env,
                        index);
                break;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    public Object traverse(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        Object visitor = null;
        Object _pReturn = null;
        this.stopTraversal = false;
        for (ZPair zpairResult860 : ZVal.getIterable(this.visitors, env, true)) {
            visitor = ZVal.assign(zpairResult860.getValue());
            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    _pReturn =
                            env.callMethod(
                                    visitor, "beforeTraverse", NodeTraverser.class, nodes))) {
                nodes = ZVal.assign(_pReturn);
            }
        }

        nodes = this.traverseArray(env, nodes);
        for (ZPair zpairResult861 : ZVal.getIterable(this.visitors, env, true)) {
            visitor = ZVal.assign(zpairResult861.getValue());
            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    _pReturn =
                            env.callMethod(visitor, "afterTraverse", NodeTraverser.class, nodes))) {
                nodes = ZVal.assign(_pReturn);
            }
        }

        return ZVal.assign(nodes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    protected Object traverseNode(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object node = assignParameter(args, 0, false);
        Object name = null;
        Object visitor = null;
        Object traverseChildren = null;
        Object _pReturn = null;
        ReferenceContainer subNode = new BasicReferenceContainer(null);
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult862 :
                ZVal.getIterable(
                        env.callMethod(node, "getSubNodeNames", NodeTraverser.class), env, true)) {
            name = ZVal.assign(zpairResult862.getValue());
            subNode = new ReferenceClassProperty(node, name, env);
            if (function_is_array.f.env(env).call(subNode.getObject()).getBool()) {
                subNode.setObject(this.traverseArray(env, subNode.getObject()));
                if (ZVal.isTrue(this.stopTraversal)) {
                    break;
                }

            } else if (ZVal.isTrue(
                    ZVal.checkInstanceType(subNode.getObject(), Node.class, "PhpParser\\Node"))) {
                traverseChildren = true;
                runtimeConverterBreakCount = 0;
                for (ZPair zpairResult863 : ZVal.getIterable(this.visitors, env, true)) {
                    visitor = ZVal.assign(zpairResult863.getValue());
                    _pReturn =
                            env.callMethod(
                                    visitor, "enterNode", NodeTraverser.class, subNode.getObject());
                    if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", _pReturn)) {
                        if (ZVal.isTrue(
                                ZVal.checkInstanceType(_pReturn, Node.class, "PhpParser\\Node"))) {
                            this.ensureReplacementReasonable(env, subNode.getObject(), _pReturn);
                            subNode.setObject(ZVal.assign(_pReturn));

                        } else if (ZVal.strictEqualityCheck(
                                CONST_DONT_TRAVERSE_CHILDREN, "===", _pReturn)) {
                            traverseChildren = false;

                        } else if (ZVal.strictEqualityCheck(
                                CONST_STOP_TRAVERSAL, "===", _pReturn)) {
                            this.stopTraversal = true;
                            runtimeConverterBreakCount = 2;
                            runtimeConverterBreakCount--;
                            break;

                        } else {
                            throw ZVal.getException(
                                    env,
                                    new LogicException(
                                            env,
                                            "enterNode() returned invalid value of type "
                                                    + toStringR(
                                                            NamespaceGlobal.gettype
                                                                    .env(env)
                                                                    .call(_pReturn)
                                                                    .value(),
                                                            env)));
                        }
                    }
                }

                if (ZVal.isTrue(traverseChildren)) {
                    subNode.setObject(this.traverseNode(env, subNode.getObject()));
                    if (ZVal.isTrue(this.stopTraversal)) {
                        break;
                    }
                }

                runtimeConverterBreakCount = 0;
                for (ZPair zpairResult864 : ZVal.getIterable(this.visitors, env, true)) {
                    visitor = ZVal.assign(zpairResult864.getValue());
                    _pReturn =
                            env.callMethod(
                                    visitor, "leaveNode", NodeTraverser.class, subNode.getObject());
                    if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", _pReturn)) {
                        if (ZVal.isTrue(
                                ZVal.checkInstanceType(_pReturn, Node.class, "PhpParser\\Node"))) {
                            this.ensureReplacementReasonable(env, subNode.getObject(), _pReturn);
                            subNode.setObject(ZVal.assign(_pReturn));

                        } else if (ZVal.strictEqualityCheck(
                                CONST_STOP_TRAVERSAL, "===", _pReturn)) {
                            this.stopTraversal = true;
                            runtimeConverterBreakCount = 2;
                            runtimeConverterBreakCount--;
                            break;

                        } else if (function_is_array.f.env(env).call(_pReturn).getBool()) {
                            throw ZVal.getException(
                                    env,
                                    new LogicException(
                                            env,
                                            "leaveNode() may only return an array "
                                                    + "if the parent structure is an array"));

                        } else {
                            throw ZVal.getException(
                                    env,
                                    new LogicException(
                                            env,
                                            "leaveNode() returned invalid value of type "
                                                    + toStringR(
                                                            NamespaceGlobal.gettype
                                                                    .env(env)
                                                                    .call(_pReturn)
                                                                    .value(),
                                                            env)));
                        }
                    }
                }
            }
        }

        return ZVal.assign(node);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    protected Object traverseArray(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object nodes = assignParameter(args, 0, false);
        ReferenceContainer node = new BasicReferenceContainer(null);
        Object runtimeTempArrayResult119 = null;
        Object replace = null;
        Object i = null;
        Object visitor = null;
        Object traverseChildren = null;
        ReferenceContainer doNodes = new BasicReferenceContainer(null);
        Object _pReturn = null;
        doNodes.setObject(ZVal.newArray());
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult865 : ZVal.getIterable(nodes, env, false)) {
            i = ZVal.assign(zpairResult865.getKey());
            node = zpairResult865;
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(node.getObject(), Node.class, "PhpParser\\Node"))) {
                traverseChildren = true;
                runtimeConverterBreakCount = 0;
                for (ZPair zpairResult866 : ZVal.getIterable(this.visitors, env, true)) {
                    visitor = ZVal.assign(zpairResult866.getValue());
                    _pReturn =
                            env.callMethod(
                                    visitor, "enterNode", NodeTraverser.class, node.getObject());
                    if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", _pReturn)) {
                        if (ZVal.isTrue(
                                ZVal.checkInstanceType(_pReturn, Node.class, "PhpParser\\Node"))) {
                            this.ensureReplacementReasonable(env, node.getObject(), _pReturn);
                            node.setObject(ZVal.assign(_pReturn));

                        } else if (ZVal.strictEqualityCheck(
                                CONST_DONT_TRAVERSE_CHILDREN, "===", _pReturn)) {
                            traverseChildren = false;

                        } else if (ZVal.strictEqualityCheck(
                                CONST_STOP_TRAVERSAL, "===", _pReturn)) {
                            this.stopTraversal = true;
                            runtimeConverterBreakCount = 2;
                            runtimeConverterBreakCount--;
                            break;

                        } else {
                            throw ZVal.getException(
                                    env,
                                    new LogicException(
                                            env,
                                            "enterNode() returned invalid value of type "
                                                    + toStringR(
                                                            NamespaceGlobal.gettype
                                                                    .env(env)
                                                                    .call(_pReturn)
                                                                    .value(),
                                                            env)));
                        }
                    }
                }

                if (ZVal.isTrue(traverseChildren)) {
                    node.setObject(this.traverseNode(env, node.getObject()));
                    if (ZVal.isTrue(this.stopTraversal)) {
                        break;
                    }
                }

                runtimeConverterBreakCount = 0;
                for (ZPair zpairResult867 : ZVal.getIterable(this.visitors, env, true)) {
                    visitor = ZVal.assign(zpairResult867.getValue());
                    _pReturn =
                            env.callMethod(
                                    visitor, "leaveNode", NodeTraverser.class, node.getObject());
                    if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", _pReturn)) {
                        if (ZVal.isTrue(
                                ZVal.checkInstanceType(_pReturn, Node.class, "PhpParser\\Node"))) {
                            this.ensureReplacementReasonable(env, node.getObject(), _pReturn);
                            node.setObject(ZVal.assign(_pReturn));

                        } else if (function_is_array.f.env(env).call(_pReturn).getBool()) {
                            doNodes.arrayAppend(env)
                                    .set(ZVal.newArray(new ZPair(0, i), new ZPair(1, _pReturn)));
                            break;

                        } else if (ZVal.strictEqualityCheck(CONST_REMOVE_NODE, "===", _pReturn)) {
                            doNodes.arrayAppend(env)
                                    .set(
                                            ZVal.newArray(
                                                    new ZPair(0, i),
                                                    new ZPair(1, ZVal.newArray())));
                            break;

                        } else if (ZVal.strictEqualityCheck(
                                CONST_STOP_TRAVERSAL, "===", _pReturn)) {
                            this.stopTraversal = true;
                            runtimeConverterBreakCount = 2;
                            runtimeConverterBreakCount--;
                            break;

                        } else if (ZVal.strictEqualityCheck(false, "===", _pReturn)) {
                            throw ZVal.getException(
                                    env,
                                    new LogicException(
                                            env,
                                            "bool(false) return from leaveNode() no longer supported. "
                                                    + "Return NodeTraverser::REMOVE_NODE instead"));

                        } else {
                            throw ZVal.getException(
                                    env,
                                    new LogicException(
                                            env,
                                            "leaveNode() returned invalid value of type "
                                                    + toStringR(
                                                            NamespaceGlobal.gettype
                                                                    .env(env)
                                                                    .call(_pReturn)
                                                                    .value(),
                                                            env)));
                        }
                    }
                }

            } else if (function_is_array.f.env(env).call(node.getObject()).getBool()) {
                throw ZVal.getException(
                        env,
                        new LogicException(env, "Invalid node structure: Contains nested arrays"));
            }
        }

        if (!ZVal.isEmpty(doNodes.getObject())) {
            runtimeConverterBreakCount = 0;
            while (ZVal.isTrue(
                    ZVal.list(
                            runtimeTempArrayResult119 =
                                    function_array_pop.f.env(env).call(doNodes.getObject()).value(),
                            (i = listGet(runtimeTempArrayResult119, 0, env)),
                            (replace = listGet(runtimeTempArrayResult119, 1, env))))) {
                function_array_splice.f.env(env).call(nodes, i, 1, replace);
            }
        }

        return ZVal.assign(nodes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "old")
    @ConvertedParameter(index = 1, name = "new")
    private Object ensureReplacementReasonable(RuntimeEnv env, Object... args) {
        Object old = assignParameter(args, 0, false);
        Object _pNew = assignParameter(args, 1, false);
        if (ZVal.toBool(ZVal.checkInstanceType(old, Stmt.class, "PhpParser\\Node\\Stmt"))
                && ZVal.toBool(
                        ZVal.checkInstanceType(_pNew, Expr.class, "PhpParser\\Node\\Expr"))) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            toStringR(
                                            "Trying to replace statement ("
                                                    + toStringR(
                                                            env.callMethod(
                                                                    old,
                                                                    "getType",
                                                                    NodeTraverser.class),
                                                            env)
                                                    + ") ",
                                            env)
                                    + toStringR(
                                            "with expression ("
                                                    + toStringR(
                                                            env.callMethod(
                                                                    _pNew,
                                                                    "getType",
                                                                    NodeTraverser.class),
                                                            env)
                                                    + "). Are you missing a ",
                                            env)
                                    + "Stmt_Expression wrapper?"));
        }

        if (ZVal.toBool(ZVal.checkInstanceType(old, Expr.class, "PhpParser\\Node\\Expr"))
                && ZVal.toBool(
                        ZVal.checkInstanceType(_pNew, Stmt.class, "PhpParser\\Node\\Stmt"))) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            toStringR(
                                            "Trying to replace expression ("
                                                    + toStringR(
                                                            env.callMethod(
                                                                    old,
                                                                    "getType",
                                                                    NodeTraverser.class),
                                                            env)
                                                    + ") ",
                                            env)
                                    + toStringR(
                                            "with statement ("
                                                    + toStringR(
                                                            env.callMethod(
                                                                    _pNew,
                                                                    "getType",
                                                                    NodeTraverser.class),
                                                            env)
                                                    + ")",
                                            env)));
        }

        return null;
    }

    public static final Object CONST_DONT_TRAVERSE_CHILDREN = 1;

    public static final Object CONST_STOP_TRAVERSAL = 2;

    public static final Object CONST_REMOVE_NODE = 3;

    public static final Object CONST_class = "PhpParser\\NodeTraverser";

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
                    .setName("PhpParser\\NodeTraverser")
                    .setLookup(
                            NodeTraverser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("stopTraversal", "visitors")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/NodeTraverser.php")
                    .addInterface("PhpParser\\NodeTraverserInterface")
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
