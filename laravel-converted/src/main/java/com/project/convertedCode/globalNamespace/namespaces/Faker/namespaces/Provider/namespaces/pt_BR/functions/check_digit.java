package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.pt_BR.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/pt_BR/check_digit.php

*/

public class check_digit extends FunctionBaseRegular {

    public static check_digit f = new check_digit();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "numbers")
    public Object call(RuntimeEnv env, Object... args) {
        ReferenceContainer numbers = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object verifier = null;
        Object multiplier = null;
        Object length = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object second_algorithm = null;
        length = function_strlen.f.env(env).call(numbers.getObject()).value();
        second_algorithm = ZVal.isGreaterThanOrEqualTo(length, ">=", 12);
        verifier = 0;
        for (i.setObject(1);
                ZVal.isLessThanOrEqualTo(i.getObject(), "<=", length);
                i.setObject(ZVal.increment(i.getObject()))) {
            if (!ZVal.isTrue(second_algorithm)) {
                multiplier = ZVal.add(i.getObject(), 1);

            } else {
                multiplier =
                        ZVal.assign(
                                ZVal.isGreaterThanOrEqualTo(i.getObject(), ">=", 9)
                                        ? ZVal.subtract(i.getObject(), 7)
                                        : ZVal.add(i.getObject(), 1));
            }

            verifier =
                    ZAssignment.add(
                            "+=",
                            verifier,
                            ZVal.multiply(
                                    numbers.arrayGet(env, ZVal.subtract(length, i.getObject())),
                                    multiplier));
        }

        verifier = ZVal.subtract(11, ZVal.modulus(verifier, 11));
        if (ZVal.isGreaterThanOrEqualTo(verifier, ">=", 10)) {
            verifier = 0;
        }

        return ZVal.assign(verifier);
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/fzaninotto/faker/src/Faker/Provider/pt_BR")
                .setFile("/vendor/fzaninotto/faker/src/Faker/Provider/pt_BR/check_digit.php");
    }
}
