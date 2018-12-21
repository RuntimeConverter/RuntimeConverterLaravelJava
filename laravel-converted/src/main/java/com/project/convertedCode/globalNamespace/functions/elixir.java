package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.project.convertedCode.globalNamespace.functions.public_path;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/helpers.php

*/

public class elixir extends FunctionBaseRegular {

    public static elixir f = new elixir();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(index = 1, name = "buildDirectory")
    public Object call(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object buildDirectory = assignParameter(args, 1, true);
        if (null == buildDirectory) {
            buildDirectory = "build";
        }
        Object path = null;
        ReferenceContainer manifest = new BasicReferenceContainer(null);
        ReferenceContainer manifestPath = new BasicReferenceContainer(null);
        Object unversioned = null;
        manifest = env.getInlineStatic(6, ZVal.newArray());
        manifestPath = env.getInlineStatic(7, null);
        if (ZVal.toBool(ZVal.isEmpty(manifest.getObject()))
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                manifestPath.getObject(), "!==", buildDirectory))) {
            path =
                    public_path
                            .f
                            .env(env)
                            .call(toStringR(buildDirectory, env) + "/rev-manifest.json")
                            .value();
            if (function_file_exists.f.env(env).call(path).getBool()) {
                manifest.setObject(
                        NamespaceGlobal.json_decode
                                .env(env)
                                .call(
                                        function_file_get_contents.f.env(env).call(path).value(),
                                        true)
                                .value());
                manifestPath.setObject(ZVal.assign(buildDirectory));
            }
        }

        file = function_ltrim.f.env(env).call(file, "/").value();
        if (arrayActionR(ArrayAction.ISSET, manifest, env, file)) {
            return ZVal.assign(
                    "/"
                            + toStringR(
                                    function_trim
                                            .f
                                            .env(env)
                                            .call(
                                                    toStringR(buildDirectory, env)
                                                            + "/"
                                                            + toStringR(
                                                                    manifest.arrayGet(env, file),
                                                                    env),
                                                    "/")
                                            .value(),
                                    env));
        }

        unversioned = public_path.f.env(env).call(file).value();
        if (function_file_exists.f.env(env).call(unversioned).getBool()) {
            return ZVal.assign(
                    "/" + toStringR(function_trim.f.env(env).call(file, "/").value(), env));
        }

        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env, "File " + toStringR(file, env) + " not defined in asset manifest."));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                .setFile("/vendor/laravel/framework/src/Illuminate/Foundation/helpers.php");
    }
}
