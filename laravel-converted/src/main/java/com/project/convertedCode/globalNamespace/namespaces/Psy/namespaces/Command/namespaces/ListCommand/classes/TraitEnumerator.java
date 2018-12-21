package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_natcasesort;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes.Enumerator;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/ListCommand/TraitEnumerator.php

*/

public class TraitEnumerator extends Enumerator {

    public TraitEnumerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TraitEnumerator.class) {
            this.__construct(env, args);
        }
    }

    public TraitEnumerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "presenter", typeHint = "Psy\\VarDumper\\Presenter")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object presenter = assignParameter(args, 0, false);
        NamespaceGlobal.trigger_error
                .env(env)
                .call("TraitEnumerator is no longer used", 16384)
                .value();
        super.__construct(env, presenter);
        return null;
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
        Object traits = null;
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(reflector, "!==", ZVal.getNull()))
                || ZVal.toBool(ZVal.strictNotEqualityCheck(target, "!==", ZVal.getNull()))) {
            return null;
        }

        if (!ZVal.isTrue(env.callMethod(input, "getOption", TraitEnumerator.class, "traits"))) {
            return null;
        }

        traits =
                this.prepareTraits(
                        env, NamespaceGlobal.get_declared_traits.env(env).call().value());
        if (ZVal.isEmpty(traits)) {
            return null;
        }

        return ZVal.assign(ZVal.newArray(new ZPair("Traits", traits)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "traits", typeHint = "array")
    protected Object prepareTraits(RuntimeEnv env, Object... args) {
        Object traits = assignParameter(args, 0, false);
        ReferenceContainer ret = new BasicReferenceContainer(null);
        Object name = null;
        function_natcasesort.f.env(env).call(traits);
        ret.setObject(ZVal.newArray());
        for (ZPair zpairResult1381 : ZVal.getIterable(traits, env, true)) {
            name = ZVal.assign(zpairResult1381.getValue());
            if (ZVal.isTrue(env.callMethod(this, "showItem", TraitEnumerator.class, name))) {
                ret.arrayAccess(env, name)
                        .set(
                                ZVal.newArray(
                                        new ZPair("name", name),
                                        new ZPair("style", CONST_IS_CLASS),
                                        new ZPair(
                                                "value",
                                                env.callMethod(
                                                        this,
                                                        "presentSignature",
                                                        TraitEnumerator.class,
                                                        name))));
            }
        }

        return ZVal.assign(ret.getObject());
    }

    public static final Object CONST_class = "Psy\\Command\\ListCommand\\TraitEnumerator";

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
                    .setName("Psy\\Command\\ListCommand\\TraitEnumerator")
                    .setLookup(
                            TraitEnumerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filter", "presenter")
                    .setFilename("vendor/psy/psysh/src/Command/ListCommand/TraitEnumerator.php")
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
