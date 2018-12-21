package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Error;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Scalar;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/LNumber.php

*/

public class LNumber extends Scalar {

    public Object value = null;

    public LNumber(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LNumber.class) {
            this.__construct(env, args);
        }
    }

    public LNumber(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "int")
    @ConvertedParameter(
        index = 1,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        super.__construct(env, attributes);
        this.value = value;
        return null;
    }

    @ConvertedMethod
    public Object getSubNodeNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("value"));
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return "Scalar_LNumber";
    }

    public static final Object CONST_KIND_BIN = 2;

    public static final Object CONST_KIND_OCT = 8;

    public static final Object CONST_KIND_DEC = 10;

    public static final Object CONST_KIND_HEX = 16;

    public static final Object CONST_class = "PhpParser\\Node\\Scalar\\LNumber";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Scalar.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "str", typeHint = "string")
        @ConvertedParameter(
            index = 1,
            name = "attributes",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 2,
            name = "allowInvalidOctal",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object fromString(RuntimeEnv env, Object... args) {
            ReferenceContainer str = new BasicReferenceContainer(assignParameter(args, 0, false));
            ReferenceContainer attributes =
                    new BasicReferenceContainer(assignParameter(args, 1, true));
            if (null == attributes.getObject()) {
                attributes.setObject(ZVal.newArray());
            }
            Object allowInvalidOctal = assignParameter(args, 2, true);
            if (null == allowInvalidOctal) {
                allowInvalidOctal = false;
            }
            if (ZVal.toBool(ZVal.strictNotEqualityCheck("0", "!==", str.arrayGet(env, 0)))
                    || ZVal.toBool(ZVal.strictEqualityCheck("0", "===", str.getObject()))) {
                attributes
                        .arrayAccess(env, "kind")
                        .set(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PhpParser
                                        .namespaces
                                        .Node
                                        .namespaces
                                        .Scalar
                                        .classes
                                        .LNumber
                                        .CONST_KIND_DEC);
                return ZVal.assign(
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Scalar
                                .classes
                                .LNumber(
                                env, ZVal.toLong(str.getObject()), attributes.getObject()));
            }

            if (ZVal.toBool(ZVal.strictEqualityCheck("x", "===", str.arrayGet(env, 1)))
                    || ZVal.toBool(ZVal.strictEqualityCheck("X", "===", str.arrayGet(env, 1)))) {
                attributes
                        .arrayAccess(env, "kind")
                        .set(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PhpParser
                                        .namespaces
                                        .Node
                                        .namespaces
                                        .Scalar
                                        .classes
                                        .LNumber
                                        .CONST_KIND_HEX);
                return ZVal.assign(
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Scalar
                                .classes
                                .LNumber(
                                env,
                                NamespaceGlobal.hexdec.env(env).call(str.getObject()).value(),
                                attributes.getObject()));
            }

            if (ZVal.toBool(ZVal.strictEqualityCheck("b", "===", str.arrayGet(env, 1)))
                    || ZVal.toBool(ZVal.strictEqualityCheck("B", "===", str.arrayGet(env, 1)))) {
                attributes
                        .arrayAccess(env, "kind")
                        .set(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PhpParser
                                        .namespaces
                                        .Node
                                        .namespaces
                                        .Scalar
                                        .classes
                                        .LNumber
                                        .CONST_KIND_BIN);
                return ZVal.assign(
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Scalar
                                .classes
                                .LNumber(
                                env,
                                NamespaceGlobal.bindec.env(env).call(str.getObject()).value(),
                                attributes.getObject()));
            }

            if (ZVal.toBool(!ZVal.isTrue(allowInvalidOctal))
                    && ZVal.toBool(
                            NamespaceGlobal.strpbrk.env(env).call(str.getObject(), "89").value())) {
                throw ZVal.getException(
                        env, new Error(env, "Invalid numeric literal", attributes.getObject()));
            }

            attributes
                    .arrayAccess(env, "kind")
                    .set(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PhpParser
                                    .namespaces
                                    .Node
                                    .namespaces
                                    .Scalar
                                    .classes
                                    .LNumber
                                    .CONST_KIND_OCT);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PhpParser
                            .namespaces
                            .Node
                            .namespaces
                            .Scalar
                            .classes
                            .LNumber(
                            env,
                            NamespaceGlobal.intval.env(env).call(str.getObject(), 8).value(),
                            attributes.getObject()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Node\\Scalar\\LNumber")
                    .setLookup(
                            LNumber.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "value")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/LNumber.php")
                    .addInterface("PhpParser\\Node")
                    .addInterface("JsonSerializable")
                    .addExtendsClass("PhpParser\\Node\\Scalar")
                    .addExtendsClass("PhpParser\\Node\\Expr")
                    .addExtendsClass("PhpParser\\NodeAbstract")
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
