package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.namespaces.Node.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.classes.TypeHintReference;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/Node/MethodNode.php

*/

public class MethodNode extends RuntimeClassBase {

    public Object name = null;

    public Object code = null;

    public Object visibility = "public";

    public Object _pStatic = false;

    public Object returnsReference = false;

    public Object returnType = null;

    public Object nullableReturnType = false;

    public Object arguments = ZVal.newArray();

    public Object typeHintReference = null;

    public MethodNode(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MethodNode.class) {
            this.__construct(env, args);
        }
    }

    public MethodNode(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "code",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "typeHintReference",
        typeHint = "Prophecy\\Doubler\\Generator\\TypeHintReference",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object code = assignParameter(args, 1, true);
        if (null == code) {
            code = ZVal.getNull();
        }
        Object typeHintReference = assignParameter(args, 2, true);
        if (null == typeHintReference) {
            typeHintReference = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.name = name;
        this.code = code;
        this.typeHintReference =
                ZVal.isTrue(ternaryExpressionTemp = typeHintReference)
                        ? ternaryExpressionTemp
                        : new TypeHintReference(env);
        return null;
    }

    @ConvertedMethod
    public Object getVisibility(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.visibility);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "visibility")
    public Object setVisibility(RuntimeEnv env, Object... args) {
        Object visibility = assignParameter(args, 0, false);
        visibility = NamespaceGlobal.strtolower.env(env).call(visibility).value();
        if (!function_in_array
                .f
                .env(env)
                .call(visibility, ZVal.arrayFromList("public", "private", "protected"))
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("`%s` method visibility is not supported.", visibility)
                                    .value()));
        }

        this.visibility = visibility;
        return null;
    }

    @ConvertedMethod
    public Object isStatic(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._pStatic);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "static",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object setStatic(RuntimeEnv env, Object... args) {
        Object _pStatic = assignParameter(args, 0, true);
        if (null == _pStatic) {
            _pStatic = true;
        }
        this._pStatic = ZVal.toBool(_pStatic);
        return null;
    }

    @ConvertedMethod
    public Object returnsReference(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.returnsReference);
    }

    @ConvertedMethod
    public Object setReturnsReference(RuntimeEnv env, Object... args) {
        this.returnsReference = true;
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "argument",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ArgumentNode"
    )
    public Object addArgument(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "arguments", env).arrayAppend(env).set(argument);
        return null;
    }

    @ConvertedMethod
    public Object getArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.arguments);
    }

    @ConvertedMethod
    public Object hasReturnType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.returnType));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setReturnType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        ReferenceContainer typeMap = new BasicReferenceContainer(null);
        if (ZVal.toBool(ZVal.strictEqualityCheck(type, "===", ""))
                || ZVal.toBool(ZVal.strictEqualityCheck(type, "===", ZVal.getNull()))) {
            this.returnType = ZVal.getNull();
            return null;
        }

        typeMap.setObject(
                ZVal.newArray(
                        new ZPair("double", "float"),
                        new ZPair("real", "float"),
                        new ZPair("boolean", "bool"),
                        new ZPair("integer", "int")));
        if (arrayActionR(ArrayAction.ISSET, typeMap, env, type)) {
            type = ZVal.assign(typeMap.arrayGet(env, type));
        }

        this.returnType =
                ZVal.isTrue(
                                env.callMethod(
                                        this.typeHintReference,
                                        "isBuiltInReturnTypeHint",
                                        MethodNode.class,
                                        type))
                        ? type
                        : "\\" + toStringR(function_ltrim.f.env(env).call(type, "\\").value(), env);
        return null;
    }

    @ConvertedMethod
    public Object getReturnType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.returnType);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object setNullableReturnType(RuntimeEnv env, Object... args) {
        Object bool = assignParameter(args, 0, true);
        if (null == bool) {
            bool = true;
        }
        this.nullableReturnType = ZVal.toBool(bool);
        return null;
    }

    @ConvertedMethod
    public Object hasNullableReturnType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.nullableReturnType);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    public Object setCode(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        this.code = code;
        return null;
    }

    @ConvertedMethod
    public Object getCode(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.returnsReference)) {
            return ZVal.assign(
                    "throw new \\Prophecy\\Exception\\Doubler\\ReturnByReferenceException('Returning by reference not supported', get_class($this), '"
                            + toStringR(this.name, env)
                            + "');");
        }

        return ZVal.assign(toStringR(this.code, env));
    }

    @ConvertedMethod
    public Object useParentCode(RuntimeEnv env, Object... args) {
        this.code =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "return parent::%s(%s);",
                                this.getName(env),
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                ", ",
                                                function_array_map
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                ZVal.newArray(
                                                                        new ZPair(0, this),
                                                                        new ZPair(
                                                                                1,
                                                                                "generateArgument")),
                                                                this.arguments)
                                                        .value())
                                        .value())
                        .value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "arg",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ArgumentNode"
    )
    private Object generateArgument(RuntimeEnv env, Object... args) {
        Object arg = assignParameter(args, 0, false);
        Object argument = null;
        argument = "$" + toStringR(env.callMethod(arg, "getName", MethodNode.class), env);
        if (ZVal.isTrue(env.callMethod(arg, "isVariadic", MethodNode.class))) {
            argument = "..." + toStringR(argument, env);
        }

        return ZVal.assign(argument);
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\Generator\\Node\\MethodNode";

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
                    .setName("Prophecy\\Doubler\\Generator\\Node\\MethodNode")
                    .setLookup(
                            MethodNode.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "arguments",
                            "code",
                            "name",
                            "nullableReturnType",
                            "returnType",
                            "returnsReference",
                            "static",
                            "typeHintReference",
                            "visibility")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/Node/MethodNode.php")
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
