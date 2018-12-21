package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LengthException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_sum;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_walk;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/Barcode.php

*/

public class Barcode extends Base {

    public Barcode(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Barcode.class) {
            this.__construct(env, args);
        }
    }

    public Barcode(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "length",
        defaultValue = "13",
        defaultValueType = "number"
    )
    private Object ean(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object length = assignParameter(args, 0, true);
        if (null == length) {
            length = 13;
        }
        ReferenceContainer code = new BasicReferenceContainer(null);
        code.setObject(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Barcode.class)
                        .method("numerify")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                function_str_repeat
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                "#",
                                                                                ZVal.subtract(
                                                                                        length, 1))
                                                                        .value())))
                        .call(rLastRefArgs.get(0))
                        .value());
        return ZVal.assign(
                toStringR(code.getObject(), env)
                        + toStringR(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Barcode.class)
                                        .method("eanChecksum")
                                        .addReferenceArgs(
                                                new RuntimeArgsWithReferences().add(0, code))
                                        .call(code.getObject())
                                        .value(),
                                env));
    }

    @ConvertedMethod
    public Object ean13(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.ean(env, 13));
    }

    @ConvertedMethod
    public Object ean8(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.ean(env, 8));
    }

    @ConvertedMethod
    public Object isbn10(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        ReferenceContainer code = new BasicReferenceContainer(null);
        code.setObject(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Barcode.class)
                        .method("numerify")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                function_str_repeat
                                                                        .f
                                                                        .env(env)
                                                                        .call("#", 9)
                                                                        .value())))
                        .call(rLastRefArgs.get(0))
                        .value());
        return ZVal.assign(
                toStringR(code.getObject(), env)
                        + toStringR(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Barcode.class)
                                        .method("isbnChecksum")
                                        .addReferenceArgs(
                                                new RuntimeArgsWithReferences().add(0, code))
                                        .call(code.getObject())
                                        .value(),
                                env));
    }

    @ConvertedMethod
    public Object isbn13(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        ReferenceContainer code = new BasicReferenceContainer(null);
        code.setObject(
                "97"
                        + toStringR(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Barcode.class)
                                        .method("numberBetween")
                                        .addReferenceArgs(new RuntimeArgsWithReferences())
                                        .call(8, 9)
                                        .value(),
                                env)
                        + toStringR(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Barcode.class)
                                        .method("numerify")
                                        .addReferenceArgs(
                                                rLastRefArgs =
                                                        new RuntimeArgsWithReferences()
                                                                .add(
                                                                        0,
                                                                        handleReturnReference(
                                                                                function_str_repeat
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                "#",
                                                                                                9)
                                                                                        .value())))
                                        .call(rLastRefArgs.get(0))
                                        .value(),
                                env));
        return ZVal.assign(
                toStringR(code.getObject(), env)
                        + toStringR(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Barcode.class)
                                        .method("eanChecksum")
                                        .addReferenceArgs(
                                                new RuntimeArgsWithReferences().add(0, code))
                                        .call(code.getObject())
                                        .value(),
                                env));
    }

    public static final Object CONST_class = "Faker\\Provider\\Barcode";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Base.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "input")
        protected Object eanChecksum(RuntimeEnv env, Object... args) {
            Object input = assignParameter(args, 0, false);
            ReferenceContainer sequence = new BasicReferenceContainer(null);
            Object sums = null;
            Object n = null;
            Object digit = null;
            sequence.setObject(
                    ZVal.assign(
                            ZVal.strictEqualityCheck(
                                            ZVal.add(
                                                    function_strlen.f.env(env).call(input).value(),
                                                    1),
                                            "===",
                                            8)
                                    ? ZVal.arrayFromList(3, 1)
                                    : ZVal.arrayFromList(1, 3)));
            sums = 0;
            for (ZPair zpairResult105 :
                    ZVal.getIterable(
                            NamespaceGlobal.str_split.env(env).call(input).value(), env, false)) {
                n = ZVal.assign(zpairResult105.getKey());
                digit = ZVal.assign(zpairResult105.getValue());
                sums =
                        ZAssignment.add(
                                "+=",
                                sums,
                                ZVal.multiply(digit, sequence.arrayGet(env, ZVal.modulus(n, 2))));
            }

            return ZVal.assign(ZVal.modulus(ZVal.subtract(10, ZVal.modulus(sums, 10)), 10));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "input")
        protected Object isbnChecksum(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/fzaninotto/faker/src/Faker/Provider")
                            .setFile("/vendor/fzaninotto/faker/src/Faker/Provider/Barcode.php");
            Object input = assignParameter(args, 0, false);
            Object result = null;
            Object length = null;
            Object digits = null;
            length = 9;
            if (ZVal.strictNotEqualityCheck(
                    function_strlen.f.env(env).call(input).value(), "!==", length)) {
                throw ZVal.getException(
                        env,
                        new LengthException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Input length should be equal to %d", length)
                                        .value()));
            }

            digits = NamespaceGlobal.str_split.env(env).call(input).value();
            function_array_walk
                    .f
                    .env(env)
                    .call(
                            digits,
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Faker\\Provider",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(index = 0, name = "digit")
                                @ConvertedParameter(index = 1, name = "position")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    ReferenceContainer digit =
                                            assignParameterRef(
                                                    runtimePassByReferenceArgs, args, 0, false);
                                    Object position = assignParameter(args, 1, false);
                                    digit.setObject(
                                            ZVal.multiply(
                                                    ZVal.subtract(10, position),
                                                    digit.getObject()));
                                    return null;
                                }
                            });
            result =
                    ZVal.modulus(
                            ZVal.subtract(
                                    11,
                                    ZVal.modulus(
                                            function_array_sum.f.env(env).call(digits).value(),
                                            11)),
                            11);
            return ZVal.assign(ZVal.isLessThan(result, '<', 10) ? result : "X");
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\Barcode")
                    .setLookup(
                            Barcode.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/Barcode.php")
                    .addExtendsClass("Faker\\Provider\\Base")
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
