package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Name;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Name.classes.FullyQualified;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Error;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Use_;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/NameContext.php

*/

public class NameContext extends RuntimeClassBase {

    public Object namespace = null;

    public Object aliases = ZVal.newArray();

    public Object origAliases = ZVal.newArray();

    public Object errorHandler = null;

    public NameContext(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NameContext.class) {
            this.__construct(env, args);
        }
    }

    public NameContext(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "errorHandler", typeHint = "PhpParser\\ErrorHandler")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object errorHandler = assignParameter(args, 0, false);
        this.errorHandler = errorHandler;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "namespace",
        typeHint = "PhpParser\\Node\\Name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object startNamespace(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, true);
        if (null == namespace) {
            namespace = ZVal.getNull();
        }
        this.namespace = namespace;
        this.origAliases =
                this.aliases =
                        ZVal.newArray(
                                new ZPair(Use_.CONST_TYPE_NORMAL, ZVal.newArray()),
                                new ZPair(Use_.CONST_TYPE_FUNCTION, ZVal.newArray()),
                                new ZPair(Use_.CONST_TYPE_CONSTANT, ZVal.newArray()));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "PhpParser\\Node\\Name")
    @ConvertedParameter(index = 1, name = "aliasName", typeHint = "string")
    @ConvertedParameter(index = 2, name = "type", typeHint = "int")
    @ConvertedParameter(
        index = 3,
        name = "errorAttrs",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object addAlias(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object aliasName = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, false);
        Object errorAttrs = assignParameter(args, 3, true);
        if (null == errorAttrs) {
            errorAttrs = ZVal.newArray();
        }
        ReferenceContainer typeStringMap = new BasicReferenceContainer(null);
        Object aliasLookupName = null;
        if (ZVal.strictEqualityCheck(type, "===", Use_.CONST_TYPE_CONSTANT)) {
            aliasLookupName = ZVal.assign(aliasName);

        } else {
            aliasLookupName = NamespaceGlobal.strtolower.env(env).call(aliasName).value();
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "aliases", env),
                env,
                type,
                aliasLookupName)) {
            typeStringMap.setObject(
                    ZVal.newArray(
                            new ZPair(Use_.CONST_TYPE_NORMAL, ""),
                            new ZPair(Use_.CONST_TYPE_FUNCTION, "function "),
                            new ZPair(Use_.CONST_TYPE_CONSTANT, "const ")));
            env.callMethod(
                    this.errorHandler,
                    "handleError",
                    NameContext.class,
                    new Error(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Cannot use %s%s as %s because the name is already in use",
                                            typeStringMap.arrayGet(env, type), name, aliasName)
                                    .value(),
                            errorAttrs));
            return null;
        }

        new ReferenceClassProperty(this, "aliases", env)
                .arrayAccess(env, type, aliasLookupName)
                .set(name);
        new ReferenceClassProperty(this, "origAliases", env)
                .arrayAccess(env, type, aliasName)
                .set(name);
        return null;
    }

    @ConvertedMethod
    public Object getNamespace(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.namespace);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "PhpParser\\Node\\Name")
    @ConvertedParameter(index = 1, name = "type", typeHint = "int")
    public Object getResolvedName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        Object resolvedName = null;
        if (ZVal.toBool(ZVal.strictEqualityCheck(type, "===", Use_.CONST_TYPE_NORMAL))
                && ZVal.toBool(env.callMethod(name, "isSpecialClassName", NameContext.class))) {
            if (!ZVal.isTrue(env.callMethod(name, "isUnqualified", NameContext.class))) {
                env.callMethod(
                        this.errorHandler,
                        "handleError",
                        NameContext.class,
                        new Error(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "'\\%s' is an invalid class name",
                                                env.callMethod(name, "toString", NameContext.class))
                                        .value(),
                                env.callMethod(name, "getAttributes", NameContext.class)));
            }

            return ZVal.assign(name);
        }

        if (ZVal.isTrue(env.callMethod(name, "isFullyQualified", NameContext.class))) {
            return ZVal.assign(name);
        }

        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(), "!==", resolvedName = this.resolveAlias(env, name, type))) {
            return ZVal.assign(resolvedName);
        }

        if (ZVal.toBool(ZVal.strictNotEqualityCheck(type, "!==", Use_.CONST_TYPE_NORMAL))
                && ZVal.toBool(env.callMethod(name, "isUnqualified", NameContext.class))) {
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.namespace)) {
                return ZVal.assign(
                        new FullyQualified(
                                env,
                                name,
                                env.callMethod(name, "getAttributes", NameContext.class)));
            }

            return ZVal.assign(ZVal.getNull());
        }

        return ZVal.assign(
                FullyQualified.runtimeStaticObject.concat(
                        env,
                        this.namespace,
                        name,
                        env.callMethod(name, "getAttributes", NameContext.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "PhpParser\\Node\\Name")
    public Object getResolvedClassName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(this.getResolvedName(env, name, Use_.CONST_TYPE_NORMAL));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(index = 1, name = "type", typeHint = "int")
    public Object getPossibleNames(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        Object lcName = null;
        Object orig = null;
        Object nsRelativeName = null;
        Object normalizedOrig = null;
        Object alias = null;
        ReferenceContainer possibleNames = new BasicReferenceContainer(null);
        Object lcOrig = null;
        lcName = NamespaceGlobal.strtolower.env(env).call(name).value();
        if (ZVal.strictEqualityCheck(type, "===", Use_.CONST_TYPE_NORMAL)) {
            if (ZVal.toBool(
                            ZVal.toBool(ZVal.strictEqualityCheck(lcName, "===", "self"))
                                    || ZVal.toBool(
                                            ZVal.strictEqualityCheck(lcName, "===", "parent")))
                    || ZVal.toBool(ZVal.strictEqualityCheck(lcName, "===", "static"))) {
                return ZVal.assign(ZVal.newArray(new ZPair(0, new Name(env, name))));
            }
        }

        possibleNames.setObject(ZVal.newArray(new ZPair(0, new FullyQualified(env, name))));
        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
                nsRelativeName = this.getNamespaceRelativeName(env, name, lcName, type))) {
            if (ZVal.strictEqualityCheck(
                    ZVal.getNull(), "===", this.resolveAlias(env, nsRelativeName, type))) {
                possibleNames.arrayAppend(env).set(nsRelativeName);
            }
        }

        for (ZPair zpairResult852 :
                ZVal.getIterable(
                        new ReferenceClassProperty(this, "origAliases", env)
                                .arrayGet(env, Use_.CONST_TYPE_NORMAL),
                        env,
                        false)) {
            alias = ZVal.assign(zpairResult852.getKey());
            orig = ZVal.assign(zpairResult852.getValue());
            lcOrig = env.callMethod(orig, "toLowerString", NameContext.class);
            if (ZVal.strictEqualityCheck(
                    0,
                    "===",
                    function_strpos
                            .f
                            .env(env)
                            .call(lcName, toStringR(lcOrig, env) + "\\")
                            .value())) {
                possibleNames
                        .arrayAppend(env)
                        .set(
                                new Name(
                                        env,
                                        toStringR(alias, env)
                                                + toStringR(
                                                        function_substr
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        name,
                                                                        function_strlen
                                                                                .f
                                                                                .env(env)
                                                                                .call(lcOrig)
                                                                                .value())
                                                                .value(),
                                                        env)));
            }
        }

        for (ZPair zpairResult853 :
                ZVal.getIterable(
                        new ReferenceClassProperty(this, "origAliases", env).arrayGet(env, type),
                        env,
                        false)) {
            alias = ZVal.assign(zpairResult853.getKey());
            orig = ZVal.assign(zpairResult853.getValue());
            if (ZVal.strictEqualityCheck(type, "===", Use_.CONST_TYPE_CONSTANT)) {
                normalizedOrig =
                        this.normalizeConstName(
                                env, env.callMethod(orig, "toString", NameContext.class));
                if (ZVal.strictEqualityCheck(
                        normalizedOrig, "===", this.normalizeConstName(env, name))) {
                    possibleNames.arrayAppend(env).set(new Name(env, alias));
                }

            } else {
                if (ZVal.strictEqualityCheck(
                        env.callMethod(orig, "toLowerString", NameContext.class), "===", lcName)) {
                    possibleNames.arrayAppend(env).set(new Name(env, alias));
                }
            }
        }

        return ZVal.assign(possibleNames.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(index = 1, name = "type", typeHint = "int")
    public Object getShortName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        Object possibleName = null;
        Object length = null;
        Object possibleNames = null;
        Object shortestName = null;
        Object shortestLength = null;
        possibleNames = this.getPossibleNames(env, name, type);
        shortestName = ZVal.getNull();
        shortestLength = function_constant.get(env, "INF");
        for (ZPair zpairResult854 : ZVal.getIterable(possibleNames, env, true)) {
            possibleName = ZVal.assign(zpairResult854.getValue());
            length =
                    function_strlen
                            .f
                            .env(env)
                            .call(env.callMethod(possibleName, "toCodeString", NameContext.class))
                            .value();
            if (ZVal.isLessThan(length, '<', shortestLength)) {
                shortestName = ZVal.assign(possibleName);
                shortestLength = ZVal.assign(length);
            }
        }

        return ZVal.assign(shortestName);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "PhpParser\\Node\\Name")
    @ConvertedParameter(index = 1, name = "type")
    private Object resolveAlias(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        Object firstPart = null;
        Object alias = null;
        Object checkName = null;
        firstPart = env.callMethod(name, "getFirst", NameContext.class);
        if (ZVal.isTrue(env.callMethod(name, "isQualified", NameContext.class))) {
            checkName = NamespaceGlobal.strtolower.env(env).call(firstPart).value();
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "aliases", env),
                    env,
                    Use_.CONST_TYPE_NORMAL,
                    checkName)) {
                alias =
                        ZVal.assign(
                                new ReferenceClassProperty(this, "aliases", env)
                                        .arrayGet(env, Use_.CONST_TYPE_NORMAL, checkName));
                return ZVal.assign(
                        FullyQualified.runtimeStaticObject.concat(
                                env,
                                alias,
                                env.callMethod(name, "slice", NameContext.class, 1),
                                env.callMethod(name, "getAttributes", NameContext.class)));
            }

        } else if (ZVal.isTrue(env.callMethod(name, "isUnqualified", NameContext.class))) {
            checkName =
                    ZVal.assign(
                            ZVal.strictEqualityCheck(type, "===", Use_.CONST_TYPE_CONSTANT)
                                    ? firstPart
                                    : NamespaceGlobal.strtolower.env(env).call(firstPart).value());
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "aliases", env),
                    env,
                    type,
                    checkName)) {
                return ZVal.assign(
                        new FullyQualified(
                                env,
                                new ReferenceClassProperty(this, "aliases", env)
                                        .arrayGet(env, type, checkName),
                                env.callMethod(name, "getAttributes", NameContext.class)));
            }
        }

        return ZVal.assign(ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(index = 1, name = "lcName", typeHint = "string")
    @ConvertedParameter(index = 2, name = "type", typeHint = "int")
    private Object getNamespaceRelativeName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object lcName = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, false);
        Object namespacePrefix = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.namespace)) {
            return ZVal.assign(new Name(env, name));
        }

        if (ZVal.strictEqualityCheck(type, "===", Use_.CONST_TYPE_CONSTANT)) {
            if (ZVal.toBool(
                            ZVal.toBool(ZVal.strictEqualityCheck(lcName, "===", "true"))
                                    || ZVal.toBool(
                                            ZVal.strictEqualityCheck(lcName, "===", "false")))
                    || ZVal.toBool(ZVal.strictEqualityCheck(lcName, "===", "null"))) {
                return ZVal.assign(new Name(env, name));
            }
        }

        namespacePrefix =
                NamespaceGlobal.strtolower
                        .env(env)
                        .call(toStringR(this.namespace, env) + "\\")
                        .value();
        if (ZVal.strictEqualityCheck(
                0, "===", function_strpos.f.env(env).call(lcName, namespacePrefix).value())) {
            return ZVal.assign(
                    new Name(
                            env,
                            function_substr
                                    .f
                                    .env(env)
                                    .call(
                                            name,
                                            function_strlen
                                                    .f
                                                    .env(env)
                                                    .call(namespacePrefix)
                                                    .value())
                                    .value()));
        }

        return ZVal.assign(ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    private Object normalizeConstName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object ns = null;
        Object nsSep = null;
        Object shortName = null;
        nsSep = NamespaceGlobal.strrpos.env(env).call(name, "\\").value();
        if (ZVal.strictEqualityCheck(false, "===", nsSep)) {
            return ZVal.assign(name);
        }

        ns = function_substr.f.env(env).call(name, 0, nsSep).value();
        shortName = function_substr.f.env(env).call(name, ZVal.add(nsSep, 1)).value();
        return ZVal.assign(
                toStringR(NamespaceGlobal.strtolower.env(env).call(ns).value(), env)
                        + "\\"
                        + toStringR(shortName, env));
    }

    public static final Object CONST_class = "PhpParser\\NameContext";

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
                    .setName("PhpParser\\NameContext")
                    .setLookup(
                            NameContext.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("aliases", "errorHandler", "namespace", "origAliases")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/NameContext.php")
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
