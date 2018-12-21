package com.project.convertedCode.includes.storage.framework.views;

import com.project.convertedCode.globalNamespace.functions.app;
import com.project.convertedCode.globalNamespace.functions.e;
import com.project.convertedCode.globalNamespace.functions.auth;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.functions.url;
import com.runtimeconverter.runtime.RuntimeStack;
import com.project.convertedCode.globalNamespace.functions.route;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 storage/framework/views/924f7b5b4478b4d86efeeda6a6ca03808d7a7244.php

*/

public class file_924f7b5b4478b4d86efeeda6a6ca03808d7a7244_php implements RuntimeIncludable {

    public static final file_924f7b5b4478b4d86efeeda6a6ca03808d7a7244_php instance =
            new file_924f7b5b4478b4d86efeeda6a6ca03808d7a7244_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope229 scope = new Scope229();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope229 scope)
            throws IncludeEventException {
        env.echo("<!doctype html>\n<html lang=\"");
        env.echo(
                e.f.env(env)
                        .call(
                                env.callMethod(
                                        app.f.env(env).call().value(),
                                        "getLocale",
                                        file_924f7b5b4478b4d86efeeda6a6ca03808d7a7244_php.class))
                        .value());

        env.echo(ZVal.getResourceAsString("stringLiterals/stringLiteral53.txt"));
        if (ZVal.isTrue(
                StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "Route"), env)
                        .callUnknownStaticMethod(
                                env, "has", new RuntimeArgsWithReferences(), "login"))) {

            env.echo("                <div class=\"top-right links\">\n                    ");
            if (ZVal.isTrue(
                    env.callMethod(
                            env.callMethod(
                                    auth.f.env(env).call().value(),
                                    "guard",
                                    file_924f7b5b4478b4d86efeeda6a6ca03808d7a7244_php.class),
                            "check",
                            file_924f7b5b4478b4d86efeeda6a6ca03808d7a7244_php.class))) {

                env.echo("                        <a href=\"");
                env.echo(e.f.env(env).call(url.f.env(env).call("/home").value()).value());

                env.echo("\">Home</a>\n                    ");

            } else {

                env.echo("                        <a href=\"");
                env.echo(e.f.env(env).call(route.f.env(env).call("login").value()).value());

                env.echo("\">Login</a>\n                        <a href=\"");
                env.echo(e.f.env(env).call(route.f.env(env).call("register").value()).value());

                env.echo("\">Register</a>\n                    ");
            }

            env.echo("                </div>\n            ");
        }

        env.echo(
                "\n            <div class=\"content\">\n                <div class=\"title m-b-md\">\n                    Laravel\n                </div>\n\n                <div class=\"links\">\n                    <a href=\"https://laravel.com/docs\">Documentation</a>\n                    <a href=\"https://laracasts.com\">Laracasts</a>\n                    <a href=\"https://laravel-news.com\">News</a>\n                    <a href=\"https://forge.laravel.com\">Forge</a>\n                    <a href=\"https://github.com/laravel/laravel\">GitHub</a>\n                </div>\n            </div>\n        </div>\n    </body>\n</html>\n");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/storage/framework/views")
                    .setFile(
                            "/storage/framework/views/924f7b5b4478b4d86efeeda6a6ca03808d7a7244.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope229 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
