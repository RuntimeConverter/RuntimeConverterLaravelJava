package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Reflection.classes.ReflectionClassConstant;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes.Enumerator;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/ListCommand/ClassConstantEnumerator.php

*/

public class ClassConstantEnumerator extends Enumerator {

    public ClassConstantEnumerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ClassConstantEnumerator.class) {
            this.__construct(env, args);
        }
    }

    public ClassConstantEnumerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "reflector",
        typeHint = "Reflector",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "target",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object listItems(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object reflector = assignParameter(args, 1, true);
        if (null == reflector) {
            reflector = ZVal.getNull();
        }
        Object target = assignParameter(args, 2, true);
        if (null == target) {
            target = ZVal.getNull();
        }
        ReferenceContainer ret = new BasicReferenceContainer(null);
        Object noInherit = null;
        Object constants = null;
        if (ZVal.strictEqualityCheck(reflector, "===", ZVal.getNull())) {
            return null;
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(reflector, ReflectionClass.class, "ReflectionClass"))) {
            return null;
        }

        if (!ZVal.isTrue(
                env.callMethod(input, "getOption", ClassConstantEnumerator.class, "constants"))) {
            return null;
        }

        noInherit = env.callMethod(input, "getOption", ClassConstantEnumerator.class, "no-inherit");
        constants = this.prepareConstants(env, this.getConstants(env, reflector, noInherit));
        if (ZVal.isEmpty(constants)) {
            return null;
        }

        ret.setObject(ZVal.newArray());
        ret.arrayAccess(env, this.getKindLabel(env, reflector)).set(constants);
        return ZVal.assign(ret.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflector", typeHint = "Reflector")
    @ConvertedParameter(
        index = 1,
        name = "noInherit",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object getConstants(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object reflector = assignParameter(args, 0, false);
        Object noInherit = assignParameter(args, 1, true);
        if (null == noInherit) {
            noInherit = false;
        }
        Object constant = null;
        Object name = null;
        Object constReflector = null;
        Object className = null;
        ReferenceContainer constants = new BasicReferenceContainer(null);
        className = env.callMethod(reflector, "getName", ClassConstantEnumerator.class);
        constants.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1369 :
                ZVal.getIterable(
                        env.callMethod(reflector, "getConstants", ClassConstantEnumerator.class),
                        env,
                        false)) {
            name = ZVal.assign(zpairResult1369.getKey());
            constant = ZVal.assign(zpairResult1369.getValue());
            constReflector =
                    ReflectionClassConstant.runtimeStaticObject.create(env, reflector, name);
            if (ZVal.toBool(noInherit)
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    env.callMethod(
                                            env.callMethod(
                                                    constReflector,
                                                    "getDeclaringClass",
                                                    ClassConstantEnumerator.class),
                                            "getName",
                                            ClassConstantEnumerator.class),
                                    "!==",
                                    className))) {
                continue;
            }

            constants.arrayAccess(env, name).set(constReflector);
        }

        function_ksort.f.env(env).call(constants.getObject(), ZVal.toLong(6) | ZVal.toLong(8));
        return ZVal.assign(constants.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "constants", typeHint = "array")
    protected Object prepareConstants(RuntimeEnv env, Object... args) {
        Object constants = assignParameter(args, 0, false);
        ReferenceContainer ret = new BasicReferenceContainer(null);
        Object constant = null;
        Object name = null;
        ret.setObject(ZVal.newArray());
        for (ZPair zpairResult1370 : ZVal.getIterable(constants, env, false)) {
            name = ZVal.assign(zpairResult1370.getKey());
            constant = ZVal.assign(zpairResult1370.getValue());
            if (ZVal.isTrue(
                    env.callMethod(this, "showItem", ClassConstantEnumerator.class, name))) {
                ret.arrayAccess(env, name)
                        .set(
                                ZVal.newArray(
                                        new ZPair("name", name),
                                        new ZPair("style", CONST_IS_CONSTANT),
                                        new ZPair(
                                                "value",
                                                env.callMethod(
                                                        this,
                                                        "presentRef",
                                                        ClassConstantEnumerator.class,
                                                        env.callMethod(
                                                                constant,
                                                                "getValue",
                                                                ClassConstantEnumerator.class)))));
            }
        }

        return ZVal.assign(ret.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflector", typeHint = "ReflectionClass")
    protected Object getKindLabel(RuntimeEnv env, Object... args) {
        Object reflector = assignParameter(args, 0, false);
        if (ZVal.isTrue(env.callMethod(reflector, "isInterface", ClassConstantEnumerator.class))) {
            return "Interface Constants";

        } else if (ZVal.toBool(function_method_exists.f.env(env).call(reflector, "isTrait").value())
                && ZVal.toBool(
                        env.callMethod(reflector, "isTrait", ClassConstantEnumerator.class))) {
            return "Trait Constants";

        } else {
            return "Class Constants";
        }
    }

    public static final Object CONST_class = "Psy\\Command\\ListCommand\\ClassConstantEnumerator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Enumerator.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Command\\ListCommand\\ClassConstantEnumerator")
                    .setLookup(
                            ClassConstantEnumerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filter", "presenter")
                    .setFilename(
                            "vendor/psy/psysh/src/Command/ListCommand/ClassConstantEnumerator.php")
                    .addExtendsClass("Psy\\Command\\ListCommand\\Enumerator")
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
