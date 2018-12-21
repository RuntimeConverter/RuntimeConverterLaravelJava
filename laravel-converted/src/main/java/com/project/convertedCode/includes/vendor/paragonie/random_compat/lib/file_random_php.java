package com.project.convertedCode.includes.vendor.paragonie.random_compat.lib;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_define;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.exceptions.missingDefinitions.ClassNotFoundDuringConversion;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/paragonie/random_compat/lib/random.php

*/

public class file_random_php implements RuntimeIncludable {

    public static final file_random_php instance = new file_random_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2249 scope = new Scope2249();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2249 scope)
            throws IncludeEventException {
        if (!function_defined.f.env(env).call("PHP_VERSION_ID").getBool()) {
            scope.RandomCompatversion.setObject(
                    function_array_map
                            .f
                            .env(env)
                            .call(
                                    "intval",
                                    function_explode.f.env(env).call(".", "7.2.11-dev").value())
                            .value());
            function_define
                    .f
                    .env(env)
                    .call(
                            "PHP_VERSION_ID",
                            ZVal.add(
                                    ZVal.add(
                                            ZVal.multiply(
                                                    scope.RandomCompatversion.arrayGet(env, 0),
                                                    10000),
                                            ZVal.multiply(
                                                    scope.RandomCompatversion.arrayGet(env, 1),
                                                    100)),
                                    scope.RandomCompatversion.arrayGet(env, 2)));
            scope.RandomCompatversion.setObject(ZVal.getNull());
        }

        if (ZVal.isGreaterThanOrEqualTo(70211, ">=", 70000)) {
            throw new IncludeEventException(null);
        }

        if (!function_defined.f.env(env).call("RANDOM_COMPAT_READ_BUFFER").getBool()) {
            function_define.f.env(env).call("RANDOM_COMPAT_READ_BUFFER", 8);
        }

        scope.RandomCompatDIR =
                function_dirname
                        .f
                        .env(env)
                        .call(
                                env.addRootFilesystemPrefix(
                                        "/vendor/paragonie/random_compat/lib/random.php"))
                        .value();
        env.include(
                toStringR(scope.RandomCompatDIR, env)
                        + toStringR("/", env)
                        + "byte_safe_strings.php",
                stack,
                this,
                true,
                true);
        env.include(
                toStringR(scope.RandomCompatDIR, env) + toStringR("/", env) + "cast_to_int.php",
                stack,
                this,
                true,
                true);
        env.include(
                toStringR(scope.RandomCompatDIR, env) + toStringR("/", env) + "error_polyfill.php",
                stack,
                this,
                true,
                true);
        if (!function_is_callable.f.env(env).call("random_bytes").getBool()) {
            if (function_extension_loaded.f.env(env).call("libsodium").getBool()) {
                if (ZVal.toBool(ZVal.isGreaterThanOrEqualTo(70211, ">=", 50300))
                        && ZVal.toBool(
                                function_is_callable
                                        .f
                                        .env(env)
                                        .call("\\Sodium\\randombytes_buf")
                                        .value())) {
                    env.include(
                            toStringR(scope.RandomCompatDIR, env)
                                    + toStringR("/", env)
                                    + "random_bytes_libsodium.php",
                            stack,
                            this,
                            true,
                            true);

                } else if (function_method_exists
                        .f
                        .env(env)
                        .call("Sodium", "randombytes_buf")
                        .getBool()) {
                    env.include(
                            toStringR(scope.RandomCompatDIR, env)
                                    + toStringR("/", env)
                                    + "random_bytes_libsodium_legacy.php",
                            stack,
                            this,
                            true,
                            true);
                }
            }

            if (ZVal.strictEqualityCheck("/", "===", "/")) {
                scope.RandomCompatUrandom = true;
                scope.RandomCompat_basedir =
                        function_ini_get.f.env(env).call("open_basedir").value();
                if (!ZVal.isEmpty(scope.RandomCompat_basedir)) {
                    scope.RandomCompat_open_basedir =
                            function_explode
                                    .f
                                    .env(env)
                                    .call(
                                            ":",
                                            NamespaceGlobal.strtolower
                                                    .env(env)
                                                    .call(scope.RandomCompat_basedir)
                                                    .value())
                                    .value();
                    scope.RandomCompatUrandom =
                            ZVal.strictNotEqualityCheck(
                                    ZVal.newArray(),
                                    "!==",
                                    function_array_intersect
                                            .f
                                            .env(env)
                                            .call(
                                                    ZVal.arrayFromList(
                                                            "/dev", "/dev/", "/dev/urandom"),
                                                    scope.RandomCompat_open_basedir)
                                            .value());
                    scope.RandomCompat_open_basedir = ZVal.getNull();
                }

                if (ZVal.toBool(
                                ZVal.toBool(
                                                !function_is_callable
                                                        .f
                                                        .env(env)
                                                        .call("random_bytes")
                                                        .getBool())
                                        && ZVal.toBool(scope.RandomCompatUrandom))
                        && ZVal.toBool(
                                NamespaceGlobal.is_readable
                                        .env(env)
                                        .call("/dev/urandom")
                                        .value())) {
                    env.include(
                            toStringR(scope.RandomCompatDIR, env)
                                    + toStringR("/", env)
                                    + "random_bytes_dev_urandom.php",
                            stack,
                            this,
                            true,
                            true);
                }

                scope.RandomCompat_basedir = ZVal.getNull();

            } else {
                scope.RandomCompatUrandom = false;
            }

            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            !function_is_callable
                                                                    .f
                                                                    .env(env)
                                                                    .call("random_bytes")
                                                                    .getBool())
                                                    && ZVal.toBool(
                                                            ZVal.toBool(
                                                                            ZVal
                                                                                    .strictEqualityCheck(
                                                                                            "/",
                                                                                            "===",
                                                                                            "/"))
                                                                    || ZVal.toBool(
                                                                            ZVal
                                                                                    .isGreaterThanOrEqualTo(
                                                                                            70211,
                                                                                            ">=",
                                                                                            50307))))
                                    && ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.strictNotEqualityCheck(
                                                                    "/", "!==", "/"))
                                                    || ZVal.toBool(
                                                            ZVal.toBool(
                                                                            ZVal
                                                                                    .isLessThanOrEqualTo(
                                                                                            70211,
                                                                                            "<=",
                                                                                            50609))
                                                                    || ZVal.toBool(
                                                                            ZVal
                                                                                    .isGreaterThanOrEqualTo(
                                                                                            70211,
                                                                                            ">=",
                                                                                            50613)))))
                    && ZVal.toBool(function_extension_loaded.f.env(env).call("mcrypt").value())) {
                env.include(
                        toStringR(scope.RandomCompatDIR, env)
                                + toStringR("/", env)
                                + "random_bytes_mcrypt.php",
                        stack,
                        this,
                        true,
                        true);
            }

            scope.RandomCompatUrandom = ZVal.getNull();
            if (ZVal.toBool(
                            ZVal.toBool(
                                            !function_is_callable
                                                    .f
                                                    .env(env)
                                                    .call("random_bytes")
                                                    .getBool())
                                    && ZVal.toBool(
                                            function_extension_loaded
                                                    .f
                                                    .env(env)
                                                    .call("com_dotnet")
                                                    .value()))
                    && ZVal.toBool(function_class_exists.f.env(env).call("COM").value())) {
                scope.RandomCompat_disabled_classes =
                        NamespaceGlobal.preg_split
                                .env(env)
                                .call(
                                        "#\\s*,\\s*#",
                                        NamespaceGlobal.strtolower
                                                .env(env)
                                                .call(
                                                        function_ini_get
                                                                .f
                                                                .env(env)
                                                                .call("disable_classes")
                                                                .value())
                                                .value())
                                .value();
                if (!function_in_array
                        .f
                        .env(env)
                        .call("com", scope.RandomCompat_disabled_classes)
                        .getBool()) {
                    try {
                        scope.RandomCompatCOMtest =
                                env.createNew(
                                        ZVal.resolveClassAlias(env, "COM"), "CAPICOM.Utilities.1");
                        if (function_method_exists
                                .f
                                .env(env)
                                .call(scope.RandomCompatCOMtest, "GetRandom")
                                .getBool()) {
                            env.include(
                                    toStringR(scope.RandomCompatDIR, env)
                                            + toStringR("/", env)
                                            + "random_bytes_com_dotnet.php",
                                    stack,
                                    this,
                                    true,
                                    true);
                        }

                    } catch (ConvertedException convertedException101) {
                        if (ClassNotFoundDuringConversion.missingClassInCatchBlock(
                                "com_exception")) {
                            scope.e = convertedException101.getObject();
                        } else {
                            throw convertedException101;
                        }
                    }
                }

                scope.RandomCompat_disabled_classes = ZVal.getNull();
                scope.RandomCompatCOMtest = ZVal.getNull();
            }

            if (!function_is_callable.f.env(env).call("random_bytes").getBool()) {
                // a function named random_bytes was defined here with PHP code
                env.addManualFunctionLoad("random_bytes");
            }
        }

        if (!function_is_callable.f.env(env).call("random_int").getBool()) {
            env.include(
                    toStringR(scope.RandomCompatDIR, env) + toStringR("/", env) + "random_int.php",
                    stack,
                    this,
                    true,
                    true);
        }

        scope.RandomCompatDIR = ZVal.getNull();
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/paragonie/random_compat/lib")
                    .setFile("/vendor/paragonie/random_compat/lib/random.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2249 implements UpdateRuntimeScopeInterface {

        ReferenceContainer RandomCompatversion;
        Object RandomCompatUrandom;
        Object e;
        Object RandomCompatDIR;
        Object RandomCompat_disabled_classes;
        Object RandomCompat_basedir;
        Object RandomCompat_open_basedir;
        Object RandomCompatCOMtest;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("RandomCompatversion", this.RandomCompatversion);
            stack.setVariable("RandomCompatUrandom", this.RandomCompatUrandom);
            stack.setVariable("e", this.e);
            stack.setVariable("RandomCompatDIR", this.RandomCompatDIR);
            stack.setVariable("RandomCompat_disabled_classes", this.RandomCompat_disabled_classes);
            stack.setVariable("RandomCompat_basedir", this.RandomCompat_basedir);
            stack.setVariable("RandomCompat_open_basedir", this.RandomCompat_open_basedir);
            stack.setVariable("RandomCompatCOMtest", this.RandomCompatCOMtest);
        }

        public void updateScope(RuntimeStack stack) {

            this.RandomCompatversion =
                    ZVal.getStackReference(stack.getVariable("RandomCompatversion"));
            this.RandomCompatUrandom = stack.getVariable("RandomCompatUrandom");
            this.e = stack.getVariable("e");
            this.RandomCompatDIR = stack.getVariable("RandomCompatDIR");
            this.RandomCompat_disabled_classes = stack.getVariable("RandomCompat_disabled_classes");
            this.RandomCompat_basedir = stack.getVariable("RandomCompat_basedir");
            this.RandomCompat_open_basedir = stack.getVariable("RandomCompat_open_basedir");
            this.RandomCompatCOMtest = stack.getVariable("RandomCompatCOMtest");
        }
    }
}
