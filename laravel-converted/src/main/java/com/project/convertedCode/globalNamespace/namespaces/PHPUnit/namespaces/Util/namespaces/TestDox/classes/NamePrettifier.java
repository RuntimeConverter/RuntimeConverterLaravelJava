package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/TestDox/NamePrettifier.php

*/

public final class NamePrettifier extends RuntimeClassBase {

    public Object strings = ZVal.newArray();

    public NamePrettifier(RuntimeEnv env, Object... args) {
        super(env);
    }

    public NamePrettifier(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object prettifyTestClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        ReferenceContainer title = new BasicReferenceContainer(null);
        title.setObject(ZVal.assign(name));
        if (ZVal.strictEqualityCheck(
                function_substr
                        .f
                        .env(env)
                        .call(
                                name,
                                ZVal.multiply(-1, function_strlen.f.env(env).call("Test").value()))
                        .value(),
                "===",
                "Test")) {
            title.setObject(
                    function_substr
                            .f
                            .env(env)
                            .call(
                                    title.getObject(),
                                    0,
                                    NamespaceGlobal.strripos
                                            .env(env)
                                            .call(title.getObject(), "Test")
                                            .value())
                            .value());
        }

        if (ZVal.strictEqualityCheck(
                function_strpos.f.env(env).call(name, "Tests").value(), "===", 0)) {
            title.setObject(
                    function_substr
                            .f
                            .env(env)
                            .call(
                                    title.getObject(),
                                    function_strlen.f.env(env).call("Tests").value())
                            .value());

        } else if (ZVal.strictEqualityCheck(
                function_strpos.f.env(env).call(name, "Test").value(), "===", 0)) {
            title.setObject(
                    function_substr
                            .f
                            .env(env)
                            .call(
                                    title.getObject(),
                                    function_strlen.f.env(env).call("Test").value())
                            .value());
        }

        if (ZVal.strictEqualityCheck(title.arrayGet(env, 0), "===", "\\")) {
            title.setObject(function_substr.f.env(env).call(title.getObject(), 1).value());
        }

        return ZVal.assign(title.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object prettifyTestMethod(RuntimeEnv env, Object... args) {
        ReferenceContainer name = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object wasNumeric = null;
        Object string = null;
        Object max = null;
        Object isNumeric = null;
        ReferenceContainer count = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object buffer = null;
        buffer = "";
        if (ZVal.toBool(!function_is_string.f.env(env).call(name.getObject()).getBool())
                || ZVal.toBool(ZVal.strictEqualityCheck(name.getObject(), "===", ""))) {
            return ZVal.assign(buffer);
        }

        string =
                function_preg_replace
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(4, count))
                        .call("#\\d+$#", "", name.getObject(), -1, count.getObject())
                        .value();
        if (function_in_array.f.env(env).call(string, this.strings).getBool()) {
            name.setObject(ZVal.assign(string));

        } else if (ZVal.strictEqualityCheck(count.getObject(), "===", 0)) {
            new ReferenceClassProperty(this, "strings", env).arrayAppend(env).set(string);
        }

        if (ZVal.strictEqualityCheck(
                function_strpos.f.env(env).call(name.getObject(), "test_").value(), "===", 0)) {
            name.setObject(function_substr.f.env(env).call(name.getObject(), 5).value());

        } else if (ZVal.strictEqualityCheck(
                function_strpos.f.env(env).call(name.getObject(), "test").value(), "===", 0)) {
            name.setObject(function_substr.f.env(env).call(name.getObject(), 4).value());
        }

        if (ZVal.strictEqualityCheck(name.getObject(), "===", "")) {
            return ZVal.assign(buffer);
        }

        name.arrayAccess(env, 0)
                .set(NamespaceGlobal.strtoupper.env(env).call(name.arrayGet(env, 0)).value());
        if (ZVal.strictNotEqualityCheck(
                function_strpos.f.env(env).call(name.getObject(), "_").value(), "!==", false)) {
            return ZVal.assign(
                    function_trim
                            .f
                            .env(env)
                            .call(
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call("_", " ", name.getObject())
                                            .value())
                            .value());
        }

        max = function_strlen.f.env(env).call(name.getObject()).value();
        wasNumeric = false;
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', max);
                i.setObject(ZVal.increment(i.getObject()))) {
            if (ZVal.toBool(
                            ZVal.toBool(ZVal.isGreaterThan(i.getObject(), '>', 0))
                                    && ZVal.toBool(
                                            ZVal.isGreaterThanOrEqualTo(
                                                    NamespaceGlobal.ord
                                                            .env(env)
                                                            .call(name.arrayGet(env, i.getObject()))
                                                            .value(),
                                                    ">=",
                                                    65)))
                    && ZVal.toBool(
                            ZVal.isLessThanOrEqualTo(
                                    NamespaceGlobal.ord
                                            .env(env)
                                            .call(name.arrayGet(env, i.getObject()))
                                            .value(),
                                    "<=",
                                    90))) {
                buffer =
                        toStringR(buffer, env)
                                + " "
                                + toStringR(
                                        NamespaceGlobal.strtolower
                                                .env(env)
                                                .call(name.arrayGet(env, i.getObject()))
                                                .value(),
                                        env);

            } else {
                isNumeric =
                        function_is_numeric
                                .f
                                .env(env)
                                .call(name.arrayGet(env, i.getObject()))
                                .value();
                if (ZVal.toBool(!ZVal.isTrue(wasNumeric)) && ZVal.toBool(isNumeric)) {
                    buffer = toStringR(buffer, env) + " ";
                    wasNumeric = true;
                }

                if (ZVal.toBool(wasNumeric) && ZVal.toBool(!ZVal.isTrue(isNumeric))) {
                    wasNumeric = false;
                }

                buffer = toStringR(buffer, env) + toStringR(name.arrayGet(env, i.getObject()), env);
            }
        }

        return ZVal.assign(buffer);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\TestDox\\NamePrettifier";

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
                    .setName("PHPUnit\\Util\\TestDox\\NamePrettifier")
                    .setLookup(
                            NamePrettifier.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("strings")
                    .setFilename("vendor/phpunit/phpunit/src/Util/TestDox/NamePrettifier.php")
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
