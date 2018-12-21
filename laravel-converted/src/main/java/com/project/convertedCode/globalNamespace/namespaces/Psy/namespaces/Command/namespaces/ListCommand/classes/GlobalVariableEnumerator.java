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
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes.Enumerator;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/ListCommand/GlobalVariableEnumerator.php

*/

public class GlobalVariableEnumerator extends Enumerator {

    public GlobalVariableEnumerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == GlobalVariableEnumerator.class) {
            this.__construct(env, args);
        }
    }

    public GlobalVariableEnumerator(NoConstructor n) {
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
        Object globals = null;
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(reflector, "!==", ZVal.getNull()))
                || ZVal.toBool(ZVal.strictNotEqualityCheck(target, "!==", ZVal.getNull()))) {
            return null;
        }

        if (!ZVal.isTrue(
                env.callMethod(input, "getOption", GlobalVariableEnumerator.class, "globals"))) {
            return null;
        }

        globals = this.prepareGlobals(env, this.getGlobals(env));
        if (ZVal.isEmpty(globals)) {
            return null;
        }

        return ZVal.assign(ZVal.newArray(new ZPair("Global Variables", globals)));
    }

    @ConvertedMethod
    protected Object getGlobals(RuntimeEnv env, Object... args) {
        ReferenceContainer ret = new BasicReferenceContainer(null);
        ReferenceContainer GLOBALS = new GlobalVariableReference(env, "GLOBALS");
        Object names = null;
        Object name = null;

        names = function_array_keys.f.env(env).call(GLOBALS.getObject()).value();
        function_natcasesort.f.env(env).call(names);
        ret.setObject(ZVal.newArray());
        for (ZPair zpairResult1374 : ZVal.getIterable(names, env, true)) {
            name = ZVal.assign(zpairResult1374.getValue());
            ret.arrayAccess(env, name).set(GLOBALS.arrayGet(env, name));
        }

        return ZVal.assign(ret.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "globals")
    protected Object prepareGlobals(RuntimeEnv env, Object... args) {
        Object globals = assignParameter(args, 0, false);
        ReferenceContainer ret = new BasicReferenceContainer(null);
        Object fname = null;
        Object name = null;
        Object value = null;
        ret.setObject(ZVal.newArray());
        for (ZPair zpairResult1375 : ZVal.getIterable(globals, env, false)) {
            name = ZVal.assign(zpairResult1375.getKey());
            value = ZVal.assign(zpairResult1375.getValue());
            if (ZVal.isTrue(
                    env.callMethod(this, "showItem", GlobalVariableEnumerator.class, name))) {
                fname = "$" + toStringR(name, env);
                ret.arrayAccess(env, fname)
                        .set(
                                ZVal.newArray(
                                        new ZPair("name", fname),
                                        new ZPair("style", CONST_IS_GLOBAL),
                                        new ZPair(
                                                "value",
                                                env.callMethod(
                                                        this,
                                                        "presentRef",
                                                        GlobalVariableEnumerator.class,
                                                        value))));
            }
        }

        return ZVal.assign(ret.getObject());
    }

    public static final Object CONST_class = "Psy\\Command\\ListCommand\\GlobalVariableEnumerator";

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
                    .setName("Psy\\Command\\ListCommand\\GlobalVariableEnumerator")
                    .setLookup(
                            GlobalVariableEnumerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filter", "presenter")
                    .setFilename(
                            "vendor/psy/psysh/src/Command/ListCommand/GlobalVariableEnumerator.php")
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
