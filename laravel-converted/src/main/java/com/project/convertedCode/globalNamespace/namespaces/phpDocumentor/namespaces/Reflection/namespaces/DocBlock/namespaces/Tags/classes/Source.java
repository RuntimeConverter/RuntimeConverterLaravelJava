package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes.BaseTag;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Factory.classes.StaticMethod;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Source.php

*/

public final class Source extends BaseTag implements StaticMethod {

    public Object startingLine = 1;

    public Object lineCount = ZVal.getNull();

    public Source(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "source";
        if (this.getClass() == Source.class) {
            this.__construct(env, args);
        }
    }

    public Source(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "startingLine")
    @ConvertedParameter(
        index = 1,
        name = "lineCount",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "description",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Description",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object startingLine = assignParameter(args, 0, false);
        Object lineCount = assignParameter(args, 1, true);
        if (null == lineCount) {
            lineCount = ZVal.getNull();
        }
        Object description = assignParameter(args, 2, true);
        if (null == description) {
            description = ZVal.getNull();
        }
        Assert.runtimeStaticObject.integerish(env, startingLine);
        Assert.runtimeStaticObject.callUnknownStaticMethod(
                env, "nullOrIntegerish", new RuntimeArgsWithReferences(), lineCount);
        this.startingLine = ZVal.toLong(startingLine);
        this.lineCount =
                ZVal.strictNotEqualityCheck(lineCount, "!==", ZVal.getNull())
                        ? ZVal.toLong(lineCount)
                        : ZVal.getNull();
        toObjectR(this).accessProp(this, env).name("description").set(description);
        return null;
    }

    @ConvertedMethod
    public Object getStartingLine(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.startingLine);
    }

    @ConvertedMethod
    public Object getLineCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.lineCount);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(this.startingLine, env)
                        + toStringR(
                                ZVal.strictNotEqualityCheck(this.lineCount, "!==", ZVal.getNull())
                                        ? " " + toStringR(this.lineCount, env)
                                        : "",
                                env)
                        + toStringR(
                                toObjectR(this).accessProp(this, env).name("description").getBool()
                                        ? " "
                                                + toStringR(
                                                        env.callMethod(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("description")
                                                                        .value(),
                                                                "render",
                                                                Source.class),
                                                        env)
                                        : "",
                                env));
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\Tags\\Source";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseTag.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "body")
        @ConvertedParameter(
            index = 1,
            name = "descriptionFactory",
            typeHint = "phpDocumentor\\Reflection\\DocBlock\\DescriptionFactory",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "context",
            typeHint = "phpDocumentor\\Reflection\\Types\\Context",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object create(RuntimeEnv env, Object... args) {
            Object body = assignParameter(args, 0, false);
            Object descriptionFactory = assignParameter(args, 1, true);
            if (null == descriptionFactory) {
                descriptionFactory = ZVal.getNull();
            }
            Object context = assignParameter(args, 2, true);
            if (null == context) {
                context = ZVal.getNull();
            }
            Object startingLine = null;
            Object description = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            Object lineCount = null;
            Assert.runtimeStaticObject.stringNotEmpty(env, body);
            Assert.runtimeStaticObject.notNull(env, descriptionFactory);
            startingLine = 1;
            lineCount = ZVal.getNull();
            description = ZVal.getNull();
            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/^([1-9]\\d*)\\s*(?:((?1))\\s+)?(.*)$/sux", body, matches.getObject())
                    .getBool()) {
                startingLine = ZVal.assign(ZVal.toLong(matches.arrayGet(env, 1)));
                if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, matches, env, 2))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(matches.arrayGet(env, 2), "!==", ""))) {
                    lineCount = ZVal.assign(ZVal.toLong(matches.arrayGet(env, 2)));
                }

                description = ZVal.assign(matches.arrayGet(env, 3));
            }

            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            startingLine,
                            lineCount,
                            env.callMethod(
                                    descriptionFactory,
                                    "create",
                                    Source.class,
                                    description,
                                    context)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Tags\\Source")
                    .setLookup(
                            Source.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("description", "lineCount", "name", "name", "startingLine")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Source.php")
                    .addInterface(
                            "phpDocumentor\\Reflection\\DocBlock\\Tags\\Factory\\StaticMethod")
                    .addInterface("phpDocumentor\\Reflection\\DocBlock\\Tag")
                    .addExtendsClass("phpDocumentor\\Reflection\\DocBlock\\Tags\\BaseTag")
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
