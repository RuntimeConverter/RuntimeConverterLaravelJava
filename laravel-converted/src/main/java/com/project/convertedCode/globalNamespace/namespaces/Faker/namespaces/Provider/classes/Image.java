package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/Image.php

*/

public class Image extends Base {

    public Image(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Image.class) {
            this.__construct(env, args);
        }
    }

    public Image(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\Image";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Base.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "width",
            defaultValue = "640",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 1,
            name = "height",
            defaultValue = "480",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 2,
            name = "category",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "randomize",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 4,
            name = "word",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 5,
            name = "gray",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object imageUrl(RuntimeEnv env, Object... args) {
            Object width = assignParameter(args, 0, true);
            if (null == width) {
                width = 640;
            }
            Object height = assignParameter(args, 1, true);
            if (null == height) {
                height = 480;
            }
            Object category = assignParameter(args, 2, true);
            if (null == category) {
                category = ZVal.getNull();
            }
            Object randomize = assignParameter(args, 3, true);
            if (null == randomize) {
                randomize = true;
            }
            Object word = assignParameter(args, 4, true);
            if (null == word) {
                word = ZVal.getNull();
            }
            Object gray = assignParameter(args, 5, true);
            if (null == gray) {
                gray = false;
            }
            Object baseUrl = null;
            Object url = null;
            baseUrl = "https://lorempixel.com/";
            url = ZVal.assign(toStringR(width, env) + "/" + toStringR(height, env) + "/");
            if (ZVal.isTrue(gray)) {
                url = "gray/" + toStringR(url, env);
            }

            if (ZVal.isTrue(category)) {
                if (!function_in_array
                        .f
                        .env(env)
                        .call(
                                category,
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Faker
                                                        .namespaces
                                                        .Provider
                                                        .classes
                                                        .Image
                                                        .RequestStaticProperties
                                                        .class)
                                        .categories)
                        .getBool()) {
                    throw ZVal.getException(
                            env,
                            new InvalidArgumentException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call("Unknown image category \"%s\"", category)
                                            .value()));
                }

                url = toStringR(url, env) + toStringR(toStringR(category, env) + "/", env);
                if (ZVal.isTrue(word)) {
                    url = toStringR(url, env) + toStringR(toStringR(word, env) + "/", env);
                }
            }

            if (ZVal.isTrue(randomize)) {
                url =
                        toStringR(url, env)
                                + "?"
                                + toStringR(
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Image.class)
                                                .method("randomNumber")
                                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                                .call(5, true)
                                                .value(),
                                        env);
            }

            return ZVal.assign(toStringR(baseUrl, env) + toStringR(url, env));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "dir",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "width",
            defaultValue = "640",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 2,
            name = "height",
            defaultValue = "480",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 3,
            name = "category",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 4,
            name = "fullPath",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 5,
            name = "randomize",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 6,
            name = "word",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object image(RuntimeEnv env, Object... args) {
            Object dir = assignParameter(args, 0, true);
            if (null == dir) {
                dir = ZVal.getNull();
            }
            Object width = assignParameter(args, 1, true);
            if (null == width) {
                width = 640;
            }
            Object height = assignParameter(args, 2, true);
            if (null == height) {
                height = 480;
            }
            Object category = assignParameter(args, 3, true);
            if (null == category) {
                category = ZVal.getNull();
            }
            Object fullPath = assignParameter(args, 4, true);
            if (null == fullPath) {
                fullPath = true;
            }
            Object randomize = assignParameter(args, 5, true);
            if (null == randomize) {
                randomize = true;
            }
            Object word = assignParameter(args, 6, true);
            if (null == word) {
                word = ZVal.getNull();
            }
            Object ch = null;
            ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
            Object fp = null;
            Object url = null;
            Object filename = null;
            Object filepath = null;
            Object success = null;
            Object name = null;
            dir =
                    ZVal.assign(
                            function_is_null.f.env(env).call(dir).getBool()
                                    ? NamespaceGlobal.sys_get_temp_dir.env(env).call().value()
                                    : dir);
            if (ZVal.toBool(!function_is_dir.f.env(env).call(dir).getBool())
                    || ZVal.toBool(!NamespaceGlobal.is_writable.env(env).call(dir).getBool())) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Cannot write to directory \"%s\"", dir)
                                        .value()));
            }

            name =
                    NamespaceGlobal.md5
                            .env(env)
                            .call(
                                    NamespaceGlobal.uniqid
                                            .env(env)
                                            .call(
                                                    arrayActionR(
                                                                    ArrayAction.EMPTY,
                                                                    _SERVER,
                                                                    env,
                                                                    "SERVER_ADDR")
                                                            ? ""
                                                            : _SERVER.arrayGet(env, "SERVER_ADDR"),
                                                    true)
                                            .value())
                            .value();
            filename = toStringR(name, env) + ".jpg";
            filepath = toStringR(dir, env) + toStringR("/", env) + toStringR(filename, env);
            url =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Image.class)
                            .method("imageUrl")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(width, height, category, randomize, word)
                            .value();
            if (function_function_exists.f.env(env).call("curl_exec").getBool()) {
                fp = function_fopen.f.env(env).call(filepath, "w").value();
                ch = NamespaceGlobal.curl_init.env(env).call(url).value();
                NamespaceGlobal.curl_setopt.env(env).call(ch, 10001, fp);
                success =
                        ZVal.toBool(NamespaceGlobal.curl_exec.env(env).call(ch).value())
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                NamespaceGlobal.curl_getinfo
                                                        .env(env)
                                                        .call(ch, 2097154)
                                                        .value(),
                                                "===",
                                                200));
                if (ZVal.isTrue(success)) {
                    function_fclose.f.env(env).call(fp);

                } else {
                    NamespaceGlobal.unlink.env(env).call(filepath);
                }

                NamespaceGlobal.curl_close.env(env).call(ch);

            } else if (function_ini_get.f.env(env).call("allow_url_fopen").getBool()) {
                success = NamespaceGlobal.copy.env(env).call(url, filepath).value();

            } else {
                return ZVal.assign(
                        new RuntimeException(
                                env,
                                "The image formatter downloads an image from a remote HTTP server. Therefore, it requires that PHP can request remote hosts, either via cURL or fopen()"));
            }

            if (!ZVal.isTrue(success)) {
                return ZVal.assign(false);
            }

            return ZVal.assign(ZVal.isTrue(fullPath) ? filepath : filename);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object categories =
                ZVal.arrayFromList(
                        "abstract",
                        "animals",
                        "business",
                        "cats",
                        "city",
                        "food",
                        "nightlife",
                        "fashion",
                        "people",
                        "nature",
                        "sports",
                        "technics",
                        "transport");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\Image")
                    .setLookup(
                            Image.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("categories")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/Image.php")
                    .addExtendsClass("Faker\\Provider\\Base")
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
