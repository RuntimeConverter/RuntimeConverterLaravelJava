package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.ArrayIterator;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Helper/HelperSet.php

*/

public class HelperSet extends RuntimeClassBase implements IteratorAggregate {

    public Object helpers = ZVal.newArray();

    public Object command = null;

    public HelperSet(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HelperSet.class) {
            this.__construct(env, args);
        }
    }

    public HelperSet(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "helpers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object helpers = assignParameter(args, 0, true);
        if (null == helpers) {
            helpers = ZVal.newArray();
        }
        Object helper = null;
        Object alias = null;
        for (ZPair zpairResult1690 : ZVal.getIterable(helpers, env, false)) {
            alias = ZVal.assign(zpairResult1690.getKey());
            helper = ZVal.assign(zpairResult1690.getValue());
            this.set(
                    env,
                    helper,
                    function_is_int.f.env(env).call(alias).getBool() ? ZVal.getNull() : alias);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "helper",
        typeHint = "Symfony\\Component\\Console\\Helper\\HelperInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "alias",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object set(RuntimeEnv env, Object... args) {
        Object helper = assignParameter(args, 0, false);
        Object alias = assignParameter(args, 1, true);
        if (null == alias) {
            alias = ZVal.getNull();
        }
        new ReferenceClassProperty(this, "helpers", env)
                .arrayAccess(env, env.callMethod(helper, "getName", HelperSet.class))
                .set(helper);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", alias)) {
            new ReferenceClassProperty(this, "helpers", env).arrayAccess(env, alias).set(helper);
        }

        env.callMethod(helper, "setHelperSet", HelperSet.class, this);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object has(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "helpers", env),
                        env,
                        name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object get(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.has(env, name))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The helper \"%s\" is not defined.", name)
                                    .value()));
        }

        return ZVal.assign(new ReferenceClassProperty(this, "helpers", env).arrayGet(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "command",
        typeHint = "Symfony\\Component\\Console\\Command\\Command",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setCommand(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, true);
        if (null == command) {
            command = ZVal.getNull();
        }
        this.command = command;
        return null;
    }

    @ConvertedMethod
    public Object getCommand(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.command);
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ArrayIterator(env, this.helpers));
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Helper\\HelperSet";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Helper\\HelperSet")
                    .setLookup(
                            HelperSet.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("command", "helpers")
                    .setFilename("vendor/symfony/console/Helper/HelperSet.php")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
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
