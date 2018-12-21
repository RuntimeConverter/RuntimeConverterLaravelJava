package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.String_;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Builder;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Node;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.DNumber;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Stmt;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Name;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ArrayItem;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Identifier;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Comment.classes.Doc;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Array_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Name.classes.Relative;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.LNumber;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Name.classes.FullyQualified;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.NullableType;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Class_;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Expr;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Expression;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ConstFetch;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_float;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/BuilderHelpers.php

*/

public final class BuilderHelpers extends RuntimeClassBase {

    public BuilderHelpers(RuntimeEnv env, Object... args) {
        super(env);
    }

    public BuilderHelpers(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "PhpParser\\BuilderHelpers";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "node")
        public Object normalizeNode(RuntimeEnv env, Object... args) {
            Object node = assignParameter(args, 0, false);
            if (ZVal.isTrue(ZVal.checkInstanceType(node, Builder.class, "PhpParser\\Builder"))) {
                return ZVal.assign(env.callMethod(node, "getNode", BuilderHelpers.class));

            } else if (ZVal.isTrue(ZVal.checkInstanceType(node, Node.class, "PhpParser\\Node"))) {
                return ZVal.assign(node);
            }

            throw ZVal.getException(
                    env, new LogicException(env, "Expected node or builder object"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "node")
        public Object normalizeStmt(RuntimeEnv env, Object... args) {
            Object node = assignParameter(args, 0, false);
            node = runtimeStaticObject.normalizeNode(env, node);
            if (ZVal.isTrue(ZVal.checkInstanceType(node, Stmt.class, "PhpParser\\Node\\Stmt"))) {
                return ZVal.assign(node);
            }

            if (ZVal.isTrue(ZVal.checkInstanceType(node, Expr.class, "PhpParser\\Node\\Expr"))) {
                return ZVal.assign(new Expression(env, node));
            }

            throw ZVal.getException(
                    env, new LogicException(env, "Expected statement or expression node"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object normalizeIdentifier(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            name, Identifier.class, "PhpParser\\Node\\Identifier"))) {
                return ZVal.assign(name);
            }

            if (function_is_string.f.env(env).call(name).getBool()) {
                return ZVal.assign(new Identifier(env, name));
            }

            throw ZVal.getException(
                    env,
                    new LogicException(
                            env, "Expected string or instance of Node\\Identifier or Node\\Expr"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object normalizeIdentifierOrExpr(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    name, Identifier.class, "PhpParser\\Node\\Identifier"))
                    || ZVal.toBool(
                            ZVal.checkInstanceType(name, Expr.class, "PhpParser\\Node\\Expr"))) {
                return ZVal.assign(name);
            }

            if (function_is_string.f.env(env).call(name).getBool()) {
                return ZVal.assign(new Identifier(env, name));
            }

            throw ZVal.getException(
                    env,
                    new LogicException(
                            env, "Expected string or instance of Node\\Identifier or Node\\Expr"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object normalizeName(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(runtimeStaticObject.normalizeNameCommon(env, name, false));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object normalizeNameOrExpr(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(runtimeStaticObject.normalizeNameCommon(env, name, true));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "allowExpr", typeHint = "bool")
        private Object normalizeNameCommon(RuntimeEnv env, Object... args) {
            ReferenceContainer name = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object allowExpr = assignParameter(args, 1, false);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            name.getObject(), Name.class, "PhpParser\\Node\\Name"))) {
                return ZVal.assign(name.getObject());

            } else if (function_is_string.f.env(env).call(name.getObject()).getBool()) {
                if (!ZVal.isTrue(name.getObject())) {
                    throw ZVal.getException(env, new LogicException(env, "Name cannot be empty"));
                }

                if (ZVal.strictEqualityCheck(name.arrayGet(env, 0), "===", "\\")) {
                    return ZVal.assign(
                            new FullyQualified(
                                    env,
                                    function_substr.f.env(env).call(name.getObject(), 1).value()));

                } else if (ZVal.strictEqualityCheck(
                        0,
                        "===",
                        function_strpos.f.env(env).call(name.getObject(), "namespace\\").value())) {
                    return ZVal.assign(
                            new Relative(
                                    env,
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    name.getObject(),
                                                    function_strlen
                                                            .f
                                                            .env(env)
                                                            .call("namespace\\")
                                                            .value())
                                            .value()));

                } else {
                    return ZVal.assign(new Name(env, name.getObject()));
                }
            }

            if (ZVal.isTrue(allowExpr)) {
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                name.getObject(), Expr.class, "PhpParser\\Node\\Expr"))) {
                    return ZVal.assign(name.getObject());
                }

                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                "Name must be a string or an instance of Node\\Name or Node\\Expr"));

            } else {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env, "Name must be a string or an instance of Node\\Name"));
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type")
        public Object normalizeType(RuntimeEnv env, Object... args) {
            ReferenceContainer type = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object nullable = null;
            Object lowerType = null;
            Object builtinTypes = null;
            if (!function_is_string.f.env(env).call(type.getObject()).getBool()) {
                if (ZVal.toBool(
                                ZVal.toBool(
                                                !ZVal.isTrue(
                                                        ZVal.checkInstanceType(
                                                                type.getObject(),
                                                                Name.class,
                                                                "PhpParser\\Node\\Name")))
                                        && ZVal.toBool(
                                                !ZVal.isTrue(
                                                        ZVal.checkInstanceType(
                                                                type.getObject(),
                                                                Identifier.class,
                                                                "PhpParser\\Node\\Identifier"))))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                type.getObject(),
                                                NullableType.class,
                                                "PhpParser\\Node\\NullableType")))) {
                    throw ZVal.getException(
                            env,
                            new LogicException(
                                    env,
                                    "Type must be a string, or an instance of Name, Identifier or NullableType"));
                }

                return ZVal.assign(type.getObject());
            }

            nullable = false;
            if (ZVal.toBool(
                            ZVal.isGreaterThan(
                                    function_strlen.f.env(env).call(type.getObject()).value(),
                                    '>',
                                    0))
                    && ZVal.toBool(ZVal.strictEqualityCheck(type.arrayGet(env, 0), "===", "?"))) {
                nullable = true;
                type.setObject(function_substr.f.env(env).call(type.getObject(), 1).value());
            }

            builtinTypes =
                    ZVal.arrayFromList(
                            "array",
                            "callable",
                            "string",
                            "int",
                            "float",
                            "bool",
                            "iterable",
                            "void",
                            "object");
            lowerType = NamespaceGlobal.strtolower.env(env).call(type.getObject()).value();
            if (function_in_array.f.env(env).call(lowerType, builtinTypes).getBool()) {
                type.setObject(new Identifier(env, lowerType));

            } else {
                type.setObject(runtimeStaticObject.normalizeName(env, type.getObject()));
            }

            if (ZVal.toBool(nullable)
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    toStringR(type.getObject(), env), "===", "void"))) {
                throw ZVal.getException(
                        env, new LogicException(env, "void type cannot be nullable"));
            }

            return ZVal.assign(
                    ZVal.isTrue(nullable)
                            ? new NullableType(env, type.getObject())
                            : type.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object normalizeValue(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object itemValue = null;
            ReferenceContainer lastKey = new BasicReferenceContainer(null);
            ReferenceContainer items = new BasicReferenceContainer(null);
            Object itemKey = null;
            if (ZVal.isTrue(ZVal.checkInstanceType(value, Expr.class, "PhpParser\\Node\\Expr"))) {
                return ZVal.assign(value);

            } else if (function_is_null.f.env(env).call(value).getBool()) {
                return ZVal.assign(new ConstFetch(env, new Name(env, "null")));

            } else if (function_is_bool.f.env(env).call(value).getBool()) {
                return ZVal.assign(
                        new ConstFetch(env, new Name(env, ZVal.isTrue(value) ? "true" : "false")));

            } else if (function_is_int.f.env(env).call(value).getBool()) {
                return ZVal.assign(new LNumber(env, value));

            } else if (function_is_float.f.env(env).call(value).getBool()) {
                return ZVal.assign(new DNumber(env, value));

            } else if (function_is_string.f.env(env).call(value).getBool()) {
                return ZVal.assign(new String_(env, value));

            } else if (function_is_array.f.env(env).call(value).getBool()) {
                items.setObject(ZVal.newArray());
                lastKey.setObject(-1);
                for (ZPair zpairResult845 : ZVal.getIterable(value, env, false)) {
                    itemKey = ZVal.assign(zpairResult845.getKey());
                    itemValue = ZVal.assign(zpairResult845.getValue());
                    if (ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            ZVal.getNull(), "!==", lastKey.getObject()))
                            && ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            ZVal.preIncrement(lastKey), "===", itemKey))) {
                        items.arrayAppend(env)
                                .set(
                                        new ArrayItem(
                                                env,
                                                runtimeStaticObject.normalizeValue(
                                                        env, itemValue)));

                    } else {
                        lastKey.setObject(ZVal.getNull());
                        items.arrayAppend(env)
                                .set(
                                        new ArrayItem(
                                                env,
                                                runtimeStaticObject.normalizeValue(env, itemValue),
                                                runtimeStaticObject.normalizeValue(env, itemKey)));
                    }
                }

                return ZVal.assign(new Array_(env, items.getObject()));

            } else {
                throw ZVal.getException(env, new LogicException(env, "Invalid value"));
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "docComment")
        public Object normalizeDocComment(RuntimeEnv env, Object... args) {
            Object docComment = assignParameter(args, 0, false);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(docComment, Doc.class, "PhpParser\\Comment\\Doc"))) {
                return ZVal.assign(docComment);

            } else if (function_is_string.f.env(env).call(docComment).getBool()) {
                return ZVal.assign(new Doc(env, docComment));

            } else {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                "Doc comment must be a string or an instance of PhpParser\\Comment\\Doc"));
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "modifiers", typeHint = "int")
        @ConvertedParameter(index = 1, name = "modifier", typeHint = "int")
        public Object addModifier(RuntimeEnv env, Object... args) {
            Object modifiers = assignParameter(args, 0, false);
            Object modifier = assignParameter(args, 1, false);
            Class_.runtimeStaticObject.verifyModifier(env, modifiers, modifier);
            return ZVal.assign(ZVal.toLong(modifiers) | ZVal.toLong(modifier));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\BuilderHelpers")
                    .setLookup(
                            BuilderHelpers.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/BuilderHelpers.php")
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
