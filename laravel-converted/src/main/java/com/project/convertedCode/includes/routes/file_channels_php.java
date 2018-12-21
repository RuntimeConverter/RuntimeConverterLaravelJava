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
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 routes/channels.php

*/

public class file_channels_php implements RuntimeIncludable {

    public static final file_channels_php instance = new file_channels_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope225 scope = new Scope225();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope225 scope)
            throws IncludeEventException {
        StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "Broadcast"), env)
                .callUnknownStaticMethod(
                        env,
                        "channel",
                        new RuntimeArgsWithReferences(),
                        "App.User.{id}",
                        new Closure(env, this.getContextConstants(), "", stack.get("this")) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "user")
                            @ConvertedParameter(index = 1, name = "id")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object user = assignParameter(args, 0, false);
                                Object id = assignParameter(args, 1, false);
                                return ZVal.assign(
                                        ZVal.strictEqualityCheck(
                                                ZVal.toLong(
                                                        toObjectR(user)
                                                                .accessProp(this, env)
                                                                .name("id")
                                                                .value()),
                                                "===",
                                                ZVal.toLong(id)));
                            }
                        });
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/routes").setFile("/routes/channels.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope225 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
