package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Handler.classes.HandlerInterface;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.classes.Token;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/Parser/Handler/WhitespaceHandler.php

*/

public class WhitespaceHandler extends RuntimeClassBase implements HandlerInterface {

    public WhitespaceHandler(RuntimeEnv env, Object... args) {
        super(env);
    }

    public WhitespaceHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "reader",
        typeHint = "Symfony\\Component\\CssSelector\\Parser\\Reader"
    )
    @ConvertedParameter(
        index = 1,
        name = "stream",
        typeHint = "Symfony\\Component\\CssSelector\\Parser\\TokenStream"
    )
    public Object handle(RuntimeEnv env, Object... args) {
        Object reader = assignParameter(args, 0, false);
        Object stream = assignParameter(args, 1, false);
        ReferenceContainer match = new BasicReferenceContainer(null);
        match.setObject(
                env.callMethod(
                        reader, "findPattern", WhitespaceHandler.class, "~^[ \\t\\r\\n\\f]+~"));
        if (ZVal.strictEqualityCheck(false, "===", match.getObject())) {
            return ZVal.assign(false);
        }

        env.callMethod(
                stream,
                "push",
                WhitespaceHandler.class,
                new Token(
                        env,
                        Token.CONST_TYPE_WHITESPACE,
                        match.arrayGet(env, 0),
                        env.callMethod(reader, "getPosition", WhitespaceHandler.class)));
        env.callMethod(
                reader,
                "moveForward",
                WhitespaceHandler.class,
                function_strlen.f.env(env).call(match.arrayGet(env, 0)).value());
        return ZVal.assign(true);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\CssSelector\\Parser\\Handler\\WhitespaceHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\CssSelector\\Parser\\Handler\\WhitespaceHandler")
                    .setLookup(
                            WhitespaceHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/css-selector/Parser/Handler/WhitespaceHandler.php")
                    .addInterface(
                            "Symfony\\Component\\CssSelector\\Parser\\Handler\\HandlerInterface")
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
