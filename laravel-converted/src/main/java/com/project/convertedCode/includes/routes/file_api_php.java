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
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 routes/api.php

*/

public class file_api_php implements RuntimeIncludable {

    public static final file_api_php instance = new file_api_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope224 scope = new Scope224();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope224 scope)
            throws IncludeEventException {
        // Namespace import was here
        env.callMethod(
                StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "Route"), env)
                        .callUnknownStaticMethod(
                                env, "middleware", new RuntimeArgsWithReferences(), "auth:api"),
                "get",
                file_api_php.class,
                "/user",
                new Closure(env, this.getContextConstants(), "", stack.get("this")) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(
                        index = 0,
                        name = "request",
                        typeHint = "Illuminate\\Http\\Request"
                    )
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object request = assignParameter(args, 0, false);
                        return ZVal.assign(env.callMethod(request, "user", file_api_php.class));
                    }
                });
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/routes").setFile("/routes/api.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope224 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
