package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Reflection.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Exception.classes.PropertyException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/myclabs/deep-copy/src/DeepCopy/Reflection/ReflectionHelper.php

*/

public class ReflectionHelper extends RuntimeClassBase {

    public ReflectionHelper(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ReflectionHelper(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "DeepCopy\\Reflection\\ReflectionHelper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "ref", typeHint = "ReflectionClass")
        public Object getProperties(RuntimeEnv env, Object... args) {
            Object ref = assignParameter(args, 0, false);
            ReferenceContainer propsArr = new BasicReferenceContainer(null);
            Object propertyName = null;
            Object prop = null;
            Object property = null;
            ReferenceContainer parentPropsArr = new BasicReferenceContainer(null);
            Object parentClass = null;
            Object key = null;
            Object props = null;
            props = env.callMethod(ref, "getProperties", ReflectionHelper.class);
            propsArr.setObject(ZVal.newArray());
            for (ZPair zpairResult824 : ZVal.getIterable(props, env, true)) {
                prop = ZVal.assign(zpairResult824.getValue());
                propertyName = env.callMethod(prop, "getName", ReflectionHelper.class);
                propsArr.arrayAccess(env, propertyName).set(prop);
            }

            if (ZVal.isTrue(
                    parentClass = env.callMethod(ref, "getParentClass", ReflectionHelper.class))) {
                parentPropsArr.setObject(runtimeStaticObject.getProperties(env, parentClass));
                for (ZPair zpairResult825 : ZVal.getIterable(propsArr.getObject(), env, false)) {
                    key = ZVal.assign(zpairResult825.getKey());
                    property = ZVal.assign(zpairResult825.getValue());
                    parentPropsArr.arrayAccess(env, key).set(property);
                }

                return ZVal.assign(parentPropsArr.getObject());
            }

            return ZVal.assign(propsArr.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "object")
        @ConvertedParameter(index = 1, name = "name")
        public Object getProperty(RuntimeEnv env, Object... args) {
            Object _object = assignParameter(args, 0, false);
            Object name = assignParameter(args, 1, false);
            Object reflection = null;
            Object parentClass = null;
            reflection =
                    ZVal.assign(
                            function_is_object.f.env(env).call(_object).getBool()
                                    ? new ReflectionObject(env, _object)
                                    : new ReflectionClass(env, _object));
            if (ZVal.isTrue(
                    env.callMethod(reflection, "hasProperty", ReflectionHelper.class, name))) {
                return ZVal.assign(
                        env.callMethod(reflection, "getProperty", ReflectionHelper.class, name));
            }

            if (ZVal.isTrue(
                    parentClass =
                            env.callMethod(reflection, "getParentClass", ReflectionHelper.class))) {
                return ZVal.assign(
                        runtimeStaticObject.getProperty(
                                env,
                                env.callMethod(parentClass, "getName", ReflectionHelper.class),
                                name));
            }

            throw ZVal.getException(
                    env,
                    new PropertyException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The class \"%s\" doesn't have a property with the given name: \"%s\".",
                                            function_is_object.f.env(env).call(_object).getBool()
                                                    ? function_get_class
                                                            .f
                                                            .env(env)
                                                            .call(_object)
                                                            .value()
                                                    : _object,
                                            name)
                                    .value()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\Reflection\\ReflectionHelper")
                    .setLookup(
                            ReflectionHelper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/myclabs/deep-copy/src/DeepCopy/Reflection/ReflectionHelper.php")
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
