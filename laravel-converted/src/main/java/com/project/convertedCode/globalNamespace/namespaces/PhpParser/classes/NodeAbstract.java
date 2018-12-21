package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Node;
import com.runtimeconverter.runtime.nativeInterfaces.JsonSerializable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Comment.classes.Doc;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/NodeAbstract.php

*/

public abstract class NodeAbstract extends RuntimeClassBase implements Node, JsonSerializable {

    public Object attributes = null;

    public NodeAbstract(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NodeAbstract.class) {
            this.__construct(env, args);
        }
    }

    public NodeAbstract(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        this.attributes = attributes;
        return null;
    }

    @ConvertedMethod
    public Object getLine(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "attributes", env)
                                                .arrayGet(env, "startLine"))
                        ? ternaryExpressionTemp
                        : -1);
    }

    @ConvertedMethod
    public Object getStartLine(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "attributes", env)
                                                .arrayGet(env, "startLine"))
                        ? ternaryExpressionTemp
                        : -1);
    }

    @ConvertedMethod
    public Object getEndLine(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "attributes", env)
                                                .arrayGet(env, "endLine"))
                        ? ternaryExpressionTemp
                        : -1);
    }

    @ConvertedMethod
    public Object getStartTokenPos(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "attributes", env)
                                                .arrayGet(env, "startTokenPos"))
                        ? ternaryExpressionTemp
                        : -1);
    }

    @ConvertedMethod
    public Object getEndTokenPos(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "attributes", env)
                                                .arrayGet(env, "endTokenPos"))
                        ? ternaryExpressionTemp
                        : -1);
    }

    @ConvertedMethod
    public Object getStartFilePos(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "attributes", env)
                                                .arrayGet(env, "startFilePos"))
                        ? ternaryExpressionTemp
                        : -1);
    }

    @ConvertedMethod
    public Object getEndFilePos(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "attributes", env)
                                                .arrayGet(env, "endFilePos"))
                        ? ternaryExpressionTemp
                        : -1);
    }

    @ConvertedMethod
    public Object getComments(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "attributes", env)
                                                .arrayGet(env, "comments"))
                        ? ternaryExpressionTemp
                        : ZVal.newArray());
    }

    @ConvertedMethod
    public Object getDocComment(RuntimeEnv env, Object... args) {
        ReferenceContainer comments = new BasicReferenceContainer(null);
        Object lastComment = null;
        comments.setObject(this.getComments(env));
        if (!ZVal.isTrue(comments.getObject())) {
            return ZVal.assign(ZVal.getNull());
        }

        lastComment =
                ZVal.assign(
                        comments.arrayGet(
                                env,
                                ZVal.subtract(
                                        function_count
                                                .f
                                                .env(env)
                                                .call(comments.getObject())
                                                .value(),
                                        1)));
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(lastComment, Doc.class, "PhpParser\\Comment\\Doc"))) {
            return ZVal.assign(ZVal.getNull());
        }

        return ZVal.assign(lastComment);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "docComment", typeHint = "PhpParser\\Comment\\Doc")
    public Object setDocComment(RuntimeEnv env, Object... args) {
        Object docComment = assignParameter(args, 0, false);
        Object numComments = null;
        ReferenceContainer comments = new BasicReferenceContainer(null);
        comments.setObject(this.getComments(env));
        numComments = function_count.f.env(env).call(comments.getObject()).value();
        if (ZVal.toBool(ZVal.isGreaterThan(numComments, '>', 0))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                comments.arrayGet(env, ZVal.subtract(numComments, 1)),
                                Doc.class,
                                "PhpParser\\Comment\\Doc"))) {
            comments.arrayAccess(env, ZVal.subtract(numComments, 1)).set(docComment);

        } else {
            comments.arrayAppend(env).set(docComment);
        }

        this.setAttribute(env, "comments", comments.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key", typeHint = "string")
    @ConvertedParameter(index = 1, name = "value")
    public Object setAttribute(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "attributes", env).arrayAccess(env, key).set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key", typeHint = "string")
    public Object hasAttribute(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(function_array_key_exists.f.env(env).call(key, this.attributes).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getAttribute(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        if (!function_array_key_exists.f.env(env).call(key, this.attributes).getBool()) {
            return ZVal.assign(_pDefault);

        } else {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "attributes", env).arrayGet(env, key));
        }
    }

    @ConvertedMethod
    public Object getAttributes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.attributes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    public Object setAttributes(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        this.attributes = attributes;
        return null;
    }

    @ConvertedMethod
    public Object jsonSerialize(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.add(
                        ZVal.newArray(
                                new ZPair(
                                        "nodeType",
                                        env.callMethod(this, "getType", NodeAbstract.class))),
                        NamespaceGlobal.get_object_vars.env(env).call(this).value()));
    }

    public static final Object CONST_class = "PhpParser\\NodeAbstract";

    @ConvertedMethod()
    public abstract Object getType(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object getSubNodeNames(RuntimeEnv env, Object... args);

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
                    .setName("PhpParser\\NodeAbstract")
                    .setLookup(
                            NodeAbstract.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/NodeAbstract.php")
                    .addInterface("PhpParser\\Node")
                    .addInterface("JsonSerializable")
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
