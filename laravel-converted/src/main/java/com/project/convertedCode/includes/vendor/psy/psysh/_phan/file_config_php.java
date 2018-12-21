package com.project.convertedCode.includes.vendor.psy.psysh._phan;

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

 vendor/psy/psysh/.phan/config.php

*/

public class file_config_php implements RuntimeIncludable {

    public static final file_config_php instance = new file_config_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2736 scope = new Scope2736();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2736 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "directory_list",
                                        ZVal.arrayFromList(
                                                "src/",
                                                "vendor/dnoegel/php-xdg-base-dir/src/",
                                                "vendor/doctrine/instantiator/src/",
                                                "vendor/hoa/console/",
                                                "vendor/jakub-onderka/php-console-color/src/",
                                                "vendor/jakub-onderka/php-console-highlighter/src/",
                                                "vendor/nikic/php-parser/lib/",
                                                "vendor/phpdocumentor/reflection-docblock/",
                                                "vendor/symfony/console/",
                                                "vendor/symfony/filesystem/",
                                                "vendor/symfony/finder/",
                                                "vendor/symfony/var-dumper/")),
                                new ZPair(
                                        "exclude_analysis_directory_list",
                                        ZVal.arrayFromList("vendor/")))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/psy/psysh/.phan")
                    .setFile("/vendor/psy/psysh/.phan/config.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2736 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
