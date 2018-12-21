package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Node;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.GroupUse;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Comment;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Include_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.UseUse;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Use_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Class_;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/NodeDumper.php

*/

public class NodeDumper extends RuntimeClassBase {

    public Object dumpComments = null;

    public Object dumpPositions = null;

    public Object code = null;

    public NodeDumper(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NodeDumper.class) {
            this.__construct(env, args);
        }
    }

    public NodeDumper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        this.dumpComments = !arrayActionR(ArrayAction.EMPTY, options, env, "dumpComments");
        this.dumpPositions = !arrayActionR(ArrayAction.EMPTY, options, env, "dumpPositions");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node")
    @ConvertedParameter(
        index = 1,
        name = "code",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object dump(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object code = assignParameter(args, 1, true);
        if (null == code) {
            code = ZVal.getNull();
        }
        this.code = code;
        return ZVal.assign(this.dumpRecursive(env, node));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node")
    protected Object dumpRecursive(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object p = null;
        Object r = null;
        Object comments = null;
        Object value = null;
        Object key = null;
        if (ZVal.isTrue(ZVal.checkInstanceType(node, Node.class, "PhpParser\\Node"))) {
            r = env.callMethod(node, "getType", NodeDumper.class);
            if (ZVal.toBool(this.dumpPositions)
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    ZVal.getNull(), "!==", p = this.dumpPosition(env, node)))) {
                r = toStringR(r, env) + toStringR(p, env);
            }

            r = toStringR(r, env) + "(";
            for (ZPair zpairResult857 :
                    ZVal.getIterable(
                            env.callMethod(node, "getSubNodeNames", NodeDumper.class), env, true)) {
                key = ZVal.assign(zpairResult857.getValue());
                r = toStringR(r, env) + "\n    " + toStringR(key, env) + ": ";
                value = ZVal.assign(toObjectR(node).accessProp(this, env).name(key).value());
                if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", value)) {
                    r = toStringR(r, env) + "null";

                } else if (ZVal.strictEqualityCheck(false, "===", value)) {
                    r = toStringR(r, env) + "false";

                } else if (ZVal.strictEqualityCheck(true, "===", value)) {
                    r = toStringR(r, env) + "true";

                } else if (function_is_scalar.f.env(env).call(value).getBool()) {
                    if (ZVal.toBool(ZVal.strictEqualityCheck("flags", "===", key))
                            || ZVal.toBool(ZVal.strictEqualityCheck("newModifier", "===", key))) {
                        r = toStringR(r, env) + toStringR(this.dumpFlags(env, value), env);

                    } else if (ZVal.toBool(ZVal.strictEqualityCheck("type", "===", key))
                            && ZVal.toBool(
                                    ZVal.checkInstanceType(
                                            node,
                                            Include_.class,
                                            "PhpParser\\Node\\Expr\\Include_"))) {
                        r = toStringR(r, env) + toStringR(this.dumpIncludeType(env, value), env);

                    } else if (ZVal.toBool(ZVal.strictEqualityCheck("type", "===", key))
                            && ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.toBool(
                                                                    ZVal.checkInstanceType(
                                                                            node,
                                                                            Use_.class,
                                                                            "PhpParser\\Node\\Stmt\\Use_"))
                                                            || ZVal.toBool(
                                                                    ZVal.checkInstanceType(
                                                                            node,
                                                                            UseUse.class,
                                                                            "PhpParser\\Node\\Stmt\\UseUse")))
                                            || ZVal.toBool(
                                                    ZVal.checkInstanceType(
                                                            node,
                                                            GroupUse.class,
                                                            "PhpParser\\Node\\Stmt\\GroupUse")))) {
                        r = toStringR(r, env) + toStringR(this.dumpUseType(env, value), env);

                    } else {
                        r = toStringR(r, env) + toStringR(value, env);
                    }

                } else {
                    r =
                            toStringR(r, env)
                                    + toStringR(
                                            function_str_replace
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "\n",
                                                            "\n    ",
                                                            this.dumpRecursive(env, value))
                                                    .value(),
                                            env);
                }
            }

            if (ZVal.toBool(this.dumpComments)
                    && ZVal.toBool(
                            comments = env.callMethod(node, "getComments", NodeDumper.class))) {
                r =
                        toStringR(r, env)
                                + "\n    comments: "
                                + toStringR(
                                        function_str_replace
                                                .f
                                                .env(env)
                                                .call(
                                                        "\n",
                                                        "\n    ",
                                                        this.dumpRecursive(env, comments))
                                                .value(),
                                        env);
            }

        } else if (function_is_array.f.env(env).call(node).getBool()) {
            r = "array(";
            for (ZPair zpairResult858 : ZVal.getIterable(node, env, false)) {
                key = ZVal.assign(zpairResult858.getKey());
                value = ZVal.assign(zpairResult858.getValue());
                r = toStringR(r, env) + "\n    " + toStringR(key, env) + ": ";
                if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", value)) {
                    r = toStringR(r, env) + "null";

                } else if (ZVal.strictEqualityCheck(false, "===", value)) {
                    r = toStringR(r, env) + "false";

                } else if (ZVal.strictEqualityCheck(true, "===", value)) {
                    r = toStringR(r, env) + "true";

                } else if (function_is_scalar.f.env(env).call(value).getBool()) {
                    r = toStringR(r, env) + toStringR(value, env);

                } else {
                    r =
                            toStringR(r, env)
                                    + toStringR(
                                            function_str_replace
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "\n",
                                                            "\n    ",
                                                            this.dumpRecursive(env, value))
                                                    .value(),
                                            env);
                }
            }

        } else if (ZVal.isTrue(ZVal.checkInstanceType(node, Comment.class, "PhpParser\\Comment"))) {
            return ZVal.assign(env.callMethod(node, "getReformattedText", NodeDumper.class));

        } else {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "Can only dump nodes and arrays."));
        }

        return ZVal.assign(toStringR(r, env) + "\n)");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flags")
    protected Object dumpFlags(RuntimeEnv env, Object... args) {
        Object flags = assignParameter(args, 0, false);
        ReferenceContainer strs = new BasicReferenceContainer(null);
        strs.setObject(ZVal.newArray());
        if (ZVal.isTrue(ZVal.toLong(flags) & ZVal.toLong(Class_.CONST_MODIFIER_PUBLIC))) {
            strs.arrayAppend(env).set("MODIFIER_PUBLIC");
        }

        if (ZVal.isTrue(ZVal.toLong(flags) & ZVal.toLong(Class_.CONST_MODIFIER_PROTECTED))) {
            strs.arrayAppend(env).set("MODIFIER_PROTECTED");
        }

        if (ZVal.isTrue(ZVal.toLong(flags) & ZVal.toLong(Class_.CONST_MODIFIER_PRIVATE))) {
            strs.arrayAppend(env).set("MODIFIER_PRIVATE");
        }

        if (ZVal.isTrue(ZVal.toLong(flags) & ZVal.toLong(Class_.CONST_MODIFIER_ABSTRACT))) {
            strs.arrayAppend(env).set("MODIFIER_ABSTRACT");
        }

        if (ZVal.isTrue(ZVal.toLong(flags) & ZVal.toLong(Class_.CONST_MODIFIER_STATIC))) {
            strs.arrayAppend(env).set("MODIFIER_STATIC");
        }

        if (ZVal.isTrue(ZVal.toLong(flags) & ZVal.toLong(Class_.CONST_MODIFIER_FINAL))) {
            strs.arrayAppend(env).set("MODIFIER_FINAL");
        }

        if (ZVal.isTrue(strs.getObject())) {
            return ZVal.assign(
                    toStringR(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(" | ", strs.getObject())
                                            .value(),
                                    env)
                            + " ("
                            + toStringR(flags, env)
                            + ")");

        } else {
            return ZVal.assign(flags);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    protected Object dumpIncludeType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        ReferenceContainer map = new BasicReferenceContainer(null);
        map.setObject(
                ZVal.newArray(
                        new ZPair(Include_.CONST_TYPE_INCLUDE, "TYPE_INCLUDE"),
                        new ZPair(Include_.CONST_TYPE_INCLUDE_ONCE, "TYPE_INCLUDE_ONCE"),
                        new ZPair(Include_.CONST_TYPE_REQUIRE, "TYPE_REQUIRE"),
                        new ZPair(Include_.CONST_TYPE_REQUIRE_ONCE, "TYPE_REQUIRE_ONCE")));
        if (!arrayActionR(ArrayAction.ISSET, map, env, type)) {
            return ZVal.assign(type);
        }

        return ZVal.assign(
                toStringR(map.arrayGet(env, type), env) + " (" + toStringR(type, env) + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    protected Object dumpUseType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        ReferenceContainer map = new BasicReferenceContainer(null);
        map.setObject(
                ZVal.newArray(
                        new ZPair(Use_.CONST_TYPE_UNKNOWN, "TYPE_UNKNOWN"),
                        new ZPair(Use_.CONST_TYPE_NORMAL, "TYPE_NORMAL"),
                        new ZPair(Use_.CONST_TYPE_FUNCTION, "TYPE_FUNCTION"),
                        new ZPair(Use_.CONST_TYPE_CONSTANT, "TYPE_CONSTANT")));
        if (!arrayActionR(ArrayAction.ISSET, map, env, type)) {
            return ZVal.assign(type);
        }

        return ZVal.assign(
                toStringR(map.arrayGet(env, type), env) + " (" + toStringR(type, env) + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    protected Object dumpPosition(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object start = null;
        Object end = null;
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        node, "hasAttribute", NodeDumper.class, "startLine")))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        node, "hasAttribute", NodeDumper.class, "endLine")))) {
            return ZVal.assign(ZVal.getNull());
        }

        start = env.callMethod(node, "getStartLine", NodeDumper.class);
        end = env.callMethod(node, "getEndLine", NodeDumper.class);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        env.callMethod(
                                                node,
                                                "hasAttribute",
                                                NodeDumper.class,
                                                "startFilePos"))
                                && ZVal.toBool(
                                        env.callMethod(
                                                node,
                                                "hasAttribute",
                                                NodeDumper.class,
                                                "endFilePos")))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.code))) {
            start =
                    toStringR(start, env)
                            + ":"
                            + toStringR(
                                    this.toColumn(
                                            env,
                                            this.code,
                                            env.callMethod(
                                                    node, "getStartFilePos", NodeDumper.class)),
                                    env);
            end =
                    toStringR(end, env)
                            + ":"
                            + toStringR(
                                    this.toColumn(
                                            env,
                                            this.code,
                                            env.callMethod(
                                                    node, "getEndFilePos", NodeDumper.class)),
                                    env);
        }

        return ZVal.assign("[" + toStringR(start, env) + " - " + toStringR(end, env) + "]");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(index = 1, name = "pos")
    private Object toColumn(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object pos = assignParameter(args, 1, false);
        Object lineStartPos = null;
        if (ZVal.isGreaterThan(pos, '>', function_strlen.f.env(env).call(code).value())) {
            throw ZVal.getException(env, new RuntimeException(env, "Invalid position information"));
        }

        lineStartPos =
                NamespaceGlobal.strrpos
                        .env(env)
                        .call(
                                code,
                                "\n",
                                ZVal.subtract(pos, function_strlen.f.env(env).call(code).value()))
                        .value();
        if (ZVal.strictEqualityCheck(false, "===", lineStartPos)) {
            lineStartPos = -1;
        }

        return ZVal.assign(ZVal.subtract(pos, lineStartPos));
    }

    public static final Object CONST_class = "PhpParser\\NodeDumper";

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
                    .setName("PhpParser\\NodeDumper")
                    .setLookup(
                            NodeDumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("code", "dumpComments", "dumpPositions")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/NodeDumper.php")
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
