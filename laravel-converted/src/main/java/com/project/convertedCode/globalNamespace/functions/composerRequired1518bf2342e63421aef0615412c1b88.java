package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/composer/autoload_real.php

*/

public class composerRequired1518bf2342e63421aef0615412c1b88 extends FunctionBaseRegular {

    public static composerRequired1518bf2342e63421aef0615412c1b88 f =
            new composerRequired1518bf2342e63421aef0615412c1b88();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fileIdentifier")
    @ConvertedParameter(index = 1, name = "file")
    public Object call(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope10 scope = new Scope10();
        stack.pushScope(scope);
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/composer")
                            .setFile("/vendor/composer/autoload_real.php");
            scope.fileIdentifier = assignParameter(args, 0, false);
            scope.file = assignParameter(args, 1, false);
            scope.GLOBALS = new GlobalVariableReference(env, "GLOBALS");
            if (arrayActionR(
                    ArrayAction.EMPTY,
                    scope.GLOBALS,
                    env,
                    "__composer_autoload_files",
                    scope.fileIdentifier)) {
                env.include(
                        toStringR(scope.file, env),
                        stack,
                        runtimeConverterFunctionClassConstants,
                        true,
                        false);
                scope.GLOBALS
                        .arrayAccess(env, "__composer_autoload_files", scope.fileIdentifier)
                        .set(true);
            }

            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    private static class Scope10 implements UpdateRuntimeScopeInterface {

        ReferenceContainer GLOBALS;
        Object file;
        Object fileIdentifier;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("GLOBALS", this.GLOBALS);
            stack.setVariable("file", this.file);
            stack.setVariable("fileIdentifier", this.fileIdentifier);
        }

        public void updateScope(RuntimeStack stack) {

            this.GLOBALS = ZVal.getStackReference(stack.getVariable("GLOBALS"));
            this.file = stack.getVariable("file");
            this.fileIdentifier = stack.getVariable("fileIdentifier");
        }
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/composer")
                .setFile("/vendor/composer/autoload_real.php");
    }
}
