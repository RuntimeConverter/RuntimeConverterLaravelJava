package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes;

import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Mixed_;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Null_;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.This;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Boolean;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_implements;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Array_;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Callable_;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Object_;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Self_;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Static_;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Float_;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Parent_;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Nullable;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.String_;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Void_;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Resource_;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Scalar;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Context;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Iterable_;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.FqsenResolver;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Compound;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Integer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.Type;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/type-resolver/src/TypeResolver.php

*/

public final class TypeResolver extends RuntimeClassBase {

    public Object keywords =
            ZVal.newArray(
                    new ZPair("string", String_.CONST_class),
                    new ZPair("int", Integer.CONST_class),
                    new ZPair("integer", Integer.CONST_class),
                    new ZPair("bool", Boolean.CONST_class),
                    new ZPair("boolean", Boolean.CONST_class),
                    new ZPair("float", Float_.CONST_class),
                    new ZPair("double", Float_.CONST_class),
                    new ZPair("object", Object_.CONST_class),
                    new ZPair("mixed", Mixed_.CONST_class),
                    new ZPair("array", Array_.CONST_class),
                    new ZPair("resource", Resource_.CONST_class),
                    new ZPair("void", Void_.CONST_class),
                    new ZPair("null", Null_.CONST_class),
                    new ZPair("scalar", Scalar.CONST_class),
                    new ZPair("callback", Callable_.CONST_class),
                    new ZPair("callable", Callable_.CONST_class),
                    new ZPair("false", Boolean.CONST_class),
                    new ZPair("true", Boolean.CONST_class),
                    new ZPair("self", Self_.CONST_class),
                    new ZPair("$this", This.CONST_class),
                    new ZPair("static", Static_.CONST_class),
                    new ZPair("parent", Parent_.CONST_class),
                    new ZPair("iterable", Iterable_.CONST_class));

    public Object fqsenResolver = null;

