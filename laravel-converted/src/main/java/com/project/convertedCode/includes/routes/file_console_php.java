package com.project.convertedCode.includes.routes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.classes.Inspiring;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 routes/console.php

*/

public class file_console_php implements RuntimeIncludable {

    public static final file_console_php instance = new file_console_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope226 scope = new Scope226();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope226 scope)
            throws IncludeEventException {
        // Namespace import was here
        env.callMethod(
                StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "Artisan"), env)
                        .callUnknownStaticMethod(
                                env,
                                "command",
                                new RuntimeArgsWithReferences(),
                                "inspire",
                                new Closure(
                                        env, this.getContextConstants(), "", stack.get("this")) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        env.callMethod(
                                                _closureThisVar,
                                                "comment",
                                                file_console_php.class,
                                                Inspiring.runtimeStaticObject.quote(env));
                                        return null;
                                    }
                                }),
                "describe",
                file_console_php.class,
                "Display an inspiring quote");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/routes").setFile("/routes/console.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope226 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
