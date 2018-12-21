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

 vendor/composer/autoload_psr4.php

*/

public class file_autoload_psr4_php implements RuntimeIncludable {

    public static final file_autoload_psr4_php instance = new file_autoload_psr4_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope235 scope = new Scope235();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope235 scope)
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
                                                        "/vendor/composer/autoload_psr4.php"))
                                        .value())
                        .value();
        scope.baseDir = function_dirname.f.env(env).call(scope.vendorDir).value();
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "phpDocumentor\\Reflection\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/phpdocumentor/reflection-common/src"),
                                                new ZPair(
                                                        1,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/phpdocumentor/reflection-docblock/src"),
                                                new ZPair(
                                                        2,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/phpdocumentor/type-resolver/src"))),
                                new ZPair(
                                        "XdgBaseDir\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/dnoegel/php-xdg-base-dir/src"))),
                                new ZPair(
                                        "Whoops\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/filp/whoops/src/Whoops"))),
                                new ZPair(
                                        "Webmozart\\Assert\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/webmozart/assert/src"))),
                                new ZPair(
                                        "TijsVerkoyen\\CssToInlineStyles\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/tijsverkoyen/css-to-inline-styles/src"))),
                                new ZPair(
                                        "Tests\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.baseDir, env) + "/tests"))),
                                new ZPair(
                                        "Symfony\\Polyfill\\Php72\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/symfony/polyfill-php72"))),
                                new ZPair(
                                        "Symfony\\Polyfill\\Mbstring\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/symfony/polyfill-mbstring"))),
                                new ZPair(
                                        "Symfony\\Polyfill\\Ctype\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/symfony/polyfill-ctype"))),
                                new ZPair(
                                        "Symfony\\Component\\VarDumper\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/symfony/var-dumper"))),
                                new ZPair(
                                        "Symfony\\Component\\Translation\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/symfony/translation"))),
                                new ZPair(
                                        "Symfony\\Component\\Routing\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/symfony/routing"))),
                                new ZPair(
                                        "Symfony\\Component\\Process\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/symfony/process"))),
                                new ZPair(
                                        "Symfony\\Component\\HttpKernel\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/symfony/http-kernel"))),
                                new ZPair(
                                        "Symfony\\Component\\HttpFoundation\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/symfony/http-foundation"))),
                                new ZPair(
                                        "Symfony\\Component\\Finder\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/symfony/finder"))),
                                new ZPair(
                                        "Symfony\\Component\\EventDispatcher\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/symfony/event-dispatcher"))),
                                new ZPair(
                                        "Symfony\\Component\\Debug\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/symfony/debug"))),
                                new ZPair(
                                        "Symfony\\Component\\CssSelector\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/symfony/css-selector"))),
                                new ZPair(
                                        "Symfony\\Component\\Console\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/symfony/console"))),
                                new ZPair(
                                        "Ramsey\\Uuid\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/ramsey/uuid/src"))),
                                new ZPair(
                                        "Psy\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/psy/psysh/src"))),
                                new ZPair(
                                        "Psr\\SimpleCache\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/psr/simple-cache/src"))),
                                new ZPair(
                                        "Psr\\Log\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/psr/log/Psr/Log"))),
                                new ZPair(
                                        "Psr\\Container\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/psr/container/src"))),
                                new ZPair(
                                        "PhpParser\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/nikic/php-parser/lib/PhpParser"))),
                                new ZPair(
                                        "NunoMaduro\\Collision\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/nunomaduro/collision/src"))),
                                new ZPair(
                                        "Monolog\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/monolog/monolog/src/Monolog"))),
                                new ZPair(
                                        "League\\Flysystem\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/league/flysystem/src"))),
                                new ZPair(
                                        "Laravel\\Tinker\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/laravel/tinker/src"))),
                                new ZPair(
                                        "Illuminate\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/laravel/framework/src/Illuminate"))),
                                new ZPair(
                                        "Fideloper\\Proxy\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/fideloper/proxy/src"))),
                                new ZPair(
                                        "Faker\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/fzaninotto/faker/src/Faker"))),
                                new ZPair(
                                        "Egulias\\EmailValidator\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/egulias/email-validator/EmailValidator"))),
                                new ZPair(
                                        "Dotenv\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/vlucas/phpdotenv/src"))),
                                new ZPair(
                                        "Doctrine\\Instantiator\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/doctrine/instantiator/src/Doctrine/Instantiator"))),
                                new ZPair(
                                        "Doctrine\\Common\\Inflector\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/doctrine/inflector/lib/Doctrine/Common/Inflector"))),
                                new ZPair(
                                        "DeepCopy\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/myclabs/deep-copy/src/DeepCopy"))),
                                new ZPair(
                                        "Cron\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/dragonmantank/cron-expression/src/Cron"))),
                                new ZPair(
                                        "Carbon\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.vendorDir, env)
                                                                + "/nesbot/carbon/src/Carbon"))),
                                new ZPair(
                                        "App\\",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        toStringR(scope.baseDir, env)
                                                                + "/app"))))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/composer")
                    .setFile("/vendor/composer/autoload_psr4.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope235 implements UpdateRuntimeScopeInterface {

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
