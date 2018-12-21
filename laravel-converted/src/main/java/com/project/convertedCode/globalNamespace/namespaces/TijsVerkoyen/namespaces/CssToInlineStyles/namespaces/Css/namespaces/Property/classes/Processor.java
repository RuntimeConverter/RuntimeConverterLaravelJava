package com.project.convertedCode.globalNamespace.namespaces.TijsVerkoyen.namespaces.CssToInlineStyles.namespaces.Css.namespaces.Property.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.namespaces.TijsVerkoyen.namespaces.CssToInlineStyles.namespaces.Css.namespaces.Property.classes.Property;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/tijsverkoyen/css-to-inline-styles/src/Css/Property/Processor.php

*/

public class Processor extends RuntimeClassBase {

    public Processor(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Processor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "propertiesString")
    public Object splitIntoSeparateProperties(RuntimeEnv env, Object... args) {
        Object propertiesString = assignParameter(args, 0, false);
        ReferenceContainer keysToRemove = new BasicReferenceContainer(null);
        Object numberOfProperties = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer properties = new BasicReferenceContainer(null);
        Object key = null;
        propertiesString = this.cleanup(env, propertiesString);
        properties.setObject(
                ZVal.assign(
                        rToArrayCast(
                                function_explode.f.env(env).call(";", propertiesString).value())));
        keysToRemove.setObject(ZVal.newArray());
        numberOfProperties = function_count.f.env(env).call(properties.getObject()).value();
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', numberOfProperties);
                i.setObject(ZVal.increment(i.getObject()))) {
            properties
                    .arrayAccess(env, i.getObject())
                    .set(
                            function_trim
                                    .f
                                    .env(env)
                                    .call(properties.arrayGet(env, i.getObject()))
                                    .value());
            if (ZVal.toBool(
                            arrayActionR(
                                    ArrayAction.ISSET, properties, env, ZVal.add(i.getObject(), 1)))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    function_strpos
                                            .f
                                            .env(env)
                                            .call(
                                                    function_trim
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    properties.arrayGet(
                                                                            env,
                                                                            ZVal.add(
                                                                                    i.getObject(),
                                                                                    1)))
                                                            .value(),
                                                    "base64,")
                                            .value(),
                                    "===",
                                    0))) {
                properties
                        .arrayAccess(env, i.getObject())
                        .set(
                                toStringR(properties.arrayGet(env, i.getObject()), env)
                                        + ";"
                                        + toStringR(
                                                function_trim
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                properties.arrayGet(
                                                                        env,
                                                                        ZVal.add(i.getObject(), 1)))
                                                        .value(),
                                                env));
                keysToRemove.arrayAppend(env).set(ZVal.add(i.getObject(), 1));
            }
        }

        if (!ZVal.isEmpty(keysToRemove.getObject())) {
            for (ZPair zpairResult2237 : ZVal.getIterable(keysToRemove.getObject(), env, true)) {
                key = ZVal.assign(zpairResult2237.getValue());
                arrayActionR(ArrayAction.UNSET, properties, env, key);
            }
        }

        return ZVal.assign(function_array_values.f.env(env).call(properties.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    private Object cleanup(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        string =
                function_str_replace
                        .f
                        .env(env)
                        .call(ZVal.arrayFromList("\r", "\n"), "", string)
                        .value();
        string =
                function_str_replace.f.env(env).call(ZVal.arrayFromList("\t"), " ", string).value();
        string = function_str_replace.f.env(env).call("\"", "'", string).value();
        string = function_preg_replace.f.env(env).call("|/\\*.*?\\*/|", "", string).value();
        string = function_preg_replace.f.env(env).call("/\\s\\s+/", " ", string).value();
        string = function_trim.f.env(env).call(string).value();
        string = function_rtrim.f.env(env).call(string, ";").value();
        return ZVal.assign(string);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "property")
    @ConvertedParameter(
        index = 1,
        name = "specificity",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\Specificity",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object convertToObject(RuntimeEnv env, Object... args) {
        Object property = assignParameter(args, 0, false);
        Object specificity = assignParameter(args, 1, true);
        if (null == specificity) {
            specificity = ZVal.getNull();
        }
        Object name = null;
        Object runtimeTempArrayResult219 = null;
        Object value = null;
        if (ZVal.strictEqualityCheck(
                function_strpos.f.env(env).call(property, ":").value(), "===", false)) {
            return ZVal.assign(ZVal.getNull());
        }

        ZVal.list(
                runtimeTempArrayResult219 =
                        function_explode.f.env(env).call(":", property, 2).value(),
                (name = listGet(runtimeTempArrayResult219, 0, env)),
                (value = listGet(runtimeTempArrayResult219, 1, env)));
        name = function_trim.f.env(env).call(name).value();
        value = function_trim.f.env(env).call(value).value();
        if (ZVal.strictEqualityCheck(value, "===", "")) {
            return ZVal.assign(ZVal.getNull());
        }

        return ZVal.assign(new Property(env, name, value, specificity));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "properties", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "specificity",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\Specificity",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object convertArrayToObjects(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object properties = assignParameter(args, 0, false);
        Object specificity = assignParameter(args, 1, true);
        if (null == specificity) {
            specificity = ZVal.getNull();
        }
        ReferenceContainer objects = new BasicReferenceContainer(null);
        Object property = null;
        Object _object = null;
        objects.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2238 : ZVal.getIterable(properties, env, true)) {
            property = ZVal.assign(zpairResult2238.getValue());
            _object = this.convertToObject(env, property, specificity);
            if (ZVal.strictEqualityCheck(_object, "===", ZVal.getNull())) {
                continue;
            }

            objects.arrayAppend(env).set(_object);
        }

        return ZVal.assign(objects.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "properties", typeHint = "array")
    public Object buildPropertiesString(RuntimeEnv env, Object... args) {
        Object properties = assignParameter(args, 0, false);
        ReferenceContainer chunks = new BasicReferenceContainer(null);
        Object property = null;
        chunks.setObject(ZVal.newArray());
        for (ZPair zpairResult2239 : ZVal.getIterable(properties, env, true)) {
            property = ZVal.assign(zpairResult2239.getValue());
            chunks.arrayAppend(env).set(env.callMethod(property, "toString", Processor.class));
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call(" ", chunks.getObject()).value());
    }

    public static final Object CONST_class =
            "TijsVerkoyen\\CssToInlineStyles\\Css\\Property\\Processor";

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
                    .setName("TijsVerkoyen\\CssToInlineStyles\\Css\\Property\\Processor")
                    .setLookup(
                            Processor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/tijsverkoyen/css-to-inline-styles/src/Css/Property/Processor.php")
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
