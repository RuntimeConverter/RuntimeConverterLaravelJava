package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.classes.Swift_CharacterReaderFactory;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/CharacterReaderFactory/SimpleCharacterReaderFactory.php

*/

public class Swift_CharacterReaderFactory_SimpleCharacterReaderFactory extends RuntimeClassBase
        implements Swift_CharacterReaderFactory {

    public Swift_CharacterReaderFactory_SimpleCharacterReaderFactory(
            RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_CharacterReaderFactory_SimpleCharacterReaderFactory.class) {
            this.__construct(env, args);
        }
    }

    public Swift_CharacterReaderFactory_SimpleCharacterReaderFactory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.init(env);
        return null;
    }

    @ConvertedMethod
    public Object __wakeup(RuntimeEnv env, Object... args) {
        this.init(env);
        return null;
    }

    @ConvertedMethod
    public Object init(RuntimeEnv env, Object... args) {
        Object prefix = null;
        Object fourBytes = null;
        Object doubleByte = null;
        Object singleByte = null;
        if (ZVal.isGreaterThan(
                function_count
                        .f
                        .env(env)
                        .call(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .classes
                                                        .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                                        .RequestStaticProperties
                                                        .class)
                                        .map)
                        .value(),
                '>',
                0)) {
            return null;
        }

        prefix = "Swift_CharacterReader_";
        singleByte =
                ZVal.newArray(
                        new ZPair("class", toStringR(prefix, env) + "GenericFixedWidthReader"),
                        new ZPair("constructor", ZVal.arrayFromList(1)));
        doubleByte =
                ZVal.newArray(
                        new ZPair("class", toStringR(prefix, env) + "GenericFixedWidthReader"),
                        new ZPair("constructor", ZVal.arrayFromList(2)));
        fourBytes =
                ZVal.newArray(
                        new ZPair("class", toStringR(prefix, env) + "GenericFixedWidthReader"),
                        new ZPair("constructor", ZVal.arrayFromList(4)));
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .classes
                                .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                .RequestStaticProperties
                                .class,
                        "map")
                .arrayAccess(env, "utf-?8")
                .set(
                        ZVal.newArray(
                                new ZPair("class", toStringR(prefix, env) + "Utf8Reader"),
                                new ZPair("constructor", ZVal.newArray())));
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .classes
                                .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                .RequestStaticProperties
                                .class,
                        "map")
                .arrayAccess(env, "(us-)?ascii")
                .set(singleByte);
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .classes
                                .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                .RequestStaticProperties
                                .class,
                        "map")
                .arrayAccess(env, "(iso|iec)-?8859-?[0-9]+")
                .set(singleByte);
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .classes
                                .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                .RequestStaticProperties
                                .class,
                        "map")
                .arrayAccess(env, "windows-?125[0-9]")
                .set(singleByte);
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .classes
                                .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                .RequestStaticProperties
                                .class,
                        "map")
                .arrayAccess(env, "cp-?[0-9]+")
                .set(singleByte);
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .classes
                                .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                .RequestStaticProperties
                                .class,
                        "map")
                .arrayAccess(env, "ansi")
                .set(singleByte);
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .classes
                                .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                .RequestStaticProperties
                                .class,
                        "map")
                .arrayAccess(env, "macintosh")
                .set(singleByte);
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .classes
                                .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                .RequestStaticProperties
                                .class,
                        "map")
                .arrayAccess(env, "koi-?7")
                .set(singleByte);
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .classes
                                .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                .RequestStaticProperties
                                .class,
                        "map")
                .arrayAccess(env, "koi-?8-?.+")
                .set(singleByte);
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .classes
                                .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                .RequestStaticProperties
                                .class,
                        "map")
                .arrayAccess(env, "mik")
                .set(singleByte);
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .classes
                                .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                .RequestStaticProperties
                                .class,
                        "map")
                .arrayAccess(env, "(cork|t1)")
                .set(singleByte);
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .classes
                                .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                .RequestStaticProperties
                                .class,
                        "map")
                .arrayAccess(env, "v?iscii")
                .set(singleByte);
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .classes
                                .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                .RequestStaticProperties
                                .class,
                        "map")
                .arrayAccess(env, "(ucs-?2|utf-?16)")
                .set(doubleByte);
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .classes
                                .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                .RequestStaticProperties
                                .class,
                        "map")
                .arrayAccess(env, "(ucs-?4|utf-?32)")
                .set(fourBytes);
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .classes
                                .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                .RequestStaticProperties
                                .class,
                        "map")
                .arrayAccess(env, ".*")
                .set(singleByte);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object getReaderFor(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        Object re = null;
        Object reflector = null;
        Object reader = null;
        Object pattern = null;
        ReferenceContainer spec = new BasicReferenceContainer(null);
        charset =
                NamespaceGlobal.strtolower
                        .env(env)
                        .call(function_trim.f.env(env).call(charset).value())
                        .value();
        for (ZPair zpairResult1498 :
                ZVal.getIterable(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .classes
                                                .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                                .RequestStaticProperties
                                                .class)
                                .map,
                        env,
                        false)) {
            pattern = ZVal.assign(zpairResult1498.getKey());
            spec.setObject(ZVal.assign(zpairResult1498.getValue()));
            re = "/^" + toStringR(pattern, env) + "$/D";
            if (function_preg_match.f.env(env).call(re, charset).getBool()) {
                if (!function_array_key_exists
                        .f
                        .env(env)
                        .call(
                                pattern,
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .classes
                                                        .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                                        .RequestStaticProperties
                                                        .class)
                                        .loaded)
                        .getBool()) {
                    reflector = new ReflectionClass(env, spec.arrayGet(env, "class"));
                    if (ZVal.isTrue(
                            env.callMethod(
                                    reflector,
                                    "getConstructor",
                                    Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                            .class))) {
                        reader =
                                env.callMethod(
                                        reflector,
                                        "newInstanceArgs",
                                        Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                                .class,
                                        spec.arrayGet(env, "constructor"));

                    } else {
                        reader =
                                env.callMethod(
                                        reflector,
                                        "newInstance",
                                        Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                                .class);
                    }

                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .classes
                                            .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                            .RequestStaticProperties
                                            .class,
                                    "loaded")
                            .arrayAccess(env, pattern)
                            .set(reader);
                }

                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .classes
                                                .Swift_CharacterReaderFactory_SimpleCharacterReaderFactory
                                                .RequestStaticProperties
                                                .class,
                                        "loaded")
                                .arrayGet(env, pattern));
            }
        }

        return null;
    }

    public static final Object CONST_class =
            "Swift_CharacterReaderFactory_SimpleCharacterReaderFactory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object map = ZVal.newArray();

        public Object loaded = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_CharacterReaderFactory_SimpleCharacterReaderFactory")
                    .setLookup(
                            Swift_CharacterReaderFactory_SimpleCharacterReaderFactory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("loaded", "map")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/CharacterReaderFactory/SimpleCharacterReaderFactory.php")
                    .addInterface("Swift_CharacterReaderFactory")
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
