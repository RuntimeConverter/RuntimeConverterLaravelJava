package com.project.convertedCode.includes.vendor.swiftmailer.swiftmailer.lib;

import com.runtimeconverter.runtime.RuntimeStack;
import com.project.convertedCode.globalNamespace.classes.Swift_Preferences;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/preferences.php

*/

public class file_preferences_php implements RuntimeIncludable {

    public static final file_preferences_php instance = new file_preferences_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3138 scope = new Scope3138();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3138 scope)
            throws IncludeEventException {
        scope.preferences = Swift_Preferences.runtimeStaticObject.getInstance(env);
        env.callMethod(scope.preferences, "setCharset", file_preferences_php.class, "utf-8");
        if (ZVal.isTrue(
                NamespaceGlobal.is_writable
                        .env(env)
                        .call(
                                scope.tmpDir =
                                        NamespaceGlobal.sys_get_temp_dir.env(env).call().value())
                        .value())) {
            env.callMethod(
                    env.callMethod(
                            scope.preferences,
                            "setTempDir",
                            file_preferences_php.class,
                            scope.tmpDir),
                    "setCacheType",
                    file_preferences_php.class,
                    "disk");
        }
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib")
                    .setFile("/vendor/swiftmailer/swiftmailer/lib/preferences.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3138 implements UpdateRuntimeScopeInterface {

        Object tmpDir;
        Object preferences;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("tmpDir", this.tmpDir);
            stack.setVariable("preferences", this.preferences);
        }

        public void updateScope(RuntimeStack stack) {

            this.tmpDir = stack.getVariable("tmpDir");
            this.preferences = stack.getVariable("preferences");
        }
    }
}
