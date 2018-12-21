package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.Description;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.nativeInterfaces.Iterator;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Internal.classes.SelfDescribingValue;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_float;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/BaseDescription.php

*/

public abstract class BaseDescription extends RuntimeClassBase implements Description {

    public BaseDescription(RuntimeEnv env, Object... args) {
        super(env);
    }

    public BaseDescription(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text")
    public Object appendText(RuntimeEnv env, Object... args) {
        Object text = assignParameter(args, 0, false);
        env.callMethod(this, "append", BaseDescription.class, text);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "Hamcrest\\SelfDescribing")
    public Object appendDescriptionOf(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        env.callMethod(value, "describeTo", BaseDescription.class, this);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object appendValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (function_is_null.f.env(env).call(value).getBool()) {
            env.callMethod(this, "append", BaseDescription.class, "null");

        } else if (function_is_string.f.env(env).call(value).getBool()) {
            this._toPhpSyntax(env, value);

        } else if (function_is_float.f.env(env).call(value).getBool()) {
            env.callMethod(this, "append", BaseDescription.class, "<");
            env.callMethod(this, "append", BaseDescription.class, value);
            env.callMethod(this, "append", BaseDescription.class, "F>");

        } else if (function_is_bool.f.env(env).call(value).getBool()) {
            env.callMethod(this, "append", BaseDescription.class, "<");
            env.callMethod(
                    this, "append", BaseDescription.class, ZVal.isTrue(value) ? "true" : "false");
            env.callMethod(this, "append", BaseDescription.class, ">");

        } else if (ZVal.toBool(
                        ZVal.toBool(function_is_array.f.env(env).call(value).value())
                                || ZVal.toBool(
                                        ZVal.checkInstanceType(value, Iterator.class, "Iterator")))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                value, IteratorAggregate.class, "IteratorAggregate"))) {
            this.appendValueList(env, "[", ", ", "]", value);

        } else if (ZVal.toBool(function_is_object.f.env(env).call(value).value())
                && ZVal.toBool(
                        !function_method_exists.f.env(env).call(value, "__toString").getBool())) {
            env.callMethod(this, "append", BaseDescription.class, "<");
            env.callMethod(
                    this,
                    "append",
                    BaseDescription.class,
                    function_get_class.f.env(env).call(value).value());
            env.callMethod(this, "append", BaseDescription.class, ">");

        } else {
            env.callMethod(this, "append", BaseDescription.class, "<");
            env.callMethod(this, "append", BaseDescription.class, value);
            env.callMethod(this, "append", BaseDescription.class, ">");
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "start")
    @ConvertedParameter(index = 1, name = "separator")
    @ConvertedParameter(index = 2, name = "end")
    @ConvertedParameter(index = 3, name = "values")
    public Object appendValueList(RuntimeEnv env, Object... args) {
        Object start = assignParameter(args, 0, false);
        Object separator = assignParameter(args, 1, false);
        Object end = assignParameter(args, 2, false);
        Object values = assignParameter(args, 3, false);
        Object v = null;
        ReferenceContainer list = new BasicReferenceContainer(null);
        list.setObject(ZVal.newArray());
        for (ZPair zpairResult163 : ZVal.getIterable(values, env, true)) {
            v = ZVal.assign(zpairResult163.getValue());
            list.arrayAppend(env).set(new SelfDescribingValue(env, v));
        }

        this.appendList(env, start, separator, end, list.getObject());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "start")
    @ConvertedParameter(index = 1, name = "separator")
    @ConvertedParameter(index = 2, name = "end")
    @ConvertedParameter(index = 3, name = "values")
    public Object appendList(RuntimeEnv env, Object... args) {
        Object start = assignParameter(args, 0, false);
        Object separator = assignParameter(args, 1, false);
        Object end = assignParameter(args, 2, false);
        Object values = assignParameter(args, 3, false);
        Object separate = null;
        Object value = null;
        env.callMethod(this, "append", BaseDescription.class, start);
        separate = false;
        for (ZPair zpairResult164 : ZVal.getIterable(values, env, true)) {
            value = ZVal.assign(zpairResult164.getValue());
            if (ZVal.isTrue(separate)) {
                env.callMethod(this, "append", BaseDescription.class, separator);
            }

            this.appendDescriptionOf(env, value);
            separate = true;
        }

        env.callMethod(this, "append", BaseDescription.class, end);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object _toPhpSyntax(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object str = null;
        Object len = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        str = "\"";
        runtimeConverterBreakCount = 0;
        for (i.setObject(0), len = function_strlen.f.env(env).call(value.getObject()).value();
                ZVal.isLessThan(i.getObject(), '<', len);
                i.setObject(ZVal.increment(i.getObject()))) {
            SwitchEnumType16 switchVariable16 =
                    ZVal.getEnum(
                            value.arrayGet(env, i.getObject()),
                            SwitchEnumType16.DEFAULT_CASE,
                            SwitchEnumType16.RESERVED_CHARS_329374634_STRING__,
                            "\"",
                            SwitchEnumType16.RESERVED_CHARS_1460189809_STRING__,
                            "\t",
                            SwitchEnumType16.RESERVED_CHARS_806002149_STRING__,
                            "\r",
                            SwitchEnumType16.RESERVED_CHARS_817570763_STRING__,
                            "\n");
            switch (switchVariable16) {
                case RESERVED_CHARS_329374634_STRING__:
                    str = toStringR(str, env) + "\\\"";
                    break;
                case RESERVED_CHARS_1460189809_STRING__:
                    str = toStringR(str, env) + "\\t";
                    break;
                case RESERVED_CHARS_806002149_STRING__:
                    str = toStringR(str, env) + "\\r";
                    break;
                case RESERVED_CHARS_817570763_STRING__:
                    str = toStringR(str, env) + "\\n";
                    break;
                case DEFAULT_CASE:
                    str = toStringR(str, env) + toStringR(value.arrayGet(env, i.getObject()), env);
            }
            ;
        }

        str = toStringR(str, env) + "\"";
        env.callMethod(this, "append", BaseDescription.class, str);
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\BaseDescription";

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
                    .setName("Hamcrest\\BaseDescription")
                    .setLookup(
                            BaseDescription.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/BaseDescription.php")
                    .addInterface("Hamcrest\\Description")
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

    private enum SwitchEnumType16 {
        RESERVED_CHARS_329374634_STRING__,
        RESERVED_CHARS_1460189809_STRING__,
        RESERVED_CHARS_806002149_STRING__,
        RESERVED_CHARS_817570763_STRING__,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
