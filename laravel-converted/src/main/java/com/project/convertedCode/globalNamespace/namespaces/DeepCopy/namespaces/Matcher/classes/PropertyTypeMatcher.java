package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Matcher.classes.Matcher;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Reflection.classes.ReflectionHelper;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/myclabs/deep-copy/src/DeepCopy/Matcher/PropertyTypeMatcher.php

*/

public class PropertyTypeMatcher extends RuntimeClassBase implements Matcher {

    public Object propertyType = null;

    public PropertyTypeMatcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PropertyTypeMatcher.class) {
            this.__construct(env, args);
        }
    }

    public PropertyTypeMatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "propertyType")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object propertyType = assignParameter(args, 0, false);
        this.propertyType = propertyType;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    @ConvertedParameter(index = 1, name = "property")
    public Object matches(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, false);
        Object property = assignParameter(args, 1, false);
        Object exception = null;
        Object reflectionProperty = null;
        try {
            reflectionProperty =
                    ReflectionHelper.runtimeStaticObject.getProperty(env, _object, property);
        } catch (ConvertedException convertedException93) {
            if (convertedException93.instanceOf(ReflectionException.class, "ReflectionException")) {
                exception = convertedException93.getObject();
                return ZVal.assign(false);
            } else {
                throw convertedException93;
            }
        }

        env.callMethod(reflectionProperty, "setAccessible", PropertyTypeMatcher.class, true);
        return ZVal.assign(
                ZVal.checkInstanceTypeMatch(
                        env.callMethod(
                                reflectionProperty, "getValue", PropertyTypeMatcher.class, _object),
                        this.propertyType));
    }

    public static final Object CONST_class = "DeepCopy\\Matcher\\PropertyTypeMatcher";

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
                    .setName("DeepCopy\\Matcher\\PropertyTypeMatcher")
                    .setLookup(
                            PropertyTypeMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("propertyType")
                    .setFilename(
                            "vendor/myclabs/deep-copy/src/DeepCopy/Matcher/PropertyTypeMatcher.php")
                    .addInterface("DeepCopy\\Matcher\\Matcher")
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
