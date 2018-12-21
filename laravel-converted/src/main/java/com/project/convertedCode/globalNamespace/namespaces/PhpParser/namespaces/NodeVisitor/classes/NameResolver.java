package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.NodeVisitor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Closure;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Catch_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Instanceof_;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Name;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.TraitUse;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Const_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.ClassMethod;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.ErrorHandler.classes.Throwing;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Namespace_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.GroupUse;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.NodeVisitorAbstract;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.NameContext;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Name.classes.FullyQualified;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Interface_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.NullableType;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Use_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.StaticPropertyFetch;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.FuncCall;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Class_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ClassConstFetch;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Function_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ConstFetch;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Trait_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.StaticCall;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.New_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.namespaces.TraitUseAdaptation.classes.Precedence;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/NodeVisitor/NameResolver.php

*/

public class NameResolver extends NodeVisitorAbstract {

    public Object nameContext = null;

    public Object preserveOriginalNames = null;

    public Object replaceNodes = null;

    public NameResolver(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NameResolver.class) {
            this.__construct(env, args);
        }
    }

    public NameResolver(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "errorHandler",
        typeHint = "PhpParser\\ErrorHandler",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object errorHandler = assignParameter(args, 0, true);
        if (null == errorHandler) {
            errorHandler = ZVal.getNull();
        }
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object ternaryExpressionTemp = null;
        this.nameContext =
                new NameContext(
                        env,
                        ZVal.isDefined(ternaryExpressionTemp = errorHandler)
                                ? ternaryExpressionTemp
                                : new Throwing(env));
        this.preserveOriginalNames =
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        options.arrayGet(env, "preserveOriginalNames"))
                        ? ternaryExpressionTemp
                        : false;
        this.replaceNodes =
                ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "replaceNodes"))
                        ? ternaryExpressionTemp
                        : true;
        return null;
    }

    @ConvertedMethod
    public Object getNameContext(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.nameContext);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    public Object beforeTraverse(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        env.callMethod(this.nameContext, "startNamespace", NameResolver.class);
        return ZVal.assign(ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object _pConst = null;
        Object use = null;
        ReferenceContainer insteadof = new BasicReferenceContainer(null);
        ReferenceContainer trait = new BasicReferenceContainer(null);
        Object adaptation = null;
        ReferenceContainer _pInterface = new BasicReferenceContainer(null);
        ReferenceContainer type = new BasicReferenceContainer(null);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, Namespace_.class, "PhpParser\\Node\\Stmt\\Namespace_"))) {
            env.callMethod(
                    this.nameContext,
                    "startNamespace",
                    NameResolver.class,
                    toObjectR(node).accessProp(this, env).name("name").value());

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(node, Use_.class, "PhpParser\\Node\\Stmt\\Use_"))) {
            for (ZPair zpairResult868 :
                    ZVal.getIterable(
                            toObjectR(node).accessProp(this, env).name("uses").value(),
                            env,
                            true)) {
                use = ZVal.assign(zpairResult868.getValue());
                this.addAlias(
                        env,
                        use,
                        toObjectR(node).accessProp(this, env).name("type").value(),
                        ZVal.getNull());
            }

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(node, GroupUse.class, "PhpParser\\Node\\Stmt\\GroupUse"))) {
            for (ZPair zpairResult869 :
                    ZVal.getIterable(
                            toObjectR(node).accessProp(this, env).name("uses").value(),
                            env,
                            true)) {
                use = ZVal.assign(zpairResult869.getValue());
                this.addAlias(
                        env,
                        use,
                        toObjectR(node).accessProp(this, env).name("type").value(),
                        toObjectR(node).accessProp(this, env).name("prefix").value());
            }

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(node, Class_.class, "PhpParser\\Node\\Stmt\\Class_"))) {
            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    toObjectR(node).accessProp(this, env).name("extends").value())) {
                toObjectR(node)
                        .accessProp(this, env)
                        .name("extends")
                        .set(
                                this.resolveClassName(
                                        env,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("extends")
                                                .value()));
            }

            for (ZPair zpairResult870 :
                    ZVal.getIterable(
                            toObjectR(node).accessProp(this, env).name("implements").value(),
                            env,
                            true)) {
                _pInterface = zpairResult870;
                _pInterface.setObject(this.resolveClassName(env, _pInterface.getObject()));
            }

            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    toObjectR(node).accessProp(this, env).name("name").value())) {
                this.addNamespacedName(env, node);
            }

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, Interface_.class, "PhpParser\\Node\\Stmt\\Interface_"))) {
            for (ZPair zpairResult871 :
                    ZVal.getIterable(
                            toObjectR(node).accessProp(this, env).name("extends").value(),
                            env,
                            true)) {
                _pInterface = zpairResult871;
                _pInterface.setObject(this.resolveClassName(env, _pInterface.getObject()));
            }

            this.addNamespacedName(env, node);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(node, Trait_.class, "PhpParser\\Node\\Stmt\\Trait_"))) {
            this.addNamespacedName(env, node);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, Function_.class, "PhpParser\\Node\\Stmt\\Function_"))) {
            this.addNamespacedName(env, node);
            this.resolveSignature(env, node);

        } else if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                node, ClassMethod.class, "PhpParser\\Node\\Stmt\\ClassMethod"))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                node, Closure.class, "PhpParser\\Node\\Expr\\Closure"))) {
            this.resolveSignature(env, node);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(node, Const_.class, "PhpParser\\Node\\Stmt\\Const_"))) {
            for (ZPair zpairResult872 :
                    ZVal.getIterable(
                            toObjectR(node).accessProp(this, env).name("consts").value(),
                            env,
                            true)) {
                _pConst = ZVal.assign(zpairResult872.getValue());
                this.addNamespacedName(env, _pConst);
            }

        } else if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.toBool(
                                                                        ZVal.checkInstanceType(
                                                                                node,
                                                                                StaticCall.class,
                                                                                "PhpParser\\Node\\Expr\\StaticCall"))
                                                                || ZVal.toBool(
                                                                        ZVal.checkInstanceType(
                                                                                node,
                                                                                StaticPropertyFetch
                                                                                        .class,
                                                                                "PhpParser\\Node\\Expr\\StaticPropertyFetch")))
                                                || ZVal.toBool(
                                                        ZVal.checkInstanceType(
                                                                node,
                                                                ClassConstFetch.class,
                                                                "PhpParser\\Node\\Expr\\ClassConstFetch")))
                                || ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                node, New_.class, "PhpParser\\Node\\Expr\\New_")))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                node, Instanceof_.class, "PhpParser\\Node\\Expr\\Instanceof_"))) {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            toObjectR(node).accessProp(this, env).name("class").value(),
                            Name.class,
                            "PhpParser\\Node\\Name"))) {
                toObjectR(node)
                        .accessProp(this, env)
                        .name("class")
                        .set(
                                this.resolveClassName(
                                        env,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("class")
                                                .value()));
            }

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(node, Catch_.class, "PhpParser\\Node\\Stmt\\Catch_"))) {
            for (ZPair zpairResult873 :
                    ZVal.getIterable(
                            toObjectR(node).accessProp(this, env).name("types").value(),
                            env,
                            true)) {
                type = zpairResult873;
                type.setObject(this.resolveClassName(env, type.getObject()));
            }

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(node, FuncCall.class, "PhpParser\\Node\\Expr\\FuncCall"))) {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            toObjectR(node).accessProp(this, env).name("name").value(),
                            Name.class,
                            "PhpParser\\Node\\Name"))) {
                toObjectR(node)
                        .accessProp(this, env)
                        .name("name")
                        .set(
                                this.resolveName(
                                        env,
                                        toObjectR(node).accessProp(this, env).name("name").value(),
                                        Use_.CONST_TYPE_FUNCTION));
            }

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, ConstFetch.class, "PhpParser\\Node\\Expr\\ConstFetch"))) {
            toObjectR(node)
                    .accessProp(this, env)
                    .name("name")
                    .set(
                            this.resolveName(
                                    env,
                                    toObjectR(node).accessProp(this, env).name("name").value(),
                                    Use_.CONST_TYPE_CONSTANT));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(node, TraitUse.class, "PhpParser\\Node\\Stmt\\TraitUse"))) {
            for (ZPair zpairResult874 :
                    ZVal.getIterable(
                            toObjectR(node).accessProp(this, env).name("traits").value(),
                            env,
                            true)) {
                trait = zpairResult874;
                trait.setObject(this.resolveClassName(env, trait.getObject()));
            }

            for (ZPair zpairResult875 :
                    ZVal.getIterable(
                            toObjectR(node).accessProp(this, env).name("adaptations").value(),
                            env,
                            true)) {
                adaptation = ZVal.assign(zpairResult875.getValue());
                if (ZVal.strictNotEqualityCheck(
                        ZVal.getNull(),
                        "!==",
                        toObjectR(adaptation).accessProp(this, env).name("trait").value())) {
                    toObjectR(adaptation)
                            .accessProp(this, env)
                            .name("trait")
                            .set(
                                    this.resolveClassName(
                                            env,
                                            toObjectR(adaptation)
                                                    .accessProp(this, env)
                                                    .name("trait")
                                                    .value()));
                }

                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                adaptation,
                                Precedence.class,
                                "PhpParser\\Node\\Stmt\\TraitUseAdaptation\\Precedence"))) {
                    for (ZPair zpairResult876 :
                            ZVal.getIterable(
                                    toObjectR(adaptation)
                                            .accessProp(this, env)
                                            .name("insteadof")
                                            .value(),
                                    env,
                                    true)) {
                        insteadof = zpairResult876;
                        insteadof.setObject(this.resolveClassName(env, insteadof.getObject()));
                    }
                }
            }
        }

        return ZVal.assign(ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "use", typeHint = "PhpParser\\Node\\Stmt\\UseUse")
    @ConvertedParameter(index = 1, name = "type")
    @ConvertedParameter(
        index = 2,
        name = "prefix",
        typeHint = "PhpParser\\Node\\Name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object addAlias(RuntimeEnv env, Object... args) {
        Object use = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        Object prefix = assignParameter(args, 2, true);
        if (null == prefix) {
            prefix = ZVal.getNull();
        }
        Object name = null;
        name =
                ZVal.assign(
                        ZVal.isTrue(prefix)
                                ? Name.runtimeStaticObject.concat(
                                        env,
                                        prefix,
                                        toObjectR(use).accessProp(this, env).name("name").value())
                                : toObjectR(use).accessProp(this, env).name("name").value());
        type =
                ZAssignment.or(
                        "|=", type, toObjectR(use).accessProp(this, env).name("type").value());
        env.callMethod(
                this.nameContext,
                "addAlias",
                NameResolver.class,
                name,
                toStringR(env.callMethod(use, "getAlias", NameResolver.class), env),
                type,
                env.callMethod(use, "getAttributes", NameResolver.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node")
    private Object resolveSignature(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object param = null;
        for (ZPair zpairResult877 :
                ZVal.getIterable(
                        toObjectR(node).accessProp(this, env).name("params").value(), env, true)) {
            param = ZVal.assign(zpairResult877.getValue());
            toObjectR(param)
                    .accessProp(this, env)
                    .name("type")
                    .set(
                            this.resolveType(
                                    env,
                                    toObjectR(param).accessProp(this, env).name("type").value()));
        }

        toObjectR(node)
                .accessProp(this, env)
                .name("returnType")
                .set(
                        this.resolveType(
                                env,
                                toObjectR(node).accessProp(this, env).name("returnType").value()));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node")
    private Object resolveType(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, NullableType.class, "PhpParser\\Node\\NullableType"))) {
            toObjectR(node)
                    .accessProp(this, env)
                    .name("type")
                    .set(
                            this.resolveType(
                                    env,
                                    toObjectR(node).accessProp(this, env).name("type").value()));
            return ZVal.assign(node);
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(node, Name.class, "PhpParser\\Node\\Name"))) {
            return ZVal.assign(this.resolveClassName(env, node));
        }

        return ZVal.assign(node);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "PhpParser\\Node\\Name")
    @ConvertedParameter(index = 1, name = "type", typeHint = "int")
    protected Object resolveName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        Object originalName = null;
        Object resolvedName = null;
        if (!ZVal.isTrue(this.replaceNodes)) {
            resolvedName =
                    env.callMethod(
                            this.nameContext, "getResolvedName", NameResolver.class, name, type);
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", resolvedName)) {
                env.callMethod(
                        name, "setAttribute", NameResolver.class, "resolvedName", resolvedName);

            } else {
                env.callMethod(
                        name,
                        "setAttribute",
                        NameResolver.class,
                        "namespacedName",
                        FullyQualified.runtimeStaticObject.concat(
                                env,
                                env.callMethod(
                                        this.nameContext, "getNamespace", NameResolver.class),
                                name,
                                env.callMethod(name, "getAttributes", NameResolver.class)));
            }

            return ZVal.assign(name);
        }

        if (ZVal.isTrue(this.preserveOriginalNames)) {
            originalName = ZVal.assign(name);
            name = ZVal.assign(((RuntimeClassInterface) originalName).phpClone(env));
            env.callMethod(name, "setAttribute", NameResolver.class, "originalName", originalName);
        }

        resolvedName =
                env.callMethod(this.nameContext, "getResolvedName", NameResolver.class, name, type);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", resolvedName)) {
            return ZVal.assign(resolvedName);
        }

        env.callMethod(
                name,
                "setAttribute",
                NameResolver.class,
                "namespacedName",
                FullyQualified.runtimeStaticObject.concat(
                        env,
                        env.callMethod(this.nameContext, "getNamespace", NameResolver.class),
                        name,
                        env.callMethod(name, "getAttributes", NameResolver.class)));
        return ZVal.assign(name);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "PhpParser\\Node\\Name")
    protected Object resolveClassName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(this.resolveName(env, name, Use_.CONST_TYPE_NORMAL));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    protected Object addNamespacedName(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        toObjectR(node)
                .accessProp(this, env)
                .name("namespacedName")
                .set(
                        Name.runtimeStaticObject.concat(
                                env,
                                env.callMethod(
                                        this.nameContext, "getNamespace", NameResolver.class),
                                toStringR(
                                        toObjectR(node).accessProp(this, env).name("name").value(),
                                        env)));
        return null;
    }

    public static final Object CONST_class = "PhpParser\\NodeVisitor\\NameResolver";

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
                    .setName("PhpParser\\NodeVisitor\\NameResolver")
                    .setLookup(
                            NameResolver.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("nameContext", "preserveOriginalNames", "replaceNodes")
                    .setFilename(
                            "vendor/nikic/php-parser/lib/PhpParser/NodeVisitor/NameResolver.php")
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
