package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Text.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.TypeSafeMatcher;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Text/IsEqualIgnoringWhiteSpace.php

*/

public class IsEqualIgnoringWhiteSpace extends TypeSafeMatcher {

    public Object _string = null;

    public IsEqualIgnoringWhiteSpace(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsEqualIgnoringWhiteSpace.class) {
            this.__construct(env, args);
        }
    }

    public IsEqualIgnoringWhiteSpace(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        super.__construct(env, CONST_TYPE_STRING);
        this._string = string;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    protected Object matchesSafely(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        NamespaceGlobal.strtolower
                                .env(env)
                                .call(this._stripSpace(env, item))
                                .value(),
                        "===",
                        NamespaceGlobal.strtolower
                                .env(env)
                                .call(this._stripSpace(env, this._string))
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    protected Object describeMismatchSafely(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        env.callMethod(
                env.callMethod(
                        mismatchDescription, "appendText", IsEqualIgnoringWhiteSpace.class, "was "),
                "appendText",
                IsEqualIgnoringWhiteSpace.class,
                item);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                description,
                                "appendText",
                                IsEqualIgnoringWhiteSpace.class,
                                "equalToIgnoringWhiteSpace("),
                        "appendValue",
                        IsEqualIgnoringWhiteSpace.class,
                        this._string),
                "appendText",
                IsEqualIgnoringWhiteSpace.class,
                ")");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    private Object _stripSpace(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object part = null;
        ReferenceContainer parts = new BasicReferenceContainer(null);
        Object i = null;
        parts.setObject(NamespaceGlobal.preg_split.env(env).call("/[\r\n\t ]+/", string).value());
        for (ZPair zpairResult172 : ZVal.getIterable(parts.getObject(), env, false)) {
            i = ZVal.assign(zpairResult172.getKey());
            part = ZVal.assign(zpairResult172.getValue());
            parts.arrayAccess(env, i).set(function_trim.f.env(env).call(part, " \r\n\t").value());
        }

        return ZVal.assign(
                function_trim
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(" ", parts.getObject())
                                        .value(),
                                " \r\n\t")
                        .value());
    }

    public static final Object CONST_class = "Hamcrest\\Text\\IsEqualIgnoringWhiteSpace";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TypeSafeMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        public Object equalToIgnoringWhiteSpace(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Text
                            .classes
                            .IsEqualIgnoringWhiteSpace(env, string));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Text\\IsEqualIgnoringWhiteSpace")
                    .setLookup(
                            IsEqualIgnoringWhiteSpace.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expectedSubtype", "_expectedType", "_string")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Text/IsEqualIgnoringWhiteSpace.php")
                    .addInterface("Hamcrest\\Matcher")
                    .addInterface("Hamcrest\\SelfDescribing")
                    .addExtendsClass("Hamcrest\\TypeSafeMatcher")
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
