package com.project.convertedCode.includes.vendor.symfony.http_kernel.Resources;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Resources/welcome.html.php

*/

public class file_welcome_html_php implements RuntimeIncludable {

    public static final file_welcome_html_php instance = new file_welcome_html_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3515 scope = new Scope3515();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3515 scope)
            throws IncludeEventException {
        env.echo(ZVal.getResourceAsString("stringLiterals/stringLiteral3377.txt"));
        env.echo(scope.version);

        env.echo(
                "</h1>\n        </div>\n\n        <div id=\"status\">\n            <p>\n                <svg id=\"icon-status\" width=\"1792\" height=\"1792\" viewBox=\"0 0 1792 1792\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M1671 566q0 40-28 68l-724 724-136 136q-28 28-68 28t-68-28l-136-136-362-362q-28-28-28-68t28-68l136-136q28-28 68-28t68 28l294 295 656-657q28-28 68-28t68 28l136 136q28 28 28 68z\" fill=\"#759E1A\"/></svg>\n\n                Your application is now ready. You can start working on it at:<br>\n                <code>");
        env.echo(scope.baseDir);

        env.echo(ZVal.getResourceAsString("stringLiterals/stringLiteral3378.txt"));
        env.echo(scope.docVersion);

        env.echo(
                "/page_creation.html\">\n                    How to create your first page in Symfony\n                </a>\n            </p>\n        </div>\n    </div>\n    <div id=\"comment\">\n        <p>\n            You're seeing this page because debug mode is enabled and you haven't configured any homepage URL.\n        </p>\n    </div>\n</div>\n</body>\n</html>\n");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/http-kernel/Resources")
                    .setFile("/vendor/symfony/http-kernel/Resources/welcome.html.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3515 implements UpdateRuntimeScopeInterface {

        Object baseDir;
        Object version;
        Object docVersion;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("baseDir", this.baseDir);
            stack.setVariable("version", this.version);
            stack.setVariable("docVersion", this.docVersion);
        }

        public void updateScope(RuntimeStack stack) {

            this.baseDir = stack.getVariable("baseDir");
            this.version = stack.getVariable("version");
            this.docVersion = stack.getVariable("docVersion");
        }
    }
}
