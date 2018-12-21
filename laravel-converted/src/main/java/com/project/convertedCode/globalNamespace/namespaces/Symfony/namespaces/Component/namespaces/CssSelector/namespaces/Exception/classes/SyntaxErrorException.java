package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Exception.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Exception.classes.ParseException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/Exception/SyntaxErrorException.php

*/

public class SyntaxErrorException extends ParseException {

    public SyntaxErrorException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SyntaxErrorException.class) {
            this.__construct(env, args);
        }
    }

    public SyntaxErrorException(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\CssSelector\\Exception\\SyntaxErrorException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ParseException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedValue")
        @ConvertedParameter(
            index = 1,
            name = "foundToken",
            typeHint = "Symfony\\Component\\CssSelector\\Parser\\Token"
        )
        public Object unexpectedToken(RuntimeEnv env, Object... args) {
            Object expectedValue = assignParameter(args, 0, false);
            Object foundToken = assignParameter(args, 1, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Symfony
                            .namespaces
                            .Component
                            .namespaces
                            .CssSelector
                            .namespaces
                            .Exception
                            .classes
                            .SyntaxErrorException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Expected %s, but %s found.", expectedValue, foundToken)
                                    .value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "pseudoElement")
        @ConvertedParameter(index = 1, name = "unexpectedLocation")
        public Object pseudoElementFound(RuntimeEnv env, Object... args) {
            Object pseudoElement = assignParameter(args, 0, false);
            Object unexpectedLocation = assignParameter(args, 1, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Symfony
                            .namespaces
                            .Component
                            .namespaces
                            .CssSelector
                            .namespaces
                            .Exception
                            .classes
                            .SyntaxErrorException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Unexpected pseudo-element \"::%s\" found %s.",
                                            pseudoElement, unexpectedLocation)
                                    .value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "position")
        public Object unclosedString(RuntimeEnv env, Object... args) {
            Object position = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Symfony
                            .namespaces
                            .Component
                            .namespaces
                            .CssSelector
                            .namespaces
                            .Exception
                            .classes
                            .SyntaxErrorException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Unclosed/invalid string at %s.", position)
                                    .value()));
        }

        @ConvertedMethod
        public Object nestedNot(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Symfony
                            .namespaces
                            .Component
                            .namespaces
                            .CssSelector
                            .namespaces
                            .Exception
                            .classes
                            .SyntaxErrorException(env, "Got nested ::not()."));
        }

        @ConvertedMethod
        public Object stringAsFunctionArgument(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Symfony
                            .namespaces
                            .Component
                            .namespaces
                            .CssSelector
                            .namespaces
                            .Exception
                            .classes
                            .SyntaxErrorException(env, "String not allowed as function argument."));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\CssSelector\\Exception\\SyntaxErrorException")
                    .setLookup(
                            SyntaxErrorException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/css-selector/Exception/SyntaxErrorException.php")
                    .addInterface("Symfony\\Component\\CssSelector\\Exception\\ExceptionInterface")
                    .addInterface("Throwable")
                    .addExtendsClass("Symfony\\Component\\CssSelector\\Exception\\ParseException")
                    .addExtendsClass("Exception")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }
}
