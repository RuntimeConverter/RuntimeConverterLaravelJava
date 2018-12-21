package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes.Generic;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Factory.classes.StaticMethod;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Context;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.FqsenResolver;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes.TagFactory;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/StandardTagFactory.php

*/

public final class StandardTagFactory extends RuntimeClassBase implements TagFactory {

    public Object tagHandlerMappings =
            ZVal.newArray(
                    new ZPair("author", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Author"),
                    new ZPair("covers", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Covers"),
                    new ZPair(
                            "deprecated",
                            "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Deprecated"),
                    new ZPair("link", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Link"),
                    new ZPair("method", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Method"),
                    new ZPair("param", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Param"),
                    new ZPair(
                            "property-read",
                            "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\PropertyRead"),
                    new ZPair("property", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Property"),
                    new ZPair(
                            "property-write",
                            "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\PropertyWrite"),
                    new ZPair("return", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Return_"),
                    new ZPair("see", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\See"),
                    new ZPair("since", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Since"),
                    new ZPair("source", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Source"),
                    new ZPair("throw", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Throws"),
                    new ZPair("throws", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Throws"),
                    new ZPair("uses", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Uses"),
                    new ZPair("var", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Var_"),
                    new ZPair("version", "\\phpDocumentor\\Reflection\\DocBlock\\Tags\\Version"));

    public Object tagHandlerParameterCache = ZVal.newArray();

    public Object fqsenResolver = null;

    public Object serviceLocator = ZVal.newArray();

    public StandardTagFactory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StandardTagFactory.class) {
            this.__construct(env, args);
        }
    }

    public StandardTagFactory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "fqsenResolver",
        typeHint = "phpDocumentor\\Reflection\\FqsenResolver"
    )
    @ConvertedParameter(
        index = 1,
        name = "tagHandlers",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object fqsenResolver = assignParameter(args, 0, false);
        Object tagHandlers = assignParameter(args, 1, true);
        if (null == tagHandlers) {
            tagHandlers = ZVal.getNull();
        }
        this.fqsenResolver = fqsenResolver;
        if (ZVal.strictNotEqualityCheck(tagHandlers, "!==", ZVal.getNull())) {
            this.tagHandlerMappings = tagHandlers;
        }

        this.addService(env, fqsenResolver, FqsenResolver.CONST_class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tagLine")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object create(RuntimeEnv env, Object... args) {
        Object tagLine = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.getNull();
        }
        ReferenceContainer tagBody = new BasicReferenceContainer(null);
        Object tagName = null;
        Object runtimeTempArrayResult130 = null;
        if (!ZVal.isTrue(context)) {
            context = new Context(env, "");
        }

        ZVal.list(
                runtimeTempArrayResult130 = this.extractTagParts(env, tagLine),
                (tagName = listGet(runtimeTempArrayResult130, 0, env)),
                (tagBody.setObject(listGet(runtimeTempArrayResult130, 1, env))));
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(tagBody.getObject(), "!==", ""))
                && ZVal.toBool(ZVal.strictEqualityCheck(tagBody.arrayGet(env, 0), "===", "["))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "The tag \""
                                    + toStringR(tagLine, env)
                                    + "\" does not seem to be wellformed, please check it for errors"));
        }

        return ZVal.assign(this.createTag(env, tagBody.getObject(), tagName, context));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    public Object addParameter(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "serviceLocator", env).arrayAccess(env, name).set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "service")
    @ConvertedParameter(
        index = 1,
        name = "alias",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addService(RuntimeEnv env, Object... args) {
        Object service = assignParameter(args, 0, false);
        Object alias = assignParameter(args, 1, true);
        if (null == alias) {
            alias = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        new ReferenceClassProperty(this, "serviceLocator", env)
                .arrayAccess(
                        env,
                        ZVal.isTrue(ternaryExpressionTemp = alias)
                                ? ternaryExpressionTemp
                                : function_get_class.f.env(env).call(service).value())
                .set(service);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tagName")
    @ConvertedParameter(index = 1, name = "handler")
    public Object registerTagHandler(RuntimeEnv env, Object... args) {
        ReferenceContainer tagName = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object handler = assignParameter(args, 1, false);
        Assert.runtimeStaticObject.stringNotEmpty(env, tagName.getObject());
        Assert.runtimeStaticObject.stringNotEmpty(env, handler);
        Assert.runtimeStaticObject.classExists(env, handler);
        Assert.runtimeStaticObject.implementsInterface(env, handler, StaticMethod.CONST_class);
        if (ZVal.toBool(function_strpos.f.env(env).call(tagName.getObject(), "\\").value())
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(tagName.arrayGet(env, 0), "!==", "\\"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "A namespaced tag must have a leading backslash as it must be fully qualified"));
        }

        new ReferenceClassProperty(this, "tagHandlerMappings", env)
                .arrayAccess(env, tagName.getObject())
                .set(handler);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tagLine")
    private Object extractTagParts(RuntimeEnv env, Object... args) {
        Object tagLine = assignParameter(args, 0, false);
        ReferenceContainer matches = new BasicReferenceContainer(null);
        matches.setObject(ZVal.newArray());
        if (!function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "/^@(" + toStringR(CONST_REGEX_TAGNAME, env) + ")(?:\\s*([^\\s].*)|$)/us",
                        tagLine,
                        matches.getObject())
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "The tag \""
                                    + toStringR(tagLine, env)
                                    + "\" does not seem to be wellformed, please check it for errors"));
        }

        if (ZVal.isLessThan(function_count.f.env(env).call(matches.getObject()).value(), '<', 3)) {
            matches.arrayAppend(env).set("");
        }

        return ZVal.assign(function_array_slice.f.env(env).call(matches.getObject(), 1).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "body")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(
        index = 2,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context"
    )
    private Object createTag(RuntimeEnv env, Object... args) {
        Object body = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object context = assignParameter(args, 2, false);
        Object handlerClassName = null;
        Object arguments = null;
        handlerClassName = this.findHandlerClassName(env, name, context);
        arguments =
                this.getArgumentsForParametersFromWiring(
                        env,
                        this.fetchParametersForHandlerFactoryMethod(env, handlerClassName),
                        this.getServiceLocatorWithDynamicParameters(env, context, name, body));
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                ZVal.newArray(
                                        new ZPair(0, handlerClassName), new ZPair(1, "create")),
                                arguments)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tagName")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context"
    )
    private Object findHandlerClassName(RuntimeEnv env, Object... args) {
        Object tagName = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, false);
        Object handlerClassName = null;
        handlerClassName = ZVal.assign(Generic.CONST_class);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "tagHandlerMappings", env),
                env,
                tagName)) {
            handlerClassName =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "tagHandlerMappings", env)
                                    .arrayGet(env, tagName));

        } else if (ZVal.isTrue(this.isAnnotation(env, tagName))) {

        }

        return ZVal.assign(handlerClassName);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters")
    @ConvertedParameter(index = 1, name = "locator")
    private Object getArgumentsForParametersFromWiring(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object parameters = assignParameter(args, 0, false);
        ReferenceContainer locator = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object parameter = null;
        Object index = null;
        ReferenceContainer arguments = new BasicReferenceContainer(null);
        Object typeHint = null;
        Object parameterName = null;
        arguments.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult929 : ZVal.getIterable(parameters, env, false)) {
            index = ZVal.assign(zpairResult929.getKey());
            parameter = ZVal.assign(zpairResult929.getValue());
            typeHint =
                    ZVal.assign(
                            ZVal.isTrue(
                                            env.callMethod(
                                                    parameter,
                                                    "getClass",
                                                    StandardTagFactory.class))
                                    ? env.callMethod(
                                            env.callMethod(
                                                    parameter,
                                                    "getClass",
                                                    StandardTagFactory.class),
                                            "getName",
                                            StandardTagFactory.class)
                                    : ZVal.getNull());
            if (arrayActionR(ArrayAction.ISSET, locator, env, typeHint)) {
                arguments.arrayAppend(env).set(locator.arrayGet(env, typeHint));
                continue;
            }

            parameterName = env.callMethod(parameter, "getName", StandardTagFactory.class);
            if (arrayActionR(ArrayAction.ISSET, locator, env, parameterName)) {
                arguments.arrayAppend(env).set(locator.arrayGet(env, parameterName));
                continue;
            }

            arguments.arrayAppend(env).set(ZVal.getNull());
        }

        return ZVal.assign(arguments.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handlerClassName")
    private Object fetchParametersForHandlerFactoryMethod(RuntimeEnv env, Object... args) {
        Object handlerClassName = assignParameter(args, 0, false);
        Object methodReflection = null;
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "tagHandlerParameterCache", env),
                env,
                handlerClassName)) {
            methodReflection = new ReflectionMethod(env, handlerClassName, "create");
            new ReferenceClassProperty(this, "tagHandlerParameterCache", env)
                    .arrayAccess(env, handlerClassName)
                    .set(
                            env.callMethod(
                                    methodReflection, "getParameters", StandardTagFactory.class));
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "tagHandlerParameterCache", env)
                        .arrayGet(env, handlerClassName));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context"
    )
    @ConvertedParameter(index = 1, name = "tagName")
    @ConvertedParameter(index = 2, name = "tagBody")
    private Object getServiceLocatorWithDynamicParameters(RuntimeEnv env, Object... args) {
        Object context = assignParameter(args, 0, false);
        Object tagName = assignParameter(args, 1, false);
        Object tagBody = assignParameter(args, 2, false);
        Object locator = null;
        locator =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                this.serviceLocator,
                                ZVal.newArray(
                                        new ZPair("name", tagName),
                                        new ZPair("body", tagBody),
                                        new ZPair(Context.CONST_class, context)))
                        .value();
        return ZVal.assign(locator);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tagContent")
    private Object isAnnotation(RuntimeEnv env, Object... args) {
        Object tagContent = assignParameter(args, 0, false);
        return ZVal.assign(false);
    }

    public static final Object CONST_REGEX_TAGNAME = "[\\w\\-\\_\\\\]+";

    public static final Object CONST_class =
            "phpDocumentor\\Reflection\\DocBlock\\StandardTagFactory";

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
                    .setName("phpDocumentor\\Reflection\\DocBlock\\StandardTagFactory")
                    .setLookup(
                            StandardTagFactory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "fqsenResolver",
                            "serviceLocator",
                            "tagHandlerMappings",
                            "tagHandlerParameterCache")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/StandardTagFactory.php")
                    .addInterface("phpDocumentor\\Reflection\\DocBlock\\TagFactory")
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
