package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.BaseMatcher;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/Set.php

*/

public class Set extends BaseMatcher {

    public Object _property = null;

    public Object _not = null;

    public Set(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Set.class) {
            this.__construct(env, args);
        }
    }

    public Set(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "property")
    @ConvertedParameter(
        index = 1,
        name = "not",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object property = assignParameter(args, 0, false);
        Object not = assignParameter(args, 1, true);
        if (null == not) {
            not = false;
        }
        this._property = property;
        this._not = not;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    public Object matches(RuntimeEnv env, Object... args) {
        ReferenceContainer item = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object result = null;
        Object property = null;
        if (ZVal.strictEqualityCheck(item.getObject(), "===", ZVal.getNull())) {
            return ZVal.assign(false);
        }

        property = ZVal.assign(this._property);
        if (function_is_array.f.env(env).call(item.getObject()).getBool()) {
            result = ZVal.assign(arrayActionR(ArrayAction.ISSET, item, env, property));

        } else if (function_is_object.f.env(env).call(item.getObject()).getBool()) {
            result =
                    ZVal.assign(
                            ZVal.isset(
                                    toObjectR(item.getObject())
                                            .accessProp(this, env)
                                            .name(property)
                                            .value()));

        } else if (function_is_string.f.env(env).call(item.getObject()).getBool()) {
            result =
                    ZVal.assign(
                            ZVal.isset(
                                    env.getRequestStaticPropertiesReference(
                                                    item.getObject(), property)
                                            .getObject()));

        } else {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(env, "Must pass an object, array, or class name"));
        }

        return ZVal.assign(ZVal.isTrue(this._not) ? !ZVal.isTrue(result) : result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        description,
                        "appendText",
                        Set.class,
                        ZVal.isTrue(this._not) ? "unset property " : "set property "),
                "appendText",
                Set.class,
                this._property);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    @ConvertedParameter(index = 1, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeMismatch(RuntimeEnv env, Object... args) {
        ReferenceContainer item = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object description = assignParameter(args, 1, false);
        Object property = null;
        Object value = null;
        value = "";
        if (!ZVal.isTrue(this._not)) {
            env.callMethod(description, "appendText", Set.class, "was not set");

        } else {
            property = ZVal.assign(this._property);
            if (function_is_array.f.env(env).call(item.getObject()).getBool()) {
                value = ZVal.assign(item.arrayGet(env, property));

            } else if (function_is_object.f.env(env).call(item.getObject()).getBool()) {
                value =
                        ZVal.assign(
                                toObjectR(item.getObject())
                                        .accessProp(this, env)
                                        .name(property)
                                        .value());

            } else if (function_is_string.f.env(env).call(item.getObject()).getBool()) {
                value =
                        ZVal.assign(
                                env.getRequestStaticPropertiesReference(item.getObject(), property)
                                        .getObject());
            }

            super.describeMismatch(env, value, description);
        }

        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Core\\Set";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "property")
        public Object set(RuntimeEnv env, Object... args) {
            Object property = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Core
                            .classes
                            .Set(env, property));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "property")
        public Object notSet(RuntimeEnv env, Object... args) {
            Object property = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Core
                            .classes
                            .Set(env, property, true));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Core\\Set")
                    .setLookup(
                            Set.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_not", "_property")
                    .setFilename("vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/Set.php")
                    .addInterface("Hamcrest\\Matcher")
                    .addInterface("Hamcrest\\SelfDescribing")
                    .addExtendsClass("Hamcrest\\BaseMatcher")
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