    public TypeResolver(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TypeResolver.class) {
            this.__construct(env, args);
        }
    }

    public TypeResolver(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "fqsenResolver",
        typeHint = "phpDocumentor\\Reflection\\FqsenResolver",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object fqsenResolver = assignParameter(args, 0, true);
        if (null == fqsenResolver) {
            fqsenResolver = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.fqsenResolver =
                ZVal.isTrue(ternaryExpressionTemp = fqsenResolver)
                        ? ternaryExpressionTemp
                        : new FqsenResolver(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object resolve(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.getNull();
        }
        if (!function_is_string.f.env(env).call(type).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Attempted to resolve type but it appeared not to be a string, received: "
                                    + toStringR(
                                            NamespaceGlobal.var_export
                                                    .env(env)
                                                    .call(type, true)
                                                    .value(),
                                            env)));
        }

        type = function_trim.f.env(env).call(type).value();
        if (!ZVal.isTrue(type)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Attempted to resolve \""
                                    + toStringR(type, env)
                                    + "\" but it appears to be empty"));
        }

        if (ZVal.strictEqualityCheck(context, "===", ZVal.getNull())) {
            context = new Context(env, "");
        }

        SwitchEnumType51 switchVariable51 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType51.DEFAULT_CASE,
                        SwitchEnumType51.DYNAMIC_TYPE_156,
                        this.isNullableType(env, type),
                        SwitchEnumType51.DYNAMIC_TYPE_157,
                        this.isKeyword(env, type),
                        SwitchEnumType51.DYNAMIC_TYPE_158,
                        this.isCompoundType(env, type),
                        SwitchEnumType51.DYNAMIC_TYPE_159,
                        this.isTypedArray(env, type),
                        SwitchEnumType51.DYNAMIC_TYPE_160,
                        this.isFqsen(env, type),
                        SwitchEnumType51.DYNAMIC_TYPE_161,
                        this.isPartialStructuralElementName(env, type));
        switch (switchVariable51) {
            case DYNAMIC_TYPE_156:
                return ZVal.assign(this.resolveNullableType(env, type, context));
            case DYNAMIC_TYPE_157:
                return ZVal.assign(this.resolveKeyword(env, type));
            case DYNAMIC_TYPE_158:
                return ZVal.assign(this.resolveCompoundType(env, type, context));
            case DYNAMIC_TYPE_159:
                return ZVal.assign(this.resolveTypedArray(env, type, context));
            case DYNAMIC_TYPE_160:
                return ZVal.assign(this.resolveTypedObject(env, type));
            case DYNAMIC_TYPE_161:
                return ZVal.assign(this.resolveTypedObject(env, type, context));
            case DEFAULT_CASE:
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                "Unable to resolve type \""
                                        + toStringR(type, env)
                                        + "\", there is no known method to resolve it"));
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keyword")
    @ConvertedParameter(index = 1, name = "typeClassName")
    public Object addKeyword(RuntimeEnv env, Object... args) {
        Object keyword = assignParameter(args, 0, false);
        Object typeClassName = assignParameter(args, 1, false);
        if (!function_class_exists.f.env(env).call(typeClassName).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "The Value Object that needs to be created with a keyword \""
                                    + toStringR(keyword, env)
                                    + "\" must be an existing class"
                                    + " but we could not find the class "
                                    + toStringR(typeClassName, env)));
        }

        if (!function_in_array
                .f
                .env(env)
                .call(
                        Type.CONST_class,
                        function_class_implements.f.env(env).call(typeClassName).value())
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "The class \""
                                    + toStringR(typeClassName, env)
                                    + "\" must implement the interface \"phpDocumentor\\Reflection\\Type\""));
        }

        new ReferenceClassProperty(this, "keywords", env)
                .arrayAccess(env, keyword)
                .set(typeClassName);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    private Object isTypedArray(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        function_substr.f.env(env).call(type, -2).value(),
                        "===",
                        CONST_OPERATOR_ARRAY));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    private Object isKeyword(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        return ZVal.assign(
                function_in_array
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.strtolower.env(env).call(type).value(),
                                function_array_keys.f.env(env).call(this.keywords).value(),
                                true)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    private Object isPartialStructuralElementName(RuntimeEnv env, Object... args) {
        ReferenceContainer type = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        type.arrayGet(env, 0), "!==", CONST_OPERATOR_NAMESPACE))
                        && ZVal.toBool(!ZVal.isTrue(this.isKeyword(env, type.getObject()))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    private Object isFqsen(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        function_strpos.f.env(env).call(type, CONST_OPERATOR_NAMESPACE).value(),
                        "===",
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    private Object isCompoundType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        function_strpos.f.env(env).call(type, "|").value(), "!==", false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    private Object isNullableType(RuntimeEnv env, Object... args) {
        ReferenceContainer type = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(ZVal.strictEqualityCheck(type.arrayGet(env, 0), "===", "?"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context"
    )
    private Object resolveTypedArray(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, false);
        return ZVal.assign(
                new Array_(
                        env,
                        this.resolve(
                                env,
                                function_substr.f.env(env).call(type, 0, -2).value(),
                                context)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    private Object resolveKeyword(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object className = null;
        className =
                ZVal.assign(
                        new ReferenceClassProperty(this, "keywords", env)
                                .arrayGet(
                                        env,
                                        NamespaceGlobal.strtolower.env(env).call(type).value()));
        return ZVal.assign(env.createNew(className));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object resolveTypedObject(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.getNull();
        }
        return ZVal.assign(
                new Object_(
                        env,
                        env.callMethod(
                                this.fqsenResolver, "resolve", TypeResolver.class, type, context)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context"
    )
    private Object resolveCompoundType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, false);
        ReferenceContainer types = new BasicReferenceContainer(null);
        Object part = null;
        types.setObject(ZVal.newArray());
        for (ZPair zpairResult937 :
                ZVal.getIterable(function_explode.f.env(env).call("|", type).value(), env, true)) {
            part = ZVal.assign(zpairResult937.getValue());
            types.arrayAppend(env).set(this.resolve(env, part, context));
        }

        return ZVal.assign(new Compound(env, types.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context"
    )
    private Object resolveNullableType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, false);
        return ZVal.assign(
                new Nullable(
                        env,
                        this.resolve(
                                env, function_ltrim.f.env(env).call(type, "?").value(), context)));
    }

    public static final Object CONST_OPERATOR_ARRAY = "[]";

    public static final Object CONST_OPERATOR_NAMESPACE = "\\";

    public static final Object CONST_class = "phpDocumentor\\Reflection\\TypeResolver";

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
                    .setName("phpDocumentor\\Reflection\\TypeResolver")
                    .setLookup(
                            TypeResolver.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("fqsenResolver", "keywords")
                    .setFilename("vendor/phpdocumentor/type-resolver/src/TypeResolver.php")
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

    private enum SwitchEnumType51 {
        DYNAMIC_TYPE_156,
        DYNAMIC_TYPE_157,
        DYNAMIC_TYPE_158,
        DYNAMIC_TYPE_159,
        DYNAMIC_TYPE_160,
        DYNAMIC_TYPE_161,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
