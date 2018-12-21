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
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes.Enumerator;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/ListCommand/PropertyEnumerator.php

*/

public class PropertyEnumerator extends Enumerator {

    public PropertyEnumerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PropertyEnumerator.class) {
            this.__construct(env, args);
        }
    }

    public PropertyEnumerator(NoConstructor n) {
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
        Object properties = null;
        if (ZVal.strictEqualityCheck(reflector, "===", ZVal.getNull())) {
            return null;
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(reflector, ReflectionClass.class, "ReflectionClass"))) {
            return null;
        }

        if (!ZVal.isTrue(
                env.callMethod(input, "getOption", PropertyEnumerator.class, "properties"))) {
            return null;
        }

        showAll = env.callMethod(input, "getOption", PropertyEnumerator.class, "all");
        noInherit = env.callMethod(input, "getOption", PropertyEnumerator.class, "no-inherit");
        properties =
                this.prepareProperties(
                        env, this.getProperties(env, showAll, reflector, noInherit), target);
        if (ZVal.isEmpty(properties)) {
            return null;
        }

        ret.setObject(ZVal.newArray());
        ret.arrayAccess(env, this.getKindLabel(env, reflector)).set(properties);
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
    protected Object getProperties(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object showAll = assignParameter(args, 0, false);
        Object reflector = assignParameter(args, 1, false);
        Object noInherit = assignParameter(args, 2, true);
        if (null == noInherit) {
            noInherit = false;
        }
        Object property = null;
        Object className = null;
        ReferenceContainer properties = new BasicReferenceContainer(null);
        className = env.callMethod(reflector, "getName", PropertyEnumerator.class);
        properties.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1379 :
                ZVal.getIterable(
                        env.callMethod(reflector, "getProperties", PropertyEnumerator.class),
                        env,
                        true)) {
            property = ZVal.assign(zpairResult1379.getValue());
            if (ZVal.toBool(noInherit)
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    env.callMethod(
                                            env.callMethod(
                                                    property,
                                                    "getDeclaringClass",
                                                    PropertyEnumerator.class),
                                            "getName",
                                            PropertyEnumerator.class),
                                    "!==",
                                    className))) {
                continue;
            }

            if (ZVal.toBool(showAll)
                    || ZVal.toBool(
                            env.callMethod(property, "isPublic", PropertyEnumerator.class))) {
                properties
                        .arrayAccess(
                                env, env.callMethod(property, "getName", PropertyEnumerator.class))
                        .set(property);
            }
        }

        function_ksort.f.env(env).call(properties.getObject(), ZVal.toLong(6) | ZVal.toLong(8));
        return ZVal.assign(properties.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "properties", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "target",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object prepareProperties(RuntimeEnv env, Object... args) {
        Object properties = assignParameter(args, 0, false);
        Object target = assignParameter(args, 1, true);
        if (null == target) {
            target = ZVal.getNull();
        }
        ReferenceContainer ret = new BasicReferenceContainer(null);
        Object fname = null;
        Object name = null;
        Object property = null;
        ret.setObject(ZVal.newArray());
        for (ZPair zpairResult1380 : ZVal.getIterable(properties, env, false)) {
            name = ZVal.assign(zpairResult1380.getKey());
            property = ZVal.assign(zpairResult1380.getValue());
            if (ZVal.isTrue(env.callMethod(this, "showItem", PropertyEnumerator.class, name))) {
                fname = "$" + toStringR(name, env);
                ret.arrayAccess(env, fname)
                        .set(
                                ZVal.newArray(
                                        new ZPair("name", fname),
                                        new ZPair("style", this.getVisibilityStyle(env, property)),
                                        new ZPair(
                                                "value",
                                                this.presentValue(env, property, target))));
            }
        }

        return ZVal.assign(ret.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflector", typeHint = "ReflectionClass")
    protected Object getKindLabel(RuntimeEnv env, Object... args) {
        Object reflector = assignParameter(args, 0, false);
        if (ZVal.isTrue(env.callMethod(reflector, "isInterface", PropertyEnumerator.class))) {
            return "Interface Properties";

        } else if (ZVal.toBool(function_method_exists.f.env(env).call(reflector, "isTrait").value())
                && ZVal.toBool(env.callMethod(reflector, "isTrait", PropertyEnumerator.class))) {
            return "Trait Properties";

        } else {
            return "Class Properties";
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "property", typeHint = "ReflectionProperty")
    private Object getVisibilityStyle(RuntimeEnv env, Object... args) {
        Object property = assignParameter(args, 0, false);
        if (ZVal.isTrue(env.callMethod(property, "isPublic", PropertyEnumerator.class))) {
            return ZVal.assign(CONST_IS_PUBLIC);

        } else if (ZVal.isTrue(env.callMethod(property, "isProtected", PropertyEnumerator.class))) {
            return ZVal.assign(CONST_IS_PROTECTED);

        } else {
            return ZVal.assign(CONST_IS_PRIVATE);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "property", typeHint = "ReflectionProperty")
    @ConvertedParameter(index = 1, name = "target")
    protected Object presentValue(RuntimeEnv env, Object... args) {
        Object property = assignParameter(args, 0, false);
        Object target = assignParameter(args, 1, false);
        Object e = null;
        Object refl = null;
        Object suffix = null;
        Object value = null;
        ReferenceContainer props = new BasicReferenceContainer(null);
        if (!function_is_object.f.env(env).call(target).getBool()) {
            try {
                refl = new ReflectionClass(env, target);
                props.setObject(
                        env.callMethod(refl, "getDefaultProperties", PropertyEnumerator.class));
                if (function_array_key_exists
                        .f
                        .env(env)
                        .call(
                                toObjectR(property).accessProp(this, env).name("name").value(),
                                props.getObject())
                        .getBool()) {
                    suffix =
                            ZVal.assign(
                                    ZVal.isTrue(
                                                    env.callMethod(
                                                            property,
                                                            "isStatic",
                                                            PropertyEnumerator.class))
                                            ? ""
                                            : " <aside>(default)</aside>");
                    return ZVal.assign(
                            toStringR(
                                            env.callMethod(
                                                    this,
                                                    "presentRef",
                                                    PropertyEnumerator.class,
                                                    props.arrayGet(
                                                            env,
                                                            toObjectR(property)
                                                                    .accessProp(this, env)
                                                                    .name("name")
                                                                    .value())),
                                            env)
                                    + toStringR(suffix, env));
                }

            } catch (ConvertedException convertedException176) {
                if (convertedException176.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException176.getObject();
                } else {
                    throw convertedException176;
                }
            }

            return "";
        }

        env.callMethod(property, "setAccessible", PropertyEnumerator.class, true);
        value = env.callMethod(property, "getValue", PropertyEnumerator.class, target);
        return ZVal.assign(env.callMethod(this, "presentRef", PropertyEnumerator.class, value));
    }

    public static final Object CONST_class = "Psy\\Command\\ListCommand\\PropertyEnumerator";

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
                    .setName("Psy\\Command\\ListCommand\\PropertyEnumerator")
                    .setLookup(
                            PropertyEnumerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filter", "presenter")
                    .setFilename("vendor/psy/psysh/src/Command/ListCommand/PropertyEnumerator.php")
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
