package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Collection;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Inspiring.php

*/

public class Inspiring extends RuntimeClassBase {

    public Inspiring(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Inspiring(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Inspiring";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object quote(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.callMethod(
                            Collection.runtimeStaticObject.make(
                                    env,
                                    ZVal.arrayFromList(
                                            "When there is no desire, all things are at peace. - Laozi",
                                            "Simplicity is the ultimate sophistication. - Leonardo da Vinci",
                                            "Simplicity is the essence of happiness. - Cedric Bledsoe",
                                            "Smile, breathe, and go slowly. - Thich Nhat Hanh",
                                            "Simplicity is an acquired taste. - Katharine Gerould",
                                            "Well begun is half done. - Aristotle",
                                            "He who is contented is rich. - Laozi",
                                            "Very little is needed to make a happy life. - Marcus Antoninus",
                                            "It is quality rather than quantity that matters. - Lucius Annaeus Seneca",
                                            "Genius is one percent inspiration and ninety-nine percent perspiration. - Thomas Edison",
                                            "Computer science is no more about computers than astronomy is about telescopes. - Edsger Dijkstra")),
                            "random",
                            Inspiring.class));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Inspiring")
                    .setLookup(
                            Inspiring.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/laravel/framework/src/Illuminate/Foundation/Inspiring.php")
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
