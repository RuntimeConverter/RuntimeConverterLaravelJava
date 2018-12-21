package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Contracts/Auth/PasswordBroker.php

*/

public interface PasswordBroker {

    public static final Object CONST_RESET_LINK_SENT = "passwords.sent";

    public static final Object CONST_PASSWORD_RESET = "passwords.reset";

    public static final Object CONST_INVALID_USER = "passwords.user";

    public static final Object CONST_INVALID_PASSWORD = "passwords.password";

    public static final Object CONST_INVALID_TOKEN = "passwords.token";

    public static final Object CONST_class = "Illuminate\\Contracts\\Auth\\PasswordBroker";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "credentials", typeHint = "array")
    public Object sendResetLink(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "credentials", typeHint = "array")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object reset(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object validator(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "credentials", typeHint = "array")
    public Object validateNewPassword(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Auth\\PasswordBroker")
                    .setLookup(PasswordBroker.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Auth/PasswordBroker.php")
                    .get();
}
