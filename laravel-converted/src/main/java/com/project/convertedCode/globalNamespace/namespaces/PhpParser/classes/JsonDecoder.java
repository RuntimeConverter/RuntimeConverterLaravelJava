package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Comment;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Comment.classes.Doc;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/JsonDecoder.php

*/

public class JsonDecoder extends RuntimeClassBase {

    public Object reflectionClassCache = null;

    public JsonDecoder(RuntimeEnv env, Object... args) {
        super(env);
    }

    public JsonDecoder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "json", typeHint = "string")
    public Object decode(RuntimeEnv env, Object... args) {
        Object json = assignParameter(args, 0, false);
        Object value = null;
        value = NamespaceGlobal.json_decode.env(env).call(json, true).value();
        if (NamespaceGlobal.json_last_error.env(env).call().getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "JSON decoding error: "
                                    + toStringR(
                                            NamespaceGlobal.json_last_error_msg
                                                    .env(env)
                                                    .call()
                                                    .value(),
                                            env)));
        }

        return ZVal.assign(this.decodeRecursive(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object decodeRecursive(RuntimeEnv env, Object... args) {
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (function_is_array.f.env(env).call(value.getObject()).getBool()) {
            if (arrayActionR(ArrayAction.ISSET, value, env, "nodeType")) {
                if (ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        value.arrayGet(env, "nodeType"), "===", "Comment"))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        value.arrayGet(env, "nodeType"), "===", "Comment_Doc"))) {
                    return ZVal.assign(this.decodeComment(env, value.getObject()));
                }

                return ZVal.assign(this.decodeNode(env, value.getObject()));
            }

            return ZVal.assign(this.decodeArray(env, value.getObject()));
        }

        return ZVal.assign(value.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array", typeHint = "array")
    private Object decodeArray(RuntimeEnv env, Object... args) {
        Object array = assignParameter(args, 0, false);
        ReferenceContainer decodedArray = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        decodedArray.setObject(ZVal.newArray());
        for (ZPair zpairResult849 : ZVal.getIterable(array, env, false)) {
            key = ZVal.assign(zpairResult849.getKey());
            value = ZVal.assign(zpairResult849.getValue());
            decodedArray.arrayAccess(env, key).set(this.decodeRecursive(env, value));
        }

        return ZVal.assign(decodedArray.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "array")
    private Object decodeNode(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object node = null;
        Object name = null;
        Object reflectionClass = null;
        Object nodeType = null;
        Object subNode = null;
        nodeType = ZVal.assign(value.arrayGet(env, "nodeType"));
        if (!function_is_string.f.env(env).call(nodeType).getBool()) {
            throw ZVal.getException(env, new RuntimeException(env, "Node type must be a string"));
        }

        reflectionClass = this.reflectionClassFromNodeType(env, nodeType);
        node = env.callMethod(reflectionClass, "newInstanceWithoutConstructor", JsonDecoder.class);
        if (arrayActionR(ArrayAction.ISSET, value, env, "attributes")) {
            if (!function_is_array.f.env(env).call(value.arrayGet(env, "attributes")).getBool()) {
                throw ZVal.getException(
                        env, new RuntimeException(env, "Attributes must be an array"));
            }

            env.callMethod(
                    node,
                    "setAttributes",
                    JsonDecoder.class,
                    this.decodeArray(env, value.arrayGet(env, "attributes")));
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult850 : ZVal.getIterable(value.getObject(), env, false)) {
            name = ZVal.assign(zpairResult850.getKey());
            subNode = ZVal.assign(zpairResult850.getValue());
            if (ZVal.toBool(ZVal.strictEqualityCheck(name, "===", "nodeType"))
                    || ZVal.toBool(ZVal.strictEqualityCheck(name, "===", "attributes"))) {
                continue;
            }

            toObjectR(node)
                    .accessProp(this, env)
                    .name(name)
                    .set(this.decodeRecursive(env, subNode));
        }

        return ZVal.assign(node);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "array")
    private Object decodeComment(RuntimeEnv env, Object... args) {
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object className = null;
        Object ternaryExpressionTemp = null;
        className =
                ZVal.assign(
                        ZVal.strictEqualityCheck(value.arrayGet(env, "nodeType"), "===", "Comment")
                                ? Comment.CONST_class
                                : Doc.CONST_class);
        if (!arrayActionR(ArrayAction.ISSET, value, env, "text")) {
            throw ZVal.getException(env, new RuntimeException(env, "Comment must have text"));
        }

        return ZVal.assign(
                env.createNew(
                        className,
                        value.arrayGet(env, "text"),
                        ZVal.isDefined(ternaryExpressionTemp = value.arrayGet(env, "line"))
                                ? ternaryExpressionTemp
                                : -1,
                        ZVal.isDefined(ternaryExpressionTemp = value.arrayGet(env, "filePos"))
                                ? ternaryExpressionTemp
                                : -1,
                        ZVal.isDefined(ternaryExpressionTemp = value.arrayGet(env, "tokenPos"))
                                ? ternaryExpressionTemp
                                : -1));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodeType", typeHint = "string")
    private Object reflectionClassFromNodeType(RuntimeEnv env, Object... args) {
        Object nodeType = assignParameter(args, 0, false);
        Object className = null;
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "reflectionClassCache", env),
                env,
                nodeType)) {
            className = this.classNameFromNodeType(env, nodeType);
            new ReferenceClassProperty(this, "reflectionClassCache", env)
                    .arrayAccess(env, nodeType)
                    .set(new ReflectionClass(env, className));
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "reflectionClassCache", env)
                        .arrayGet(env, nodeType));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodeType", typeHint = "string")
    private Object classNameFromNodeType(RuntimeEnv env, Object... args) {
        Object nodeType = assignParameter(args, 0, false);
        Object className = null;
        className =
                "PhpParser\\Node\\"
                        + toStringR(
                                NamespaceGlobal.strtr.env(env).call(nodeType, "_", "\\").value(),
                                env);
        if (function_class_exists.f.env(env).call(className).getBool()) {
            return ZVal.assign(className);
        }

        className = toStringR(className, env) + "_";
        if (function_class_exists.f.env(env).call(className).getBool()) {
            return ZVal.assign(className);
        }

        throw ZVal.getException(
                env,
                new RuntimeException(
                        env, "Unknown node type \"" + toStringR(nodeType, env) + "\""));
    }

    public static final Object CONST_class = "PhpParser\\JsonDecoder";

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
                    .setName("PhpParser\\JsonDecoder")
                    .setLookup(
                            JsonDecoder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("reflectionClassCache")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/JsonDecoder.php")
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
