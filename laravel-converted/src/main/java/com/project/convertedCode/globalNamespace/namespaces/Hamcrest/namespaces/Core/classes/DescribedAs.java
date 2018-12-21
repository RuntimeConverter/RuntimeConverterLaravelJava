package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.BaseMatcher;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/DescribedAs.php

*/

public class DescribedAs extends BaseMatcher {

    public Object _descriptionTemplate = null;

    public Object _matcher = null;

    public Object _values = null;

    public DescribedAs(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DescribedAs.class) {
            this.__construct(env, args);
        }
    }

    public DescribedAs(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "descriptionTemplate")
    @ConvertedParameter(index = 1, name = "matcher", typeHint = "Hamcrest\\Matcher")
    @ConvertedParameter(index = 2, name = "values", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object descriptionTemplate = assignParameter(args, 0, false);
        Object matcher = assignParameter(args, 1, false);
        Object values = assignParameter(args, 2, false);
        this._descriptionTemplate = descriptionTemplate;
        this._matcher = matcher;
        this._values = values;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    public Object matches(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this._matcher, "matches", DescribedAs.class, item));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        Object offset = null;
        Object index = null;
        Object textStart = null;
        Object text = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        textStart = 0;
        while (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        CONST_ARG_PATTERN,
                        this._descriptionTemplate,
                        matches.getObject(),
                        256,
                        textStart)
                .getBool()) {
            text = ZVal.assign(matches.arrayGet(env, 0, 0));
            index = ZVal.assign(matches.arrayGet(env, 1, 0));
            offset = ZVal.assign(matches.arrayGet(env, 0, 1));
            env.callMethod(
                    description,
                    "appendText",
                    DescribedAs.class,
                    function_substr
                            .f
                            .env(env)
                            .call(
                                    this._descriptionTemplate,
                                    textStart,
                                    ZVal.subtract(offset, textStart))
                            .value());
            env.callMethod(
                    description,
                    "appendValue",
                    DescribedAs.class,
                    new ReferenceClassProperty(this, "_values", env).arrayGet(env, index));
            textStart = ZVal.add(offset, function_strlen.f.env(env).call(text).value());
        }

        if (ZVal.isLessThan(
                textStart,
                '<',
                function_strlen.f.env(env).call(this._descriptionTemplate).value())) {
            env.callMethod(
                    description,
                    "appendText",
                    DescribedAs.class,
                    function_substr.f.env(env).call(this._descriptionTemplate, textStart).value());
        }

        return null;
    }

    public static final Object CONST_ARG_PATTERN = "/%([0-9]+)/";

    public static final Object CONST_class = "Hamcrest\\Core\\DescribedAs";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object describedAs(RuntimeEnv env, Object... args) {
            Object ___args = null;
            Object values = null;
            Object description = null;
            Object matcher = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            description = function_array_shift.f.env(env).call(___args).value();
            matcher = function_array_shift.f.env(env).call(___args).value();
            values = ZVal.assign(___args);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Core
                            .classes
                            .DescribedAs(env, description, matcher, values));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Core\\DescribedAs")
                    .setLookup(
                            DescribedAs.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_descriptionTemplate", "_matcher", "_values")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/DescribedAs.php")
                    .addInterface("Hamcrest\\Matcher")
                    .addInterface("Hamcrest\\SelfDescribing")
                    .addExtendsClass("Hamcrest\\BaseMatcher")
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
