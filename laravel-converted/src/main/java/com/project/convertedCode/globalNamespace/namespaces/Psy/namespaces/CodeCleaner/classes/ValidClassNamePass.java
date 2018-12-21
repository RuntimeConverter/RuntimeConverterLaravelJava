package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.If_;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.While_;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Do_;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.NamespaceAwarePass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Interface_;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.FatalErrorException;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Class_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ClassConstFetch;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Expr;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Switch_;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Trait_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.StaticCall;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.New_;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/ValidClassNamePass.php

*/

public class ValidClassNamePass extends NamespaceAwarePass {

    public Object conditionalScopes = 0;

    public Object atLeastPhp55 = null;

    public ValidClassNamePass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ValidClassNamePass.class) {
            this.__construct(env, args);
        }
    }

    public ValidClassNamePass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.atLeastPhp55 =
                NamespaceGlobal.version_compare.env(env).call("7.2.11-dev", "5.5", ">=").value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        super.enterNode(env, node);
        if (ZVal.isTrue(runtimeStaticObject.isConditional(env, node))) {
            this.conditionalScopes = ZVal.increment(this.conditionalScopes);

        } else {
            if (ZVal.strictEqualityCheck(this.conditionalScopes, "===", 0)) {
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                node, Class_.class, "PhpParser\\Node\\Stmt\\Class_"))) {
                    this.validateClassStatement(env, node);

                } else if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                node, Interface_.class, "PhpParser\\Node\\Stmt\\Interface_"))) {
                    this.validateInterfaceStatement(env, node);

                } else if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                node, Trait_.class, "PhpParser\\Node\\Stmt\\Trait_"))) {
                    this.validateTraitStatement(env, node);
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object leaveNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (ZVal.isTrue(runtimeStaticObject.isConditional(env, node))) {
            this.conditionalScopes = ZVal.decrement(this.conditionalScopes);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(node, New_.class, "PhpParser\\Node\\Expr\\New_"))) {
            this.validateNewExpression(env, node);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, ClassConstFetch.class, "PhpParser\\Node\\Expr\\ClassConstFetch"))) {
            this.validateClassConstFetchExpression(env, node);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, StaticCall.class, "PhpParser\\Node\\Expr\\StaticCall"))) {
            this.validateStaticCallExpression(env, node);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stmt", typeHint = "PhpParser\\Node\\Stmt\\Class_")
    protected Object validateClassStatement(RuntimeEnv env, Object... args) {
        Object stmt = assignParameter(args, 0, false);
        this.ensureCanDefine(env, stmt, CONST_CLASS_TYPE);
        if (ZVal.isset(toObjectR(stmt).accessProp(this, env).name("extends").value())) {
            this.ensureClassExists(
                    env,
                    env.callMethod(
                            this,
                            "getFullyQualifiedName",
                            ValidClassNamePass.class,
                            toObjectR(stmt).accessProp(this, env).name("extends").value()),
                    stmt);
        }

        this.ensureInterfacesExist(
                env, toObjectR(stmt).accessProp(this, env).name("implements").value(), stmt);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stmt", typeHint = "PhpParser\\Node\\Stmt\\Interface_")
    protected Object validateInterfaceStatement(RuntimeEnv env, Object... args) {
        Object stmt = assignParameter(args, 0, false);
        this.ensureCanDefine(env, stmt, CONST_INTERFACE_TYPE);
        this.ensureInterfacesExist(
                env, toObjectR(stmt).accessProp(this, env).name("extends").value(), stmt);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stmt", typeHint = "PhpParser\\Node\\Stmt\\Trait_")
    protected Object validateTraitStatement(RuntimeEnv env, Object... args) {
        Object stmt = assignParameter(args, 0, false);
        this.ensureCanDefine(env, stmt, CONST_TRAIT_TYPE);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stmt", typeHint = "PhpParser\\Node\\Expr\\New_")
    protected Object validateNewExpression(RuntimeEnv env, Object... args) {
        Object stmt = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        toObjectR(stmt).accessProp(this, env).name("class").value(),
                                        Expr.class,
                                        "PhpParser\\Node\\Expr")))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        toObjectR(stmt).accessProp(this, env).name("class").value(),
                                        Class_.class,
                                        "PhpParser\\Node\\Stmt\\Class_")))) {
            this.ensureClassExists(
                    env,
                    env.callMethod(
                            this,
                            "getFullyQualifiedName",
                            ValidClassNamePass.class,
                            toObjectR(stmt).accessProp(this, env).name("class").value()),
                    stmt);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "stmt",
        typeHint = "PhpParser\\Node\\Expr\\ClassConstFetch"
    )
    protected Object validateClassConstFetchExpression(RuntimeEnv env, Object... args) {
        Object stmt = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                NamespaceGlobal.strtolower
                                        .env(env)
                                        .call(
                                                toObjectR(stmt)
                                                        .accessProp(this, env)
                                                        .name("name")
                                                        .value())
                                        .value(),
                                "===",
                                "class"))
                && ZVal.toBool(this.atLeastPhp55)) {
            return null;
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        toObjectR(stmt).accessProp(this, env).name("class").value(),
                        Expr.class,
                        "PhpParser\\Node\\Expr"))) {
            this.ensureClassOrInterfaceExists(
                    env,
                    env.callMethod(
                            this,
                            "getFullyQualifiedName",
                            ValidClassNamePass.class,
                            toObjectR(stmt).accessProp(this, env).name("class").value()),
                    stmt);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stmt", typeHint = "PhpParser\\Node\\Expr\\StaticCall")
    protected Object validateStaticCallExpression(RuntimeEnv env, Object... args) {
        Object stmt = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        toObjectR(stmt).accessProp(this, env).name("class").value(),
                        Expr.class,
                        "PhpParser\\Node\\Expr"))) {
            this.ensureMethodExists(
                    env,
                    env.callMethod(
                            this,
                            "getFullyQualifiedName",
                            ValidClassNamePass.class,
                            toObjectR(stmt).accessProp(this, env).name("class").value()),
                    toObjectR(stmt).accessProp(this, env).name("name").value(),
                    stmt);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stmt", typeHint = "PhpParser\\Node\\Stmt")
    @ConvertedParameter(index = 1, name = "scopeType")
    protected Object ensureCanDefine(RuntimeEnv env, Object... args) {
        Object stmt = assignParameter(args, 0, false);
        Object scopeType = assignParameter(args, 1, true);
        if (null == scopeType) {
            scopeType = CONST_CLASS_TYPE;
        }
        Object errorType = null;
        Object name = null;
        name =
                env.callMethod(
                        this,
                        "getFullyQualifiedName",
                        ValidClassNamePass.class,
                        toObjectR(stmt).accessProp(this, env).name("name").value());
        errorType = ZVal.getNull();
        if (ZVal.isTrue(this.classExists(env, name))) {
            errorType = ZVal.assign(CONST_CLASS_TYPE);

        } else if (ZVal.isTrue(this.interfaceExists(env, name))) {
            errorType = ZVal.assign(CONST_INTERFACE_TYPE);

        } else if (ZVal.isTrue(this.traitExists(env, name))) {
            errorType = ZVal.assign(CONST_TRAIT_TYPE);
        }

        if (ZVal.strictNotEqualityCheck(errorType, "!==", ZVal.getNull())) {
            throw ZVal.getException(
                    env,
                    this.createError(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "%s named %s already exists",
                                            NamespaceGlobal.ucfirst
                                                    .env(env)
                                                    .call(errorType)
                                                    .value(),
                                            name)
                                    .value(),
                            stmt));
        }

        new ReferenceClassProperty(this, "currentScope", env)
                .arrayAccess(env, NamespaceGlobal.strtolower.env(env).call(name).value())
                .set(scopeType);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "stmt")
    protected Object ensureClassExists(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object stmt = assignParameter(args, 1, false);
        if (!ZVal.isTrue(this.classExists(env, name))) {
            throw ZVal.getException(
                    env,
                    this.createError(
                            env,
                            function_sprintf.f.env(env).call("Class '%s' not found", name).value(),
                            stmt));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "stmt")
    protected Object ensureClassOrInterfaceExists(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object stmt = assignParameter(args, 1, false);
        if (ZVal.toBool(!ZVal.isTrue(this.classExists(env, name)))
                && ZVal.toBool(!ZVal.isTrue(this.interfaceExists(env, name)))) {
            throw ZVal.getException(
                    env,
                    this.createError(
                            env,
                            function_sprintf.f.env(env).call("Class '%s' not found", name).value(),
                            stmt));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(index = 2, name = "stmt")
    protected Object ensureMethodExists(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object stmt = assignParameter(args, 2, false);
        this.ensureClassExists(env, _pClass, stmt);
        if (function_in_array
                .f
                .env(env)
                .call(
                        NamespaceGlobal.strtolower.env(env).call(_pClass).value(),
                        ZVal.arrayFromList("self", "parent", "static"))
                .getBool()) {
            return null;
        }

        if (ZVal.strictEqualityCheck(this.findInScope(env, _pClass), "===", CONST_CLASS_TYPE)) {
            return null;
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(name, Expr.class, "PhpParser\\Node\\Expr"))) {
            return null;
        }

        if (ZVal.toBool(!function_method_exists.f.env(env).call(_pClass, name).getBool())
                && ZVal.toBool(
                        !function_method_exists
                                .f
                                .env(env)
                                .call(_pClass, "__callStatic")
                                .getBool())) {
            throw ZVal.getException(
                    env,
                    this.createError(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Call to undefined method %s::%s()", _pClass, name)
                                    .value(),
                            stmt));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interfaces")
    @ConvertedParameter(index = 1, name = "stmt")
    protected Object ensureInterfacesExist(RuntimeEnv env, Object... args) {
        Object interfaces = assignParameter(args, 0, false);
        Object stmt = assignParameter(args, 1, false);
        Object name = null;
        Object _pInterface = null;
        for (ZPair zpairResult1352 : ZVal.getIterable(interfaces, env, true)) {
            _pInterface = ZVal.assign(zpairResult1352.getValue());
            name =
                    env.callMethod(
                            this, "getFullyQualifiedName", ValidClassNamePass.class, _pInterface);
            if (!ZVal.isTrue(this.interfaceExists(env, name))) {
                throw ZVal.getException(
                        env,
                        this.createError(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Interface '%s' not found", name)
                                        .value(),
                                stmt));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stmt", typeHint = "PhpParser\\Node\\Stmt")
    protected Object getScopeType(RuntimeEnv env, Object... args) {
        Object stmt = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(stmt, Class_.class, "PhpParser\\Node\\Stmt\\Class_"))) {
            return ZVal.assign(CONST_CLASS_TYPE);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        stmt, Interface_.class, "PhpParser\\Node\\Stmt\\Interface_"))) {
            return ZVal.assign(CONST_INTERFACE_TYPE);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(stmt, Trait_.class, "PhpParser\\Node\\Stmt\\Trait_"))) {
            return ZVal.assign(CONST_TRAIT_TYPE);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object classExists(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (function_in_array
                .f
                .env(env)
                .call(
                        NamespaceGlobal.strtolower.env(env).call(name).value(),
                        ZVal.arrayFromList("self", "static", "parent"))
                .getBool()) {
            return ZVal.assign(true);
        }

        return ZVal.assign(
                ZVal.toBool(function_class_exists.f.env(env).call(name).value())
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        this.findInScope(env, name), "===", CONST_CLASS_TYPE)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object interfaceExists(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(NamespaceGlobal.interface_exists.env(env).call(name).value())
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        this.findInScope(env, name), "===", CONST_INTERFACE_TYPE)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object traitExists(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(NamespaceGlobal.trait_exists.env(env).call(name).value())
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        this.findInScope(env, name), "===", CONST_TRAIT_TYPE)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object findInScope(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        name = NamespaceGlobal.strtolower.env(env).call(name).value();
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "currentScope", env),
                env,
                name)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "currentScope", env).arrayGet(env, name));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "msg")
    @ConvertedParameter(index = 1, name = "stmt")
    protected Object createError(RuntimeEnv env, Object... args) {
        Object msg = assignParameter(args, 0, false);
        Object stmt = assignParameter(args, 1, false);
        return ZVal.assign(
                new FatalErrorException(
                        env,
                        msg,
                        0,
                        1,
                        ZVal.getNull(),
                        env.callMethod(stmt, "getLine", ValidClassNamePass.class)));
    }

    public static final Object CONST_CLASS_TYPE = "class";

    public static final Object CONST_INTERFACE_TYPE = "interface";

    public static final Object CONST_TRAIT_TYPE = "trait";

    public static final Object CONST_class = "Psy\\CodeCleaner\\ValidClassNamePass";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends NamespaceAwarePass.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
        private Object isConditional(RuntimeEnv env, Object... args) {
            Object node = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.toBool(
                                                                    ZVal.checkInstanceType(
                                                                            node,
                                                                            If_.class,
                                                                            "PhpParser\\Node\\Stmt\\If_"))
                                                            || ZVal.toBool(
                                                                    ZVal.checkInstanceType(
                                                                            node,
                                                                            While_.class,
                                                                            "PhpParser\\Node\\Stmt\\While_")))
                                            || ZVal.toBool(
                                                    ZVal.checkInstanceType(
                                                            node,
                                                            Do_.class,
                                                            "PhpParser\\Node\\Stmt\\Do_")))
                            || ZVal.toBool(
                                    ZVal.checkInstanceType(
                                            node,
                                            Switch_.class,
                                            "PhpParser\\Node\\Stmt\\Switch_")));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\CodeCleaner\\ValidClassNamePass")
                    .setLookup(
                            ValidClassNamePass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "atLeastPhp55", "conditionalScopes", "currentScope", "namespace")
                    .setFilename("vendor/psy/psysh/src/CodeCleaner/ValidClassNamePass.php")
                    .addInterface("PhpParser\\NodeVisitor")
                    .addExtendsClass("Psy\\CodeCleaner\\NamespaceAwarePass")
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
