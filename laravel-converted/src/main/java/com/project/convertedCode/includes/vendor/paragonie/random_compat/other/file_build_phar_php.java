package com.project.convertedCode.includes.vendor.paragonie.random_compat.other;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.FilesystemIterator;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeClasses.phar.Phar;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/paragonie/random_compat/other/build_phar.php

*/

public class file_build_phar_php implements RuntimeIncludable {

    public static final file_build_phar_php instance = new file_build_phar_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2256 scope = new Scope2256();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2256 scope)
            throws IncludeEventException {
        scope.dist =
                toStringR(
                                function_dirname
                                        .f
                                        .env(env)
                                        .call(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/paragonie/random_compat/other"))
                                        .value(),
                                env)
                        + "/dist";
        if (!function_is_dir.f.env(env).call(scope.dist).getBool()) {
            NamespaceGlobal.mkdir.env(env).call(scope.dist, 493);
        }

        if (function_file_exists
                .f
                .env(env)
                .call(toStringR(scope.dist, env) + "/random_compat.phar")
                .getBool()) {
            NamespaceGlobal.unlink
                    .env(env)
                    .call(toStringR(scope.dist, env) + "/random_compat.phar");
        }

        scope.phar =
                new Phar(
                        env,
                        toStringR(scope.dist, env) + "/random_compat.phar",
                        ZVal.toLong(0) | ZVal.toLong(256),
                        "random_compat.phar");
        NamespaceGlobal.rename
                .env(env)
                .call(
                        toStringR(
                                        function_dirname
                                                .f
                                                .env(env)
                                                .call(
                                                        env.addRootFilesystemPrefix(
                                                                "/vendor/paragonie/random_compat/other"))
                                                .value(),
                                        env)
                                + "/lib/random.php",
                        toStringR(
                                        function_dirname
                                                .f
                                                .env(env)
                                                .call(
                                                        env.addRootFilesystemPrefix(
                                                                "/vendor/paragonie/random_compat/other"))
                                                .value(),
                                        env)
                                + "/lib/index.php");
        env.callMethod(
                scope.phar,
                "buildFromDirectory",
                file_build_phar_php.class,
                toStringR(
                                function_dirname
                                        .f
                                        .env(env)
                                        .call(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/paragonie/random_compat/other"))
                                        .value(),
                                env)
                        + "/lib");
        NamespaceGlobal.rename
                .env(env)
                .call(
                        toStringR(
                                        function_dirname
                                                .f
                                                .env(env)
                                                .call(
                                                        env.addRootFilesystemPrefix(
                                                                "/vendor/paragonie/random_compat/other"))
                                                .value(),
                                        env)
                                + "/lib/index.php",
                        toStringR(
                                        function_dirname
                                                .f
                                                .env(env)
                                                .call(
                                                        env.addRootFilesystemPrefix(
                                                                "/vendor/paragonie/random_compat/other"))
                                                .value(),
                                        env)
                                + "/lib/random.php");
        if (ZVal.isGreaterThan(scope.argc, '>', 1)) {
            if (!ZVal.isTrue(
                    NamespaceGlobal.is_readable
                            .env(env)
                            .call(scope.argv.arrayGet(env, 1))
                            .value())) {
                env.echo("Could not read the private key file:");
                env.echo(scope.argv.arrayGet(env, 1));
                env.echo("\n");
                env.exit(255);
            }

            scope.pkeyFile =
                    function_file_get_contents.f.env(env).call(scope.argv.arrayGet(env, 1)).value();
            scope._pPrivate =
                    NamespaceGlobal.openssl_get_privatekey.env(env).call(scope.pkeyFile).value();
            if (ZVal.strictNotEqualityCheck(scope._pPrivate, "!==", false)) {
                scope.pkey.setObject("");
                NamespaceGlobal.openssl_pkey_export
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(1, scope.pkey))
                        .call(scope._pPrivate, scope.pkey.getObject());
                env.callMethod(
                        scope.phar,
                        "setSignatureAlgorithm",
                        file_build_phar_php.class,
                        16,
                        scope.pkey.getObject());
                if (!ZVal.isTrue(
                        NamespaceGlobal.is_readable
                                .env(env)
                                .call(toStringR(scope.dist, env) + "/random_compat.phar.pubkey")
                                .value())) {
                    scope.details.setObject(
                            NamespaceGlobal.openssl_pkey_get_details
                                    .env(env)
                                    .call(scope._pPrivate)
                                    .value());
                    NamespaceGlobal.file_put_contents
                            .env(env)
                            .call(
                                    toStringR(scope.dist, env) + "/random_compat.phar.pubkey",
                                    scope.details.arrayGet(env, "key"));
                }

            } else {
                env.echo("An error occurred reading the private key from OpenSSL.");
                env.echo("\n");
                env.exit(255);
            }
        }
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/paragonie/random_compat/other")
                    .setFile("/vendor/paragonie/random_compat/other/build_phar.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2256 implements UpdateRuntimeScopeInterface {

        Object argc;
        Object _pPrivate;
        Object dist;
        Object pkeyFile;
        ReferenceContainer details;
        ReferenceContainer pkey;
        Object phar;
        ReferenceContainer argv;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("argc", this.argc);
            stack.setVariable("private", this._pPrivate);
            stack.setVariable("dist", this.dist);
            stack.setVariable("pkeyFile", this.pkeyFile);
            stack.setVariable("details", this.details);
            stack.setVariable("pkey", this.pkey);
            stack.setVariable("phar", this.phar);
            stack.setVariable("argv", this.argv);
        }

        public void updateScope(RuntimeStack stack) {

            this.argc = stack.getVariable("argc");
            this._pPrivate = stack.getVariable("private");
            this.dist = stack.getVariable("dist");
            this.pkeyFile = stack.getVariable("pkeyFile");
            this.details = ZVal.getStackReference(stack.getVariable("details"));
            this.pkey = ZVal.getStackReference(stack.getVariable("pkey"));
            this.phar = stack.getVariable("phar");
            this.argv = ZVal.getStackReference(stack.getVariable("argv"));
        }
    }
}
