package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Json;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/JsonMatches.php

*/

public class JsonMatches extends Constraint {

    public Object value = null;

    public JsonMatches(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == JsonMatches.class) {
            this.__construct(env, args);
        }
    }

    public JsonMatches(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        super.__construct(env);
        this.value = value;
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_sprintf.f.env(env).call("matches JSON string \"%s\"", this.value).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        Object runtimeTempArrayResult137 = null;
        Object recodedOther = null;
        Object runtimeTempArrayResult138 = null;
        Object error = null;
        Object recodedValue = null;
        ZVal.list(
                runtimeTempArrayResult137 = Json.runtimeStaticObject.canonicalize(env, other),
                (error = listGet(runtimeTempArrayResult137, 0, env)),
                (recodedOther = listGet(runtimeTempArrayResult137, 1, env)));
        if (ZVal.isTrue(error)) {
            return ZVal.assign(false);
        }

        ZVal.list(
                runtimeTempArrayResult138 = Json.runtimeStaticObject.canonicalize(env, this.value),
                (error = listGet(runtimeTempArrayResult138, 0, env)),
                (recodedValue = listGet(runtimeTempArrayResult138, 1, env)));
        if (ZVal.isTrue(error)) {
            return ZVal.assign(false);
        }

        return ZVal.assign(ZVal.equalityCheck(recodedOther, recodedValue));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    @ConvertedParameter(index = 1, name = "description")
    @ConvertedParameter(
        index = 2,
        name = "comparisonFailure",
        typeHint = "SebastianBergmann\\Comparator\\ComparisonFailure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object fail(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        Object description = assignParameter(args, 1, false);
        Object comparisonFailure = assignParameter(args, 2, true);
        if (null == comparisonFailure) {
            comparisonFailure = ZVal.getNull();
        }
        Object runtimeTempArrayResult139 = null;
        Object runtimeTempArrayResult140 = null;
        Object error = null;
        if (ZVal.strictEqualityCheck(comparisonFailure, "===", ZVal.getNull())) {
            ZVal.list(
                    runtimeTempArrayResult139 = Json.runtimeStaticObject.canonicalize(env, other),
                    (error = listGet(runtimeTempArrayResult139, 0, env)));
            if (ZVal.isTrue(error)) {
                super.fail(env, other, description);
                return null;
            }

            ZVal.list(
                    runtimeTempArrayResult140 =
                            Json.runtimeStaticObject.canonicalize(env, this.value),
                    (error = listGet(runtimeTempArrayResult140, 0, env)));
            if (ZVal.isTrue(error)) {
                super.fail(env, other, description);
                return null;
            }

            comparisonFailure =
                    new ComparisonFailure(
                            env,
                            NamespaceGlobal.json_decode.env(env).call(this.value).value(),
                            NamespaceGlobal.json_decode.env(env).call(other).value(),
                            Json.runtimeStaticObject.prettify(env, this.value),
                            Json.runtimeStaticObject.prettify(env, other),
                            false,
                            "Failed asserting that two json values are equal.");
        }

        super.fail(env, other, description, comparisonFailure);
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\JsonMatches";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\JsonMatches")
                    .setLookup(
                            JsonMatches.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exporter", "value")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/JsonMatches.php")
                    .addInterface("Countable")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
                    .addExtendsClass("PHPUnit\\Framework\\Constraint\\Constraint")
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
