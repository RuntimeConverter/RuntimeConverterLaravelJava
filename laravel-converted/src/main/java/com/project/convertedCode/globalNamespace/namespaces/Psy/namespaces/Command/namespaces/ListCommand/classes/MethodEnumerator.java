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

 vendor/psy/psysh/src/Command/ListCommand/MethodEnumerator.php

*/

public class MethodEnumerator extends Enumerator {

    public MethodEnumerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MethodEnumerator.class) {
            this.__construct(env, args);
        }
    }

    public MethodEnumerator(NoConstructor n) {
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
        Object showAll = null;
        Object noInherit = null;
        Object methods = null;
        if (ZVal.strictEqualityCheck(reflector, "===", ZVal.getNull())) {
            return null;
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(reflector, ReflectionClass.class, "ReflectionClass"))) {
            return null;
        }

        if (!ZVal.isTrue(env.callMethod(input, "getOption", MethodEnumerator.class, "methods"))) {
            return null;
        }

        showAll = env.callMethod(input, "getOption", MethodEnumerator.class, "all");
        noInherit = env.callMethod(input, "getOption", MethodEnumerator.class, "no-inherit");
        methods = this.prepareMethods(env, this.getMethods(env, showAll, reflector, noInherit));
        if (ZVal.isEmpty(methods)) {
            return null;
        }

        ret.setObject(ZVal.newArray());
        ret.arrayAccess(env, this.getKindLabel(env, reflector)).set(methods);
        return ZVal.assign(ret.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "showAll")
    @ConvertedParameter(index = 1, name = "reflector", typeHint = "Reflector")
    @ConvertedParameter(
        index = 2,
        name = "noInherit",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object getMethods(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object showAll = assignParameter(args, 0, false);
        Object reflector = assignParameter(args, 1, false);
        Object noInherit = assignParameter(args, 2, true);
        if (null == noInherit) {
            noInherit = false;
        }
        Object method = null;
        ReferenceContainer methods = new BasicReferenceContainer(null);
        Object name = null;
        Object className = null;
        className = env.callMethod(reflector, "getName", MethodEnumerator.class);
        methods.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1377 :
                ZVal.getIterable(
                        env.callMethod(reflector, "getMethods", MethodEnumerator.class),
                        env,
                        false)) {
            name = ZVal.assign(zpairResult1377.getKey());
            method = ZVal.assign(zpairResult1377.getValue());
            if (ZVal.toBool(noInherit)
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    env.callMethod(
                                            env.callMethod(
                                                    method,
                                                    "getDeclaringClass",
                                                    MethodEnumerator.class),
                                            "getName",
                                            MethodEnumerator.class),
                                    "!==",
                                    className))) {
                continue;
            }

            if (ZVal.toBool(showAll)
                    || ZVal.toBool(env.callMethod(method, "isPublic", MethodEnumerator.class))) {
                methods.arrayAccess(env, env.callMethod(method, "getName", MethodEnumerator.class))
                        .set(method);
            }
        }

        function_ksort.f.env(env).call(methods.getObject(), ZVal.toLong(6) | ZVal.toLong(8));
        return ZVal.assign(methods.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methods", typeHint = "array")
    protected Object prepareMethods(RuntimeEnv env, Object... args) {
        Object methods = assignParameter(args, 0, false);
        ReferenceContainer ret = new BasicReferenceContainer(null);
        Object method = null;
        Object name = null;
        ret.setObject(ZVal.newArray());
        for (ZPair zpairResult1378 : ZVal.getIterable(methods, env, false)) {
            name = ZVal.assign(zpairResult1378.getKey());
            method = ZVal.assign(zpairResult1378.getValue());
            if (ZVal.isTrue(env.callMethod(this, "showItem", MethodEnumerator.class, name))) {
                ret.arrayAccess(env, name)
                        .set(
                                ZVal.newArray(
                                        new ZPair("name", name),
                                        new ZPair("style", this.getVisibilityStyle(env, method)),
                                        new ZPair(
                                                "value",
                                                env.callMethod(
                                                        this,
                                                        "presentSignature",
                                                        MethodEnumerator.class,
                                                        method))));
            }
        }

        return ZVal.assign(ret.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflector", typeHint = "ReflectionClass")
    protected Object getKindLabel(RuntimeEnv env, Object... args) {
        Object reflector = assignParameter(args, 0, false);
        if (ZVal.isTrue(env.callMethod(reflector, "isInterface", MethodEnumerator.class))) {
            return "Interface Methods";

        } else if (ZVal.toBool(function_method_exists.f.env(env).call(reflector, "isTrait").value())
                && ZVal.toBool(env.callMethod(reflector, "isTrait", MethodEnumerator.class))) {
            return "Trait Methods";

        } else {
            return "Class Methods";
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
    private Object getVisibilityStyle(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        if (ZVal.isTrue(env.callMethod(method, "isPublic", MethodEnumerator.class))) {
            return ZVal.assign(CONST_IS_PUBLIC);

        } else if (ZVal.isTrue(env.callMethod(method, "isProtected", MethodEnumerator.class))) {
            return ZVal.assign(CONST_IS_PROTECTED);

        } else {
            return ZVal.assign(CONST_IS_PRIVATE);
        }
    }

    public static final Object CONST_class = "Psy\\Command\\ListCommand\\MethodEnumerator";

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
                    .setName("Psy\\Command\\ListCommand\\MethodEnumerator")
                    .setLookup(
                            MethodEnumerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filter", "presenter")
                    .setFilename("vendor/psy/psysh/src/Command/ListCommand/MethodEnumerator.php")
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
