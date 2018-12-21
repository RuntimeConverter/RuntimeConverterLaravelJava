package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes.Description;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/DescriptionFactory.php

*/

public class DescriptionFactory extends RuntimeClassBase {

    public Object tagFactory = null;

    public DescriptionFactory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DescriptionFactory.class) {
            this.__construct(env, args);
        }
    }

    public DescriptionFactory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "tagFactory",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\TagFactory"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object tagFactory = assignParameter(args, 0, false);
        this.tagFactory = tagFactory;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "contents")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object create(RuntimeEnv env, Object... args) {
        Object contents = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.getNull();
        }
        Object runtimeTempArrayResult129 = null;
        Object text = null;
        Object tags = null;
        ZVal.list(
                runtimeTempArrayResult129 = this.parse(env, this.lex(env, contents), context),
                (text = listGet(runtimeTempArrayResult129, 0, env)),
                (tags = listGet(runtimeTempArrayResult129, 1, env)));
        return ZVal.assign(new Description(env, text, tags));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "contents")
    private Object lex(RuntimeEnv env, Object... args) {
        Object contents = assignParameter(args, 0, false);
        contents = this.removeSuperfluousStartingWhitespace(env, contents);
        if (ZVal.strictEqualityCheck(
                function_strpos.f.env(env).call(contents, "{@").value(), "===", false)) {
            return ZVal.assign(ZVal.newArray(new ZPair(0, contents)));
        }

        return ZVal.assign(
                NamespaceGlobal.preg_split
                        .env(env)
                        .call(
                                ZVal.getResourceAsString("stringLiterals/stringLiteral2189.txt"),
                                contents,
                                ZVal.getNull(),
                                2)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context"
    )
    private Object parse(RuntimeEnv env, Object... args) {
        ReferenceContainer tokens = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object context = assignParameter(args, 1, false);
        Object count = null;
        ReferenceContainer tagCount = new BasicReferenceContainer(null);
        Object i = null;
        ReferenceContainer tags = new BasicReferenceContainer(null);
        count = function_count.f.env(env).call(tokens.getObject()).value();
        tagCount.setObject(0);
        tags.setObject(ZVal.newArray());
        for (i = 1; ZVal.isLessThan(i, '<', count); i = ZAssignment.add("+=", i, 2)) {
            tags.arrayAppend(env)
                    .set(
                            env.callMethod(
                                    this.tagFactory,
                                    "create",
                                    DescriptionFactory.class,
                                    tokens.arrayGet(env, i),
                                    context));
            tokens.arrayAccess(env, i)
                    .set("%" + toStringR(ZVal.preIncrement(tagCount), env) + "$s");
        }

        for (i = 0; ZVal.isLessThan(i, '<', count); i = ZAssignment.add("+=", i, 2)) {
            tokens.arrayAccess(env, i)
                    .set(
                            function_str_replace
                                    .f
                                    .env(env)
                                    .call(
                                            ZVal.arrayFromList("{@}", "{}", "%"),
                                            ZVal.arrayFromList("@", "}", "%%"),
                                            tokens.arrayGet(env, i))
                                    .value());
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call("", tokens.getObject())
                                        .value()),
                        new ZPair(1, tags.getObject())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "contents")
    private Object removeSuperfluousStartingWhitespace(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object contents = assignParameter(args, 0, false);
        Object startingSpaceCount = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer lines = new BasicReferenceContainer(null);
        lines.setObject(function_explode.f.env(env).call("\n", contents).value());
        if (ZVal.isLessThanOrEqualTo(
                function_count.f.env(env).call(lines.getObject()).value(), "<=", 1)) {
            return ZVal.assign(contents);
        }

        startingSpaceCount = 9999999;
        runtimeConverterContinueCount = 0;
        for (i.setObject(1);
                ZVal.isLessThan(
                        i.getObject(),
                        '<',
                        function_count.f.env(env).call(lines.getObject()).value());
                i.setObject(ZVal.increment(i.getObject()))) {
            if (ZVal.strictEqualityCheck(
                    function_strlen
                            .f
                            .env(env)
                            .call(
                                    function_trim
                                            .f
                                            .env(env)
                                            .call(lines.arrayGet(env, i.getObject()))
                                            .value())
                            .value(),
                    "===",
                    0)) {
                continue;
            }

            startingSpaceCount =
                    NamespaceGlobal.min
                            .env(env)
                            .call(
                                    startingSpaceCount,
                                    ZVal.subtract(
                                            function_strlen
                                                    .f
                                                    .env(env)
                                                    .call(lines.arrayGet(env, i.getObject()))
                                                    .value(),
                                            function_strlen
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            function_ltrim
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            lines.arrayGet(
                                                                                    env,
                                                                                    i.getObject()))
                                                                    .value())
                                                    .value()))
                            .value();
        }

        if (ZVal.isGreaterThan(startingSpaceCount, '>', 0)) {
            runtimeConverterContinueCount = 0;
            for (i.setObject(1);
                    ZVal.isLessThan(
                            i.getObject(),
                            '<',
                            function_count.f.env(env).call(lines.getObject()).value());
                    i.setObject(ZVal.increment(i.getObject()))) {
                lines.arrayAccess(env, i.getObject())
                        .set(
                                function_substr
                                        .f
                                        .env(env)
                                        .call(
                                                lines.arrayGet(env, i.getObject()),
                                                startingSpaceCount)
                                        .value());
            }
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call("\n", lines.getObject()).value());
    }

    public static final Object CONST_class =
            "phpDocumentor\\Reflection\\DocBlock\\DescriptionFactory";

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
                    .setName("phpDocumentor\\Reflection\\DocBlock\\DescriptionFactory")
                    .setLookup(
                            DescriptionFactory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("tagFactory")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/DescriptionFactory.php")
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
