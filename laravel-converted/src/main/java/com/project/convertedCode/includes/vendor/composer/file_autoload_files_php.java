package com.project.convertedCode.includes.vendor.composer;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/composer/autoload_files.php

*/

public class file_autoload_files_php implements RuntimeIncludable {

    public static final file_autoload_files_php instance = new file_autoload_files_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope233 scope = new Scope233();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope233 scope)
            throws IncludeEventException {
        scope.vendorDir =
                function_dirname
                        .f
                        .env(env)
                        .call(
                                function_dirname
                                        .f
                                        .env(env)
                                        .call(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/composer/autoload_files.php"))
                                        .value())
                        .value();
        scope.baseDir = function_dirname.f.env(env).call(scope.vendorDir).value();
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "0e6d7bf4a5811bfa5cf40c5ccd6fae6a",
                                        toStringR(scope.vendorDir, env)
                                                + "/symfony/polyfill-mbstring/bootstrap.php"),
                                new ZPair(
                                        "25072dd6e2470089de65ae7bf11d3109",
                                        toStringR(scope.vendorDir, env)
                                                + "/symfony/polyfill-php72/bootstrap.php"),
                                new ZPair(
                                        "667aeda72477189d0494fecd327c3641",
                                        toStringR(scope.vendorDir, env)
                                                + "/symfony/var-dumper/Resources/functions/dump.php"),
                                new ZPair(
                                        "320cde22f66dd4f5d3fd621d3e88b98f",
                                        toStringR(scope.vendorDir, env)
                                                + "/symfony/polyfill-ctype/bootstrap.php"),
                                new ZPair(
                                        "2c102faa651ef8ea5874edb585946bce",
                                        toStringR(scope.vendorDir, env)
                                                + "/swiftmailer/swiftmailer/lib/swift_required.php"),
                                new ZPair(
                                        "5255c38a0faeba867671b61dfda6d864",
                                        toStringR(scope.vendorDir, env)
                                                + "/paragonie/random_compat/lib/random.php"),
                                new ZPair(
                                        "f0906e6318348a765ffb6eb24e0d0938",
                                        toStringR(scope.vendorDir, env)
                                                + "/laravel/framework/src/Illuminate/Foundation/helpers.php"),
                                new ZPair(
                                        "58571171fd5812e6e447dce228f52f4d",
                                        toStringR(scope.vendorDir, env)
                                                + "/laravel/framework/src/Illuminate/Support/helpers.php"),
                                new ZPair(
                                        "6124b4c8570aa390c21fafd04a26c69f",
                                        toStringR(scope.vendorDir, env)
                                                + "/myclabs/deep-copy/src/DeepCopy/deep_copy.php"),
                                new ZPair(
                                        "801c31d8ed748cfa537fa45402288c95",
                                        toStringR(scope.vendorDir, env)
                                                + "/psy/psysh/src/functions.php"))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/composer")
                    .setFile("/vendor/composer/autoload_files.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope233 implements UpdateRuntimeScopeInterface {

        Object vendorDir;
        Object baseDir;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("vendorDir", this.vendorDir);
            stack.setVariable("baseDir", this.baseDir);
        }

        public void updateScope(RuntimeStack stack) {

            this.vendorDir = stack.getVariable("vendorDir");
            this.baseDir = stack.getVariable("baseDir");
        }
    }
}
