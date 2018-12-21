package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LengthException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.math.function_round;
import com.project.convertedCode.globalNamespace.namespaces.Faker.classes.DefaultGenerator;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.project.convertedCode.globalNamespace.namespaces.Faker.classes.ValidGenerator;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.namespaces.Faker.classes.UniqueGenerator;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/Base.php

*/

public class Base extends RuntimeClassBase {

    public Object generator = null;

    public Object unique = null;

    public Base(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Base.class) {
            this.__construct(env, args);
        }
    }

    public Base(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "generator", typeHint = "Faker\\Generator")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object generator = assignParameter(args, 0, false);
        this.generator = generator;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "weight",
        defaultValue = "0.5",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object optional(RuntimeEnv env, Object... args) {
        Object weight = assignParameter(args, 0, true);
        if (null == weight) {
            weight = 0.5;
        }
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        if (ZVal.toBool(
                        ZVal.toBool(ZVal.isGreaterThan(weight, '>', 0))
                                && ZVal.toBool(ZVal.isLessThan(weight, '<', 1)))
                && ZVal.toBool(
                        ZVal.isLessThanOrEqualTo(
                                ZVal.divide(
                                        NamespaceGlobal.mt_rand.env(env).call().value(),
                                        NamespaceGlobal.mt_getrandmax.env(env).call().value()),
                                "<=",
                                weight))) {
            return ZVal.assign(this.generator);
        }

        if (ZVal.toBool(function_is_int.f.env(env).call(weight).value())
                && ZVal.toBool(
                        ZVal.isLessThanOrEqualTo(
                                NamespaceGlobal.mt_rand.env(env).call(1, 100).value(),
                                "<=",
                                weight))) {
            return ZVal.assign(this.generator);
        }

        return ZVal.assign(new DefaultGenerator(env, _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "reset",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "maxRetries",
        defaultValue = "10000",
        defaultValueType = "number"
    )
    public Object unique(RuntimeEnv env, Object... args) {
        Object reset = assignParameter(args, 0, true);
        if (null == reset) {
            reset = false;
        }
        Object maxRetries = assignParameter(args, 1, true);
        if (null == maxRetries) {
            maxRetries = 10000;
        }
        if (ZVal.toBool(reset) || ZVal.toBool(!ZVal.isTrue(this.unique))) {
            this.unique = new UniqueGenerator(env, this.generator, maxRetries);
        }

        return ZVal.assign(this.unique);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "validator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "maxRetries",
        defaultValue = "10000",
        defaultValueType = "number"
    )
    public Object valid(RuntimeEnv env, Object... args) {
        Object validator = assignParameter(args, 0, true);
        if (null == validator) {
            validator = ZVal.getNull();
        }
        Object maxRetries = assignParameter(args, 1, true);
        if (null == maxRetries) {
            maxRetries = 10000;
        }
        return ZVal.assign(new ValidGenerator(env, this.generator, validator, maxRetries));
    }

    public static final Object CONST_class = "Faker\\Provider\\Base";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object randomDigit(RuntimeEnv env, Object... args) {
            return ZVal.assign(NamespaceGlobal.mt_rand.env(env).call(0, 9).value());
        }

        @ConvertedMethod
        public Object randomDigitNotNull(RuntimeEnv env, Object... args) {
            return ZVal.assign(NamespaceGlobal.mt_rand.env(env).call(1, 9).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "except")
        public Object randomDigitNot(RuntimeEnv env, Object... args) {
            Object except = assignParameter(args, 0, false);
            ReferenceContainer result = new BasicReferenceContainer(null);
            result.setObject(runtimeStaticObject.numberBetween(env, 0, 8));
            if (ZVal.isGreaterThanOrEqualTo(result.getObject(), ">=", except)) {
                result.setObject(ZVal.increment(result.getObject()));
            }

            return ZVal.assign(result.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "nbDigits",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "strict",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object randomNumber(RuntimeEnv env, Object... args) {
            Object nbDigits = assignParameter(args, 0, true);
            if (null == nbDigits) {
                nbDigits = ZVal.getNull();
            }
            Object strict = assignParameter(args, 1, true);
            if (null == strict) {
                strict = false;
            }
            Object max = null;
            if (!function_is_bool.f.env(env).call(strict).getBool()) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "randomNumber() generates numbers of fixed width. To generate numbers between two boundaries, use numberBetween() instead."));
            }

            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", nbDigits)) {
                nbDigits =
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Base.class)
                                .method("randomDigitNotNull")
                                .call()
                                .value();
            }

            max = ZVal.subtract(NamespaceGlobal.pow.env(env).call(10, nbDigits).value(), 1);
            if (ZVal.isGreaterThan(
                    max, '>', NamespaceGlobal.mt_getrandmax.env(env).call().value())) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "randomNumber() can only generate numbers up to mt_getrandmax()"));
            }

            if (ZVal.isTrue(strict)) {
                return ZVal.assign(
                        NamespaceGlobal.mt_rand
                                .env(env)
                                .call(
                                        NamespaceGlobal.pow
                                                .env(env)
                                                .call(10, ZVal.subtract(nbDigits, 1))
                                                .value(),
                                        max)
                                .value());
            }

            return ZVal.assign(NamespaceGlobal.mt_rand.env(env).call(0, max).value());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "nbMaxDecimals",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "min",
            defaultValue = "0",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 2,
            name = "max",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object randomFloat(RuntimeEnv env, Object... args) {
            Object nbMaxDecimals = assignParameter(args, 0, true);
            if (null == nbMaxDecimals) {
                nbMaxDecimals = ZVal.getNull();
            }
            Object min = assignParameter(args, 1, true);
            if (null == min) {
                min = 0;
            }
            Object max = assignParameter(args, 2, true);
            if (null == max) {
                max = ZVal.getNull();
            }
            Object tmp = null;
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", nbMaxDecimals)) {
                nbMaxDecimals =
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Base.class)
                                .method("randomDigit")
                                .call()
                                .value();
            }

            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", max)) {
                max =
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Base.class)
                                .method("randomNumber")
                                .call()
                                .value();
                if (ZVal.isGreaterThan(min, '>', max)) {
                    max = ZVal.assign(min);
                }
            }

            if (ZVal.isGreaterThan(min, '>', max)) {
                tmp = ZVal.assign(min);
                min = ZVal.assign(max);
                max = ZVal.assign(tmp);
            }

            return ZVal.assign(
                    function_round
                            .f
                            .env(env)
                            .call(
                                    ZVal.add(
                                            min,
                                            ZVal.multiply(
                                                    ZVal.divide(
                                                            NamespaceGlobal.mt_rand
                                                                    .env(env)
                                                                    .call()
                                                                    .value(),
                                                            NamespaceGlobal.mt_getrandmax
                                                                    .env(env)
                                                                    .call()
                                                                    .value()),
                                                    ZVal.subtract(max, min))),
                                    nbMaxDecimals)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "int1",
            defaultValue = "0",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 1,
            name = "int2",
            defaultValue = "2147483647L",
            defaultValueType = "number"
        )
        public Object numberBetween(RuntimeEnv env, Object... args) {
            Object int1 = assignParameter(args, 0, true);
            if (null == int1) {
                int1 = 0;
            }
            Object int2 = assignParameter(args, 1, true);
            if (null == int2) {
                int2 = 2147483647L;
            }
            Object min = null;
            Object max = null;
            min = ZVal.assign(ZVal.isLessThan(int1, '<', int2) ? int1 : int2);
            max = ZVal.assign(ZVal.isLessThan(int1, '<', int2) ? int2 : int1);
            return ZVal.assign(NamespaceGlobal.mt_rand.env(env).call(min, max).value());
        }

        @ConvertedMethod
        public Object randomLetter(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    NamespaceGlobal.chr
                            .env(env)
                            .call(NamespaceGlobal.mt_rand.env(env).call(97, 122).value())
                            .value());
        }

        @ConvertedMethod
        public Object randomAscii(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    NamespaceGlobal.chr
                            .env(env)
                            .call(NamespaceGlobal.mt_rand.env(env).call(33, 126).value())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "array",
            typeHint = "array",
            defaultValue = "ZVal.arrayFromList(\"a\", \"b\", \"c\")",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 1,
            name = "count",
            defaultValue = "1",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 2,
            name = "allowDuplicates",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object randomElements(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            ReferenceContainer array = new BasicReferenceContainer(assignParameter(args, 0, true));
            if (null == array.getObject()) {
                array.setObject(ZVal.arrayFromList("a", "b", "c"));
            }
            Object count = assignParameter(args, 1, true);
            if (null == count) {
                count = 1;
            }
            Object allowDuplicates = assignParameter(args, 2, true);
            if (null == allowDuplicates) {
                allowDuplicates = false;
            }
            Object numKeys = null;
            ReferenceContainer keys = new BasicReferenceContainer(null);
            ReferenceContainer elements = new BasicReferenceContainer(null);
            Object num = null;
            ReferenceContainer allKeys = new BasicReferenceContainer(null);
            Object highKey = null;
            ReferenceContainer numElements = new BasicReferenceContainer(null);
            allKeys.setObject(function_array_keys.f.env(env).call(array.getObject()).value());
            numKeys = function_count.f.env(env).call(allKeys.getObject()).value();
            if (ZVal.toBool(!ZVal.isTrue(allowDuplicates))
                    && ZVal.toBool(ZVal.isLessThan(numKeys, '<', count))) {
                throw ZVal.getException(
                        env,
                        new LengthException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Cannot get %d elements, only %d in array",
                                                count, numKeys)
                                        .value()));
            }

            highKey = ZVal.subtract(numKeys, 1);
            keys.setObject(ZVal.assign(elements.setObject(ZVal.newArray())));
            numElements.setObject(0);
            runtimeConverterContinueCount = 0;
            while (ZVal.isLessThan(numElements.getObject(), '<', count)) {
                num = NamespaceGlobal.mt_rand.env(env).call(0, highKey).value();
                if (!ZVal.isTrue(allowDuplicates)) {
                    if (arrayActionR(ArrayAction.ISSET, keys, env, num)) {
                        continue;
                    }

                    keys.arrayAccess(env, num).set(true);
                }

                elements.arrayAppend(env).set(array.arrayGet(env, allKeys.arrayGet(env, num)));
                numElements.setObject(ZVal.increment(numElements.getObject()));
            }

            return ZVal.assign(elements.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "array",
            defaultValue = "ZVal.arrayFromList(\"a\", \"b\", \"c\")",
            defaultValueType = "array"
        )
        public Object randomElement(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, true);
            if (null == array) {
                array = ZVal.arrayFromList("a", "b", "c");
            }
            ReferenceContainer elements = new BasicReferenceContainer(null);
            if (!ZVal.isTrue(array)) {
                return ZVal.assign(ZVal.getNull());
            }

            elements.setObject(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Base.class)
                            .method("randomElements")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(array, 1)
                            .value());
            return ZVal.assign(elements.arrayGet(env, 0));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        public Object randomKey(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, true);
            if (null == array) {
                array = ZVal.newArray();
            }
            ReferenceContainer keys = new BasicReferenceContainer(null);
            Object key = null;
            if (!ZVal.isTrue(array)) {
                return ZVal.assign(ZVal.getNull());
            }

            keys.setObject(function_array_keys.f.env(env).call(array).value());
            key =
                    ZVal.assign(
                            keys.arrayGet(
                                    env,
                                    NamespaceGlobal.mt_rand
                                            .env(env)
                                            .call(
                                                    0,
                                                    ZVal.subtract(
                                                            function_count
                                                                    .f
                                                                    .env(env)
                                                                    .call(keys.getObject())
                                                                    .value(),
                                                            1))
                                            .value()));
            return ZVal.assign(key);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "arg")
        public Object shuffle(RuntimeEnv env, Object... args) {
            Object arg = assignParameter(args, 0, true);
            if (null == arg) {
                arg = "";
            }
            if (function_is_array.f.env(env).call(arg).getBool()) {
                return ZVal.assign(
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Base.class)
                                .method("shuffleArray")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(arg)
                                .value());
            }

            if (function_is_string.f.env(env).call(arg).getBool()) {
                return ZVal.assign(
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Base.class)
                                .method("shuffleString")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(arg)
                                .value());
            }

            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(env, "shuffle() only supports strings or arrays"));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        public Object shuffleArray(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, true);
            if (null == array) {
                array = ZVal.newArray();
            }
            ReferenceContainer shuffledArray = new BasicReferenceContainer(null);
            ReferenceContainer i = new BasicReferenceContainer(null);
            Object j = null;
            Object value = null;
            Object key = null;
            shuffledArray.setObject(ZVal.newArray());
            i.setObject(0);
            function_reset.f.env(env).call(array);
            for (ZPair zpairResult106 : ZVal.getIterable(array, env, false)) {
                key = ZVal.assign(zpairResult106.getKey());
                value = ZVal.assign(zpairResult106.getValue());
                if (ZVal.equalityCheck(i.getObject(), 0)) {
                    j = 0;

                } else {
                    j = NamespaceGlobal.mt_rand.env(env).call(0, i.getObject()).value();
                }

                if (ZVal.equalityCheck(j, i.getObject())) {
                    shuffledArray.arrayAppend(env).set(value);

                } else {
                    shuffledArray.arrayAppend(env).set(shuffledArray.arrayGet(env, j));
                    shuffledArray.arrayAccess(env, j).set(value);
                }

                i.setObject(ZVal.increment(i.getObject()));
            }

            return ZVal.assign(shuffledArray.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        @ConvertedParameter(index = 1, name = "encoding")
        public Object shuffleString(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, true);
            if (null == string) {
                string = "";
            }
            Object encoding = assignParameter(args, 1, true);
            if (null == encoding) {
                encoding = "UTF-8";
            }
            Object strlen = null;
            ReferenceContainer array = new BasicReferenceContainer(null);
            ReferenceContainer i = new BasicReferenceContainer(null);
            if (function_function_exists.f.env(env).call("mb_strlen").getBool()) {
                array.setObject(ZVal.newArray());
                strlen = NamespaceGlobal.mb_strlen.env(env).call(string, encoding).value();
                for (i.setObject(0);
                        ZVal.isLessThan(i.getObject(), '<', strlen);
                        i.setObject(ZVal.increment(i.getObject()))) {
                    array.arrayAppend(env)
                            .set(
                                    NamespaceGlobal.mb_substr
                                            .env(env)
                                            .call(string, i.getObject(), 1, encoding)
                                            .value());
                }

            } else {
                array.setObject(NamespaceGlobal.str_split.env(env).call(string, 1).value());
            }

            return ZVal.assign(
                    NamespaceGlobal.implode
                            .env(env)
                            .call(
                                    "",
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Base.class)
                                            .method("shuffleArray")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(array.getObject())
                                            .value())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        @ConvertedParameter(index = 1, name = "wildcard")
        @ConvertedParameter(index = 2, name = "callback")
        private Object replaceWildcard(RuntimeEnv env, Object... args) {
            ReferenceContainer string =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            Object wildcard = assignParameter(args, 1, true);
            if (null == wildcard) {
                wildcard = "#";
            }
            Object callback = assignParameter(args, 2, true);
            if (null == callback) {
                callback = "static::randomDigit";
            }
            Object last = null;
            Object pos = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            if (ZVal.strictEqualityCheck(
                    pos = function_strpos.f.env(env).call(string.getObject(), wildcard).value(),
                    "===",
                    false)) {
                return ZVal.assign(string.getObject());
            }

            for (i.setObject(ZVal.assign(pos)),
                            last =
                                    ZVal.add(
                                            NamespaceGlobal.strrpos
                                                    .env(env)
                                                    .call(string.getObject(), wildcard, pos)
                                                    .value(),
                                            1);
                    ZVal.isLessThan(i.getObject(), '<', last);
                    i.setObject(ZVal.increment(i.getObject()))) {
                if (ZVal.strictEqualityCheck(
                        string.arrayGet(env, i.getObject()), "===", wildcard)) {
                    string.arrayAccess(env, i.getObject())
                            .set(
                                    function_call_user_func
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call(callback)
                                            .value());
                }
            }

            return ZVal.assign(string.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        public Object numerify(RuntimeEnv env, Object... args) {
            ReferenceContainer string = new BasicReferenceContainer(assignParameter(args, 0, true));
            if (null == string.getObject()) {
                string.setObject("###");
            }
            ReferenceContainer toReplace = new BasicReferenceContainer(null);
            Object last = null;
            Object size = null;
            Object pos = null;
            ReferenceContainer numbers = new BasicReferenceContainer(null);
            ReferenceContainer i = new BasicReferenceContainer(null);
            Object maxAtOnce = null;
            Object nbReplacements = null;
            toReplace.setObject(ZVal.newArray());
            if (ZVal.strictNotEqualityCheck(
                    pos = function_strpos.f.env(env).call(string.getObject(), "#").value(),
                    "!==",
                    false)) {
                for (i.setObject(ZVal.assign(pos)),
                                last =
                                        ZVal.add(
                                                NamespaceGlobal.strrpos
                                                        .env(env)
                                                        .call(string.getObject(), "#", pos)
                                                        .value(),
                                                1);
                        ZVal.isLessThan(i.getObject(), '<', last);
                        i.setObject(ZVal.increment(i.getObject()))) {
                    if (ZVal.strictEqualityCheck(string.arrayGet(env, i.getObject()), "===", "#")) {
                        toReplace.arrayAppend(env).set(i.getObject());
                    }
                }
            }

            if (ZVal.isTrue(
                    nbReplacements =
                            function_count.f.env(env).call(toReplace.getObject()).value())) {
                maxAtOnce =
                        ZVal.subtract(
                                function_strlen
                                        .f
                                        .env(env)
                                        .call(
                                                toStringR(
                                                        NamespaceGlobal.mt_getrandmax
                                                                .env(env)
                                                                .call()
                                                                .value(),
                                                        env))
                                        .value(),
                                1);
                numbers.setObject("");
                i.setObject(0);
                while (ZVal.isLessThan(i.getObject(), '<', nbReplacements)) {
                    size =
                            NamespaceGlobal.min
                                    .env(env)
                                    .call(ZVal.subtract(nbReplacements, i.getObject()), maxAtOnce)
                                    .value();
                    numbers.setObject(
                            toStringR(numbers.getObject(), env)
                                    + toStringR(
                                            NamespaceGlobal.str_pad
                                                    .env(env)
                                                    .call(
                                                            StaticMethodUtils
                                                                    .accessUnknownLateStaticMethod(
                                                                            env, this, Base.class)
                                                                    .method("randomNumber")
                                                                    .addReferenceArgs(
                                                                            new RuntimeArgsWithReferences())
                                                                    .call(size)
                                                                    .value(),
                                                            size,
                                                            "0",
                                                            0)
                                                    .value(),
                                            env));
                    i.setObject(ZAssignment.add("+=", i.getObject(), size));
                }

                for (i.setObject(0);
                        ZVal.isLessThan(i.getObject(), '<', nbReplacements);
                        i.setObject(ZVal.increment(i.getObject()))) {
                    string.arrayAccess(env, toReplace.arrayGet(env, i.getObject()))
                            .set(numbers.arrayGet(env, i.getObject()));
                }
            }

            string.setObject(
                    runtimeStaticObject.replaceWildcard(
                            env, string.getObject(), "%", "static::randomDigitNotNull"));
            return ZVal.assign(string.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        public Object lexify(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, true);
            if (null == string) {
                string = "????";
            }
            return ZVal.assign(
                    runtimeStaticObject.replaceWildcard(env, string, "?", "static::randomLetter"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        public Object bothify(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/fzaninotto/faker/src/Faker/Provider")
                            .setFile("/vendor/fzaninotto/faker/src/Faker/Provider/Base.php");
            Object string = assignParameter(args, 0, true);
            if (null == string) {
                string = "## ??";
            }
            string =
                    runtimeStaticObject.replaceWildcard(
                            env,
                            string,
                            "*",
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Faker\\Provider",
                                    this) {
                                @Override
                                @ConvertedMethod
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    return ZVal.assign(
                                            NamespaceGlobal.mt_rand.env(env).call(0, 1).getBool()
                                                    ? "#"
                                                    : "?");
                                }
                            });
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Base.class)
                            .method("lexify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Base.class)
                                            .method("numerify")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(string)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        public Object asciify(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, true);
            if (null == string) {
                string = "****";
            }
            return ZVal.assign(
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call("/\\*/u", "static::randomAscii", string)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "regex")
        public Object regexify(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/fzaninotto/faker/src/Faker/Provider")
                            .setFile("/vendor/fzaninotto/faker/src/Faker/Provider/Base.php");
            Object regex = assignParameter(args, 0, true);
            if (null == regex) {
                regex = "";
            }
            regex = function_preg_replace.f.env(env).call("/^\\/?\\^?/", "", regex).value();
            regex = function_preg_replace.f.env(env).call("/\\$?\\/?$/", "", regex).value();
            regex =
                    function_preg_replace
                            .f
                            .env(env)
                            .call("/\\{(\\d+)\\}/", "{\\1,\\1}", regex)
                            .value();
            regex = function_preg_replace.f.env(env).call("/(?<!\\\\)\\?/", "{0,1}", regex).value();
            regex =
                    function_preg_replace
                            .f
                            .env(env)
                            .call(
                                    "/(?<!\\\\)\\*/",
                                    "{0,"
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, Base.class)
                                                            .method("randomDigitNotNull")
                                                            .call()
                                                            .value(),
                                                    env)
                                            + "}",
                                    regex)
                            .value();
            regex =
                    function_preg_replace
                            .f
                            .env(env)
                            .call(
                                    "/(?<!\\\\)\\+/",
                                    "{1,"
                                            + toStringR(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, Base.class)
                                                            .method("randomDigitNotNull")
                                                            .call()
                                                            .value(),
                                                    env)
                                            + "}",
                                    regex)
                            .value();
            regex =
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call(
                                    "/(\\[[^\\]]+\\])\\{(\\d+),(\\d+)\\}/",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Faker\\Provider",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "matches")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            ReferenceContainer matches =
                                                    new BasicReferenceContainer(
                                                            assignParameter(args, 0, false));
                                            return ZVal.assign(
                                                    function_str_repeat
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    matches.arrayGet(env, 1),
                                                                    com.project.convertedCode
                                                                            .globalNamespace
                                                                            .namespaces.Faker
                                                                            .namespaces.Provider
                                                                            .classes.Base
                                                                            .runtimeStaticObject
                                                                            .randomElement(
                                                                                    env,
                                                                                    function_range
                                                                                            .f
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    matches
                                                                                                            .arrayGet(
                                                                                                                    env,
                                                                                                                    2),
                                                                                                    matches
                                                                                                            .arrayGet(
                                                                                                                    env,
                                                                                                                    3))
                                                                                            .value()))
                                                            .value());
                                        }
                                    },
                                    regex)
                            .value();
            regex =
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call(
                                    "/(\\([^\\)]+\\))\\{(\\d+),(\\d+)\\}/",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Faker\\Provider",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "matches")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            ReferenceContainer matches =
                                                    new BasicReferenceContainer(
                                                            assignParameter(args, 0, false));
                                            return ZVal.assign(
                                                    function_str_repeat
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    matches.arrayGet(env, 1),
                                                                    com.project.convertedCode
                                                                            .globalNamespace
                                                                            .namespaces.Faker
                                                                            .namespaces.Provider
                                                                            .classes.Base
                                                                            .runtimeStaticObject
                                                                            .randomElement(
                                                                                    env,
                                                                                    function_range
                                                                                            .f
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    matches
                                                                                                            .arrayGet(
                                                                                                                    env,
                                                                                                                    2),
                                                                                                    matches
                                                                                                            .arrayGet(
                                                                                                                    env,
                                                                                                                    3))
                                                                                            .value()))
                                                            .value());
                                        }
                                    },
                                    regex)
                            .value();
            regex =
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call(
                                    "/(\\\\?.)\\{(\\d+),(\\d+)\\}/",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Faker\\Provider",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "matches")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            ReferenceContainer matches =
                                                    new BasicReferenceContainer(
                                                            assignParameter(args, 0, false));
                                            return ZVal.assign(
                                                    function_str_repeat
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    matches.arrayGet(env, 1),
                                                                    com.project.convertedCode
                                                                            .globalNamespace
                                                                            .namespaces.Faker
                                                                            .namespaces.Provider
                                                                            .classes.Base
                                                                            .runtimeStaticObject
                                                                            .randomElement(
                                                                                    env,
                                                                                    function_range
                                                                                            .f
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    matches
                                                                                                            .arrayGet(
                                                                                                                    env,
                                                                                                                    2),
                                                                                                    matches
                                                                                                            .arrayGet(
                                                                                                                    env,
                                                                                                                    3))
                                                                                            .value()))
                                                            .value());
                                        }
                                    },
                                    regex)
                            .value();
            regex =
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call(
                                    "/\\((.*?)\\)/",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Faker\\Provider",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "matches")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            ReferenceContainer matches =
                                                    new BasicReferenceContainer(
                                                            assignParameter(args, 0, false));
                                            return ZVal.assign(
                                                    com.project.convertedCode.globalNamespace
                                                            .namespaces.Faker.namespaces.Provider
                                                            .classes.Base.runtimeStaticObject
                                                            .randomElement(
                                                                    env,
                                                                    function_explode
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    "|",
                                                                                    function_str_replace
                                                                                            .f
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    ZVal
                                                                                                            .arrayFromList(
                                                                                                                    "(",
                                                                                                                    ")"),
                                                                                                    "",
                                                                                                    matches
                                                                                                            .arrayGet(
                                                                                                                    env,
                                                                                                                    1))
                                                                                            .value())
                                                                            .value()));
                                        }
                                    },
                                    regex)
                            .value();
            regex =
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call(
                                    "/\\[([^\\]]+)\\]/",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Faker\\Provider",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "matches")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            ContextConstants
                                                    runtimeConverterFunctionClassConstants =
                                                            new ContextConstants()
                                                                    .setDir(
                                                                            "/vendor/fzaninotto/faker/src/Faker/Provider")
                                                                    .setFile(
                                                                            "/vendor/fzaninotto/faker/src/Faker/Provider/Base.php");
                                            ReferenceContainer matches =
                                                    new BasicReferenceContainer(
                                                            assignParameter(args, 0, false));
                                            return ZVal.assign(
                                                    "["
                                                            + toStringR(
                                                                    NamespaceGlobal
                                                                            .preg_replace_callback
                                                                            .env(env)
                                                                            .call(
                                                                                    "/(\\w|\\d)\\-(\\w|\\d)/",
                                                                                    new Closure(
                                                                                            env,
                                                                                            runtimeConverterFunctionClassConstants,
                                                                                            "Faker\\Provider",
                                                                                            this) {
                                                                                        @Override
                                                                                        @ConvertedMethod
                                                                                        @ConvertedParameter(
                                                                                            index =
                                                                                                    0,
                                                                                            name =
                                                                                                    "range"
                                                                                        )
                                                                                        public
                                                                                        Object run(
                                                                                                RuntimeEnv
                                                                                                        env,
                                                                                                Object
                                                                                                        thisvar,
                                                                                                PassByReferenceArgs
                                                                                                        runtimePassByReferenceArgs,
                                                                                                Object...
                                                                                                        args) {
                                                                                            ReferenceContainer
                                                                                                    range =
                                                                                                            new BasicReferenceContainer(
                                                                                                                    assignParameter(
                                                                                                                            args,
                                                                                                                            0,
                                                                                                                            false));
                                                                                            return ZVal
                                                                                                    .assign(
                                                                                                            NamespaceGlobal
                                                                                                                    .implode
                                                                                                                    .env(
                                                                                                                            env)
                                                                                                                    .call(
                                                                                                                            function_range
                                                                                                                                    .f
                                                                                                                                    .env(
                                                                                                                                            env)
                                                                                                                                    .call(
                                                                                                                                            range
                                                                                                                                                    .arrayGet(
                                                                                                                                                            env,
                                                                                                                                                            1),
                                                                                                                                            range
                                                                                                                                                    .arrayGet(
                                                                                                                                                            env,
                                                                                                                                                            2))
                                                                                                                                    .value(),
                                                                                                                            "")
                                                                                                                    .value());
                                                                                        }
                                                                                    },
                                                                                    matches
                                                                                            .arrayGet(
                                                                                                    env,
                                                                                                    1))
                                                                            .value(),
                                                                    env)
                                                            + "]");
                                        }
                                    },
                                    regex)
                            .value();
            regex =
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call(
                                    "/\\[([^\\]]+)\\]/",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Faker\\Provider",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "matches")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            ReferenceContainer matches =
                                                    new BasicReferenceContainer(
                                                            assignParameter(args, 0, false));
                                            return ZVal.assign(
                                                    com.project.convertedCode.globalNamespace
                                                            .namespaces.Faker.namespaces.Provider
                                                            .classes.Base.runtimeStaticObject
                                                            .randomElement(
                                                                    env,
                                                                    NamespaceGlobal.str_split
                                                                            .env(env)
                                                                            .call(
                                                                                    matches
                                                                                            .arrayGet(
                                                                                                    env,
                                                                                                    1))
                                                                            .value()));
                                        }
                                    },
                                    regex)
                            .value();
            regex =
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call("/\\\\w/", "static::randomLetter", regex)
                            .value();
            regex =
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call("/\\\\d/", "static::randomDigit", regex)
                            .value();
            regex =
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call("/(?<!\\\\)\\./", "static::randomAscii", regex)
                            .value();
            regex = function_str_replace.f.env(env).call("\\", "", regex).value();
            return ZVal.assign(regex);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        public Object toLower(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, true);
            if (null == string) {
                string = "";
            }
            return ZVal.assign(
                    function_extension_loaded.f.env(env).call("mbstring").getBool()
                            ? NamespaceGlobal.mb_strtolower.env(env).call(string, "UTF-8").value()
                            : NamespaceGlobal.strtolower.env(env).call(string).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        public Object toUpper(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, true);
            if (null == string) {
                string = "";
            }
            return ZVal.assign(
                    function_extension_loaded.f.env(env).call("mbstring").getBool()
                            ? NamespaceGlobal.mb_strtoupper.env(env).call(string, "UTF-8").value()
                            : NamespaceGlobal.strtoupper.env(env).call(string).value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\Base")
                    .setLookup(
                            Base.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/Base.php")
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
