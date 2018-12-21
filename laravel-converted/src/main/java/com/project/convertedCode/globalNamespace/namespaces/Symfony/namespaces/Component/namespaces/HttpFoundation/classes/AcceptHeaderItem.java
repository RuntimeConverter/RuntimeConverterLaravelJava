package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.HeaderUtils;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/AcceptHeaderItem.php

*/

public class AcceptHeaderItem extends RuntimeClassBase {

    public Object value = null;

    public Object quality = 1.0;

    public Object index = 0;

    public Object attributes = ZVal.newArray();

    public AcceptHeaderItem(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AcceptHeaderItem.class) {
            this.__construct(env, args);
        }
    }

    public AcceptHeaderItem(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object name = null;
        this.value = value;
        for (ZPair zpairResult1843 : ZVal.getIterable(attributes, env, false)) {
            name = ZVal.assign(zpairResult1843.getKey());
            value = ZVal.assign(zpairResult1843.getValue());
            this.setAttribute(env, name, value);
        }

        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        Object string = null;
        string =
                toStringR(this.value, env)
                        + toStringR(
                                ZVal.isLessThan(this.quality, '<', 1)
                                        ? ";q=" + toStringR(this.quality, env)
                                        : "",
                                env);
        if (ZVal.isGreaterThan(function_count.f.env(env).call(this.attributes).value(), '>', 0)) {
            string =
                    toStringR(string, env)
                            + "; "
                            + toStringR(
                                    HeaderUtils.runtimeStaticObject.toString(
                                            env, this.attributes, ";"),
                                    env);
        }

        return ZVal.assign(string);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this.value = value;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "quality")
    public Object setQuality(RuntimeEnv env, Object... args) {
        Object quality = assignParameter(args, 0, false);
        this.quality = quality;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getQuality(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.quality);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "index")
    public Object setIndex(RuntimeEnv env, Object... args) {
        Object index = assignParameter(args, 0, false);
        this.index = index;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getIndex(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.index);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasAttribute(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "attributes", env),
                        env,
                        name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getAttribute(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "attributes", env),
                                env,
                                name)
                        ? new ReferenceClassProperty(this, "attributes", env).arrayGet(env, name)
                        : _pDefault);
    }

    @ConvertedMethod
    public Object getAttributes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.attributes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    public Object setAttribute(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (ZVal.strictEqualityCheck("q", "===", name)) {
            this.quality = ZVal.toDouble(value);

        } else {
            new ReferenceClassProperty(this, "attributes", env)
                    .arrayAccess(env, name)
                    .set(toStringR(value, env));
        }

        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\AcceptHeaderItem";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "itemValue")
        public Object fromString(RuntimeEnv env, Object... args) {
            Object itemValue = assignParameter(args, 0, false);
            ReferenceContainer part = new BasicReferenceContainer(null);
            Object parts = null;
            Object attributes = null;
            parts = HeaderUtils.runtimeStaticObject.split(env, itemValue, ";=");
            part.setObject(function_array_shift.f.env(env).call(parts).value());
            attributes = HeaderUtils.runtimeStaticObject.combine(env, parts);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Symfony
                            .namespaces
                            .Component
                            .namespaces
                            .HttpFoundation
                            .classes
                            .AcceptHeaderItem(env, part.arrayGet(env, 0), attributes));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\AcceptHeaderItem")
                    .setLookup(
                            AcceptHeaderItem.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "index", "quality", "value")
                    .setFilename("vendor/symfony/http-foundation/AcceptHeaderItem.php")
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
