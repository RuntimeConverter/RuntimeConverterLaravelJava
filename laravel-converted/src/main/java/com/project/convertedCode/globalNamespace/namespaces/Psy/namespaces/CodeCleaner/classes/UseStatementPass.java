package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.GroupUse;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.NodeTraverser;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Name.classes.FullyQualified;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.CodeCleanerPass;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Name;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Use_;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Namespace_;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/UseStatementPass.php

*/

public class UseStatementPass extends CodeCleanerPass {

    public Object aliases = ZVal.newArray();

    public Object lastAliases = ZVal.newArray();

    public Object lastNamespace = ZVal.getNull();

    public UseStatementPass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public UseStatementPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, Namespace_.class, "PhpParser\\Node\\Stmt\\Namespace_"))) {
            if (ZVal.strictEqualityCheck(
                    NamespaceGlobal.strtolower
                            .env(env)
                            .call(toObjectR(node).accessProp(this, env).name("name").value())
                            .value(),
                    "===",
                    NamespaceGlobal.strtolower.env(env).call(this.lastNamespace).value())) {
                this.aliases = this.lastAliases;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object leaveNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object use = null;
        Object name = null;
        Object alias = null;
        Object ternaryExpressionTemp = null;
        Object replacement = null;
        Object subNode = null;
        if (ZVal.isTrue(ZVal.checkInstanceType(node, Use_.class, "PhpParser\\Node\\Stmt\\Use_"))) {
            for (ZPair zpairResult1348 :
                    ZVal.getIterable(
                            toObjectR(node).accessProp(this, env).name("uses").value(),
                            env,
                            true)) {
                use = ZVal.assign(zpairResult1348.getValue());
                alias =
                        ZVal.assign(
                                ZVal.isTrue(
                                                ternaryExpressionTemp =
                                                        toObjectR(use)
                                                                .accessProp(this, env)
                                                                .name("alias")
                                                                .value())
                                        ? ternaryExpressionTemp
                                        : function_end
                                                .f
                                                .env(env)
                                                .call(
                                                        toObjectR(use)
                                                                .accessProp(this, env)
                                                                .name("name")
                                                                .getObject()
                                                                .accessProp(this, env)
                                                                .name("parts")
                                                                .value())
                                                .value());
                new ReferenceClassProperty(this, "aliases", env)
                        .arrayAccess(env, NamespaceGlobal.strtolower.env(env).call(alias).value())
                        .set(toObjectR(use).accessProp(this, env).name("name").value());
            }

            return ZVal.assign(NodeTraverser.CONST_REMOVE_NODE);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(node, GroupUse.class, "PhpParser\\Node\\Stmt\\GroupUse"))) {
            for (ZPair zpairResult1349 :
                    ZVal.getIterable(
                            toObjectR(node).accessProp(this, env).name("uses").value(),
                            env,
                            true)) {
                use = ZVal.assign(zpairResult1349.getValue());
                alias =
                        ZVal.assign(
                                ZVal.isTrue(
                                                ternaryExpressionTemp =
                                                        toObjectR(use)
                                                                .accessProp(this, env)
                                                                .name("alias")
                                                                .value())
                                        ? ternaryExpressionTemp
                                        : function_end
                                                .f
                                                .env(env)
                                                .call(
                                                        toObjectR(use)
                                                                .accessProp(this, env)
                                                                .name("name")
                                                                .getObject()
                                                                .accessProp(this, env)
                                                                .name("parts")
                                                                .value())
                                                .value());
                new ReferenceClassProperty(this, "aliases", env)
                        .arrayAccess(env, NamespaceGlobal.strtolower.env(env).call(alias).value())
                        .set(
                                Name.runtimeStaticObject.concat(
                                        env,
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("prefix")
                                                .value(),
                                        toObjectR(use).accessProp(this, env).name("name").value(),
                                        ZVal.newArray(
                                                new ZPair(
                                                        "startLine",
                                                        env.callMethod(
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("prefix")
                                                                        .value(),
                                                                "getAttribute",
                                                                UseStatementPass.class,
                                                                "startLine")),
                                                new ZPair(
                                                        "endLine",
                                                        env.callMethod(
                                                                toObjectR(use)
                                                                        .accessProp(this, env)
                                                                        .name("name")
                                                                        .value(),
                                                                "getAttribute",
                                                                UseStatementPass.class,
                                                                "endLine")))));
            }

            return ZVal.assign(NodeTraverser.CONST_REMOVE_NODE);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, Namespace_.class, "PhpParser\\Node\\Stmt\\Namespace_"))) {
            this.lastNamespace = toObjectR(node).accessProp(this, env).name("name").value();
            this.lastAliases = this.aliases;
            this.aliases = ZVal.newArray();

        } else {
            for (ZPair zpairResult1350 : ZVal.getIterable(node, env, false)) {
                name = ZVal.assign(zpairResult1350.getKey());
                subNode = ZVal.assign(zpairResult1350.getValue());
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(subNode, Name.class, "PhpParser\\Node\\Name"))) {
                    if (ZVal.isTrue(replacement = this.findAlias(env, subNode))) {
                        toObjectR(node).accessProp(this, env).name(name).set(replacement);
                    }
                }
            }

            return ZVal.assign(node);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "PhpParser\\Node\\Name")
    private Object findAlias(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object that = null;
        Object prefix = null;
        Object alias = null;
        that = NamespaceGlobal.strtolower.env(env).call(name).value();
        for (ZPair zpairResult1351 : ZVal.getIterable(this.aliases, env, false)) {
            alias = ZVal.assign(zpairResult1351.getKey());
            prefix = ZVal.assign(zpairResult1351.getValue());
            if (ZVal.strictEqualityCheck(that, "===", alias)) {
                return ZVal.assign(
                        new FullyQualified(
                                env, env.callMethod(prefix, "toString", UseStatementPass.class)));

            } else if (ZVal.strictEqualityCheck(
                    function_substr
                            .f
                            .env(env)
                            .call(
                                    that,
                                    0,
                                    ZVal.add(function_strlen.f.env(env).call(alias).value(), 1))
                            .value(),
                    "===",
                    toStringR(alias, env) + "\\")) {
                return ZVal.assign(
                        new FullyQualified(
                                env,
                                toStringR(
                                                env.callMethod(
                                                        prefix, "toString", UseStatementPass.class),
                                                env)
                                        + toStringR(
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                name,
                                                                function_strlen
                                                                        .f
                                                                        .env(env)
                                                                        .call(alias)
                                                                        .value())
                                                        .value(),
                                                env)));
            }
        }

        return null;
    }

    public static final Object CONST_class = "Psy\\CodeCleaner\\UseStatementPass";

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
                    .setName("Psy\\CodeCleaner\\UseStatementPass")
                    .setLookup(
                            UseStatementPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("aliases", "lastAliases", "lastNamespace")
                    .setFilename("vendor/psy/psysh/src/CodeCleaner/UseStatementPass.php")
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
