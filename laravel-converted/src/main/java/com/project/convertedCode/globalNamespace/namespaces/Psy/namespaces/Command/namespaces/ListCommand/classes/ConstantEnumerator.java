package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_natcasesort;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes.Enumerator;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/ListCommand/ConstantEnumerator.php

*/

public class ConstantEnumerator extends Enumerator {

    public ConstantEnumerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConstantEnumerator.class) {
            this.__construct(env, args);
        }
    }

    public ConstantEnumerator(NoConstructor n) {
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
        Object internal = null;
        Object label = null;
        Object category = null;
        Object user = null;
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(reflector, "!==", ZVal.getNull()))
                || ZVal.toBool(ZVal.strictNotEqualityCheck(target, "!==", ZVal.getNull()))) {
            return null;
        }

        if (!ZVal.isTrue(
                env.callMethod(input, "getOption", ConstantEnumerator.class, "constants"))) {
            return null;
        }

        user = env.callMethod(input, "getOption", ConstantEnumerator.class, "user");
        internal = env.callMethod(input, "getOption", ConstantEnumerator.class, "internal");
        category = env.callMethod(input, "getOption", ConstantEnumerator.class, "category");
        ret.setObject(ZVal.newArray());
        if (ZVal.isTrue(user)) {
            ret.arrayAccess(env, "User Constants").set(this.getConstants(env, "user"));
        }

        if (ZVal.isTrue(internal)) {
            ret.arrayAccess(env, "Interal Constants").set(this.getConstants(env, "internal"));
        }

        if (ZVal.isTrue(category)) {
            label =
                    toStringR(NamespaceGlobal.ucfirst.env(env).call(category).value(), env)
                            + " Constants";
            ret.arrayAccess(env, label).set(this.getConstants(env, category));
        }

        if (ZVal.toBool(ZVal.toBool(!ZVal.isTrue(user)) && ZVal.toBool(!ZVal.isTrue(internal)))
                && ZVal.toBool(!ZVal.isTrue(category))) {
            ret.arrayAccess(env, "Constants").set(this.getConstants(env));
        }

        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "prepareConstants")),
                                function_array_filter.f.env(env).call(ret.getObject()).value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "category",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object getConstants(RuntimeEnv env, Object... args) {
        Object category = assignParameter(args, 0, true);
        if (null == category) {
            category = ZVal.getNull();
        }
        ReferenceContainer consts = new BasicReferenceContainer(null);
        if (!ZVal.isTrue(category)) {
            return ZVal.assign(NamespaceGlobal.get_defined_constants.env(env).call().value());
        }

        consts.setObject(NamespaceGlobal.get_defined_constants.env(env).call(true).value());
        if (ZVal.strictEqualityCheck(category, "===", "internal")) {
            arrayActionR(ArrayAction.UNSET, consts, env, "user");
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call("array_merge", consts.getObject())
                            .value());
        }

        return ZVal.assign(
                arrayActionR(ArrayAction.ISSET, consts, env, category)
                        ? consts.arrayGet(env, category)
                        : ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "constants", typeHint = "array")
    protected Object prepareConstants(RuntimeEnv env, Object... args) {
        ReferenceContainer constants = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer ret = new BasicReferenceContainer(null);
        Object names = null;
        Object name = null;
        ret.setObject(ZVal.newArray());
        names = function_array_keys.f.env(env).call(constants.getObject()).value();
        function_natcasesort.f.env(env).call(names);
        for (ZPair zpairResult1372 : ZVal.getIterable(names, env, true)) {
            name = ZVal.assign(zpairResult1372.getValue());
            if (ZVal.isTrue(env.callMethod(this, "showItem", ConstantEnumerator.class, name))) {
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
                                                        ConstantEnumerator.class,
                                                        constants.arrayGet(env, name)))));
            }
        }

        return ZVal.assign(ret.getObject());
    }

    public static final Object CONST_class = "Psy\\Command\\ListCommand\\ConstantEnumerator";

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
                    .setName("Psy\\Command\\ListCommand\\ConstantEnumerator")
                    .setLookup(
                            ConstantEnumerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filter", "presenter")
                    .setFilename("vendor/psy/psysh/src/Command/ListCommand/ConstantEnumerator.php")
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
