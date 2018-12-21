package com.project.convertedCode.includes.vendor.jakub_onderka.php_console_color;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.JakubOnderka.namespaces.PhpConsoleColor.classes.ConsoleColor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/jakub-onderka/php-console-color/example.php

*/

public class file_example_php implements RuntimeIncludable {

    public static final file_example_php instance = new file_example_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope866 scope = new Scope866();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope866 scope)
            throws IncludeEventException {
        scope.loader =
                ZVal.assign(
                        env.include(
                                toStringR(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/jakub-onderka/php-console-color"),
                                                env)
                                        + "/vendor/autoload.php",
                                stack,
                                this,
                                true,
                                true));
        scope.consoleColor = new ConsoleColor(env);
        env.echo(
                "Colors are supported: "
                        + toStringR(
                                ZVal.isTrue(
                                                env.callMethod(
                                                        scope.consoleColor,
                                                        "isSupported",
                                                        file_example_php.class))
                                        ? "Yes"
                                        : "No",
                                env)
                        + "\n");
        env.echo(
                "256 colors are supported: "
                        + toStringR(
                                ZVal.isTrue(
                                                env.callMethod(
                                                        scope.consoleColor,
                                                        "are256ColorsSupported",
                                                        file_example_php.class))
                                        ? "Yes"
                                        : "No",
                                env)
                        + "\n\n");
        if (ZVal.isTrue(
                env.callMethod(scope.consoleColor, "isSupported", file_example_php.class))) {
            for (ZPair zpairResult178 :
                    ZVal.getIterable(
                            env.callMethod(
                                    scope.consoleColor,
                                    "getPossibleStyles",
                                    file_example_php.class),
                            env,
                            true)) {
                scope.style = ZVal.assign(zpairResult178.getValue());
                env.echo(
                        toStringR(
                                        env.callMethod(
                                                scope.consoleColor,
                                                "apply",
                                                file_example_php.class,
                                                scope.style,
                                                scope.style),
                                        env)
                                + "\n");
            }
        }

        env.echo("\n");
        if (ZVal.isTrue(
                env.callMethod(
                        scope.consoleColor, "are256ColorsSupported", file_example_php.class))) {
            env.echo("Foreground colors:\n");
            for (scope.i.setObject(1);
                    ZVal.isLessThanOrEqualTo(scope.i.getObject(), "<=", 255);
                    scope.i.setObject(ZVal.increment(scope.i.getObject()))) {
                env.echo(
                        env.callMethod(
                                scope.consoleColor,
                                "apply",
                                file_example_php.class,
                                "color_" + toStringR(scope.i.getObject(), env),
                                NamespaceGlobal.str_pad
                                        .env(env)
                                        .call(scope.i.getObject(), 6, " ", 2)
                                        .value()));
                if (ZVal.strictEqualityCheck(ZVal.modulus(scope.i.getObject(), 15), "===", 0)) {
                    env.echo("\n");
                }
            }

            env.echo("\nBackground colors:\n");
            for (scope.i.setObject(1);
                    ZVal.isLessThanOrEqualTo(scope.i.getObject(), "<=", 255);
                    scope.i.setObject(ZVal.increment(scope.i.getObject()))) {
                env.echo(
                        env.callMethod(
                                scope.consoleColor,
                                "apply",
                                file_example_php.class,
                                "bg_color_" + toStringR(scope.i.getObject(), env),
                                NamespaceGlobal.str_pad
                                        .env(env)
                                        .call(scope.i.getObject(), 6, " ", 2)
                                        .value()));
                if (ZVal.strictEqualityCheck(ZVal.modulus(scope.i.getObject(), 15), "===", 0)) {
                    env.echo("\n");
                }
            }

            env.echo("\n");
        }
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/jakub-onderka/php-console-color")
                    .setFile("/vendor/jakub-onderka/php-console-color/example.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope866 implements UpdateRuntimeScopeInterface {

        Object loader;
        Object consoleColor;
        ReferenceContainer i;
        Object style;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("loader", this.loader);
            stack.setVariable("consoleColor", this.consoleColor);
            stack.setVariable("i", this.i);
            stack.setVariable("style", this.style);
        }

        public void updateScope(RuntimeStack stack) {

            this.loader = stack.getVariable("loader");
            this.consoleColor = stack.getVariable("consoleColor");
            this.i = ZVal.getStackReference(stack.getVariable("i"));
            this.style = stack.getVariable("style");
        }
    }
}
