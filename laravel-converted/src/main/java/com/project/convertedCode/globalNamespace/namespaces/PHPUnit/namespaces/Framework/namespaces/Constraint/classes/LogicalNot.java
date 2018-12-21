package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.LogicalOr;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsEqual;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.LogicalAnd;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/LogicalNot.php

*/

public class LogicalNot extends Constraint {

    public Object constraint = null;

    public LogicalNot(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LogicalNot.class) {
            this.__construct(env, args);
        }
    }

    public LogicalNot(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "constraint")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object constraint = assignParameter(args, 0, false);
        super.__construct(env);
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        constraint,
                        Constraint.class,
                        "PHPUnit\\Framework\\Constraint\\Constraint"))) {
            constraint = new IsEqual(env, constraint);
        }

        this.constraint = constraint;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    @ConvertedParameter(index = 1, name = "description")
    @ConvertedParameter(
        index = 2,
        name = "returnResult",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object evaluate(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        Object description = assignParameter(args, 1, true);
        if (null == description) {
            description = "";
        }
        Object returnResult = assignParameter(args, 2, true);
        if (null == returnResult) {
            returnResult = false;
        }
        Object success = null;
        success =
                !ZVal.isTrue(
                        env.callMethod(
                                this.constraint,
                                "evaluate",
                                LogicalNot.class,
                                other,
                                description,
                                true));
        if (ZVal.isTrue(returnResult)) {
            return ZVal.assign(success);
        }

        if (!ZVal.isTrue(success)) {
            env.callMethod(this, "fail", LogicalNot.class, other, description);
        }

        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        SwitchEnumType61 switchVariable61 =
                ZVal.getEnum(
                        function_get_class.f.env(env).call(this.constraint).value(),
                        SwitchEnumType61.DEFAULT_CASE,
                        SwitchEnumType61.DYNAMIC_TYPE_241,
                        LogicalAnd.CONST_class,
                        SwitchEnumType61.DYNAMIC_TYPE_242,
                        CONST_class,
                        SwitchEnumType61.DYNAMIC_TYPE_243,
                        LogicalOr.CONST_class);
        switch (switchVariable61) {
            case DYNAMIC_TYPE_241:
            case DYNAMIC_TYPE_242:
            case DYNAMIC_TYPE_243:
                return ZVal.assign(
                        "not( "
                                + toStringR(
                                        env.callMethod(
                                                this.constraint, "toString", LogicalNot.class),
                                        env)
                                + " )");
            case DEFAULT_CASE:
                return ZVal.assign(
                        runtimeStaticObject.negate(
                                env,
                                env.callMethod(this.constraint, "toString", LogicalNot.class)));
        }
        ;
        return null;
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.constraint).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object failureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        SwitchEnumType62 switchVariable62 =
                ZVal.getEnum(
                        function_get_class.f.env(env).call(this.constraint).value(),
                        SwitchEnumType62.DEFAULT_CASE,
                        SwitchEnumType62.DYNAMIC_TYPE_244,
                        LogicalAnd.CONST_class,
                        SwitchEnumType62.DYNAMIC_TYPE_245,
                        CONST_class,
                        SwitchEnumType62.DYNAMIC_TYPE_246,
                        LogicalOr.CONST_class);
        switch (switchVariable62) {
            case DYNAMIC_TYPE_244:
            case DYNAMIC_TYPE_245:
            case DYNAMIC_TYPE_246:
                return ZVal.assign(
                        "not( "
                                + toStringR(
                                        env.callMethod(
                                                this.constraint,
                                                "failureDescription",
                                                LogicalNot.class,
                                                other),
                                        env)
                                + " )");
            case DEFAULT_CASE:
                return ZVal.assign(
                        runtimeStaticObject.negate(
                                env,
                                env.callMethod(
                                        this.constraint,
                                        "failureDescription",
                                        LogicalNot.class,
                                        other)));
        }
        ;
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\LogicalNot";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string", typeHint = "string")
        public Object negate(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, false);
            Object negatives = null;
            Object positives = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            Object negatedString = null;
            Object nonInput = null;
            positives =
                    ZVal.arrayFromList(
                            "contains ",
                            "exists",
                            "has ",
                            "is ",
                            "are ",
                            "matches ",
                            "starts with ",
                            "ends with ",
                            "reference ",
                            "not not ");
            negatives =
                    ZVal.arrayFromList(
                            "does not contain ",
                            "does not exist",
                            "does not have ",
                            "is not ",
                            "are not ",
                            "does not match ",
                            "starts not with ",
                            "ends not with ",
                            "don't reference ",
                            "not ");
            function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "/('[\\w\\W]*')([\\w\\W]*)(\"[\\w\\W]*\")/i",
                            string,
                            matches.getObject());
            if (ZVal.isGreaterThan(
                    function_count.f.env(env).call(matches.getObject()).value(), '>', 0)) {
                nonInput = ZVal.assign(matches.arrayGet(env, 2));
                negatedString =
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        nonInput,
                                        function_str_replace
                                                .f
                                                .env(env)
                                                .call(positives, negatives, nonInput)
                                                .value(),
                                        string)
                                .value();

            } else {
                negatedString =
                        function_str_replace.f.env(env).call(positives, negatives, string).value();
            }

            return ZVal.assign(negatedString);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\LogicalNot")
                    .setLookup(
                            LogicalNot.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("constraint", "exporter")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/LogicalNot.php")
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

    private enum SwitchEnumType61 {
        DYNAMIC_TYPE_241,
        DYNAMIC_TYPE_242,
        DYNAMIC_TYPE_243,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType62 {
        DYNAMIC_TYPE_244,
        DYNAMIC_TYPE_245,
        DYNAMIC_TYPE_246,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
