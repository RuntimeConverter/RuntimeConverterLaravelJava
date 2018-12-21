package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.app;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.project.convertedCode.globalNamespace.functions.public_path;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.functions.report;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.HtmlString;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/helpers.php

*/

public class mix extends FunctionBaseRegular {

    public static mix f = new mix();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "manifestDirectory")
    public Object call(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object manifestDirectory = assignParameter(args, 1, true);
        if (null == manifestDirectory) {
            manifestDirectory = "";
        }
        ReferenceContainer manifest = new BasicReferenceContainer(null);
        ReferenceContainer manifests = new BasicReferenceContainer(null);
        Object manifestPath = null;
        Object url = null;
        manifests = env.getInlineStatic(8, ZVal.newArray());
        if (!ZVal.isTrue(Str.runtimeStaticObject.startsWith(env, path, "/"))) {
            path = ZVal.assign("/" + toStringR(path, env));
        }

        if (ZVal.toBool(manifestDirectory)
                && ZVal.toBool(
                        !ZVal.isTrue(
                                Str.runtimeStaticObject.startsWith(env, manifestDirectory, "/")))) {
            manifestDirectory = ZVal.assign("/" + toStringR(manifestDirectory, env));
        }

        if (function_file_exists
                .f
                .env(env)
                .call(
                        public_path
                                .f
                                .env(env)
                                .call(toStringR(manifestDirectory, env) + "/hot")
                                .value())
                .getBool()) {
            url =
                    function_file_get_contents
                            .f
                            .env(env)
                            .call(
                                    public_path
                                            .f
                                            .env(env)
                                            .call(toStringR(manifestDirectory, env) + "/hot")
                                            .value())
                            .value();
            if (ZVal.isTrue(
                    Str.runtimeStaticObject.startsWith(
                            env, url, ZVal.arrayFromList("http://", "https://")))) {
                return ZVal.assign(
                        new HtmlString(
                                env,
                                toStringR(Str.runtimeStaticObject.after(env, url, ":"), env)
                                        + toStringR(path, env)));
            }

            return ZVal.assign(new HtmlString(env, "//localhost:8080" + toStringR(path, env)));
        }

        manifestPath =
                public_path
                        .f
                        .env(env)
                        .call(toStringR(manifestDirectory, env) + "/mix-manifest.json")
                        .value();
        if (!arrayActionR(ArrayAction.ISSET, manifests, env, manifestPath)) {
            if (!function_file_exists.f.env(env).call(manifestPath).getBool()) {
                throw ZVal.getException(
                        env, new PHPException(env, "The Mix manifest does not exist."));
            }

            manifests
                    .arrayAccess(env, manifestPath)
                    .set(
                            NamespaceGlobal.json_decode
                                    .env(env)
                                    .call(
                                            function_file_get_contents
                                                    .f
                                                    .env(env)
                                                    .call(manifestPath)
                                                    .value(),
                                            true)
                                    .value());
        }

        manifest.setObject(ZVal.assign(manifests.arrayGet(env, manifestPath)));
        if (!arrayActionR(ArrayAction.ISSET, manifest, env, path)) {
            report.f
                    .env(env)
                    .call(
                            new PHPException(
                                    env,
                                    "Unable to locate Mix file: " + toStringR(path, env) + "."));
            if (!ZVal.isTrue(
                    env.callMethod(
                            app.f.env(env).call("config").value(),
                            "get",
                            mix.class,
                            "app.debug"))) {
                return ZVal.assign(path);
            }
        }

        return ZVal.assign(
                new HtmlString(
                        env,
                        toStringR(manifestDirectory, env)
                                + toStringR(manifest.arrayGet(env, path), env)));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                .setFile("/vendor/laravel/framework/src/Illuminate/Foundation/helpers.php");
    }
}
