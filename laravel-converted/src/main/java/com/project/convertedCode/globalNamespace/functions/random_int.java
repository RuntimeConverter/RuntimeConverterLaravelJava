package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.RandomCompat_intval;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.nativeClasses.errors.PHPError;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.nativeClasses.errors.TypeError;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.functions.random_bytes;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/paragonie/random_compat/lib/random_int.php

*/

public class random_int extends FunctionBaseRegular {

    public static random_int f = new random_int();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "min")
    @ConvertedParameter(index = 1, name = "max")
    public Object call(RuntimeEnv env, Object... args) {
        Object min = assignParameter(args, 0, false);
        Object max = assignParameter(args, 1, false);
        Object val = null;
        Object ex = null;
        ReferenceContainer randomByteString = new BasicReferenceContainer(null);
        ReferenceContainer bytes = new BasicReferenceContainer(null);
        ReferenceContainer bits = new BasicReferenceContainer(null);
        Object range = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object valueShift = null;
        ReferenceContainer attempts = new BasicReferenceContainer(null);
        Object mask = null;
        try {
            min = RandomCompat_intval.f.env(env).call(min).value();
        } catch (ConvertedException convertedException107) {
            if (convertedException107.instanceOf(TypeError.class, "TypeError")) {
                ex = convertedException107.getObject();
                throw ZVal.getException(
                        env, new TypeError(env, "random_int(): $min must be an integer"));
            } else {
                throw convertedException107;
            }
        }

        try {
            max = RandomCompat_intval.f.env(env).call(max).value();
        } catch (ConvertedException convertedException108) {
            if (convertedException108.instanceOf(TypeError.class, "TypeError")) {
                ex = convertedException108.getObject();
                throw ZVal.getException(
                        env, new TypeError(env, "random_int(): $max must be an integer"));
            } else {
                throw convertedException108;
            }
        }

        if (ZVal.isGreaterThan(min, '>', max)) {
            throw ZVal.getException(
                    env,
                    new PHPError(
                            env, "Minimum value must be less than or equal to the maximum value"));
        }

        if (ZVal.strictEqualityCheck(max, "===", min)) {
            return ZVal.assign(ZVal.toLong(min));
        }

        attempts.setObject(
                ZVal.assign(
                        bits.setObject(
                                ZVal.assign(
                                        bytes.setObject(
                                                ZVal.assign(
                                                        mask = ZVal.assign(valueShift = 0)))))));
        range = ZVal.subtract(max, min);
        if (!function_is_int.f.env(env).call(range).getBool()) {
            bytes.setObject(8);
            mask = ~ZVal.toLong(0);

        } else {
            while (ZVal.isGreaterThan(range, '>', 0)) {
                if (ZVal.strictEqualityCheck(ZVal.modulus(bits.getObject(), 8), "===", 0)) {
                    bytes.setObject(ZVal.increment(bytes.getObject()));
                }

                bits.setObject(ZVal.increment(bits.getObject()));
                range = ZAssignment.shiftRight(">>=", range, 1);
                mask = ZVal.toLong(ZVal.toLong(mask) << ZVal.toLong(1)) | ZVal.toLong(1);
            }

            valueShift = ZVal.assign(min);
        }

        val = 0;
        do {
            if (ZVal.isGreaterThan(attempts.getObject(), '>', 128)) {
                throw ZVal.getException(
                        env,
                        new PHPException(env, "random_int: RNG is broken - too many rejections"));
            }

            randomByteString.setObject(random_bytes.f.env(env).call(bytes.getObject()).value());
            val = ZAssignment.and("&=", val, 0);
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', bytes.getObject());
                    i.setObject(ZVal.increment(i.getObject()))) {
                val =
                        ZAssignment.or(
                                "|=",
                                val,
                                ZVal.toLong(
                                                NamespaceGlobal.ord
                                                        .env(env)
                                                        .call(
                                                                randomByteString.arrayGet(
                                                                        env, i.getObject()))
                                                        .value())
                                        << ZVal.toLong(ZVal.multiply(i.getObject(), 8)));
            }

            val = ZAssignment.and("&=", val, mask);
            val = ZAssignment.add("+=", val, valueShift);
            attempts.setObject(ZVal.increment(attempts.getObject()));

        } while (ZVal.toBool(
                        ZVal.toBool(!function_is_int.f.env(env).call(val).getBool())
                                || ZVal.toBool(ZVal.isGreaterThan(val, '>', max)))
                || ZVal.toBool(ZVal.isLessThan(val, '<', min)));

        return ZVal.assign(ZVal.toLong(val));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/paragonie/random_compat/lib")
                .setFile("/vendor/paragonie/random_compat/lib/random_int.php");
    }
}
