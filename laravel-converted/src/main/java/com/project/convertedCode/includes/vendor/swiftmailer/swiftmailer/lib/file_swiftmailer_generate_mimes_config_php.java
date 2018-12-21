package com.project.convertedCode.includes.vendor.swiftmailer.swiftmailer.lib;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_define;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.project.convertedCode.globalNamespace.functions.generateUpToDateMimeArray;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/swiftmailer_generate_mimes_config.php

*/

public class file_swiftmailer_generate_mimes_config_php implements RuntimeIncludable {

    public static final file_swiftmailer_generate_mimes_config_php instance =
            new file_swiftmailer_generate_mimes_config_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3140 scope = new Scope3140();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3140 scope)
            throws IncludeEventException {
        env.echo("#!/usr/bin/php\n\n");
        function_define
                .f
                .env(env)
                .call(
                        "APACHE_MIME_TYPES_URL",
                        "https://svn.apache.org/repos/asf/httpd/httpd/trunk/docs/conf/mime.types");
        function_define
                .f
                .env(env)
                .call(
                        "FREEDESKTOP_XML_URL",
                        "https://raw.github.com/minad/mimemagic/master/script/freedesktop.org.xml");
        // a function named generateUpToDateMimeArray was defined here with PHP code
        env.addManualFunctionLoad("generateUpToDateMimeArray");
        generateUpToDateMimeArray.f.env(env).call();
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib")
                    .setFile(
                            "/vendor/swiftmailer/swiftmailer/lib/swiftmailer_generate_mimes_config.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3140 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
