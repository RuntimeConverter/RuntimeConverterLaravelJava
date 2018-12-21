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

 vendor/symfony/css-selector/Parser/Handler/IdentifierHandler.php

*/

public class IdentifierHandler extends RuntimeClassBase implements HandlerInterface {

    public Object patterns = null;

    public Object escaping = null;

    public IdentifierHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IdentifierHandler.class) {
            this.__construct(env, args);
        }
    }

    public IdentifierHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "patterns",
        typeHint = "Symfony\\Component\\CssSelector\\Parser\\Tokenizer\\TokenizerPatterns"
    )
    @ConvertedParameter(
        index = 1,
        name = "escaping",
        typeHint = "Symfony\\Component\\CssSelector\\Parser\\Tokenizer\\TokenizerEscaping"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object patterns = assignParameter(args, 0, false);
        Object escaping = assignParameter(args, 1, false);
        this.patterns = patterns;
        this.escaping = escaping;
        return null;
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
        Object value = null;
        match.setObject(
                env.callMethod(
                        reader,
                        "findPattern",
                        IdentifierHandler.class,
                        env.callMethod(
                                this.patterns, "getIdentifierPattern", IdentifierHandler.class)));
        if (!ZVal.isTrue(match.getObject())) {
            return ZVal.assign(false);
        }

        value =
                env.callMethod(
                        this.escaping,
                        "escapeUnicode",
                        IdentifierHandler.class,
                        match.arrayGet(env, 0));
        env.callMethod(
                stream,
                "push",
                IdentifierHandler.class,
                new Token(
                        env,
                        Token.CONST_TYPE_IDENTIFIER,
                        value,
                        env.callMethod(reader, "getPosition", IdentifierHandler.class)));
        env.callMethod(
                reader,
                "moveForward",
                IdentifierHandler.class,
                function_strlen.f.env(env).call(match.arrayGet(env, 0)).value());
        return ZVal.assign(true);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\CssSelector\\Parser\\Handler\\IdentifierHandler";

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
                    .setName("Symfony\\Component\\CssSelector\\Parser\\Handler\\IdentifierHandler")
                    .setLookup(
                            IdentifierHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("escaping", "patterns")
                    .setFilename("vendor/symfony/css-selector/Parser/Handler/IdentifierHandler.php")
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
