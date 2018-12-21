package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Scalar;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/DNumber.php

*/

public class DNumber extends Scalar {

    public Object value = null;

    public DNumber(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DNumber.class) {
            this.__construct(env, args);
        }
    }

    public DNumber(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "float")
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
        return "Scalar_DNumber";
    }

    public static final Object CONST_class = "PhpParser\\Node\\Scalar\\DNumber";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Scalar.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "str", typeHint = "string")
        public Object parse(RuntimeEnv env, Object... args) {
            ReferenceContainer str = new BasicReferenceContainer(assignParameter(args, 0, false));
            if (ZVal.strictNotEqualityCheck(
                    false,
                    "!==",
                    NamespaceGlobal.strpbrk.env(env).call(str.getObject(), ".eE").value())) {
                return ZVal.assign(ZVal.toDouble(str.getObject()));
            }

            if (ZVal.strictEqualityCheck("0", "===", str.arrayGet(env, 0))) {
                if (ZVal.toBool(ZVal.strictEqualityCheck("x", "===", str.arrayGet(env, 1)))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck("X", "===", str.arrayGet(env, 1)))) {
                    return ZVal.assign(
                            NamespaceGlobal.hexdec.env(env).call(str.getObject()).value());
                }

                if (ZVal.toBool(ZVal.strictEqualityCheck("b", "===", str.arrayGet(env, 1)))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck("B", "===", str.arrayGet(env, 1)))) {
                    return ZVal.assign(
                            NamespaceGlobal.bindec.env(env).call(str.getObject()).value());
                }

                return ZVal.assign(
                        NamespaceGlobal.octdec
                                .env(env)
                                .call(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(
                                                        str.getObject(),
                                                        0,
                                                        NamespaceGlobal.strcspn
                                                                .env(env)
                                                                .call(str.getObject(), "89")
                                                                .value())
                                                .value())
                                .value());
            }

            return ZVal.assign(ZVal.toDouble(str.getObject()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Node\\Scalar\\DNumber")
                    .setLookup(
                            DNumber.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "value")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/DNumber.php")
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
