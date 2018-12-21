package com.project.convertedCode.includes.database.factories;

import com.project.convertedCode.globalNamespace.namespaces.App.classes.User;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.project.convertedCode.globalNamespace.functions.str_random;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 database/factories/UserFactory.php

*/

public class file_UserFactory_php implements RuntimeIncludable {

    public static final file_UserFactory_php instance = new file_UserFactory_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope214 scope = new Scope214();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope214 scope)
            throws IncludeEventException {
        // Namespace import was here
        env.callMethod(
                scope.factory,
                "define",
                file_UserFactory_php.class,
                User.CONST_class,
                new Closure(env, this.getContextConstants(), "", stack.get("this")) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "faker", typeHint = "Faker\\Generator")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object faker = assignParameter(args, 0, false);
                        return ZVal.assign(
                                ZVal.newArray(
                                        new ZPair(
                                                "name",
                                                toObjectR(faker)
                                                        .accessProp(this, env)
                                                        .name("name")
                                                        .value()),
                                        new ZPair(
                                                "email",
                                                toObjectR(
                                                                env.callMethod(
                                                                        faker,
                                                                        "unique",
                                                                        file_UserFactory_php.class))
                                                        .accessProp(this, env)
                                                        .name("safeEmail")
                                                        .value()),
                                        new ZPair(
                                                "password",
                                                "$2y$10$TKh8H1.PfQx37YgCzwiKb.KjNyWgaHb9cbcoQgdIVFlYg7B77UdFm"),
                                        new ZPair(
                                                "remember_token",
                                                str_random.f.env(env).call(10).value())));
                    }
                });
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/database/factories")
                    .setFile("/database/factories/UserFactory.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope214 implements UpdateRuntimeScopeInterface {

        Object factory;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("factory", this.factory);
        }

        public void updateScope(RuntimeStack stack) {

            this.factory = stack.getVariable("factory");
        }
    }
}
