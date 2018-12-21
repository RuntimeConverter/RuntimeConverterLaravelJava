package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.functions.FunctionBaseExtended;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class data_set extends FunctionBaseExtended {

    public static data_set f = new data_set();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "target")
    @ConvertedParameter(index = 1, name = "key")
    @ConvertedParameter(index = 2, name = "value")
    @ConvertedParameter(
        index = 3,
        name = "overwrite",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object call(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer target = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object key = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        Object overwrite = assignParameter(args, 3, true);
        if (null == overwrite) {
            overwrite = true;
        }
        Object segment = null;
        ReferenceContainer inner = new BasicReferenceContainer(null);
        Object segments = null;
        segments =
                ZVal.assign(
                        function_is_array.f.env(env).call(key).getBool()
                                ? key
                                : function_explode.f.env(env).call(".", key).value());
        if (ZVal.strictEqualityCheck(
                segment = function_array_shift.f.env(env).call(segments).value(), "===", "*")) {
            if (!ZVal.isTrue(Arr.runtimeStaticObject.accessible(env, target.getObject()))) {
                target.setObject(ZVal.newArray());
            }

            if (ZVal.isTrue(segments)) {
                for (ZPair zpairResult597 : ZVal.getIterable(target.getObject(), env, true)) {
                    inner = zpairResult597;
                    com.project
                            .convertedCode
                            .globalNamespace
                            .functions
                            .data_set
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(0, inner))
                            .call(inner.getObject(), segments, value, overwrite);
                }

            } else if (ZVal.isTrue(overwrite)) {
                for (ZPair zpairResult598 : ZVal.getIterable(target.getObject(), env, true)) {
                    inner = zpairResult598;
                    inner.setObject(ZVal.assign(value));
                }
            }

        } else if (ZVal.isTrue(Arr.runtimeStaticObject.accessible(env, target.getObject()))) {
            if (ZVal.isTrue(segments)) {
                if (!ZVal.isTrue(
                        Arr.runtimeStaticObject.exists(env, target.getObject(), segment))) {
                    target.arrayAccess(env, segment).set(ZVal.newArray());
                }

                com.project
                        .convertedCode
                        .globalNamespace
                        .functions
                        .data_set
                        .f
                        .env(env)
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                new ArrayDimensionReference(
                                                        target.getObject(), segment)))
                        .call(target.arrayGet(env, segment), segments, value, overwrite);

            } else if (ZVal.toBool(overwrite)
                    || ZVal.toBool(
                            !ZVal.isTrue(
                                    Arr.runtimeStaticObject.exists(
                                            env, target.getObject(), segment)))) {
                target.arrayAccess(env, segment).set(value);
            }

        } else if (function_is_object.f.env(env).call(target.getObject()).getBool()) {
            if (ZVal.isTrue(segments)) {
                if (!ZVal.isset(
                        toObjectR(target.getObject())
                                .accessProp(this, env)
                                .name(segment)
                                .value())) {
                    toObjectR(target.getObject())
                            .accessProp(this, env)
                            .name(segment)
                            .set(ZVal.newArray());
                }

                com.project
                        .convertedCode
                        .globalNamespace
                        .functions
                        .data_set
                        .f
                        .env(env)
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                new ReferenceClassProperty(
                                                        target.getObject(), segment, env)))
                        .call(
                                toObjectR(target.getObject())
                                        .accessProp(this, env)
                                        .name(segment)
                                        .value(),
                                segments,
                                value,
                                overwrite);

            } else if (ZVal.toBool(overwrite)
                    || ZVal.toBool(
                            !ZVal.isset(
                                    toObjectR(target.getObject())
                                            .accessProp(this, env)
                                            .name(segment)
                                            .value()))) {
                toObjectR(target.getObject()).accessProp(this, env).name(segment).set(value);
            }

        } else {
            target.setObject(ZVal.newArray());
            if (ZVal.isTrue(segments)) {
                com.project
                        .convertedCode
                        .globalNamespace
                        .functions
                        .data_set
                        .f
                        .env(env)
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                new ArrayDimensionReference(
                                                        target.getObject(), segment)))
                        .call(target.arrayGet(env, segment), segments, value, overwrite);

            } else if (ZVal.isTrue(overwrite)) {
                target.arrayAccess(env, segment).set(value);
            }
        }

        return ZVal.assign(target.getObject());
    }

    public Object data_set(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
