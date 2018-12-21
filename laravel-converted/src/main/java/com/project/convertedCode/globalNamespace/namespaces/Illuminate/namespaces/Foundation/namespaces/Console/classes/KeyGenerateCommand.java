package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Encryption.classes.Encrypter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/KeyGenerateCommand.php

*/

public class KeyGenerateCommand extends Command {

    public KeyGenerateCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.signature =
                "key:generate\n                    {--show : Display the key instead of modifying files}\n                    {--force : Force the operation to run when in production}";
        this.description = "Set the application key";
        if (this.getClass() == KeyGenerateCommand.class) {
            this.__construct(env, args);
        }
    }

    public KeyGenerateCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        Object key = null;
        key = this.generateRandomKey(env);
        if (ZVal.isTrue(env.callMethod(this, "option", KeyGenerateCommand.class, "show"))) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            "line",
                            KeyGenerateCommand.class,
                            "<comment>" + toStringR(key, env) + "</comment>"));
        }

        if (!ZVal.isTrue(this.setKeyInEnvironmentFile(env, key))) {
            return null;
        }

        new ReferenceClassProperty(this, "laravel", env)
                .arrayAccess(env, "config", "app.key")
                .set(key);
        env.callMethod(
                this,
                "info",
                KeyGenerateCommand.class,
                "Application key [" + toStringR(key, env) + "] set successfully.");
        return null;
    }

    @ConvertedMethod
    protected Object generateRandomKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "base64:"
                        + toStringR(
                                NamespaceGlobal.base64_encode
                                        .env(env)
                                        .call(
                                                Encrypter.runtimeStaticObject.generateKey(
                                                        env,
                                                        new ReferenceClassProperty(
                                                                        this, "laravel", env)
                                                                .arrayGet(
                                                                        env,
                                                                        "config",
                                                                        "app.cipher")))
                                        .value(),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object setKeyInEnvironmentFile(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object currentKey = null;
        currentKey =
                ZVal.assign(
                        new ReferenceClassProperty(this, "laravel", env)
                                .arrayGet(env, "config", "app.key"));
        if (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                function_strlen.f.env(env).call(currentKey).value(), "!==", 0))
                && ZVal.toBool(!ZVal.isTrue(this.confirmToProceed(env)))) {
            return ZVal.assign(false);
        }

        this.writeNewEnvironmentFileWith(env, key);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object writeNewEnvironmentFileWith(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        NamespaceGlobal.file_put_contents
                .env(env)
                .call(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("laravel").value(),
                                "environmentFilePath",
                                KeyGenerateCommand.class),
                        function_preg_replace
                                .f
                                .env(env)
                                .call(
                                        this.keyReplacementPattern(env),
                                        "APP_KEY=" + toStringR(key, env),
                                        function_file_get_contents
                                                .f
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("laravel")
                                                                        .value(),
                                                                "environmentFilePath",
                                                                KeyGenerateCommand.class))
                                                .value())
                                .value());
        return null;
    }

    @ConvertedMethod
    protected Object keyReplacementPattern(RuntimeEnv env, Object... args) {
        Object escaped = null;
        escaped =
                NamespaceGlobal.preg_quote
                        .env(env)
                        .call(
                                "="
                                        + toStringR(
                                                new ReferenceClassProperty(this, "laravel", env)
                                                        .arrayGet(env, "config", "app.key"),
                                                env),
                                "/")
                        .value();
        return ZVal.assign("/^APP_KEY" + toStringR(escaped, env) + "/m");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "warning")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object confirmToProceed(RuntimeEnv env, Object... args) {
        Object warning = assignParameter(args, 0, true);
        if (null == warning) {
            warning = "Application In Production!";
        }
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object shouldConfirm = null;
        Object confirmed = null;
        callback =
                ZVal.assign(
                        function_is_null.f.env(env).call(callback).getBool()
                                ? this.getDefaultConfirmCallback(env)
                                : callback);
        shouldConfirm =
                ZVal.assign(
                        ZVal.isTrue(ZVal.checkInstanceType(callback, Closure.class, "Closure"))
                                ? function_call_user_func
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call(callback)
                                        .value()
                                : callback);
        if (ZVal.isTrue(shouldConfirm)) {
            if (ZVal.isTrue(env.callMethod(this, "option", KeyGenerateCommand.class, "force"))) {
                return ZVal.assign(true);
            }

            env.callMethod(this, "alert", KeyGenerateCommand.class, warning);
            confirmed =
                    env.callMethod(
                            this,
                            "confirm",
                            KeyGenerateCommand.class,
                            "Do you really wish to run this command?");
            if (!ZVal.isTrue(confirmed)) {
                env.callMethod(this, "comment", KeyGenerateCommand.class, "Command Cancelled!");
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    protected Object getDefaultConfirmCallback(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Console")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Console/ConfirmableTrait.php");
        return ZVal.assign(
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Console", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        return ZVal.assign(
                                ZVal.equalityCheck(
                                        env.callMethod(
                                                env.callMethod(
                                                        _closureThisVar,
                                                        "getLaravel",
                                                        KeyGenerateCommand.class),
                                                "environment",
                                                KeyGenerateCommand.class),
                                        "production"));
                    }
                });
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\KeyGenerateCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Command.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Console\\KeyGenerateCommand")
                    .setLookup(
                            KeyGenerateCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "definition",
                            "description",
                            "description",
                            "description",
                            "help",
                            "helperSet",
                            "hidden",
                            "hidden",
                            "ignoreValidationErrors",
                            "input",
                            "laravel",
                            "name",
                            "name",
                            "output",
                            "processTitle",
                            "signature",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/KeyGenerateCommand.php")
                    .addTrait("Illuminate\\Console\\ConfirmableTrait")
                    .addExtendsClass("Illuminate\\Console\\Command")
                    .addExtendsClass("Symfony\\Component\\Console\\Command\\Command")
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
