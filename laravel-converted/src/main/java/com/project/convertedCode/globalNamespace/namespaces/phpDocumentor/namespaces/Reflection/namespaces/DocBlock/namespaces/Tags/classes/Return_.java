package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
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
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Return_.php

*/

public final class Return_ extends BaseTag implements StaticMethod {

    public Object type = null;

    public Return_(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "return";
        if (this.getClass() == Return_.class) {
            this.__construct(env, args);
        }
    }

    public Return_(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type", typeHint = "phpDocumentor\\Reflection\\Type")
    @ConvertedParameter(
        index = 1,
        name = "description",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Description",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object description = assignParameter(args, 1, true);
        if (null == description) {
            description = ZVal.getNull();
        }
        this.type = type;
        toObjectR(this).accessProp(this, env).name("description").set(description);
        return null;
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.type);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(this.type, env)
                        + " "
                        + toStringR(
                                toObjectR(this).accessProp(this, env).name("description").value(),
                                env));
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\Tags\\Return_";

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
            name = "typeResolver",
            typeHint = "phpDocumentor\\Reflection\\TypeResolver",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "descriptionFactory",
            typeHint = "phpDocumentor\\Reflection\\DocBlock\\DescriptionFactory",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "context",
            typeHint = "phpDocumentor\\Reflection\\Types\\Context",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object create(RuntimeEnv env, Object... args) {
            Object body = assignParameter(args, 0, false);
            Object typeResolver = assignParameter(args, 1, true);
            if (null == typeResolver) {
                typeResolver = ZVal.getNull();
            }
            Object descriptionFactory = assignParameter(args, 2, true);
            if (null == descriptionFactory) {
                descriptionFactory = ZVal.getNull();
            }
            Object context = assignParameter(args, 3, true);
            if (null == context) {
                context = ZVal.getNull();
            }
            ReferenceContainer parts = new BasicReferenceContainer(null);
            Object description = null;
            Object type = null;
            Assert.runtimeStaticObject.string(env, body);
            Assert.runtimeStaticObject.callUnknownStaticMethod(
                    env,
                    "allNotNull",
                    new RuntimeArgsWithReferences(),
                    ZVal.newArray(new ZPair(0, typeResolver), new ZPair(1, descriptionFactory)));
            parts.setObject(NamespaceGlobal.preg_split.env(env).call("/\\s+/Su", body, 2).value());
            type =
                    env.callMethod(
                            typeResolver,
                            "resolve",
                            Return_.class,
                            arrayActionR(ArrayAction.ISSET, parts, env, 0)
                                    ? parts.arrayGet(env, 0)
                                    : "",
                            context);
            description =
                    env.callMethod(
                            descriptionFactory,
                            "create",
                            Return_.class,
                            arrayActionR(ArrayAction.ISSET, parts, env, 1)
                                    ? parts.arrayGet(env, 1)
                                    : "",
                            context);
            return ZVal.assign(env.createNewWithLateStaticBindings(this, type, description));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Tags\\Return_")
                    .setLookup(
                            Return_.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("description", "name", "name", "type")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Return_.php")
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
