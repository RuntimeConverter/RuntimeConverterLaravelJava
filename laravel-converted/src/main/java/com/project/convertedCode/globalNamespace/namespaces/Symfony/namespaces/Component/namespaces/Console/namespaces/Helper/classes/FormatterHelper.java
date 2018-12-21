package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatter;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.Helper;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Helper/FormatterHelper.php

*/

public class FormatterHelper extends Helper {

    public FormatterHelper(RuntimeEnv env, Object... args) {
        super(env);
    }

    public FormatterHelper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "section")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(index = 2, name = "style")
    public Object formatSection(RuntimeEnv env, Object... args) {
        Object section = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object style = assignParameter(args, 2, true);
        if (null == style) {
            style = "info";
        }
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call("<%s>[%s]</%s> %s", style, section, style, message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(index = 1, name = "style")
    @ConvertedParameter(
        index = 2,
        name = "large",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object formatBlock(RuntimeEnv env, Object... args) {
        ReferenceContainer messages = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object style = assignParameter(args, 1, false);
        Object large = assignParameter(args, 2, true);
        if (null == large) {
            large = false;
        }
        Object len = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer lines = new BasicReferenceContainer(null);
        Object message = null;
        if (!function_is_array.f.env(env).call(messages.getObject()).getBool()) {
            messages.setObject(ZVal.newArray(new ZPair(0, messages.getObject())));
        }

        len = 0;
        lines.setObject(ZVal.newArray());
        for (ZPair zpairResult1688 : ZVal.getIterable(messages.getObject(), env, true)) {
            message = ZVal.assign(zpairResult1688.getValue());
            message = OutputFormatter.runtimeStaticObject.escape(env, message);
            lines.arrayAppend(env)
                    .set(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(ZVal.isTrue(large) ? "  %s  " : " %s ", message)
                                    .value());
            len =
                    NamespaceGlobal.max
                            .env(env)
                            .call(
                                    ZVal.add(
                                            env.callMethod(
                                                    this, "strlen", FormatterHelper.class, message),
                                            ZVal.isTrue(large) ? 4 : 2),
                                    len)
                            .value();
        }

        messages.setObject(
                ZVal.assign(
                        ZVal.isTrue(large)
                                ? ZVal.newArray(
                                        new ZPair(
                                                0,
                                                function_str_repeat
                                                        .f
                                                        .env(env)
                                                        .call(" ", len)
                                                        .value()))
                                : ZVal.newArray()));
        for (i.setObject(0);
                arrayActionR(ArrayAction.ISSET, lines, env, i.getObject());
                i.setObject(ZVal.increment(i.getObject()))) {
            messages.arrayAppend(env)
                    .set(
                            toStringR(lines.arrayGet(env, i.getObject()), env)
                                    + toStringR(
                                            function_str_repeat
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            " ",
                                                            ZVal.subtract(
                                                                    len,
                                                                    env.callMethod(
                                                                            this,
                                                                            "strlen",
                                                                            FormatterHelper.class,
                                                                            lines.arrayGet(
                                                                                    env,
                                                                                    i
                                                                                            .getObject()))))
                                                    .value(),
                                            env));
        }

        if (ZVal.isTrue(large)) {
            messages.arrayAppend(env).set(function_str_repeat.f.env(env).call(" ", len).value());
        }

        for (i.setObject(0);
                arrayActionR(ArrayAction.ISSET, messages, env, i.getObject());
                i.setObject(ZVal.increment(i.getObject()))) {
            messages.arrayAccess(env, i.getObject())
                    .set(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "<%s>%s</%s>",
                                            style, messages.arrayGet(env, i.getObject()), style)
                                    .value());
        }

        return ZVal.assign(
                NamespaceGlobal.implode.env(env).call("\n", messages.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "length")
    @ConvertedParameter(index = 2, name = "suffix")
    public Object truncate(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object length = assignParameter(args, 1, false);
        Object suffix = assignParameter(args, 2, true);
        if (null == suffix) {
            suffix = "...";
        }
        Object computedLength = null;
        Object encoding = null;
        computedLength =
                ZVal.subtract(
                        length, env.callMethod(this, "strlen", FormatterHelper.class, suffix));
        if (ZVal.isGreaterThan(
                computedLength,
                '>',
                env.callMethod(this, "strlen", FormatterHelper.class, message))) {
            return ZVal.assign(message);
        }

        if (ZVal.strictEqualityCheck(
                false,
                "===",
                encoding =
                        NamespaceGlobal.mb_detect_encoding
                                .env(env)
                                .call(message, ZVal.getNull(), true)
                                .value())) {
            return ZVal.assign(
                    toStringR(function_substr.f.env(env).call(message, 0, length).value(), env)
                            + toStringR(suffix, env));
        }

        return ZVal.assign(
                toStringR(
                                NamespaceGlobal.mb_substr
                                        .env(env)
                                        .call(message, 0, length, encoding)
                                        .value(),
                                env)
                        + toStringR(suffix, env));
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "formatter";
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Helper\\FormatterHelper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Helper.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Helper\\FormatterHelper")
                    .setLookup(
                            FormatterHelper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("helperSet")
                    .setFilename("vendor/symfony/console/Helper/FormatterHelper.php")
                    .addInterface("Symfony\\Component\\Console\\Helper\\HelperInterface")
                    .addExtendsClass("Symfony\\Component\\Console\\Helper\\Helper")
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
