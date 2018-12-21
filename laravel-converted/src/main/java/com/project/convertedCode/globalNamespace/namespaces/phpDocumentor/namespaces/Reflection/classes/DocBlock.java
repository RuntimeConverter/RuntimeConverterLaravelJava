package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes.Description;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes.Tag;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock.php

*/

public final class DocBlock extends RuntimeClassBase {

    public Object summary = "";

    public Object description = ZVal.getNull();

    public Object tags = ZVal.newArray();

    public Object context = ZVal.getNull();

    public Object location = ZVal.getNull();

    public Object isTemplateStart = false;

    public Object isTemplateEnd = false;

    public DocBlock(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DocBlock.class) {
            this.__construct(env, args);
        }
    }

    public DocBlock(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "summary")
    @ConvertedParameter(
        index = 1,
        name = "description",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Description",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "tags",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "location",
        typeHint = "phpDocumentor\\Reflection\\Location",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "isTemplateStart",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "isTemplateEnd",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object summary = assignParameter(args, 0, true);
        if (null == summary) {
            summary = "";
        }
        Object description = assignParameter(args, 1, true);
        if (null == description) {
            description = ZVal.getNull();
        }
        Object tags = assignParameter(args, 2, true);
        if (null == tags) {
            tags = ZVal.newArray();
        }
        Object context = assignParameter(args, 3, true);
        if (null == context) {
            context = ZVal.getNull();
        }
        Object location = assignParameter(args, 4, true);
        if (null == location) {
            location = ZVal.getNull();
        }
        Object isTemplateStart = assignParameter(args, 5, true);
        if (null == isTemplateStart) {
            isTemplateStart = false;
        }
        Object isTemplateEnd = assignParameter(args, 6, true);
        if (null == isTemplateEnd) {
            isTemplateEnd = false;
        }
        Object ternaryExpressionTemp = null;
        Object tag = null;
        Assert.runtimeStaticObject.string(env, summary);
        Assert.runtimeStaticObject._pBoolean(env, isTemplateStart);
        Assert.runtimeStaticObject._pBoolean(env, isTemplateEnd);
        Assert.runtimeStaticObject.callUnknownStaticMethod(
                env, "allIsInstanceOf", new RuntimeArgsWithReferences(), tags, Tag.CONST_class);
        this.summary = summary;
        this.description =
                ZVal.isTrue(ternaryExpressionTemp = description)
                        ? ternaryExpressionTemp
                        : new Description(env, "");
        for (ZPair zpairResult922 : ZVal.getIterable(tags, env, true)) {
            tag = ZVal.assign(zpairResult922.getValue());
            this.addTag(env, tag);
        }

        this.context = context;
        this.location = location;
        this.isTemplateEnd = isTemplateEnd;
        this.isTemplateStart = isTemplateStart;
        return null;
    }

    @ConvertedMethod
    public Object getSummary(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.summary);
    }

    @ConvertedMethod
    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.description);
    }

    @ConvertedMethod
    public Object getContext(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.context);
    }

    @ConvertedMethod
    public Object getLocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.location);
    }

    @ConvertedMethod
    public Object isTemplateStart(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.isTemplateStart);
    }

    @ConvertedMethod
    public Object isTemplateEnd(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.isTemplateEnd);
    }

    @ConvertedMethod
    public Object getTags(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.tags);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getTagsByName(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object name = assignParameter(args, 0, false);
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object tag = null;
        Assert.runtimeStaticObject.string(env, name);
        result.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult923 : ZVal.getIterable(this.getTags(env), env, true)) {
            tag = ZVal.assign(zpairResult923.getValue());
            if (ZVal.strictNotEqualityCheck(
                    env.callMethod(tag, "getName", DocBlock.class), "!==", name)) {
                continue;
            }

            result.arrayAppend(env).set(tag);
        }

        return ZVal.assign(result.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasTag(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object tag = null;
        Assert.runtimeStaticObject.string(env, name);
        for (ZPair zpairResult924 : ZVal.getIterable(this.getTags(env), env, true)) {
            tag = ZVal.assign(zpairResult924.getValue());
            if (ZVal.strictEqualityCheck(
                    env.callMethod(tag, "getName", DocBlock.class), "===", name)) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "tagToRemove",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Tag"
    )
    public Object removeTag(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object tagToRemove = assignParameter(args, 0, false);
        Object tag = null;
        Object key = null;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult925 : ZVal.getIterable(this.tags, env, false)) {
            key = ZVal.assign(zpairResult925.getKey());
            tag = ZVal.assign(zpairResult925.getValue());
            if (ZVal.strictEqualityCheck(tag, "===", tagToRemove)) {
                arrayActionR(
                        ArrayAction.UNSET, new ReferenceClassProperty(this, "tags", env), env, key);
                break;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "tag",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Tag"
    )
    private Object addTag(RuntimeEnv env, Object... args) {
        Object tag = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "tags", env).arrayAppend(env).set(tag);
        return null;
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock";

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
                    .setName("phpDocumentor\\Reflection\\DocBlock")
                    .setLookup(
                            DocBlock.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "context",
                            "description",
                            "isTemplateEnd",
                            "isTemplateStart",
                            "location",
                            "summary",
                            "tags")
                    .setFilename("vendor/phpdocumentor/reflection-docblock/src/DocBlock.php")
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
