package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes.StandardTagFactory;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.TypeResolver;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.DocBlockFactoryInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Context;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.FqsenResolver;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes.Tag;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.DocBlock;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes.DescriptionFactory;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlockFactory.php

*/

public final class DocBlockFactory extends RuntimeClassBase implements DocBlockFactoryInterface {

    public Object descriptionFactory = null;

    public Object tagFactory = null;

    public DocBlockFactory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DocBlockFactory.class) {
            this.__construct(env, args);
        }
    }

    public DocBlockFactory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "descriptionFactory",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\DescriptionFactory"
    )
    @ConvertedParameter(
        index = 1,
        name = "tagFactory",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\TagFactory"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object descriptionFactory = assignParameter(args, 0, false);
        Object tagFactory = assignParameter(args, 1, false);
        this.descriptionFactory = descriptionFactory;
        this.tagFactory = tagFactory;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "docblock")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "location",
        typeHint = "phpDocumentor\\Reflection\\Location",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object create(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpdocumentor/reflection-docblock/src")
                        .setFile(
                                "/vendor/phpdocumentor/reflection-docblock/src/DocBlockFactory.php");
        Object docblock = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.getNull();
        }
        Object location = assignParameter(args, 2, true);
        if (null == location) {
            location = ZVal.getNull();
        }
        Object summary = null;
        Object parts = null;
        Object description = null;
        Object runtimeTempArrayResult132 = null;
        Object exceptionMessage = null;
        Object templateMarker = null;
        Object tags = null;
        if (function_is_object.f.env(env).call(docblock).getBool()) {
            if (!function_method_exists.f.env(env).call(docblock, "getDocComment").getBool()) {
                exceptionMessage =
                        "Invalid object passed; the given object must support the getDocComment method";
                throw ZVal.getException(env, new InvalidArgumentException(env, exceptionMessage));
            }

            docblock = env.callMethod(docblock, "getDocComment", DocBlockFactory.class);
        }

        Assert.runtimeStaticObject.stringNotEmpty(env, docblock);
        if (ZVal.strictEqualityCheck(context, "===", ZVal.getNull())) {
            context = new Context(env, "");
        }

        parts = this.splitDocBlock(env, this.stripDocComment(env, docblock));
        ZVal.list(
                runtimeTempArrayResult132 = parts,
                (templateMarker = listGet(runtimeTempArrayResult132, 0, env)),
                (summary = listGet(runtimeTempArrayResult132, 1, env)),
                (description = listGet(runtimeTempArrayResult132, 2, env)),
                (tags = listGet(runtimeTempArrayResult132, 3, env)));
        return ZVal.assign(
                new DocBlock(
                        env,
                        summary,
                        ZVal.isTrue(description)
                                ? env.callMethod(
                                        this.descriptionFactory,
                                        "create",
                                        DocBlockFactory.class,
                                        description,
                                        context)
                                : ZVal.getNull(),
                        function_array_filter
                                .f
                                .env(env)
                                .call(
                                        this.parseTagBlock(env, tags, context),
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "phpDocumentor\\Reflection",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "tag")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object tag = assignParameter(args, 0, false);
                                                return ZVal.assign(
                                                        ZVal.checkInstanceType(
                                                                tag,
                                                                Tag.class,
                                                                "phpDocumentor\\Reflection\\DocBlock\\Tag"));
                                            }
                                        })
                                .value(),
                        context,
                        location,
                        ZVal.strictEqualityCheck(templateMarker, "===", "#@+"),
                        ZVal.strictEqualityCheck(templateMarker, "===", "#@-")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tagName")
    @ConvertedParameter(index = 1, name = "handler")
    public Object registerTagHandler(RuntimeEnv env, Object... args) {
        Object tagName = assignParameter(args, 0, false);
        Object handler = assignParameter(args, 1, false);
        env.callMethod(
                this.tagFactory, "registerTagHandler", DocBlockFactory.class, tagName, handler);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "comment")
    private Object stripDocComment(RuntimeEnv env, Object... args) {
        Object comment = assignParameter(args, 0, false);
        comment =
                function_trim
                        .f
                        .env(env)
                        .call(
                                function_preg_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "#[ \\t]*(?:\\/\\*\\*|\\*\\/|\\*)?[ \\t]{0,1}(.*)?#u",
                                                "$1",
                                                comment)
                                        .value())
                        .value();
        if (ZVal.strictEqualityCheck(
                function_substr.f.env(env).call(comment, -2).value(), "===", "*/")) {
            comment =
                    function_trim
                            .f
                            .env(env)
                            .call(function_substr.f.env(env).call(comment, 0, -2).value())
                            .value();
        }

        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(ZVal.arrayFromList("\r\n", "\r"), "\n", comment)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "comment")
    private Object splitDocBlock(RuntimeEnv env, Object... args) {
        Object comment = assignParameter(args, 0, false);
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(
                function_strpos.f.env(env).call(comment, "@").value(), "===", 0)) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, ""),
                            new ZPair(1, ""),
                            new ZPair(2, ""),
                            new ZPair(3, comment)));
        }

        comment = function_preg_replace.f.env(env).call("/\\h*$/Sum", "", comment).value();
        function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        ZVal.getResourceAsString("stringLiterals/stringLiteral2224.txt"),
                        comment,
                        matches.getObject());
        function_array_shift.f.env(env).call(matches.getObject());
        while (ZVal.isLessThan(
                function_count.f.env(env).call(matches.getObject()).value(), '<', 4)) {
            matches.arrayAppend(env).set("");
        }

        return ZVal.assign(matches.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tags")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context"
    )
    private Object parseTagBlock(RuntimeEnv env, Object... args) {
        Object tags = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, false);
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object tagLine = null;
        Object key = null;
        tags = this.filterTagBlock(env, tags);
        if (!ZVal.isTrue(tags)) {
            return ZVal.assign(ZVal.newArray());
        }

        result.setObject(this.splitTagBlockIntoTagLines(env, tags));
        for (ZPair zpairResult935 : ZVal.getIterable(result.getObject(), env, false)) {
            key = ZVal.assign(zpairResult935.getKey());
            tagLine = ZVal.assign(zpairResult935.getValue());
            result.arrayAccess(env, key)
                    .set(
                            env.callMethod(
                                    this.tagFactory,
                                    "create",
                                    DocBlockFactory.class,
                                    function_trim.f.env(env).call(tagLine).value(),
                                    context));
        }

        return ZVal.assign(result.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tags")
    private Object splitTagBlockIntoTagLines(RuntimeEnv env, Object... args) {
        Object tags = assignParameter(args, 0, false);
        ReferenceContainer result = new BasicReferenceContainer(null);
        ReferenceContainer tag_line = new BasicReferenceContainer(null);
        result.setObject(ZVal.newArray());
        for (ZPair zpairResult936 :
                ZVal.getIterable(function_explode.f.env(env).call("\n", tags).value(), env, true)) {
            tag_line.setObject(ZVal.assign(zpairResult936.getValue()));
            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, tag_line, env, 0))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(tag_line.arrayGet(env, 0), "===", "@"))) {
                result.arrayAppend(env).set(tag_line.getObject());

            } else {
                result.arrayAccess(
                                env,
                                ZVal.subtract(
                                        function_count.f.env(env).call(result.getObject()).value(),
                                        1))
                        .set(
                                toStringR(
                                                result.arrayGet(
                                                        env,
                                                        ZVal.subtract(
                                                                function_count
                                                                        .f
                                                                        .env(env)
                                                                        .call(result.getObject())
                                                                        .value(),
                                                                1)),
                                                env)
                                        + "\n"
                                        + toStringR(tag_line.getObject(), env));
            }
        }

        return ZVal.assign(result.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tags")
    private Object filterTagBlock(RuntimeEnv env, Object... args) {
        ReferenceContainer tags = new BasicReferenceContainer(assignParameter(args, 0, false));
        tags.setObject(function_trim.f.env(env).call(tags.getObject()).value());
        if (!ZVal.isTrue(tags.getObject())) {
            return ZVal.assign(ZVal.getNull());
        }

        if (ZVal.strictNotEqualityCheck("@", "!==", tags.arrayGet(env, 0))) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "A tag block started with text instead of an at-sign(@): "
                                    + toStringR(tags.getObject(), env)));
        }

        return ZVal.assign(tags.getObject());
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlockFactory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "additionalTags",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        public Object createInstance(RuntimeEnv env, Object... args) {
            Object additionalTags = assignParameter(args, 0, true);
            if (null == additionalTags) {
                additionalTags = ZVal.newArray();
            }
            Object docBlockFactory = null;
            Object tagFactory = null;
            Object tagHandler = null;
            Object descriptionFactory = null;
            Object fqsenResolver = null;
            Object tagName = null;
            fqsenResolver = new FqsenResolver(env);
            tagFactory = new StandardTagFactory(env, fqsenResolver);
            descriptionFactory = new DescriptionFactory(env, tagFactory);
            env.callMethod(tagFactory, "addService", DocBlockFactory.class, descriptionFactory);
            env.callMethod(
                    tagFactory,
                    "addService",
                    DocBlockFactory.class,
                    new TypeResolver(env, fqsenResolver));
            docBlockFactory =
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .phpDocumentor
                            .namespaces
                            .Reflection
                            .classes
                            .DocBlockFactory(env, descriptionFactory, tagFactory);
            for (ZPair zpairResult934 : ZVal.getIterable(additionalTags, env, false)) {
                tagName = ZVal.assign(zpairResult934.getKey());
                tagHandler = ZVal.assign(zpairResult934.getValue());
                env.callMethod(
                        docBlockFactory,
                        "registerTagHandler",
                        DocBlockFactory.class,
                        tagName,
                        tagHandler);
            }

            return ZVal.assign(docBlockFactory);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlockFactory")
                    .setLookup(
                            DocBlockFactory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("descriptionFactory", "tagFactory")
                    .setFilename("vendor/phpdocumentor/reflection-docblock/src/DocBlockFactory.php")
                    .addInterface("phpDocumentor\\Reflection\\DocBlockFactoryInterface")
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
