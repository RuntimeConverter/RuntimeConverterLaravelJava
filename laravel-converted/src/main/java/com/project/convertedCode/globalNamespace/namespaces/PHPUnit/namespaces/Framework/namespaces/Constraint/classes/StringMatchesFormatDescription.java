package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.RegularExpression;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Differ;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/StringMatchesFormatDescription.php

*/

public class StringMatchesFormatDescription extends RegularExpression {

    public Object string = null;

    public StringMatchesFormatDescription(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StringMatchesFormatDescription.class) {
            this.__construct(env, args);
        }
    }

    public StringMatchesFormatDescription(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        super.__construct(
                env, this.createPatternFromFormat(env, this.convertNewlines(env, string)));
        this.string = string;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        return ZVal.assign(super.matches(env, this.convertNewlines(env, other)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object failureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        return "string matches format description";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object additionalFailureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        Object line = null;
        Object index = null;
        ReferenceContainer from = new BasicReferenceContainer(null);
        ReferenceContainer to = new BasicReferenceContainer(null);
        Object differ = null;
        from.setObject(function_explode.f.env(env).call("\n", this.string).value());
        to.setObject(
                function_explode.f.env(env).call("\n", this.convertNewlines(env, other)).value());
        for (ZPair zpairResult1134 : ZVal.getIterable(from.getObject(), env, false)) {
            index = ZVal.assign(zpairResult1134.getKey());
            line = ZVal.assign(zpairResult1134.getValue());
            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, to, env, index))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(line, "!==", to.arrayGet(env, index)))) {
                line = this.createPatternFromFormat(env, line);
                if (ZVal.isGreaterThan(
                        function_preg_match.f.env(env).call(line, to.arrayGet(env, index)).value(),
                        '>',
                        0)) {
                    from.arrayAccess(env, index).set(to.arrayGet(env, index));
                }
            }
        }

        this.string = NamespaceGlobal.implode.env(env).call("\n", from.getObject()).value();
        other = NamespaceGlobal.implode.env(env).call("\n", to.getObject()).value();
        differ = new Differ(env, "--- Expected\n+++ Actual\n");
        return ZVal.assign(
                env.callMethod(
                        differ, "diff", StringMatchesFormatDescription.class, this.string, other));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string", typeHint = "string")
    private Object createPatternFromFormat(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        string =
                function_preg_replace
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList(
                                        "/(?<!%)%e/",
                                        "/(?<!%)%s/",
                                        "/(?<!%)%S/",
                                        "/(?<!%)%a/",
                                        "/(?<!%)%A/",
                                        "/(?<!%)%w/",
                                        "/(?<!%)%i/",
                                        "/(?<!%)%d/",
                                        "/(?<!%)%x/",
                                        "/(?<!%)%f/",
                                        "/(?<!%)%c/"),
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                function_str_replace
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "\\",
                                                                "\\\\",
                                                                "\\" + toStringR("/", env))
                                                        .value()),
                                        new ZPair(1, "[^\\r\\n]+"),
                                        new ZPair(2, "[^\\r\\n]*"),
                                        new ZPair(3, ".+"),
                                        new ZPair(4, ".*"),
                                        new ZPair(5, "\\s*"),
                                        new ZPair(6, "[+-]?\\d+"),
                                        new ZPair(7, "\\d+"),
                                        new ZPair(8, "[0-9a-fA-F]+"),
                                        new ZPair(9, "[+-]?\\.?\\d+\\.?\\d*(?:[Ee][+-]?\\d+)?"),
                                        new ZPair(10, ".")),
                                NamespaceGlobal.preg_quote.env(env).call(string, "/").value())
                        .value();
        string = function_str_replace.f.env(env).call("%%", "%", string).value();
        return ZVal.assign("/^" + toStringR(string, env) + "$/s");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text")
    private Object convertNewlines(RuntimeEnv env, Object... args) {
        Object text = assignParameter(args, 0, false);
        return ZVal.assign(function_preg_replace.f.env(env).call("/\\r\\n/", "\n", text).value());
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\Constraint\\StringMatchesFormatDescription";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RegularExpression.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\StringMatchesFormatDescription")
                    .setLookup(
                            StringMatchesFormatDescription.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exporter", "pattern", "string")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/Constraint/StringMatchesFormatDescription.php")
                    .addInterface("Countable")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
                    .addExtendsClass("PHPUnit\\Framework\\Constraint\\RegularExpression")
                    .addExtendsClass("PHPUnit\\Framework\\Constraint\\Constraint")
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
